package concilio.data_batch.model.concilio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {
    @Id
    private Long id;
    private String firstName;

    public Candidate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
