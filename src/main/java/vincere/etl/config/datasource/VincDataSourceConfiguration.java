package vincere.etl.config.datasource;

import com.zaxxer.hikari.HikariDataSource;
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
import org.springframework.util.Assert;
import vincere.etl.config.routing.DataSourceRouter;
import vincere.etl.config.routing.DatabaseEnvironment;
import vincere.etl.entity.vinc.AccountantEmail;
import vincere.etl.repository.CandidateRepository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(basePackageClasses = CandidateRepository.class
        , entityManagerFactoryRef = "vincEntityManager"
        , transactionManagerRef = "vincTransactionManager")
@EnableTransactionManagement
@PropertySource("classpath:application-datasources-local.properties")
public class VincDataSourceConfiguration {

    @Bean
    @ConfigurationProperties("tung.vincere.io.datasource")
    DataSourceProperties dsp1() {
        return new DataSourceProperties();
    }

    private DataSource dsp1DataSource() {
        return dsp1()
                .initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean
    @ConfigurationProperties("strivesales.vincere.io.datasource")
    DataSourceProperties dsp2() {
        return new DataSourceProperties();
    }

    private DataSource dsp2DataSource() {
        return dsp2()
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
    public DataSource vincDataSource() {
        DataSourceRouter router = new DataSourceRouter();
        final HashMap<Object, Object> map = new HashMap<>();
        map.put(DatabaseEnvironment.tung_vincere_io, dsp1DataSource());
        map.put(DatabaseEnvironment.strivesale_vincere_io, dsp2DataSource());
        router.setTargetDataSources(map);
        router.afterPropertiesSet();
        router.setDefaultTargetDataSource(dsp1DataSource());
        return router;
    }

    @Bean(name="vincEntityManager")
    public LocalContainerEntityManagerFactoryBean vincEntityManager(Environment env) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(vincDataSource());
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan(AccountantEmail.class.getPackage().getName());

        Properties prop = new Properties();
        prop.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect.override"));
        prop.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
        Assert.isTrue(env.getRequiredProperty("hibernate.hbm2ddl.auto.override").equals("validate"), "expected: validate - " + "actual: " + env.getRequiredProperty("hibernate.hbm2ddl.auto.override"));
        prop.put("hibernate.ejb.naming_strategy", env.getRequiredProperty("hibernate.ejb.naming_strategy"));
        prop.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
        prop.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
        // avoid exception: Caused by: java.sql.SQLFeatureNotSupportedException: Method org.postgresql.jdbc.PgConnection.createClob() is not yet implemented.
//        prop.put("hibernate.jdbc.lob.non_contextual_creation", "true");
//        prop.put("hibernate.temp.use_jdbc_metadata_defaults", "false");

        entityManagerFactoryBean.setJpaProperties(prop);

        return entityManagerFactoryBean;
    }

    @Bean
    PlatformTransactionManager vincTransactionManager(
            @Qualifier("vincEntityManager") LocalContainerEntityManagerFactoryBean vincEntityManager
    ) {
        return new JpaTransactionManager(vincEntityManager.getObject());
    }

}