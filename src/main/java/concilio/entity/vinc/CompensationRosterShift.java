package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compensation_roster_shift")
public class CompensationRosterShift {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="compensation_roster_id")
  private long compensationRosterId;

  @Column(name="comp_setting_id")
  private long compSettingId;

  @Column(name="plus_day")
  private long plusDay;

  @Column(name="start_time")
  private String startTime;

  @Column(name="end_time")
  private String endTime;

  @Column(name="break_time")
  private String breakTime;

  @Column(name="shift_hour")
  private String shiftHour;

  @Column(name="note")
  private String note;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCompensationRosterId() {
    return this.compensationRosterId;
  }

  public void setCompensationRosterId(long compensationRosterId) {
    this.compensationRosterId = compensationRosterId;
  }

  public long getCompSettingId() {
    return this.compSettingId;
  }

  public void setCompSettingId(long compSettingId) {
    this.compSettingId = compSettingId;
  }

  public long getPlusDay() {
    return this.plusDay;
  }

  public void setPlusDay(long plusDay) {
    this.plusDay = plusDay;
  }

  public String getStartTime() {
    return this.startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return this.endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getBreakTime() {
    return this.breakTime;
  }

  public void setBreakTime(String breakTime) {
    this.breakTime = breakTime;
  }

  public String getShiftHour() {
    return this.shiftHour;
  }

  public void setShiftHour(String shiftHour) {
    this.shiftHour = shiftHour;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
