package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="on_cost_template_pay_rule")
public class OnCostTemplatePayRule {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="on_cost_template_id")
  private long onCostTemplateId;

  @Column(name="shift_setting_id")
  private long shiftSettingId;

  @Column(name="pay_rule")
  private long payRule;

  @Column(name="hours")
  private String hours;

  @Column(name="from_hour")
  private String fromHour;

  @Column(name="to_hour")
  private String toHour;

  @Column(name="week_day")
  private long weekDay;

  @Column(name="pay_name_setting_id")
  private long payNameSettingId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="exception_type")
  private long exceptionType;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getOnCostTemplateId() {
    return this.onCostTemplateId;
  }

  public void setOnCostTemplateId(long onCostTemplateId) {
    this.onCostTemplateId = onCostTemplateId;
  }

  public long getShiftSettingId() {
    return this.shiftSettingId;
  }

  public void setShiftSettingId(long shiftSettingId) {
    this.shiftSettingId = shiftSettingId;
  }

  public long getPayRule() {
    return this.payRule;
  }

  public void setPayRule(long payRule) {
    this.payRule = payRule;
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

  public long getPayNameSettingId() {
    return this.payNameSettingId;
  }

  public void setPayNameSettingId(long payNameSettingId) {
    this.payNameSettingId = payNameSettingId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getExceptionType() {
    return this.exceptionType;
  }

  public void setExceptionType(long exceptionType) {
    this.exceptionType = exceptionType;
  }
}
