package vincere.etl.repository.local;

import org.springframework.data.jpa.repository.JpaRepository;
import vincere.etl.entity.vinc.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
