package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_candidate_history")
public class PositionCandidateHistory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="decline_reason")
  private String declineReason;

  @Column(name="declined_date")
  private java.sql.Timestamp declinedDate;

  @Column(name="introduced_date")
  private java.sql.Timestamp introducedDate;

  @Column(name="sent_date")
  private java.sql.Timestamp sentDate;

  @Column(name="accepted_date")
  private java.sql.Timestamp acceptedDate;

  @Column(name="offer_date")
  private java.sql.Timestamp offerDate;

  @Column(name="rejected_date")
  private java.sql.Timestamp rejectedDate;

  @Column(name="hire_date")
  private java.sql.Timestamp hireDate;

  @Column(name="resigned_date")
  private java.sql.Timestamp resignedDate;

  @Column(name="reason_for_offer_rejection")
  private String reasonForOfferRejection;

  @Column(name="offer_accepted_date")
  private java.sql.Timestamp offerAcceptedDate;

  @Column(name="status")
  private long status;

  @Column(name="old_status")
  private long oldStatus;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="interview1_date")
  private java.sql.Timestamp interview1Date;

  @Column(name="interview2_date")
  private java.sql.Timestamp interview2Date;

  @Column(name="last_stage_date")
  private java.sql.Timestamp lastStageDate;

  @Column(name="configurable_stage_id")
  private long configurableStageId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public String getDeclineReason() {
    return this.declineReason;
  }

  public void setDeclineReason(String declineReason) {
    this.declineReason = declineReason;
  }

  public java.sql.Timestamp getDeclinedDate() {
    return this.declinedDate;
  }

  public void setDeclinedDate(java.sql.Timestamp declinedDate) {
    this.declinedDate = declinedDate;
  }

  public java.sql.Timestamp getIntroducedDate() {
    return this.introducedDate;
  }

  public void setIntroducedDate(java.sql.Timestamp introducedDate) {
    this.introducedDate = introducedDate;
  }

  public java.sql.Timestamp getSentDate() {
    return this.sentDate;
  }

  public void setSentDate(java.sql.Timestamp sentDate) {
    this.sentDate = sentDate;
  }

  public java.sql.Timestamp getAcceptedDate() {
    return this.acceptedDate;
  }

  public void setAcceptedDate(java.sql.Timestamp acceptedDate) {
    this.acceptedDate = acceptedDate;
  }

  public java.sql.Timestamp getOfferDate() {
    return this.offerDate;
  }

  public void setOfferDate(java.sql.Timestamp offerDate) {
    this.offerDate = offerDate;
  }

  public java.sql.Timestamp getRejectedDate() {
    return this.rejectedDate;
  }

  public void setRejectedDate(java.sql.Timestamp rejectedDate) {
    this.rejectedDate = rejectedDate;
  }

  public java.sql.Timestamp getHireDate() {
    return this.hireDate;
  }

  public void setHireDate(java.sql.Timestamp hireDate) {
    this.hireDate = hireDate;
  }

  public java.sql.Timestamp getResignedDate() {
    return this.resignedDate;
  }

  public void setResignedDate(java.sql.Timestamp resignedDate) {
    this.resignedDate = resignedDate;
  }

  public String getReasonForOfferRejection() {
    return this.reasonForOfferRejection;
  }

  public void setReasonForOfferRejection(String reasonForOfferRejection) {
    this.reasonForOfferRejection = reasonForOfferRejection;
  }

  public java.sql.Timestamp getOfferAcceptedDate() {
    return this.offerAcceptedDate;
  }

  public void setOfferAcceptedDate(java.sql.Timestamp offerAcceptedDate) {
    this.offerAcceptedDate = offerAcceptedDate;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public long getOldStatus() {
    return this.oldStatus;
  }

  public void setOldStatus(long oldStatus) {
    this.oldStatus = oldStatus;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getInterview1Date() {
    return this.interview1Date;
  }

  public void setInterview1Date(java.sql.Timestamp interview1Date) {
    this.interview1Date = interview1Date;
  }

  public java.sql.Timestamp getInterview2Date() {
    return this.interview2Date;
  }

  public void setInterview2Date(java.sql.Timestamp interview2Date) {
    this.interview2Date = interview2Date;
  }

  public java.sql.Timestamp getLastStageDate() {
    return this.lastStageDate;
  }

  public void setLastStageDate(java.sql.Timestamp lastStageDate) {
    this.lastStageDate = lastStageDate;
  }

  public long getConfigurableStageId() {
    return this.configurableStageId;
  }

  public void setConfigurableStageId(long configurableStageId) {
    this.configurableStageId = configurableStageId;
  }
}
