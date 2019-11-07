package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="paid_time_off_item")
public class PaidTimeOffItem {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="pto_code_id")
  private long ptoCodeId;

  @Column(name="job_id")
  private long jobId;

  @Column(name="paid_hours")
  private double paidHours;

  @Column(name="accruals_tracking")
  private long accrualsTracking;

  @Column(name="charge_to_client")
  private long chargeToClient;

  @Column(name="status")
  private String status;

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

  public long getPtoCodeId() {
    return this.ptoCodeId;
  }

  public void setPtoCodeId(long ptoCodeId) {
    this.ptoCodeId = ptoCodeId;
  }

  public long getJobId() {
    return this.jobId;
  }

  public void setJobId(long jobId) {
    this.jobId = jobId;
  }

  public double getPaidHours() {
    return this.paidHours;
  }

  public void setPaidHours(double paidHours) {
    this.paidHours = paidHours;
  }

  public long getAccrualsTracking() {
    return this.accrualsTracking;
  }

  public void setAccrualsTracking(long accrualsTracking) {
    this.accrualsTracking = accrualsTracking;
  }

  public long getChargeToClient() {
    return this.chargeToClient;
  }

  public void setChargeToClient(long chargeToClient) {
    this.chargeToClient = chargeToClient;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
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
