package concilio.config.datasource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import concilio.entity.member.Member;
import concilio.repository.member.MemberRepository;
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
//        basePackages = "concilio.repository.member",
        basePackageClasses = MemberRepository.class,
        entityManagerFactoryRef = "memberEntityManagerFactory",
        transactionManagerRef= "memberTransactionManager"
)
@PropertySource("classpath:application-datasources.properties")
public class MemberDataSourceConfiguration {

    @Bean(name = "memberDataSource", destroyMethod = "close")
    public DataSource memberDataSource(Environment env) {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(env.getRequiredProperty("app.datasource.member.driverClassName"));
        hikariConfig.setJdbcUrl(env.getRequiredProperty("app.datasource.member.url"));
        hikariConfig.setUsername(env.getRequiredProperty("app.datasource.member.username"));
        hikariConfig.setPassword(env.getRequiredProperty("app.datasource.member.password"));
        return new HikariDataSource(hikariConfig);
    }

    @Bean(name = "memberEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean memberEntityManagerFactory(
            @Qualifier("memberDataSource") DataSource dataSource, Environment env
    ) {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(dataSource);
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        localContainerEntityManagerFactoryBean.setPackagesToScan(Member.class.getPackage().getName());

        Properties prop = new Properties();
        prop.put("hibernate.dialect", env.getRequiredProperty("app.datasource.member.dialect"));
        prop.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
        prop.put("hibernate.ejb.naming_strategy", env.getRequiredProperty("hibernate.ejb.naming_strategy"));
        prop.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
        prop.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
        localContainerEntityManagerFactoryBean.setJpaProperties(prop);
        return localContainerEntityManagerFactoryBean;
    }

    @Bean
    public PlatformTransactionManager memberTransactionManager(
            final @Qualifier("memberEntityManagerFactory") LocalContainerEntityManagerFactoryBean memberEntityManagerFactory) {
        return new JpaTransactionManager(memberEntityManagerFactory.getObject());
    }

}
