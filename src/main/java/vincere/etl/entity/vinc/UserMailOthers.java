package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="user_mail_others")
public class UserMailOthers {


  @Id
  @Column(name="user_mail_message_id")
  private long userMailMessageId;

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
