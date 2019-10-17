package concilio.data_batch.repository.concilio;

import concilio.data_batch.model.concilio.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
