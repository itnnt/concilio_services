package vincere.etl.config.datasource

import org.assertj.core.api.Assertions
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.core.env.Environment
import org.springframework.test.context.junit4.SpringRunner
import javax.persistence.EntityManager

@RunWith(SpringRunner::class)
@SpringBootTest
class LocalRoutingApplicationTests {

    @Autowired
    internal lateinit var env: Environment

    @Autowired
    internal lateinit var vincereRoutingTestUtil: LocalRoutingTestUtil

    @Autowired
    internal  lateinit var entityManager: EntityManager

    @Test
    @Throws(Exception::class)
    fun contextSwitch_createDataSchema_saveRecodeToTables() {
        // Create databases for each environment
        for (databaseEnvironment in LocalDatabaseEnvironment.values()) {
            val url = env.getRequiredProperty(databaseEnvironment.url)
            val username = env.getRequiredProperty(databaseEnvironment.username)
            val password = env.getRequiredProperty(databaseEnvironment.password)
            val dialect = env.getRequiredProperty(databaseEnvironment.dialect)

            vincereRoutingTestUtil.createDatabase(url, username, password, dialect)
            val createNativeQuery = entityManager.createNativeQuery("SHOW TABLES")
            var resultList = createNativeQuery.resultList
            Assertions.assertThat(resultList.size).isEqualTo(514)
        }
    }

    @Configuration
    @Import(LocalRoutingTestUtil::class, LocalDataSourceConfiguration::class)
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
