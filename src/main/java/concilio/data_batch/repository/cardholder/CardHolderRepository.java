package concilio.data_batch.repository.cardholder;

import concilio.data_batch.model.cardholder.CardHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
}
