package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="interview_time")
public class InterviewTime {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="interview_id")
  private long interviewId;

  @Column(name="interview_date_time_from")
  private java.sql.Timestamp interviewDateTimeFrom;

  @Column(name="interview_date_time_to")
  private java.sql.Timestamp interviewDateTimeTo;

  @Column(name="selected")
  private long selected;

  @Column(name="rescheduled")
  private long rescheduled;

  @Column(name="index_num")
  private long indexNum;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="time_zone")
  private String timeZone;


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

  public long getSelected() {
    return this.selected;
  }

  public void setSelected(long selected) {
    this.selected = selected;
  }

  public long getRescheduled() {
    return this.rescheduled;
  }

  public void setRescheduled(long rescheduled) {
    this.rescheduled = rescheduled;
  }

  public long getIndexNum() {
    return this.indexNum;
  }

  public void setIndexNum(long indexNum) {
    this.indexNum = indexNum;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getTimeZone() {
    return this.timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }
}
