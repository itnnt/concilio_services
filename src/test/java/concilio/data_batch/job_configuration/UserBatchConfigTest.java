package concilio.data_batch.job_configuration;

import concilio.data_batch.job_configuration.datasource.CardDataSourceConfiguration;
import concilio.data_batch.job_configuration.datasource.ConcilioDataSourceConfiguration;
import concilio.data_batch.repository.card.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobInstance;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = {CardDataSourceConfiguration.class,
                ConcilioDataSourceConfiguration.class,
                UserBatchConfigTest.BatchTestConfig.class})
public class UserBatchConfigTest {

    @Autowired
    JobLauncherTestUtils jobLauncherTestUtils;

    @Autowired
    JobExplorer jobExplorer;

    @Autowired
    UserRepository userRepository;

    @Test
    public void testRemoveAllUser() throws Exception {
        userRepository.deleteAll();
        assertThat(userRepository.findAll().size()).isEqualTo(0);
    }

    @Test
    public void testUserJob() throws Exception {
        List<JobInstance> jobInstanceBefore = jobExplorer.getJobInstances("User-job", 0, Integer.MAX_VALUE);

        userRepository.deleteAll();
        assertThat(userRepository.findAll().size()).isEqualTo(0);
        JobExecution jobExecution = jobLauncherTestUtils.launchJob();
        assertThat(jobExecution.getExitStatus().getExitCode()).isEqualTo("COMPLETED");
        assertThat(userRepository.findAll().size()).isEqualTo(6);

        // make sure spring batch logged execution info to meta data schema
        List<JobInstance> jobInstanceAfter = jobExplorer.getJobInstances("User-job", 0, Integer.MAX_VALUE);
        assertThat(jobInstanceAfter.size()).isEqualTo(jobInstanceBefore.size() + 1);
    }

    @Configuration
    @Import({UserBatchConfig.class, CardDataSourceConfiguration.class})
    static class BatchTestConfig {

        @Autowired
        private Job userJob;

        @Bean
        JobLauncherTestUtils jobLauncherTestUtils() throws NoSuchJobException {
            JobLauncherTestUtils jobLauncherTestUtils = new JobLauncherTestUtils();
            jobLauncherTestUtils.setJob(userJob);
            return jobLauncherTestUtils;
        }
    }
}


