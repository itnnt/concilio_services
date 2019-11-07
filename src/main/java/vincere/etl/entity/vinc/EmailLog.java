package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="email_log")
public class EmailLog {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="email_category")
  private long emailCategory;

  @Column(name="email_status")
  private long emailStatus;

  @Column(name="sent_to_email")
  private String sentToEmail;

  @Column(name="log_message")
  private String logMessage;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


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

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getEmailCategory() {
    return this.emailCategory;
  }

  public void setEmailCategory(long emailCategory) {
    this.emailCategory = emailCategory;
  }

  public long getEmailStatus() {
    return this.emailStatus;
  }

  public void setEmailStatus(long emailStatus) {
    this.emailStatus = emailStatus;
  }

  public String getSentToEmail() {
    return this.sentToEmail;
  }

  public void setSentToEmail(String sentToEmail) {
    this.sentToEmail = sentToEmail;
  }

  public String getLogMessage() {
    return this.logMessage;
  }

  public void setLogMessage(String logMessage) {
    this.logMessage = logMessage;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
