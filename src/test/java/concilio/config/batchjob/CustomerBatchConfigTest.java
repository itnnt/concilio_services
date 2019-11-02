package concilio.config.batchjob;


import concilio.config.batchjob.CustomerBatchConfig;
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
import org.springframework.batch.core.JobInstance;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest/*(classes = {CustomerBatchConfig.class, DataSourceConfiguration.class})*/
public class CustomerBatchConfigTest {

    @Autowired
    JobLauncherTestUtils customerBatchTest;

    @Autowired
    RoutingTestUtil routingTestUtil;

    @Autowired
    JobExplorer jobExplorer;

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
        // batch job execution before
        List<JobInstance> jobInstancesBefore = jobExplorer.getJobInstances("customer batch job", 0, Integer.MAX_VALUE);

        // test job run
        DatabaseContextHolder.set(DatabaseEnvironment.DEVELOPMENT);
        JobExecution jobExecution = customerBatchTest.launchJob();
        assertThat(jobExecution.getExitStatus().getExitCode()).isEqualTo("COMPLETED");
        assertThat(jobExecution.getStatus().getBatchStatus().toString()).isEqualTo("COMPLETED");

        // batch job execution after
        List<JobInstance> jobInstances = jobExplorer.getJobInstances("customer batch job", 0, Integer.MAX_VALUE);

        // check logs of job executions
        assertThat(jobInstances.size()).isEqualTo(jobInstancesBefore.size() + 1);
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