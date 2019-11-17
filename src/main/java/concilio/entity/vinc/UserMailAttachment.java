package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_mail_attachment")
public class UserMailAttachment {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_mail_message_id")
  private long userMailMessageId;

  @Column(name="attach_filename")
  private String attachFilename;

  @Column(name="saved_local_filename")
  private String savedLocalFilename;

  @Column(name="saved_server_filename")
  private String savedServerFilename;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserMailMessageId() {
    return this.userMailMessageId;
  }

  public void setUserMailMessageId(long userMailMessageId) {
    this.userMailMessageId = userMailMessageId;
  }

  public String getAttachFilename() {
    return this.attachFilename;
  }

  public void setAttachFilename(String attachFilename) {
    this.attachFilename = attachFilename;
  }

  public String getSavedLocalFilename() {
    return this.savedLocalFilename;
  }

  public void setSavedLocalFilename(String savedLocalFilename) {
    this.savedLocalFilename = savedLocalFilename;
  }

  public String getSavedServerFilename() {
    return this.savedServerFilename;
  }

  public void setSavedServerFilename(String savedServerFilename) {
    this.savedServerFilename = savedServerFilename;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
