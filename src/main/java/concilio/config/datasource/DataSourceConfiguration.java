package concilio.config.datasource;

import com.zaxxer.hikari.HikariDataSource;
import concilio.config.routing.DataSourceRouter;
import concilio.config.routing.DatabaseEnvironment;
import concilio.entity.customer.Customer;
import concilio.repository.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(basePackageClasses = CustomerRepository.class
        , entityManagerFactoryRef = "customerEntityManager"
        , transactionManagerRef = "customerTransactionManager")
@EnableTransactionManagement
@PropertySource("classpath:application-datasources.properties")
public class DataSourceConfiguration {

    @Bean
    @ConfigurationProperties("app.customer.development.datasource")
    DataSourceProperties dsp1() {
        return new DataSourceProperties();
    }

    public DataSource customerDevelopmentDataSource() {
        return dsp1()
                .initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean
    @ConfigurationProperties("app.customer.testing.datasource")
    DataSourceProperties dsp2() {
        return new DataSourceProperties();
    }

    public DataSource customerTestingDataSource() {
        return dsp2()
                .initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean
    @ConfigurationProperties("app.customer.production.datasource")
    DataSourceProperties dsp3() {
        return new DataSourceProperties();
    }

    public DataSource customerProductionDataSource() {
        return dsp3()
                .initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    /**
     * Adds all available datasources to datasource map.
     *
     * @return datasource of current context
     */
    @Bean
    public DataSource customerDataSource() {
        DataSourceRouter router = new DataSourceRouter();
        final HashMap<Object, Object> map = new HashMap<>(3);
        map.put(DatabaseEnvironment.DEVELOPMENT, customerDevelopmentDataSource());
        map.put(DatabaseEnvironment.TESTING, customerTestingDataSource());
        map.put(DatabaseEnvironment.PRODUCTION, customerProductionDataSource());
        router.setTargetDataSources(map);
        router.afterPropertiesSet();
        router.setDefaultTargetDataSource(customerProductionDataSource());
        return router;
    }

    @Bean(name="customerEntityManager")
    public LocalContainerEntityManagerFactoryBean customerEntityManager(Environment env) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(customerDataSource());
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan(Customer.class.getPackage().getName());

        Properties prop = new Properties();
        prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        prop.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
        prop.put("hibernate.ejb.naming_strategy", env.getRequiredProperty("hibernate.ejb.naming_strategy"));
        prop.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
        prop.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
        entityManagerFactoryBean.setJpaProperties(prop);

        return entityManagerFactoryBean;
    }

    @Bean
    PlatformTransactionManager customerTransactionManager(
            @Qualifier("customerEntityManager") LocalContainerEntityManagerFactoryBean customerEntityManager
    ) {
        return new JpaTransactionManager(customerEntityManager.getObject());
    }

}