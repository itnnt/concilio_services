package concilio.config;


import concilio.config.datasource.ConcilioDataSourceConfiguration;
import concilio.config.datasource.DataSourceConfiguration;
import concilio.config.routing.DatabaseContextHolder;
import concilio.config.routing.DatabaseEnvironment;
import concilio.config.routing.RoutingTestUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest/*(classes = {CustomerBatchConfig.class, DataSourceConfiguration.class})*/
public class CustomerBatchConfigTest {

    @Autowired
    JobLauncherTestUtils customerBatchTest;

    @Autowired
    RoutingTestUtil routingTestUtil;

    @Before
    public void setUp() throws Exception {
        // Create databases for each environment
        for (DatabaseEnvironment databaseEnvironment : DatabaseEnvironment
                .values()) {
            routingTestUtil.createDatabase(databaseEnvironment);
        }
    }

    @After
    public void tearDown() {
    }

    @Test
    public void customerBatchJob() throws Exception {
        DatabaseContextHolder.set(DatabaseEnvironment.DEVELOPMENT);
        JobExecution jobExecution = customerBatchTest.launchJob();
        assertThat(jobExecution.getExitStatus().getExitCode()).isEqualTo("COMPLETED");

    }

    @Configuration
    @Import({RoutingTestUtil.class, CustomerBatchConfig.class, DataSourceConfiguration.class, ConcilioDataSourceConfiguration.class})
    static class BatchTestConfig {
        @Autowired
        Job customerBatchJob;

        @Bean
        JobLauncherTestUtils customerBatchTest() {
            JobLauncherTestUtils jobLauncherTestUtils = new JobLauncherTestUtils();
            jobLauncherTestUtils.setJob(customerBatchJob);
            return jobLauncherTestUtils;
        }
    }
}