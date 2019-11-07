package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_candidate_feedback")
public class PositionCandidateFeedback {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="interview_id")
  private long interviewId;

  @Column(name="feedback_timestamp")
  private java.sql.Timestamp feedbackTimestamp;

  @Column(name="comment_body")
  private String commentBody;

  @Column(name="feedback_score")
  private double feedbackScore;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="restricted_users")
  private String restrictedUsers;

  @Column(name="on_behalf_interviewer")
  private long onBehalfInterviewer;

  @Column(name="email_message_id")
  private String emailMessageId;

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

  @Column(name="json_relate_info")
  private String jsonRelateInfo;

  @Column(name="kpi_related_lib")
  private String kpiRelatedLib;

  @Column(name="task_id")
  private long taskId;

  @Column(name="related_status")
  private long relatedStatus;

  @Column(name="tags")
  private String tags;

  @Column(name="meeting_room")
  private String meetingRoom;

  @Column(name="attendee")
  private String attendee;

  @Column(name="kpi_action")
  private String kpiAction;

  @Column(name="interview_status")
  private String interviewStatus;

  @Column(name="interview_start_time")
  private java.sql.Timestamp interviewStartTime;

  @Column(name="interview_end_time")
  private java.sql.Timestamp interviewEndTime;

  @Column(name="interview_history_id")
  private long interviewHistoryId;

  @Column(name="subject")
  private String subject;

  @Column(name="time_zone")
  private String timeZone;

  @Column(name="contact_id")
  private long contactId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
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

  public long getInterviewId() {
    return this.interviewId;
  }

  public void setInterviewId(long interviewId) {
    this.interviewId = interviewId;
  }

  public java.sql.Timestamp getFeedbackTimestamp() {
    return this.feedbackTimestamp;
  }

  public void setFeedbackTimestamp(java.sql.Timestamp feedbackTimestamp) {
    this.feedbackTimestamp = feedbackTimestamp;
  }

  public String getCommentBody() {
    return this.commentBody;
  }

  public void setCommentBody(String commentBody) {
    this.commentBody = commentBody;
  }

  public double getFeedbackScore() {
    return this.feedbackScore;
  }

  public void setFeedbackScore(double feedbackScore) {
    this.feedbackScore = feedbackScore;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getRestrictedUsers() {
    return this.restrictedUsers;
  }

  public void setRestrictedUsers(String restrictedUsers) {
    this.restrictedUsers = restrictedUsers;
  }

  public long getOnBehalfInterviewer() {
    return this.onBehalfInterviewer;
  }

  public void setOnBehalfInterviewer(long onBehalfInterviewer) {
    this.onBehalfInterviewer = onBehalfInterviewer;
  }

  public String getEmailMessageId() {
    return this.emailMessageId;
  }

  public void setEmailMessageId(String emailMessageId) {
    this.emailMessageId = emailMessageId;
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

  public String getJsonRelateInfo() {
    return this.jsonRelateInfo;
  }

  public void setJsonRelateInfo(String jsonRelateInfo) {
    this.jsonRelateInfo = jsonRelateInfo;
  }

  public String getKpiRelatedLib() {
    return this.kpiRelatedLib;
  }

  public void setKpiRelatedLib(String kpiRelatedLib) {
    this.kpiRelatedLib = kpiRelatedLib;
  }

  public long getTaskId() {
    return this.taskId;
  }

  public void setTaskId(long taskId) {
    this.taskId = taskId;
  }

  public long getRelatedStatus() {
    return this.relatedStatus;
  }

  public void setRelatedStatus(long relatedStatus) {
    this.relatedStatus = relatedStatus;
  }

  public String getTags() {
    return this.tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public String getMeetingRoom() {
    return this.meetingRoom;
  }

  public void setMeetingRoom(String meetingRoom) {
    this.meetingRoom = meetingRoom;
  }

  public String getAttendee() {
    return this.attendee;
  }

  public void setAttendee(String attendee) {
    this.attendee = attendee;
  }

  public String getKpiAction() {
    return this.kpiAction;
  }

  public void setKpiAction(String kpiAction) {
    this.kpiAction = kpiAction;
  }

  public String getInterviewStatus() {
    return this.interviewStatus;
  }

  public void setInterviewStatus(String interviewStatus) {
    this.interviewStatus = interviewStatus;
  }

  public java.sql.Timestamp getInterviewStartTime() {
    return this.interviewStartTime;
  }

  public void setInterviewStartTime(java.sql.Timestamp interviewStartTime) {
    this.interviewStartTime = interviewStartTime;
  }

  public java.sql.Timestamp getInterviewEndTime() {
    return this.interviewEndTime;
  }

  public void setInterviewEndTime(java.sql.Timestamp interviewEndTime) {
    this.interviewEndTime = interviewEndTime;
  }

  public long getInterviewHistoryId() {
    return this.interviewHistoryId;
  }

  public void setInterviewHistoryId(long interviewHistoryId) {
    this.interviewHistoryId = interviewHistoryId;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getTimeZone() {
    return this.timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }
}
