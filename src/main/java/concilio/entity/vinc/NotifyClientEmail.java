package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notify_client_email")
public class NotifyClientEmail {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="uid")
  private long uid;

  @Column(name="purpose_code")
  private long purposeCode;

  @Column(name="recipient")
  private String recipient;

  @Column(name="cc")
  private String cc;

  @Column(name="bcc")
  private String bcc;

  @Column(name="subject")
  private String subject;

  @Column(name="body")
  private String body;

  @Column(name="user_id")
  private long userId;

  @Column(name="urls")
  private String urls;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUid() {
    return this.uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

  public long getPurposeCode() {
    return this.purposeCode;
  }

  public void setPurposeCode(long purposeCode) {
    this.purposeCode = purposeCode;
  }

  public String getRecipient() {
    return this.recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public String getCc() {
    return this.cc;
  }

  public void setCc(String cc) {
    this.cc = cc;
  }

  public String getBcc() {
    return this.bcc;
  }

  public void setBcc(String bcc) {
    this.bcc = bcc;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getBody() {
    return this.body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getUrls() {
    return this.urls;
  }

  public void setUrls(String urls) {
    this.urls = urls;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
