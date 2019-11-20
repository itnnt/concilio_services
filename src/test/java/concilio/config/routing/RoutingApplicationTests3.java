package concilio.config.routing;

import concilio.config.batchjob.CustomerBatchConfig;
import concilio.config.datasource.ConcilioDataSourceConfiguration;
import concilio.config.datasource.DataSourceConfiguration;
import concilio.config.datasource.LocalDataSourceConfiguration;
import concilio.entity.customer.Customer;
import concilio.repository.customer.CustomerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoutingApplicationTests3 {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    RoutingTestUtil routingTestUtil;

    List dbEnv;
    @Before
    public void setup() throws Exception {
        dbEnv = new ArrayList();
        dbEnv.add(DatabaseEnvironment.DEVELOPMENT);
        dbEnv.add(DatabaseEnvironment.TESTING);
        dbEnv.add(DatabaseEnvironment.PRODUCTION);

        for (Object databaseEnvironment : dbEnv) {
            routingTestUtil.createDatabase((DatabaseEnvironment)databaseEnvironment);
        }
    }

    @Test
    public void contextSwitch_removeRecord() {
        for (Object databaseEnvironment : dbEnv) {
            DatabaseContextHolder.set((DatabaseEnvironment)databaseEnvironment);
            Assert.assertNotNull(customerRepository.findOneByName("Tony Tester " + databaseEnvironment));
            customerRepository.deleteById(customerRepository.findOneByName("Tony Tester " + databaseEnvironment).getId());
            Assert.assertNull(customerRepository.findOneByName("Tony Tester $databaseEnvironment"));
        }
    }

    @Test
    public void contextSwitch_saveNewRecordTest() throws Exception {
        // Create a customer in each environment
        for (Object databaseEnvironment : dbEnv) {
            System.out.println("-------------------" + databaseEnvironment + "------------------");
            DatabaseContextHolder.set((DatabaseEnvironment)databaseEnvironment);

            Customer devCustomer = new Customer();
            devCustomer.setId(1L);
            devCustomer.setName("Tony Tester " + databaseEnvironment);
            customerRepository.save(devCustomer);

            Customer devCustomer2 = new Customer();
            devCustomer2.setId(2L);
            devCustomer2.setName("Tony Tester2 " + databaseEnvironment);
            customerRepository.save(devCustomer2);

            DatabaseContextHolder.clear();
        }

        for (Object databaseEnvironment : dbEnv) {
            DatabaseContextHolder.set((DatabaseEnvironment)databaseEnvironment);
            assertEquals(1L, customerRepository.findOneByName(("Tony Tester " + databaseEnvironment)).getId().longValue());
            assertEquals(2L, customerRepository.findOneByName(("Tony Tester2 " + databaseEnvironment)).getId().longValue());

            Customer customer = customerRepository.findById(1L).get();
            System.out.println("--------------------------------------------------------");
            System.out.println(customer.getName());
            DatabaseContextHolder.clear();
        }
    }

    @Configuration
    @Import({
            ConcilioDataSourceConfiguration.class,
            RoutingTestUtil.class,
            DataSourceConfiguration.class,
            CustomerBatchConfig.class,
    })
    static class BatchTestConfig {
    }

}
