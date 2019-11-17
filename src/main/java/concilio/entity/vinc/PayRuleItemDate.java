package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pay_rule_item_date")
public class PayRuleItemDate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="pay_rule_item_id")
  private long payRuleItemId;

  @Column(name="applied_date")
  private java.sql.Timestamp appliedDate;

  @Column(name="start_time")
  private java.sql.Timestamp startTime;

  @Column(name="end_time")
  private java.sql.Timestamp endTime;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPayRuleItemId() {
    return this.payRuleItemId;
  }

  public void setPayRuleItemId(long payRuleItemId) {
    this.payRuleItemId = payRuleItemId;
  }

  public java.sql.Timestamp getAppliedDate() {
    return this.appliedDate;
  }

  public void setAppliedDate(java.sql.Timestamp appliedDate) {
    this.appliedDate = appliedDate;
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

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
