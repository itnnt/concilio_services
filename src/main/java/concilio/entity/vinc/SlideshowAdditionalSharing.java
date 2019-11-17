package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="slideshow_additional_sharing")
public class SlideshowAdditionalSharing {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="slideshow_id")
  private long slideshowId;

  @Column(name="emails")
  private String emails;

  @Column(name="subject")
  private String subject;

  @Column(name="message")
  private String message;

  @Column(name="uuid")
  private String uuid;

  @Column(name="date_modified")
  private java.sql.Timestamp dateModified;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSlideshowId() {
    return this.slideshowId;
  }

  public void setSlideshowId(long slideshowId) {
    this.slideshowId = slideshowId;
  }

  public String getEmails() {
    return this.emails;
  }

  public void setEmails(String emails) {
    this.emails = emails;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }

  public void setDateModified(java.sql.Timestamp dateModified) {
    this.dateModified = dateModified;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
