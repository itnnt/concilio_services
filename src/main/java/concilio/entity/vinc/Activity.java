package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activity")
public class Activity {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="alert_date_time")
  private java.sql.Timestamp alertDateTime;

  @Column(name="time_zone")
  private String timeZone;

  @Column(name="priority")
  private long priority;

  @Column(name="status")
  private long status;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="followers")
  private String followers;

  @Column(name="tags")
  private String tags;

  @Column(name="related_type")
  private long relatedType;

  @Column(name="relate_object_name")
  private String relateObjectName;

  @Column(name="subject")
  private String subject;

  @Column(name="relate_to_contact")
  private String relateToContact;

  @Column(name="relate_to_job")
  private String relateToJob;

  @Column(name="relate_to_candidate")
  private String relateToCandidate;

  @Column(name="next_contact_date")
  private java.sql.Timestamp nextContactDate;

  @Column(name="next_contact_to_date")
  private java.sql.Timestamp nextContactToDate;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="assigned_user_id")
  private long assignedUserId;

  @Column(name="content")
  private String content;

  @Column(name="relate_to_company")
  private String relateToCompany;

  @Column(name="meeting_location")
  private String meetingLocation;

  @Column(name="meeting_room")
  private String meetingRoom;

  @Column(name="contact_method")
  private long contactMethod;

  @Column(name="attendee")
  private String attendee;

  @Column(name="other_attendee")
  private String otherAttendee;

  @Column(name="position_id")
  private long positionId;

  @Column(name="kpi_action")
  private String kpiAction;

  @Column(name="category")
  private String category;

  @Column(name="type")
  private String type;

  @Column(name="action")
  private String action;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="company_id")
  private long companyId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="comment_type")
  private long commentType;

  @Column(name="interview_status")
  private String interviewStatus;

  @Column(name="interview_start_time")
  private java.sql.Timestamp interviewStartTime;

  @Column(name="interview_end_time")
  private java.sql.Timestamp interviewEndTime;

  @Column(name="interview_history_id")
  private long interviewHistoryId;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="feedback_score")
  private double feedbackScore;

  @Column(name="deal_id")
  private long dealId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public java.sql.Timestamp getAlertDateTime() {
    return this.alertDateTime;
  }

  public void setAlertDateTime(java.sql.Timestamp alertDateTime) {
    this.alertDateTime = alertDateTime;
  }

  public String getTimeZone() {
    return this.timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public long getPriority() {
    return this.priority;
  }

  public void setPriority(long priority) {
    this.priority = priority;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getFollowers() {
    return this.followers;
  }

  public void setFollowers(String followers) {
    this.followers = followers;
  }

  public String getTags() {
    return this.tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public long getRelatedType() {
    return this.relatedType;
  }

  public void setRelatedType(long relatedType) {
    this.relatedType = relatedType;
  }

  public String getRelateObjectName() {
    return this.relateObjectName;
  }

  public void setRelateObjectName(String relateObjectName) {
    this.relateObjectName = relateObjectName;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getRelateToContact() {
    return this.relateToContact;
  }

  public void setRelateToContact(String relateToContact) {
    this.relateToContact = relateToContact;
  }

  public String getRelateToJob() {
    return this.relateToJob;
  }

  public void setRelateToJob(String relateToJob) {
    this.relateToJob = relateToJob;
  }

  public String getRelateToCandidate() {
    return this.relateToCandidate;
  }

  public void setRelateToCandidate(String relateToCandidate) {
    this.relateToCandidate = relateToCandidate;
  }

  public java.sql.Timestamp getNextContactDate() {
    return this.nextContactDate;
  }

  public void setNextContactDate(java.sql.Timestamp nextContactDate) {
    this.nextContactDate = nextContactDate;
  }

  public java.sql.Timestamp getNextContactToDate() {
    return this.nextContactToDate;
  }

  public void setNextContactToDate(java.sql.Timestamp nextContactToDate) {
    this.nextContactToDate = nextContactToDate;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getAssignedUserId() {
    return this.assignedUserId;
  }

  public void setAssignedUserId(long assignedUserId) {
    this.assignedUserId = assignedUserId;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getRelateToCompany() {
    return this.relateToCompany;
  }

  public void setRelateToCompany(String relateToCompany) {
    this.relateToCompany = relateToCompany;
  }

  public String getMeetingLocation() {
    return this.meetingLocation;
  }

  public void setMeetingLocation(String meetingLocation) {
    this.meetingLocation = meetingLocation;
  }

  public String getMeetingRoom() {
    return this.meetingRoom;
  }

  public void setMeetingRoom(String meetingRoom) {
    this.meetingRoom = meetingRoom;
  }

  public long getContactMethod() {
    return this.contactMethod;
  }

  public void setContactMethod(long contactMethod) {
    this.contactMethod = contactMethod;
  }

  public String getAttendee() {
    return this.attendee;
  }

  public void setAttendee(String attendee) {
    this.attendee = attendee;
  }

  public String getOtherAttendee() {
    return this.otherAttendee;
  }

  public void setOtherAttendee(String otherAttendee) {
    this.otherAttendee = otherAttendee;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public String getKpiAction() {
    return this.kpiAction;
  }

  public void setKpiAction(String kpiAction) {
    this.kpiAction = kpiAction;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
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

  public long getCommentType() {
    return this.commentType;
  }

  public void setCommentType(long commentType) {
    this.commentType = commentType;
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

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public double getFeedbackScore() {
    return this.feedbackScore;
  }

  public void setFeedbackScore(double feedbackScore) {
    this.feedbackScore = feedbackScore;
  }

  public long getDealId() {
    return this.dealId;
  }

  public void setDealId(long dealId) {
    this.dealId = dealId;
  }
}
