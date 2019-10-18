package concilio.data_batch.repository.db4;

import concilio.data_batch.model.db4.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
