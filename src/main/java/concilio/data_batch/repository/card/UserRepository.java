package concilio.data_batch.repository.card;

import concilio.data_batch.model.card.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
