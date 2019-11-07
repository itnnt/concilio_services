package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="bulk_email_log")
public class BulkEmailLog {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="screen_no")
  private long screenNo;

  @Column(name="sent_to_name")
  private String sentToName;

  @Column(name="sent_to_email")
  private String sentToEmail;

  @Column(name="log_message")
  private String logMessage;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="recent_log")
  private long recentLog;

  @Column(name="contact_log")
  private long contactLog;


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

  public long getScreenNo() {
    return this.screenNo;
  }

  public void setScreenNo(long screenNo) {
    this.screenNo = screenNo;
  }

  public String getSentToName() {
    return this.sentToName;
  }

  public void setSentToName(String sentToName) {
    this.sentToName = sentToName;
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

  public long getRecentLog() {
    return this.recentLog;
  }

  public void setRecentLog(long recentLog) {
    this.recentLog = recentLog;
  }

  public long getContactLog() {
    return this.contactLog;
  }

  public void setContactLog(long contactLog) {
    this.contactLog = contactLog;
  }
}
