package concilio.config.datasource;

import com.zaxxer.hikari.HikariDataSource;
import concilio.entity.concilio.Candidate;
import concilio.repository.local.tung.vincere.io.src.CandidateRepositorySrc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
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
//        basePackages = "concilio.repository.local.tung.vincere.io.src",
        basePackageClasses = CandidateRepositorySrc.class,
        entityManagerFactoryRef = "srcTungVincereIoLocalContainerEntityManagerFactory",
        transactionManagerRef= "srcTungVincereIoTransactionManager")
@PropertySource("classpath:application-datasources.properties")
public class SrcTungVincereIoDataSourceConfiguration {

    @Bean
    @ConfigurationProperties("src.tung.vincere.io.datasource")
    public DataSourceProperties tungVincereIoDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name="srcTungVincereIoDataSource", destroyMethod = "close")
    public DataSource srcTungVincereIoDataSource() {
        return tungVincereIoDataSourceProperties()
                .initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean(name = "srcTungVincereIoLocalContainerEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean srcTungVincereIoLocalContainerEntityManagerFactory(@Qualifier("srcTungVincereIoDataSource") DataSource dataSource, Environment env) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan(Candidate.class.getPackage().getName());

        Properties jpaProperties = new Properties();

        //Configures the used database dialect. This allows Hibernate to create SQL
        //that is optimized for the used database.
        jpaProperties.put("hibernate.dialect", env.getRequiredProperty("src.tung.vincere.io.datasource.dialect"));

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
    public PlatformTransactionManager srcTungVincereIoTransactionManager(
            final @Qualifier("srcTungVincereIoLocalContainerEntityManagerFactory") LocalContainerEntityManagerFactoryBean srcTungVincereIoLocalContainerEntityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager(srcTungVincereIoLocalContainerEntityManagerFactory.getObject());
        return transactionManager;
    }
}
