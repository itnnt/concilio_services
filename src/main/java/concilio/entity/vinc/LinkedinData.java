package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="linkedin_data")
public class LinkedinData {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="custom_data")
  private String customData;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public String getCustomData() {
    return this.customData;
  }

  public void setCustomData(String customData) {
    this.customData = customData;
  }
}
