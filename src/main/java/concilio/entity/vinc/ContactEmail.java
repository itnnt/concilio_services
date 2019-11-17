package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_email")
public class ContactEmail {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="user_id")
  private long userId;

  @Column(name="email_content")
  private String emailContent;

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

  public String getEmailContent() {
    return this.emailContent;
  }

  public void setEmailContent(String emailContent) {
    this.emailContent = emailContent;
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
}
