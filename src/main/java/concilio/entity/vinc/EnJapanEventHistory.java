package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="en_japan_event_history")
public class EnJapanEventHistory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="candidate_name")
  private String candidateName;

  @Column(name="event_type")
  private long eventType;

  @Column(name="job_id")
  private long jobId;

  @Column(name="job_name")
  private String jobName;

  @Column(name="recent_log")
  private long recentLog;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public String getCandidateName() {
    return this.candidateName;
  }

  public void setCandidateName(String candidateName) {
    this.candidateName = candidateName;
  }

  public long getEventType() {
    return this.eventType;
  }

  public void setEventType(long eventType) {
    this.eventType = eventType;
  }

  public long getJobId() {
    return this.jobId;
  }

  public void setJobId(long jobId) {
    this.jobId = jobId;
  }

  public String getJobName() {
    return this.jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public long getRecentLog() {
    return this.recentLog;
  }

  public void setRecentLog(long recentLog) {
    this.recentLog = recentLog;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
