package org.reil.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = {FtpApplicationTests.BatchTestConfig.class})
public class FtpApplicationTests {

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Test
    public void testHelloWorldJob() throws Exception {
        JobExecution jobExecution = jobLauncherTestUtils.launchJob();
        assertThat(jobExecution.getExitStatus().getExitCode()).isEqualTo("COMPLETED");
    }

    @Configuration
    @Import({FtpGetRemoteFilesTaskletConfiguration.class, FtpApplication.class})
    static class BatchTestConfig {

        @Autowired
        private Job ftpGetRemoteFilesJob;

        @Bean
        JobLauncherTestUtils jobLauncherTestUtils() throws NoSuchJobException {
            JobLauncherTestUtils jobLauncherTestUtils = new JobLauncherTestUtils();
            jobLauncherTestUtils.setJob(ftpGetRemoteFilesJob);
            return jobLauncherTestUtils;
        }
    }
}