package concilio.data_batch.job_configuration.datasource;

import concilio.data_batch.model.card.Card;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "concilio.data_batch.repository.card",
        entityManagerFactoryRef = "cardEntityManagerFactory",
        transactionManagerRef= "cardTransactionManager")
public class CardDataSourceConfiguration {

    @Bean
    @ConfigurationProperties("app.datasource.card")
    public DataSourceProperties cardDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("app.datasource.card.configuration")
    public DataSource cardDataSource() {
        return cardDataSourceProperties().initializeDataSourceBuilder()
                .type(BasicDataSource.class).build();
    }

    @Bean(name = "cardEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean cardEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(cardDataSource())
                .packages("concilio.data_batch.model")
                .build();
    }

    @Bean
    public PlatformTransactionManager cardTransactionManager(
            final @Qualifier("cardEntityManagerFactory") LocalContainerEntityManagerFactoryBean cardEntityManagerFactory) {
        return new JpaTransactionManager(cardEntityManagerFactory.getObject());
    }

}
