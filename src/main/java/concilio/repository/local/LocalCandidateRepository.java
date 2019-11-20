package concilio.repository.local;

import concilio.entity.local.LocalCandidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalCandidateRepository extends JpaRepository<LocalCandidate, Long> {
}
