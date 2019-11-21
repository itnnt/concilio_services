package concilio.config.routing;

import concilio.config.batchjob.CandidateSynchBatchConfig2;
import concilio.config.datasource.ConcilioDataSourceConfiguration;
import concilio.config.datasource.LocalDataSourceConfiguration;
import concilio.config.datasource.RemoteDataSourceConfiguration;
import concilio.entity.vinc.Candidate;
import concilio.repository.local.LocalCandidateRepository;
import concilio.repository.remote.RemoteCandidateRepository;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RemoteRoutingApplicationTests {

    @Autowired
    Environment env;

    @Autowired
    LocalCandidateRepository localCandidateRepository;
    @Autowired
    RemoteCandidateRepository remoteCandidateRepository;
    @Autowired
    LocalRoutingTestUtil vincereRoutingTestUtil;

    List dbEnv;
    @Before
    public void setup() {
        dbEnv = new ArrayList();
        dbEnv.add(DatabaseEnvironment.remote_tung_vincere_io);
        dbEnv.add(DatabaseEnvironment.remote_strivesale_vincere_io);
    }

   /* @Test
    public void test1_contextSwitch_removeRecords() {
        for (Object databaseEnvironment : dbEnv) {
            DatabaseContextHolder.set((DatabaseEnvironment)databaseEnvironment);
            remoteCandidateRepository.deleteAll();
            Assert.assertEquals(0, remoteCandidateRepository.findAll().size());
        }
    }*/

    @Test
    public void test2_contextSwitch_saveNewRecords() throws Exception {
        // Create databases for each environment
        /*for (Object databaseEnvironment : dbEnv) {
            DatabaseEnvironment currentDbEnv = (DatabaseEnvironment) databaseEnvironment;
            String url = env.getRequiredProperty(currentDbEnv.url);
            String username = env.getRequiredProperty(currentDbEnv.username);
            String password = env.getRequiredProperty(currentDbEnv.password);
            String dialect = env.getRequiredProperty(currentDbEnv.dialect);

            vincereRoutingTestUtil.createDatabase(url, username, password, dialect);
        }*/

        // Create a customer in each environment
        for (Object databaseEnvironment : dbEnv) {
            System.out.println("-------------------" + databaseEnvironment + "------------------");
            DatabaseContextHolder.set((DatabaseEnvironment)databaseEnvironment);

            Candidate cand = new Candidate();
            cand.setId(1L);
            cand.setFirstName("Tony Tester " + databaseEnvironment);
            remoteCandidateRepository.save(cand);

            Candidate cand2 = new Candidate();
            cand2.setId(2L);
            cand2.setFirstName("Tony Tester2 " + databaseEnvironment);
            remoteCandidateRepository.save(cand2);

            DatabaseContextHolder.clear();
        }

        for (Object databaseEnvironment : dbEnv) {
            DatabaseContextHolder.set((DatabaseEnvironment)databaseEnvironment);
            Assertions.assertThat(1L).isEqualTo(remoteCandidateRepository.findById(1L).get().getId());
            Assertions.assertThat(2L).isEqualTo(remoteCandidateRepository.findById(2L).get().getId());

            Candidate localCandidate = remoteCandidateRepository.findById(1L).get();
            System.out.println("--------------------------------------------------------");
            System.out.println(localCandidate.getFirstName());
            DatabaseContextHolder.clear();
        }
    }

    @Configuration
    @Import({
            LocalRoutingTestUtil.class,
            CandidateSynchBatchConfig2.class,
            ConcilioDataSourceConfiguration.class, // the primary datasource should always be imported first

            LocalDataSourceConfiguration.class,
            RemoteDataSourceConfiguration.class,
    })
    static class BatchTestConfig {
    }

}
