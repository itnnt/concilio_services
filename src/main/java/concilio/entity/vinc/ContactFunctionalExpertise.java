package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_functional_expertise")
public class ContactFunctionalExpertise {


  @Column(name="contact_id")
  private long contactId;

  @Column(name="functional_expertise_id")
  private long functionalExpertiseId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Id
  @Column(name="id")
  private long id;

  @Column(name="sub_functional_expertise_id")
  private long subFunctionalExpertiseId;


  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getFunctionalExpertiseId() {
    return this.functionalExpertiseId;
  }

  public void setFunctionalExpertiseId(long functionalExpertiseId) {
    this.functionalExpertiseId = functionalExpertiseId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSubFunctionalExpertiseId() {
    return this.subFunctionalExpertiseId;
  }

  public void setSubFunctionalExpertiseId(long subFunctionalExpertiseId) {
    this.subFunctionalExpertiseId = subFunctionalExpertiseId;
  }
}
