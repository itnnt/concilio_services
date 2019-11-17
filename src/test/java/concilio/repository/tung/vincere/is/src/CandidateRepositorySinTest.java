package concilio.repository.tung.vincere.is.src;

import concilio.entity.concilio.Candidate;
import concilio.repository.tung.vincere.io.sin.CandidateRepositorySin;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CandidateRepositorySinTest {


    @Autowired
    CandidateRepositorySin candidateRepositorySin;

    public Candidate newCandidate() {
        // given
        Candidate candidate = new Candidate();
        candidate.setId(1L);
        candidate.setEmail("cand1test@gmail.com");
        candidate.setFirstName("John");
        candidate.setLastName("Kerry");
        return candidate;
    }

    @Test
    public void saveCandidateThenGet() {
        // given
        Candidate candidate = newCandidate();
        candidateRepositorySin.save(candidate);

        // when
        Candidate found = candidateRepositorySin.getOne(1L);

        // then
        Assertions.assertThat(found).isNotNull();
    }

    @Test
    public void saveCandidateThenGetThenRemove() {
        // given
        Candidate candidate = newCandidate();
        candidateRepositorySin.save(candidate);

        // when
        Candidate found = candidateRepositorySin.getOne(1L);

        // then
        Assertions.assertThat(found).isNotNull();

        long count1 = candidateRepositorySin.count();
        // remove
        candidateRepositorySin.delete(found);

        long count2 = candidateRepositorySin.count();

        Assertions.assertThat(count2).isEqualTo(count1 - 1);
        Assertions.assertThat(null == candidateRepositorySin.getOne(1L));

    }
}
