package concilio.data_batch.job_configuration.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "concilio.data_batch.repository.concilio",
        entityManagerFactoryRef = "concilioLocalContainerEntityManagerFactoryBean",
        transactionManagerRef = "concilioPlatformTransactionManager"
)
public class ConcilioDataSourceConfiguration {

    @Bean
    @ConfigurationProperties("concilio.datasource")
    DataSourceProperties concilioDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    DataSource concilioDataSource() {
        return concilioDataSourceProperties()
                .initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean(name="concilioLocalContainerEntityManagerFactoryBean")
    LocalContainerEntityManagerFactoryBean concilioLocalContainerEntityManagerFactoryBean(
            EntityManagerFactoryBuilder entityManagerFactoryBuilder
    ) {
        return entityManagerFactoryBuilder
                .dataSource(concilioDataSource())
                .packages("concilio.data_batch.model.concilio")
                .build();
    }

    @Bean
    PlatformTransactionManager concilioPlatformTransactionManager(
            @Qualifier("concilioLocalContainerEntityManagerFactoryBean")
            LocalContainerEntityManagerFactoryBean concilioLocalContainerEntityManagerFactoryBean
    ) {
        return new JpaTransactionManager(concilioLocalContainerEntityManagerFactoryBean.getObject());
    }
}
