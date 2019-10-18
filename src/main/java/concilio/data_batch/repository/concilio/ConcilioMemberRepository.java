package concilio.data_batch.repository.concilio;

import concilio.data_batch.model.concilio.ConcilioMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcilioMemberRepository extends JpaRepository<ConcilioMember, Long> {
}
