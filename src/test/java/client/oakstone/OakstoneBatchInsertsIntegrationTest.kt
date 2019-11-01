package client.oakstone

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext


@RunWith(SpringRunner::class)
@ActiveProfiles("oakstone")
@SpringBootTest(classes = [OakstoneApplication::class])
class OakstoneBatchInsertsIntegrationTest {
    @PersistenceContext
    private val entityManager: EntityManager? = null

    @Test
    fun whenInsertingSingleTypeOfEntity_thenCreatesSingleBatch() {
        println("adsfad========")
    }

    companion object {

        private val BATCH_SIZE = 5
    }

}
