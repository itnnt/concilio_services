package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_comment")
public class ContactComment {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="user_id")
  private long userId;

  @Column(name="comment_timestamp")
  private java.sql.Timestamp commentTimestamp;

  @Column(name="comment_content")
  private String commentContent;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="assigned_user_id")
  private long assignedUserId;

  @Column(name="next_contact_date")
  private java.sql.Timestamp nextContactDate;

  @Column(name="comment_type")
  private long commentType;

  @Column(name="contact_method")
  private long contactMethod;

  @Column(name="meeting_location")
  private String meetingLocation;

  @Column(name="company_location_id")
  private long companyLocationId;

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

  @Column(name="comment_in_company")
  private long commentInCompany;

  @Column(name="tags")
  private String tags;

  @Column(name="meeting_room")
  private String meetingRoom;

  @Column(name="attendee")
  private String attendee;

  @Column(name="kpi_action")
  private String kpiAction;

  @Column(name="subject")
  private String subject;

  @Column(name="time_zone")
  private String timeZone;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public java.sql.Timestamp getCommentTimestamp() {
    return this.commentTimestamp;
  }

  public void setCommentTimestamp(java.sql.Timestamp commentTimestamp) {
    this.commentTimestamp = commentTimestamp;
  }

  public String getCommentContent() {
    return this.commentContent;
  }

  public void setCommentContent(String commentContent) {
    this.commentContent = commentContent;
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

  public java.sql.Timestamp getNextContactDate() {
    return this.nextContactDate;
  }

  public void setNextContactDate(java.sql.Timestamp nextContactDate) {
    this.nextContactDate = nextContactDate;
  }

  public long getCommentType() {
    return this.commentType;
  }

  public void setCommentType(long commentType) {
    this.commentType = commentType;
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

  public long getCommentInCompany() {
    return this.commentInCompany;
  }

  public void setCommentInCompany(long commentInCompany) {
    this.commentInCompany = commentInCompany;
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
}
