package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="availability")
public class Availability {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="available")
  private long available;

  @Column(name="recurrence")
  private String recurrence;

  @Column(name="interval")
  private long interval;

  @Column(name="start_time")
  private java.sql.Timestamp startTime;

  @Column(name="end_time")
  private java.sql.Timestamp endTime;

  @Column(name="recurrence_end_time")
  private java.sql.Timestamp recurrenceEndTime;

  @Column(name="recurrence_day")
  private String recurrenceDay;

  @Column(name="note")
  private String note;

  @Column(name="updated_by_id")
  private long updatedById;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


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

  public long getAvailable() {
    return this.available;
  }

  public void setAvailable(long available) {
    this.available = available;
  }

  public String getRecurrence() {
    return this.recurrence;
  }

  public void setRecurrence(String recurrence) {
    this.recurrence = recurrence;
  }

  public long getInterval() {
    return this.interval;
  }

  public void setInterval(long interval) {
    this.interval = interval;
  }

  public java.sql.Timestamp getStartTime() {
    return this.startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }

  public java.sql.Timestamp getEndTime() {
    return this.endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }

  public java.sql.Timestamp getRecurrenceEndTime() {
    return this.recurrenceEndTime;
  }

  public void setRecurrenceEndTime(java.sql.Timestamp recurrenceEndTime) {
    this.recurrenceEndTime = recurrenceEndTime;
  }

  public String getRecurrenceDay() {
    return this.recurrenceDay;
  }

  public void setRecurrenceDay(String recurrenceDay) {
    this.recurrenceDay = recurrenceDay;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public long getUpdatedById() {
    return this.updatedById;
  }

  public void setUpdatedById(long updatedById) {
    this.updatedById = updatedById;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
