package concilio.config.routing;

import concilio.config.batchjob.CustomerBatchConfig;
import concilio.config.datasource.ConcilioDataSourceConfiguration;
import concilio.config.datasource.DataSourceConfiguration;
import concilio.config.datasource.LocalDataSourceConfiguration;
import concilio.entity.customer.Customer;
import concilio.repository.customer.CustomerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoutingApplicationTests {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    RoutingTestUtil routingTestUtil;

    List dbEnv;
    @Before
    public void setup() {
        dbEnv = new ArrayList();
        dbEnv.add(DatabaseEnvironment.DEVELOPMENT);
        dbEnv.add(DatabaseEnvironment.TESTING);
        dbEnv.add(DatabaseEnvironment.PRODUCTION);
    }
//    @Autowired
//    CacheManager cacheManager;

    @Test
    public void contextSwitchTest() throws Exception {
        // Create databases for each environment
        for (Object databaseEnvironment : dbEnv) {
            routingTestUtil.createDatabase((DatabaseEnvironment)databaseEnvironment);
        }


        // Create a customer in each environment
        for (Object databaseEnvironment : dbEnv) {
            System.out.println("-------------------" + databaseEnvironment + "------------------");
            DatabaseContextHolder.set((DatabaseEnvironment)databaseEnvironment);
            Customer devCustomer = new Customer();
            devCustomer.setId(1L);
            devCustomer.setName("Tony Tester " + databaseEnvironment);
            customerRepository.save(devCustomer);
            DatabaseContextHolder.clear();
        }

        for (Object databaseEnvironment : dbEnv) {
            DatabaseContextHolder.set((DatabaseEnvironment)databaseEnvironment);
            assertEquals(1L, customerRepository.findOneByName(("Tony Tester " + databaseEnvironment)).getId().longValue());

            Customer customer = customerRepository.findById(1L).get();
            System.out.println("--------------------------------------------------------");
            System.out.println(customer.getName());
            DatabaseContextHolder.clear();
        }

       /* // Check if caches are filled for each environment
        for (DatabaseEnvironment databaseEnvironment : DatabaseEnvironment
            .values()) {
            DatabaseContextHolder.set(databaseEnvironment);
            assertEquals("Tony Tester",
                ((Customer) cacheManager.getCache("customers")
                    .get(databaseEnvironment + "-findOneByName-Tony Tester")
                    .get()).getName());
            DatabaseContextHolder.clear();
        }*/

    }

    @Configuration
    @Import({RoutingTestUtil.class, CustomerBatchConfig.class, DataSourceConfiguration.class, LocalDataSourceConfiguration.class, ConcilioDataSourceConfiguration.class})
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
