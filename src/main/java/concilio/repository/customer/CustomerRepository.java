package concilio.repository.customer;

import concilio.model.customer.Customer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Cacheable("customers")
    Customer findOneByName(String name);
}
