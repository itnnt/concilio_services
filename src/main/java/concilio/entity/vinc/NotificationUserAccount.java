package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notification_user_account")
public class NotificationUserAccount {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="contact_comment_id")
  private long contactCommentId;

  @Column(name="contact_trigger_id")
  private long contactTriggerId;

  @Column(name="position_candidate_feedback_id")
  private long positionCandidateFeedbackId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="comment_by")
  private long commentBy;

  @Column(name="read_flag")
  private long readFlag;

  @Column(name="task_id")
  private long taskId;


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

  public long getContactCommentId() {
    return this.contactCommentId;
  }

  public void setContactCommentId(long contactCommentId) {
    this.contactCommentId = contactCommentId;
  }

  public long getContactTriggerId() {
    return this.contactTriggerId;
  }

  public void setContactTriggerId(long contactTriggerId) {
    this.contactTriggerId = contactTriggerId;
  }

  public long getPositionCandidateFeedbackId() {
    return this.positionCandidateFeedbackId;
  }

  public void setPositionCandidateFeedbackId(long positionCandidateFeedbackId) {
    this.positionCandidateFeedbackId = positionCandidateFeedbackId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
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

  public long getCommentBy() {
    return this.commentBy;
  }

  public void setCommentBy(long commentBy) {
    this.commentBy = commentBy;
  }

  public long getReadFlag() {
    return this.readFlag;
  }

  public void setReadFlag(long readFlag) {
    this.readFlag = readFlag;
  }

  public long getTaskId() {
    return this.taskId;
  }

  public void setTaskId(long taskId) {
    this.taskId = taskId;
  }
}
