package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mail_message")
public class MailMessage {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="message_id")
  private String messageId;

  @Column(name="referenced_message_id")
  private String referencedMessageId;

  @Column(name="sender")
  private String sender;

  @Column(name="recipient")
  private String recipient;

  @Column(name="cc")
  private String cc;

  @Column(name="bcc")
  private String bcc;

  @Column(name="subject")
  private String subject;

  @Column(name="received_date")
  private java.sql.Timestamp receivedDate;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="status")
  private long status;

  @Column(name="body")
  private String body;

  @Column(name="uid")
  private long uid;

  @Column(name="folder")
  private String folder;

  @Column(name="user_id")
  private long userId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getMessageId() {
    return this.messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public String getReferencedMessageId() {
    return this.referencedMessageId;
  }

  public void setReferencedMessageId(String referencedMessageId) {
    this.referencedMessageId = referencedMessageId;
  }

  public String getSender() {
    return this.sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
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

  public java.sql.Timestamp getReceivedDate() {
    return this.receivedDate;
  }

  public void setReceivedDate(java.sql.Timestamp receivedDate) {
    this.receivedDate = receivedDate;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public String getBody() {
    return this.body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public long getUid() {
    return this.uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

  public String getFolder() {
    return this.folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
