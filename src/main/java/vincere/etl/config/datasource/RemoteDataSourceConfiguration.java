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
import vincere.etl.entity.remote.RemoteCandidate;
import vincere.etl.repository.remote.RemoteCandidateRepository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(basePackageClasses = RemoteCandidateRepository.class
        , entityManagerFactoryRef = "remoteEntityManager"
        , transactionManagerRef = "remoteTransactionManager")
@EnableTransactionManagement
@PropertySource("classpath:application-datasources-remote.properties")
public class RemoteDataSourceConfiguration {

    @Bean
    @ConfigurationProperties("remote.tung.vincere.io.datasource")
    DataSourceProperties remoteDsp1() {
        return new DataSourceProperties();
    }

    private DataSource dsp1DataSource() {
        return remoteDsp1()
                .initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean
    @ConfigurationProperties("remote.strivesale.vincere.io.datasource")
    DataSourceProperties remoteDsp2() {
        return new DataSourceProperties();
    }

    private DataSource dsp2DataSource() {
        return remoteDsp2()
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
    public DataSource remoteDataSource() {
        LocalDataSourceRouter router = new LocalDataSourceRouter();
        final HashMap<Object, Object> map = new HashMap<>();
        map.put(RemoteDatabaseEnvironment.tung_vincere_io, dsp1DataSource());
        map.put(RemoteDatabaseEnvironment.strivesale_vincere_io, dsp2DataSource());
        router.setTargetDataSources(map);
        router.afterPropertiesSet();
        router.setDefaultTargetDataSource(dsp1DataSource());
        return router;
    }

    @Bean(name="remoteEntityManager")
    public LocalContainerEntityManagerFactoryBean remoteEntityManager(Environment env) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(remoteDataSource());
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan(RemoteCandidate.class.getPackage().getName());

        Properties prop = new Properties();
        prop.put("hibernate.dialect", env.getRequiredProperty("remote.hibernate.dialect.override"));
        prop.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("remote.hibernate.hbm2ddl.auto.override"));
        prop.put("hibernate.ejb.naming_strategy", env.getRequiredProperty("hibernate.ejb.naming_strategy"));
        prop.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
        prop.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
        // avoid exception: Caused by: java.sql.SQLFeatureNotSupportedException: Method org.postgresql.jdbc.PgConnection.createClob() is not yet implemented.
        prop.put("hibernate.jdbc.lob.non_contextual_creation", "true");
        prop.put("hibernate.temp.use_jdbc_metadata_defaults", "false");

        entityManagerFactoryBean.setJpaProperties(prop);

        return entityManagerFactoryBean;
    }

    @Bean
    PlatformTransactionManager remoteTransactionManager(
            @Qualifier("remoteEntityManager") LocalContainerEntityManagerFactoryBean remoteEntityManager
    ) {
        return new JpaTransactionManager(remoteEntityManager.getObject());
    }

}