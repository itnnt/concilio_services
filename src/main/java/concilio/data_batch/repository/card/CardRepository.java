package concilio.data_batch.repository.card;

import concilio.data_batch.model.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
