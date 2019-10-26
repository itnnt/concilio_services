package concilio.repository.cardholder;

import concilio.model.cardholder.CardHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
}
