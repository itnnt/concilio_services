package concilio.config.routing;

import concilio.config.CustomerBatchConfig;
import concilio.config.datasource.ConcilioDataSourceConfiguration;
import concilio.config.datasource.DataSourceConfiguration;
import concilio.model.customer.Customer;
import concilio.repository.customer.CustomerRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoutingApplicationTests {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    RoutingTestUtil routingTestUtil;


//    @Autowired
//    CacheManager cacheManager;

    @Test
    public void contextSwitchTest() throws Exception {
        // Create databases for each environment
        for (DatabaseEnvironment databaseEnvironment : DatabaseEnvironment
            .values()) {
            routingTestUtil.createDatabase(databaseEnvironment);
        }


        // Create a customer in each environment
        for (DatabaseEnvironment databaseEnvironment : DatabaseEnvironment.values()) {
            System.out.println("-------------------" + databaseEnvironment + "------------------");
            DatabaseContextHolder.set(databaseEnvironment);
            Customer devCustomer = new Customer();
            devCustomer.setId(1L);
            devCustomer.setName("Tony Tester " + databaseEnvironment);
            customerRepository.save(devCustomer);
            DatabaseContextHolder.clear();
        }

        for (DatabaseEnvironment databaseEnvironment : DatabaseEnvironment.values()) {
            DatabaseContextHolder.set(databaseEnvironment);
            assertEquals(1L,
//                customerRepository.findOneByName("Tony Tester").getId().longValue());
                    customerRepository.findById(1L).get().getId().longValue());

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

//    @Autowired
//    JobLauncherTestUtils customerBatchTest;

//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }

//    @Test
//    public void customerBatchJob() throws Exception {
//        DatabaseContextHolder.set(DatabaseEnvironment.DEVELOPMENT);
//        JobExecution jobExecution = customerBatchTest.launchJob();
//        assertThat(jobExecution.getExitStatus().getExitCode()).isEqualTo("COMPLETED");
//
//    }

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
