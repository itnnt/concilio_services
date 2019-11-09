package vincere.etl.config.routing

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.core.env.Environment
import org.springframework.test.context.junit4.SpringRunner
import vincere.etl.config.datasource.VincDataSourceConfiguration

@RunWith(SpringRunner::class)
@SpringBootTest
class VincereRoutingApplicationTests {

    @Autowired
    internal lateinit var env: Environment

    @Autowired
    internal lateinit var vincereRoutingTestUtil: VincereRoutingTestUtil

    @Test
    @Throws(Exception::class)
    fun contextSwitch_createDataSchema_saveRecodeToTables() {
        // Create databases for each environment
        for (databaseEnvironment in DatabaseEnvironment.values()) {
            val url = env.getRequiredProperty(databaseEnvironment.url)
            val username = env.getRequiredProperty(databaseEnvironment.username)
            val password = env.getRequiredProperty(databaseEnvironment.password)
            val dialect = env.getRequiredProperty(databaseEnvironment.dialect)

            vincereRoutingTestUtil.createDatabase(url, username, password, dialect)
        }
    }

    @Configuration
    @Import(VincereRoutingTestUtil::class, VincDataSourceConfiguration::class)
    internal open class BatchTestConfig {
//        @Autowired
//        var customerBatchJob: Job? = null
//
//        @Bean
//        open fun customerBatchTest(): JobLauncherTestUtils {
//            val jobLauncherTestUtils = JobLauncherTestUtils()
//            jobLauncherTestUtils.job = customerBatchJob
//            return jobLauncherTestUtils
//        }
    }

}
