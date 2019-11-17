package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scheduled_offer_renewal_job")
public class ScheduledOfferRenewalJob {


  @Id
  @Column(name="offer_id")
  private long offerId;

  @Column(name="start_date")
  private java.sql.Timestamp startDate;

  @Column(name="end_date")
  private java.sql.Timestamp endDate;

  @Column(name="updated_timestamp")
  private java.sql.Timestamp updatedTimestamp;

  @Column(name="start_timestamp")
  private java.sql.Timestamp startTimestamp;

  @Column(name="start_complete_timestamp")
  private java.sql.Timestamp startCompleteTimestamp;

  @Column(name="end_complete_timestamp")
  private java.sql.Timestamp endCompleteTimestamp;


  public long getOfferId() {
    return this.offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }

  public java.sql.Timestamp getStartDate() {
    return this.startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }

  public java.sql.Timestamp getEndDate() {
    return this.endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }

  public java.sql.Timestamp getUpdatedTimestamp() {
    return this.updatedTimestamp;
  }

  public void setUpdatedTimestamp(java.sql.Timestamp updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }

  public java.sql.Timestamp getStartTimestamp() {
    return this.startTimestamp;
  }

  public void setStartTimestamp(java.sql.Timestamp startTimestamp) {
    this.startTimestamp = startTimestamp;
  }

  public java.sql.Timestamp getStartCompleteTimestamp() {
    return this.startCompleteTimestamp;
  }

  public void setStartCompleteTimestamp(java.sql.Timestamp startCompleteTimestamp) {
    this.startCompleteTimestamp = startCompleteTimestamp;
  }

  public java.sql.Timestamp getEndCompleteTimestamp() {
    return this.endCompleteTimestamp;
  }

  public void setEndCompleteTimestamp(java.sql.Timestamp endCompleteTimestamp) {
    this.endCompleteTimestamp = endCompleteTimestamp;
  }
}
