package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notification")
public class Notification {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="notification_type")
  private long notificationType;

  @Column(name="action")
  private long action;

  @Column(name="status")
  private long status;

  @Column(name="note")
  private String note;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="read_flag")
  private long readFlag;

  @Column(name="interview_date")
  private java.sql.Timestamp interviewDate;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="created_by_id")
  private long createdById;


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

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public long getNotificationType() {
    return this.notificationType;
  }

  public void setNotificationType(long notificationType) {
    this.notificationType = notificationType;
  }

  public long getAction() {
    return this.action;
  }

  public void setAction(long action) {
    this.action = action;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getReadFlag() {
    return this.readFlag;
  }

  public void setReadFlag(long readFlag) {
    this.readFlag = readFlag;
  }

  public java.sql.Timestamp getInterviewDate() {
    return this.interviewDate;
  }

  public void setInterviewDate(java.sql.Timestamp interviewDate) {
    this.interviewDate = interviewDate;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getCreatedById() {
    return this.createdById;
  }

  public void setCreatedById(long createdById) {
    this.createdById = createdById;
  }
}
