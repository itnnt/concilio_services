package concilio.data_batch.job_configuration.datasource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import concilio.data_batch.model.cardholder.CardHolder;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.dialect.PostgreSQL9Dialect;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;


//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "concilio.data_batch.repository.tung_vincere_io",
//        entityManagerFactoryRef = "tungVincereIoEntityManagerFactory",
//        transactionManagerRef= "tungVincereIoEntityManagerFactory")
public class TungVincereIoDataSourceConfiguration {

    @Bean(name="tungVincereIoDataSource", destroyMethod = "close")
    DataSource tungVincereIoDataSource(Environment env) {
        HikariConfig dataSourceConfig = new HikariConfig();
        dataSourceConfig.setDriverClassName(env.getRequiredProperty("tung.vincere.io.datasource.driverClassName"));
        dataSourceConfig.setJdbcUrl(env.getRequiredProperty("tung.vincere.io.datasource.url"));
        dataSourceConfig.setUsername(env.getRequiredProperty("tung.vincere.io.datasource.username"));
        dataSourceConfig.setPassword(env.getRequiredProperty("tung.vincere.io.datasource.password"));

        return new HikariDataSource(dataSourceConfig);
    }

    @Bean(name = "tungVincereIoEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean tungVincereIoEntityManagerFactory(@Qualifier("tungVincereIoDataSource") DataSource dataSource, Environment env) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan("concilio.data_batch.model.tung_vincere_io");

        Properties jpaProperties = new Properties();

        //Configures the used database dialect. This allows Hibernate to create SQL
        //that is optimized for the used database.
        jpaProperties.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));

        System.out.println("------------------------------------->>>>>");
        System.out.println(env.getRequiredProperty("hibernate.dialect"));
        System.out.println("------------------------------------->>>>>");

        //Specifies the action that is invoked to the database when the Hibernate
        //SessionFactory is created or closed.
        jpaProperties.put("hibernate.hbm2ddl.auto",
                env.getRequiredProperty("hibernate.hbm2ddl.auto")
        );

        //Configures the naming strategy that is used when Hibernate creates
        //new database objects and schema elements
        jpaProperties.put("hibernate.ejb.naming_strategy",
                env.getRequiredProperty("hibernate.ejb.naming_strategy")
        );

        //If the value of this property is true, Hibernate writes all SQL
        //statements to the console.
        jpaProperties.put("hibernate.show_sql",
                env.getRequiredProperty("hibernate.show_sql")
        );

        //If the value of this property is true, Hibernate will format the SQL
        //that is written to the console.
        jpaProperties.put("hibernate.format_sql",
                env.getRequiredProperty("hibernate.format_sql")
        );

        // avoid exception: Caused by: java.sql.SQLFeatureNotSupportedException: Method org.postgresql.jdbc.PgConnection.createClob() is not yet implemented.
        jpaProperties.put("hibernate.jdbc.lob.non_contextual_creation", "true");
        jpaProperties.put("hibernate.temp.use_jdbc_metadata_defaults", "false");

        entityManagerFactoryBean.setJpaProperties(jpaProperties);

        return entityManagerFactoryBean;
    }

    @Bean
    public PlatformTransactionManager tungVincereTransactionManager(
            final @Qualifier("tungVincereIoEntityManagerFactory") LocalContainerEntityManagerFactoryBean tungVincereIoEntityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager(tungVincereIoEntityManagerFactory.getObject());
        return transactionManager;
    }
}
