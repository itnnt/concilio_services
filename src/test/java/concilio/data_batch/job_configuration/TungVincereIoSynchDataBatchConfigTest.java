package concilio.data_batch.job_configuration;

import concilio.data_batch.job_configuration.datasource.CardDataSourceConfiguration;
import concilio.data_batch.job_configuration.datasource.ConcilioDataSourceConfiguration;
import concilio.data_batch.job_configuration.datasource.SinTungVincereIoDataSourceConfiguration;
import concilio.data_batch.job_configuration.datasource.SrcTungVincereIoDataSourceConfiguration;
import concilio.data_batch.repository.local.tung.vincere.io.sin.CandidateRepositorySin;
import concilio.data_batch.repository.local.tung.vincere.io.src.CandidateRepositorySrc;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.explore.JobExplorer;
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
        classes = {
                SinTungVincereIoDataSourceConfiguration.class,
                SrcTungVincereIoDataSourceConfiguration.class,
                ConcilioDataSourceConfiguration.class,
                TungVincereIoSynchDataBatchConfigTest.BatchTestConfig.class
        })
public class TungVincereIoSynchDataBatchConfigTest {

    @Autowired
    JobLauncherTestUtils jobLauncherTestUtils;

    @Autowired
    JobExplorer jobExplorer;

    @Autowired
    CandidateRepositorySrc candidateRepositorySrc;

    @Autowired
    CandidateRepositorySin candidateRepositorySin;

    @Test
    public void testJobSchynCandidate() throws Exception {
        // remove all rows from the sink database's candidate table
        candidateRepositorySin.deleteAllInBatch();

        // make sure the candidate table was empty
        assertThat(candidateRepositorySin.count()).isEqualTo(0);

        // run job to synch candidate table
        JobExecution jobExecution = jobLauncherTestUtils.launchJob();

        // make sure the job has been completed
        assertThat(jobExecution.getExitStatus().getExitCode()).isEqualTo("COMPLETED");

        // make sure all rows had been synchronized
        assertThat(candidateRepositorySrc.count()).isEqualTo(candidateRepositorySin.count());
    }

    @Configuration
    @Import({TungVincereIoSynchDataBatchConfig.class})
    static class BatchTestConfig {
        @Autowired
        private Job jobSchynCandidate;

        @Bean
        JobLauncherTestUtils jobLauncherTestUtils() throws NoSuchJobException {
            JobLauncherTestUtils jobLauncherTestUtils = new JobLauncherTestUtils();
            jobLauncherTestUtils.setJob(jobSchynCandidate);
            return jobLauncherTestUtils;
        }
    }
}
