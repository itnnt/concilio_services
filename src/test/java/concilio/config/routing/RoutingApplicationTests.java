package concilio.config.routing;

import concilio.config.CustomerBatchConfig;
import concilio.config.datasource.DataSourceConfiguration;
import concilio.model.customer.Customer;
import concilio.repository.customer.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoutingApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

//    @Autowired
//    CacheManager cacheManager;

    @Test
    public void contextSwitchTest() throws Exception {

        // Create a customer in each environment
        for (DatabaseEnvironment databaseEnvironment : DatabaseEnvironment
            .values()) {
            DatabaseContextHolder.set(databaseEnvironment);
            Customer devCustomer = new Customer();
            devCustomer.setId(1L);
            devCustomer.setName("Tony Tester");
            customerRepository.save(devCustomer);
            DatabaseContextHolder.clear();
        }

        // Every customer entry is the first entry
        for (DatabaseEnvironment databaseEnvironment : DatabaseEnvironment
            .values()) {
            DatabaseContextHolder.set(databaseEnvironment);
            assertEquals(1L,
                customerRepository.findOneByName("Tony Tester").getId()
                    .longValue());
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
    @Import({DataSourceConfiguration.class})
    static class BatchTestConfig {

    }

}
