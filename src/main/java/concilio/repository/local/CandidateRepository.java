package concilio.repository.local;

import org.springframework.data.jpa.repository.JpaRepository;
import concilio.entity.vinc.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
