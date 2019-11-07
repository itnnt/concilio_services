package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class UserMailContactId implements Serializable {
  private long userMailMessageId;
  private long contactId;

}
@Entity
@Table(name="user_mail_contact")
@IdClass(UserMailContactId.class)
public class UserMailContact {


  @Id
  @Column(name="user_mail_message_id")
  private long userMailMessageId;

  @Id
  @Column(name="contact_id")
  private long contactId;

  @Column(name="status")
  private long status;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getUserMailMessageId() {
    return this.userMailMessageId;
  }

  public void setUserMailMessageId(long userMailMessageId) {
    this.userMailMessageId = userMailMessageId;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
