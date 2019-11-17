package concilio.repository.remote;

import org.springframework.data.jpa.repository.JpaRepository;
import vincere.etl.entity.remote.RemoteCandidate;

public interface RemoteCandidateRepository extends JpaRepository<RemoteCandidate, Long> {
}
