package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class UserMailContactRelatedId implements Serializable {
  private long userMailMessageId;
  private long contactId;
  private long positionCandidateId;

}

@Entity
@Table(name="user_mail_contact_related")
@IdClass(UserMailContactRelatedId.class)
public class UserMailContactRelated {


  @Id
  @Column(name="user_mail_message_id")
  private long userMailMessageId;

  @Id
  @Column(name="contact_id")
  private long contactId;

  @Id
  @Column(name="position_candidate_id")
  private long positionCandidateId;

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

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
