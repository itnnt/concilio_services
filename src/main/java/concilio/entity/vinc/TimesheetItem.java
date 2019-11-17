package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timesheet_item")
public class TimesheetItem {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="timesheet_id")
  private long timesheetId;

  @Column(name="day")
  private java.sql.Timestamp day;

  @Column(name="start_time")
  private java.sql.Timestamp startTime;

  @Column(name="end_time")
  private java.sql.Timestamp endTime;

  @Column(name="break_time")
  private long breakTime;

  @Column(name="worked_time")
  private double workedTime;

  @Column(name="shift")
  private String shift;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="day_type")
  private String dayType;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getTimesheetId() {
    return this.timesheetId;
  }

  public void setTimesheetId(long timesheetId) {
    this.timesheetId = timesheetId;
  }

  public java.sql.Timestamp getDay() {
    return this.day;
  }

  public void setDay(java.sql.Timestamp day) {
    this.day = day;
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

  public long getBreakTime() {
    return this.breakTime;
  }

  public void setBreakTime(long breakTime) {
    this.breakTime = breakTime;
  }

  public double getWorkedTime() {
    return this.workedTime;
  }

  public void setWorkedTime(double workedTime) {
    this.workedTime = workedTime;
  }

  public String getShift() {
    return this.shift;
  }

  public void setShift(String shift) {
    this.shift = shift;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getDayType() {
    return this.dayType;
  }

  public void setDayType(String dayType) {
    this.dayType = dayType;
  }
}
