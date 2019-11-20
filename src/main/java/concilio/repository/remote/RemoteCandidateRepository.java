package concilio.repository.remote;

import concilio.entity.vinc.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemoteCandidateRepository extends JpaRepository<Candidate, Long> {
}
