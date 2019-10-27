package concilio.repository.local.tung.vincere.is.src;

import concilio.model.concilio.Candidate;
import concilio.repository.local.tung.vincere.io.src.CandidateRepositorySrc;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CandidateRepositorySrcTest {


    @Autowired
    CandidateRepositorySrc candidateRepositorySrc;

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
        candidateRepositorySrc.save(candidate);

        // when
        Candidate found = candidateRepositorySrc.getOne(1L);

        // then
        Assertions.assertThat(found).isNotNull();
    }

    @Test
    public void saveCandidateThenGetThenRemove() {
        // given
        Candidate candidate = newCandidate();
        candidateRepositorySrc.save(candidate);

        // when
        Candidate found = candidateRepositorySrc.getOne(1L);

        // then
        Assertions.assertThat(found).isNotNull();

        long count1 = candidateRepositorySrc.count();
        // remove
        candidateRepositorySrc.delete(found);

        long count2 = candidateRepositorySrc.count();

        Assertions.assertThat(count2).isEqualTo(count1 - 1);
        Assertions.assertThat(null == candidateRepositorySrc.getOne(1L));

    }
}
