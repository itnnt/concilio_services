package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="allowance")
public class Allowance {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="timesheet_id")
  private long timesheetId;

  @Column(name="name")
  private String name;

  @Column(name="pay_period")
  private String payPeriod;

  @Column(name="total_claim")
  private String totalClaim;

  @Column(name="pay_limit")
  private String payLimit;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="type")
  private String type;

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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPayPeriod() {
    return this.payPeriod;
  }

  public void setPayPeriod(String payPeriod) {
    this.payPeriod = payPeriod;
  }

  public String getTotalClaim() {
    return this.totalClaim;
  }

  public void setTotalClaim(String totalClaim) {
    this.totalClaim = totalClaim;
  }

  public String getPayLimit() {
    return this.payLimit;
  }

  public void setPayLimit(String payLimit) {
    this.payLimit = payLimit;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getOfferId() {
    return this.offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }
}
