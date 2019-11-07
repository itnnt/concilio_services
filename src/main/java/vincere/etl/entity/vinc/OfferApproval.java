package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="offer_approval")
public class OfferApproval {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="status")
  private long status;

  @Column(name="notes")
  private String notes;

  @Column(name="latest_request_date")
  private java.sql.Timestamp latestRequestDate;

  @Column(name="latest_approval_date")
  private java.sql.Timestamp latestApprovalDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getOfferId() {
    return this.offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public String getNotes() {
    return this.notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public java.sql.Timestamp getLatestRequestDate() {
    return this.latestRequestDate;
  }

  public void setLatestRequestDate(java.sql.Timestamp latestRequestDate) {
    this.latestRequestDate = latestRequestDate;
  }

  public java.sql.Timestamp getLatestApprovalDate() {
    return this.latestApprovalDate;
  }

  public void setLatestApprovalDate(java.sql.Timestamp latestApprovalDate) {
    this.latestApprovalDate = latestApprovalDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
