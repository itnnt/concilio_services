package concilio.data_batch.job_configuration.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
        basePackages = "concilio.data_batch.repository.concilio",
        entityManagerFactoryRef = "concilioLocalContainerEntityManagerFactoryBean",
        transactionManagerRef = "concilioPlatformTransactionManager"
)
public class ConcilioDataSourceConfiguration {

    @Primary
    @Bean
    @ConfigurationProperties("concilio.datasource")
    DataSourceProperties concilioDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "concilioDataSource", destroyMethod = "close")
    DataSource concilioDataSource() {
        return concilioDataSourceProperties()
                .initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    @Primary
    @Bean(name="concilioLocalContainerEntityManagerFactoryBean")
    LocalContainerEntityManagerFactoryBean concilioLocalContainerEntityManagerFactoryBean(
            @Qualifier("concilioDataSource") DataSource dataSource, Environment env
    ) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan("concilio.data_batch.model.concilio");

        Properties jpaProperties = new Properties();

        //Configures the used database dialect. This allows Hibernate to create SQL
        //that is optimized for the used database.
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

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
//        jpaProperties.put("hibernate.jdbc.lob.non_contextual_creation", "true");
//        jpaProperties.put("hibernate.temp.use_jdbc_metadata_defaults", "false");

        entityManagerFactoryBean.setJpaProperties(jpaProperties);

        return entityManagerFactoryBean;
    }

    @Primary
    @Bean
    PlatformTransactionManager concilioPlatformTransactionManager(
            @Qualifier("concilioLocalContainerEntityManagerFactoryBean")
            LocalContainerEntityManagerFactoryBean concilioLocalContainerEntityManagerFactoryBean
    ) {
        return new JpaTransactionManager(concilioLocalContainerEntityManagerFactoryBean.getObject());
    }
}
