package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="mail_message_log_attachment")
public class MailMessageLogAttachment {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="mail_message_log_id")
  private long mailMessageLogId;

  @Column(name="attach_filename")
  private String attachFilename;

  @Column(name="saved_server_filename")
  private String savedServerFilename;

  @Column(name="filesize")
  private long filesize;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getMailMessageLogId() {
    return this.mailMessageLogId;
  }

  public void setMailMessageLogId(long mailMessageLogId) {
    this.mailMessageLogId = mailMessageLogId;
  }

  public String getAttachFilename() {
    return this.attachFilename;
  }

  public void setAttachFilename(String attachFilename) {
    this.attachFilename = attachFilename;
  }

  public String getSavedServerFilename() {
    return this.savedServerFilename;
  }

  public void setSavedServerFilename(String savedServerFilename) {
    this.savedServerFilename = savedServerFilename;
  }

  public long getFilesize() {
    return this.filesize;
  }

  public void setFilesize(long filesize) {
    this.filesize = filesize;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
