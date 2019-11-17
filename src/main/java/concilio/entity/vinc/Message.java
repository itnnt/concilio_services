package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="message")
  private String message;

  @Column(name="message_candidate")
  private String messageCandidate;

  @Column(name="message_position_description")
  private String messagePositionDescription;

  @Column(name="position_is_read_message")
  private long positionIsReadMessage;

  @Column(name="candidate_is_read_message")
  private long candidateIsReadMessage;

  @Column(name="answered_user_id")
  private long answeredUserId;

  @Column(name="position_timestamp")
  private java.sql.Timestamp positionTimestamp;

  @Column(name="candidate_timestamp")
  private java.sql.Timestamp candidateTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="redirect_my_task_board")
  private long redirectMyTaskBoard;

  @Column(name="message_agency")
  private String messageAgency;

  @Column(name="agency_id")
  private long agencyId;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="agency_is_read_message")
  private long agencyIsReadMessage;

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

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessageCandidate() {
    return this.messageCandidate;
  }

  public void setMessageCandidate(String messageCandidate) {
    this.messageCandidate = messageCandidate;
  }

  public String getMessagePositionDescription() {
    return this.messagePositionDescription;
  }

  public void setMessagePositionDescription(String messagePositionDescription) {
    this.messagePositionDescription = messagePositionDescription;
  }

  public long getPositionIsReadMessage() {
    return this.positionIsReadMessage;
  }

  public void setPositionIsReadMessage(long positionIsReadMessage) {
    this.positionIsReadMessage = positionIsReadMessage;
  }

  public long getCandidateIsReadMessage() {
    return this.candidateIsReadMessage;
  }

  public void setCandidateIsReadMessage(long candidateIsReadMessage) {
    this.candidateIsReadMessage = candidateIsReadMessage;
  }

  public long getAnsweredUserId() {
    return this.answeredUserId;
  }

  public void setAnsweredUserId(long answeredUserId) {
    this.answeredUserId = answeredUserId;
  }

  public java.sql.Timestamp getPositionTimestamp() {
    return this.positionTimestamp;
  }

  public void setPositionTimestamp(java.sql.Timestamp positionTimestamp) {
    this.positionTimestamp = positionTimestamp;
  }

  public java.sql.Timestamp getCandidateTimestamp() {
    return this.candidateTimestamp;
  }

  public void setCandidateTimestamp(java.sql.Timestamp candidateTimestamp) {
    this.candidateTimestamp = candidateTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getRedirectMyTaskBoard() {
    return this.redirectMyTaskBoard;
  }

  public void setRedirectMyTaskBoard(long redirectMyTaskBoard) {
    this.redirectMyTaskBoard = redirectMyTaskBoard;
  }

  public String getMessageAgency() {
    return this.messageAgency;
  }

  public void setMessageAgency(String messageAgency) {
    this.messageAgency = messageAgency;
  }

  public long getAgencyId() {
    return this.agencyId;
  }

  public void setAgencyId(long agencyId) {
    this.agencyId = agencyId;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getAgencyIsReadMessage() {
    return this.agencyIsReadMessage;
  }

  public void setAgencyIsReadMessage(long agencyIsReadMessage) {
    this.agencyIsReadMessage = agencyIsReadMessage;
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
