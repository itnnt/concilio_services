package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pay_rule_item")
public class PayRuleItem {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="timesheet_id")
  private long timesheetId;

  @Column(name="pay_name")
  private String payName;

  @Column(name="rule")
  private String rule;

  @Column(name="hours")
  private String hours;

  @Column(name="from_hour")
  private String fromHour;

  @Column(name="to_hour")
  private String toHour;

  @Column(name="week_day")
  private long weekDay;

  @Column(name="applied_time")
  private double appliedTime;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="offer_id")
  private long offerId;


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

  public String getPayName() {
    return this.payName;
  }

  public void setPayName(String payName) {
    this.payName = payName;
  }

  public String getRule() {
    return this.rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public String getHours() {
    return this.hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

  public String getFromHour() {
    return this.fromHour;
  }

  public void setFromHour(String fromHour) {
    this.fromHour = fromHour;
  }

  public String getToHour() {
    return this.toHour;
  }

  public void setToHour(String toHour) {
    this.toHour = toHour;
  }

  public long getWeekDay() {
    return this.weekDay;
  }

  public void setWeekDay(long weekDay) {
    this.weekDay = weekDay;
  }

  public double getAppliedTime() {
    return this.appliedTime;
  }

  public void setAppliedTime(double appliedTime) {
    this.appliedTime = appliedTime;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getOfferId() {
    return this.offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }
}
