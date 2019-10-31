package concilio.config.routing

import concilio.config.CustomerBatchConfig
import concilio.config.datasource.ConcilioDataSourceConfiguration
import concilio.config.datasource.DataSourceConfiguration
import concilio.model.customer.Customer
import concilio.repository.customer.CustomerRepository
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.batch.core.Job
import org.springframework.batch.test.JobLauncherTestUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class RoutingApplicationTests2 {

    @Autowired
    internal lateinit var customerRepository: CustomerRepository
    @Autowired
    internal lateinit var routingTestUtil: RoutingTestUtil


    //    @Autowired
    //    CacheManager cacheManager;

    @Test
    @Throws(Exception::class)
    fun contextSwitch_createDataSchema_saveRecodeToTables() {
        // Create databases for each environment
        for (databaseEnvironment in DatabaseEnvironment
                .values()) {
            routingTestUtil.createDatabase(databaseEnvironment)
        }


        // Create a customer in each environment
        for (databaseEnvironment in DatabaseEnvironment.values()) {
            println("-------------------$databaseEnvironment------------------")
            DatabaseContextHolder.set(databaseEnvironment)
            val devCustomer = Customer()
            devCustomer.id = 1L
            devCustomer.name = "Tony Tester $databaseEnvironment"
            customerRepository.save(devCustomer)
            DatabaseContextHolder.clear()
        }

        for (databaseEnvironment in DatabaseEnvironment.values()) {
            DatabaseContextHolder.set(databaseEnvironment)
            assertEquals(1L, customerRepository.findOneByName("Tony Tester $databaseEnvironment").id.toLong())

            val customer = customerRepository.findById(1L).get()
            println("--------------------------------------------------------")
            println(customer.name)
            DatabaseContextHolder.clear()
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

    @Test
    fun contextSwitch_removeRecord() {
        for (databaseEnvironment in DatabaseEnvironment.values()) {
            DatabaseContextHolder.set(databaseEnvironment)
            assertNotNull(customerRepository.findOneByName("Tony Tester $databaseEnvironment"))

            customerRepository.deleteById(customerRepository.findOneByName("Tony Tester $databaseEnvironment").id)

            assertNull(customerRepository.findOneByName("Tony Tester $databaseEnvironment"))
        }
    }

    @Configuration
    @Import(RoutingTestUtil::class, CustomerBatchConfig::class, DataSourceConfiguration::class, ConcilioDataSourceConfiguration::class)
    internal open class BatchTestConfig {
        @Autowired
        var customerBatchJob: Job? = null

        @Bean
        open fun customerBatchTest(): JobLauncherTestUtils {
            val jobLauncherTestUtils = JobLauncherTestUtils()
            jobLauncherTestUtils.job = customerBatchJob
            return jobLauncherTestUtils
        }
    }

}
