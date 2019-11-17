package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_email")
public class CandidateEmail {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="email_body")
  private String emailBody;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="assigned_user_id")
  private long assignedUserId;

  @Column(name="comment_type")
  private long commentType;

  @Column(name="next_contact_date")
  private java.sql.Timestamp nextContactDate;

  @Column(name="contact_method")
  private long contactMethod;

  @Column(name="meeting_location")
  private String meetingLocation;

  @Column(name="company_location_id")
  private long companyLocationId;

  @Column(name="predefined_comment_id")
  private long predefinedCommentId;

  @Column(name="task_status")
  private long taskStatus;

  @Column(name="next_contact_to_date")
  private java.sql.Timestamp nextContactToDate;


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

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getEmailBody() {
    return this.emailBody;
  }

  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getAssignedUserId() {
    return this.assignedUserId;
  }

  public void setAssignedUserId(long assignedUserId) {
    this.assignedUserId = assignedUserId;
  }

  public long getCommentType() {
    return this.commentType;
  }

  public void setCommentType(long commentType) {
    this.commentType = commentType;
  }

  public java.sql.Timestamp getNextContactDate() {
    return this.nextContactDate;
  }

  public void setNextContactDate(java.sql.Timestamp nextContactDate) {
    this.nextContactDate = nextContactDate;
  }

  public long getContactMethod() {
    return this.contactMethod;
  }

  public void setContactMethod(long contactMethod) {
    this.contactMethod = contactMethod;
  }

  public String getMeetingLocation() {
    return this.meetingLocation;
  }

  public void setMeetingLocation(String meetingLocation) {
    this.meetingLocation = meetingLocation;
  }

  public long getCompanyLocationId() {
    return this.companyLocationId;
  }

  public void setCompanyLocationId(long companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  public long getPredefinedCommentId() {
    return this.predefinedCommentId;
  }

  public void setPredefinedCommentId(long predefinedCommentId) {
    this.predefinedCommentId = predefinedCommentId;
  }

  public long getTaskStatus() {
    return this.taskStatus;
  }

  public void setTaskStatus(long taskStatus) {
    this.taskStatus = taskStatus;
  }

  public java.sql.Timestamp getNextContactToDate() {
    return this.nextContactToDate;
  }

  public void setNextContactToDate(java.sql.Timestamp nextContactToDate) {
    this.nextContactToDate = nextContactToDate;
  }
}
