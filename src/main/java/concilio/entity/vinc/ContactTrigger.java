package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_trigger")
public class ContactTrigger {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="trigger_id")
  private long triggerId;

  @Column(name="assigned_user_id")
  private long assignedUserId;

  @Column(name="modified_user_id")
  private long modifiedUserId;

  @Column(name="modified_timestamp")
  private java.sql.Timestamp modifiedTimestamp;

  @Column(name="description")
  private String description;

  @Column(name="next_contact_date")
  private java.sql.Timestamp nextContactDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="deleted_timestamp")
  private java.sql.Timestamp deletedTimestamp;

  @Column(name="status")
  private long status;

  @Column(name="board")
  private long board;

  @Column(name="comment_type")
  private long commentType;

  @Column(name="contact_method")
  private long contactMethod;

  @Column(name="meeting_location")
  private String meetingLocation;

  @Column(name="company_location_id")
  private long companyLocationId;

  @Column(name="last_trigger")
  private long lastTrigger;

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

  @Column(name="kpi_action")
  private long kpiAction;

  @Column(name="meeting_room")
  private String meetingRoom;

  @Column(name="attendee")
  private String attendee;


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

  public long getTriggerId() {
    return this.triggerId;
  }

  public void setTriggerId(long triggerId) {
    this.triggerId = triggerId;
  }

  public long getAssignedUserId() {
    return this.assignedUserId;
  }

  public void setAssignedUserId(long assignedUserId) {
    this.assignedUserId = assignedUserId;
  }

  public long getModifiedUserId() {
    return this.modifiedUserId;
  }

  public void setModifiedUserId(long modifiedUserId) {
    this.modifiedUserId = modifiedUserId;
  }

  public java.sql.Timestamp getModifiedTimestamp() {
    return this.modifiedTimestamp;
  }

  public void setModifiedTimestamp(java.sql.Timestamp modifiedTimestamp) {
    this.modifiedTimestamp = modifiedTimestamp;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public java.sql.Timestamp getNextContactDate() {
    return this.nextContactDate;
  }

  public void setNextContactDate(java.sql.Timestamp nextContactDate) {
    this.nextContactDate = nextContactDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getDeletedTimestamp() {
    return this.deletedTimestamp;
  }

  public void setDeletedTimestamp(java.sql.Timestamp deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public long getBoard() {
    return this.board;
  }

  public void setBoard(long board) {
    this.board = board;
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

  public long getLastTrigger() {
    return this.lastTrigger;
  }

  public void setLastTrigger(long lastTrigger) {
    this.lastTrigger = lastTrigger;
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

  public long getKpiAction() {
    return this.kpiAction;
  }

  public void setKpiAction(long kpiAction) {
    this.kpiAction = kpiAction;
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
}
