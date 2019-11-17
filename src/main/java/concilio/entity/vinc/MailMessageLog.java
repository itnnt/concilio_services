package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mail_message_log")
public class MailMessageLog {


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

  @Column(name="num_candidate")
  private long numCandidate;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="company_id")
  private long companyId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="status")
  private String status;

  @Column(name="action_type")
  private long actionType;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="uuid")
  private String uuid;


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

  public long getNumCandidate() {
    return this.numCandidate;
  }

  public void setNumCandidate(long numCandidate) {
    this.numCandidate = numCandidate;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getActionType() {
    return this.actionType;
  }

  public void setActionType(long actionType) {
    this.actionType = actionType;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }
}
