package concilio.repository.concilio;

import concilio.entity.concilio.ConcilioMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcilioMemberRepository extends JpaRepository<ConcilioMember, Long> {
}
