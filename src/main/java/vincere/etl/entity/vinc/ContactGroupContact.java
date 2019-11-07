package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="contact_group_contact")
public class ContactGroupContact {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="contact_group_id")
  private long contactGroupId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getContactGroupId() {
    return this.contactGroupId;
  }

  public void setContactGroupId(long contactGroupId) {
    this.contactGroupId = contactGroupId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
