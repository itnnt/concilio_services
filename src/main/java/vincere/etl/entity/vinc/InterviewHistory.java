package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="interview_history")
public class InterviewHistory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="interview_id")
  private long interviewId;

  @Column(name="interview_date_time_from")
  private java.sql.Timestamp interviewDateTimeFrom;

  @Column(name="interview_date_time_to")
  private java.sql.Timestamp interviewDateTimeTo;

  @Column(name="rescheduled")
  private long rescheduled;

  @Column(name="time_zone")
  private String timeZone;

  @Column(name="completed_date")
  private java.sql.Timestamp completedDate;

  @Column(name="interview_no")
  private long interviewNo;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="creator_id")
  private long creatorId;

  @Column(name="modifier_id")
  private long modifierId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getInterviewId() {
    return this.interviewId;
  }

  public void setInterviewId(long interviewId) {
    this.interviewId = interviewId;
  }

  public java.sql.Timestamp getInterviewDateTimeFrom() {
    return this.interviewDateTimeFrom;
  }

  public void setInterviewDateTimeFrom(java.sql.Timestamp interviewDateTimeFrom) {
    this.interviewDateTimeFrom = interviewDateTimeFrom;
  }

  public java.sql.Timestamp getInterviewDateTimeTo() {
    return this.interviewDateTimeTo;
  }

  public void setInterviewDateTimeTo(java.sql.Timestamp interviewDateTimeTo) {
    this.interviewDateTimeTo = interviewDateTimeTo;
  }

  public long getRescheduled() {
    return this.rescheduled;
  }

  public void setRescheduled(long rescheduled) {
    this.rescheduled = rescheduled;
  }

  public String getTimeZone() {
    return this.timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public java.sql.Timestamp getCompletedDate() {
    return this.completedDate;
  }

  public void setCompletedDate(java.sql.Timestamp completedDate) {
    this.completedDate = completedDate;
  }

  public long getInterviewNo() {
    return this.interviewNo;
  }

  public void setInterviewNo(long interviewNo) {
    this.interviewNo = interviewNo;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getCreatorId() {
    return this.creatorId;
  }

  public void setCreatorId(long creatorId) {
    this.creatorId = creatorId;
  }

  public long getModifierId() {
    return this.modifierId;
  }

  public void setModifierId(long modifierId) {
    this.modifierId = modifierId;
  }
}
