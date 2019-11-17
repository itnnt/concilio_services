package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_mail_message")
public class UserMailMessage {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

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

  @Column(name="body")
  private String body;

  @Column(name="sent_date")
  private java.sql.Timestamp sentDate;

  @Column(name="received_date")
  private java.sql.Timestamp receivedDate;

  @Column(name="message_id")
  private String messageId;

  @Column(name="folder")
  private String folder;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="sender_name")
  private String senderName;

  @Column(name="attachment_count")
  private long attachmentCount;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
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

  public String getBody() {
    return this.body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public java.sql.Timestamp getSentDate() {
    return this.sentDate;
  }

  public void setSentDate(java.sql.Timestamp sentDate) {
    this.sentDate = sentDate;
  }

  public java.sql.Timestamp getReceivedDate() {
    return this.receivedDate;
  }

  public void setReceivedDate(java.sql.Timestamp receivedDate) {
    this.receivedDate = receivedDate;
  }

  public String getMessageId() {
    return this.messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public String getFolder() {
    return this.folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getSenderName() {
    return this.senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public long getAttachmentCount() {
    return this.attachmentCount;
  }

  public void setAttachmentCount(long attachmentCount) {
    this.attachmentCount = attachmentCount;
  }
}
