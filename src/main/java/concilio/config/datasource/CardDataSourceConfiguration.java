package concilio.config.datasource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import concilio.entity.card.Card;
import concilio.repository.card.CardRepository;
import org.springframework.beans.factory.annotation.Qualifier;
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
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
//        basePackages = "concilio.repository.card",
        basePackageClasses = CardRepository.class,
        entityManagerFactoryRef = "cardEntityManagerFactory",
        transactionManagerRef= "cardTransactionManager")
@PropertySource("classpath:application-datasources.properties")
public class CardDataSourceConfiguration {

    @Bean(name = "cardDataSource", destroyMethod = "close")
    DataSource cardDataSource(Environment env) {
        HikariConfig dataSourceConfig = new HikariConfig();
        dataSourceConfig.setDriverClassName(env.getRequiredProperty("app.datasource.card.driverClassName"));
        dataSourceConfig.setJdbcUrl(env.getRequiredProperty("app.datasource.card.url"));
        dataSourceConfig.setUsername(env.getRequiredProperty("app.datasource.card.username"));
        dataSourceConfig.setPassword(env.getRequiredProperty("app.datasource.card.password"));

        return new HikariDataSource(dataSourceConfig);
    }

    @Bean(name = "cardEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean cardEntityManagerFactory(
            @Qualifier("cardDataSource") DataSource dataSource, Environment env
    ) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan(Card.class.getPackage().getName());

        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.dialect", env.getRequiredProperty("app.datasource.card.dialect"));
        jpaProperties.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
        jpaProperties.put("hibernate.ejb.naming_strategy", env.getRequiredProperty("hibernate.ejb.naming_strategy"));
        jpaProperties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
        jpaProperties.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
        entityManagerFactoryBean.setJpaProperties(jpaProperties);
        return entityManagerFactoryBean;
    }

    @Bean
    public PlatformTransactionManager cardTransactionManager(
            final @Qualifier("cardEntityManagerFactory") LocalContainerEntityManagerFactoryBean cardEntityManagerFactory) {
        return new JpaTransactionManager(cardEntityManagerFactory.getObject());
    }

}
