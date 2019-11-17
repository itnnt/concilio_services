package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compensation_period")
public class CompensationPeriod {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_id")
  private long positionId;

  @Column(name="period_type")
  private long periodType;

  @Column(name="from_date")
  private java.sql.Timestamp fromDate;

  @Column(name="to_date")
  private java.sql.Timestamp toDate;

  @Column(name="delete_timestamp")
  private java.sql.Timestamp deleteTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public long getPeriodType() {
    return this.periodType;
  }

  public void setPeriodType(long periodType) {
    this.periodType = periodType;
  }

  public java.sql.Timestamp getFromDate() {
    return this.fromDate;
  }

  public void setFromDate(java.sql.Timestamp fromDate) {
    this.fromDate = fromDate;
  }

  public java.sql.Timestamp getToDate() {
    return this.toDate;
  }

  public void setToDate(java.sql.Timestamp toDate) {
    this.toDate = toDate;
  }

  public java.sql.Timestamp getDeleteTimestamp() {
    return this.deleteTimestamp;
  }

  public void setDeleteTimestamp(java.sql.Timestamp deleteTimestamp) {
    this.deleteTimestamp = deleteTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
