package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="invoice")
public class Invoice {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="document_id")
  private long documentId;

  @Column(name="status")
  private long status;

  @Column(name="action_by")
  private long actionBy;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="valid")
  private long valid;

  @Column(name="renewal_date")
  private java.sql.Timestamp renewalDate;

  @Column(name="rejected_date")
  private java.sql.Timestamp rejectedDate;

  @Column(name="renewed_date")
  private java.sql.Timestamp renewedDate;

  @Column(name="reason")
  private String reason;

  @Column(name="renewal_index")
  private long renewalIndex;

  @Column(name="candidate_rejected_date")
  private java.sql.Timestamp candidateRejectedDate;

  @Column(name="candidate_accepted_date")
  private java.sql.Timestamp candidateAcceptedDate;

  @Column(name="contract_to_perm_date")
  private java.sql.Timestamp contractToPermDate;

  @Column(name="renewal_flow_status")
  private long renewalFlowStatus;


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

  public long getOfferId() {
    return this.offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }

  public long getDocumentId() {
    return this.documentId;
  }

  public void setDocumentId(long documentId) {
    this.documentId = documentId;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public long getActionBy() {
    return this.actionBy;
  }

  public void setActionBy(long actionBy) {
    this.actionBy = actionBy;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getValid() {
    return this.valid;
  }

  public void setValid(long valid) {
    this.valid = valid;
  }

  public java.sql.Timestamp getRenewalDate() {
    return this.renewalDate;
  }

  public void setRenewalDate(java.sql.Timestamp renewalDate) {
    this.renewalDate = renewalDate;
  }

  public java.sql.Timestamp getRejectedDate() {
    return this.rejectedDate;
  }

  public void setRejectedDate(java.sql.Timestamp rejectedDate) {
    this.rejectedDate = rejectedDate;
  }

  public java.sql.Timestamp getRenewedDate() {
    return this.renewedDate;
  }

  public void setRenewedDate(java.sql.Timestamp renewedDate) {
    this.renewedDate = renewedDate;
  }

  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public long getRenewalIndex() {
    return this.renewalIndex;
  }

  public void setRenewalIndex(long renewalIndex) {
    this.renewalIndex = renewalIndex;
  }

  public java.sql.Timestamp getCandidateRejectedDate() {
    return this.candidateRejectedDate;
  }

  public void setCandidateRejectedDate(java.sql.Timestamp candidateRejectedDate) {
    this.candidateRejectedDate = candidateRejectedDate;
  }

  public java.sql.Timestamp getCandidateAcceptedDate() {
    return this.candidateAcceptedDate;
  }

  public void setCandidateAcceptedDate(java.sql.Timestamp candidateAcceptedDate) {
    this.candidateAcceptedDate = candidateAcceptedDate;
  }

  public java.sql.Timestamp getContractToPermDate() {
    return this.contractToPermDate;
  }

  public void setContractToPermDate(java.sql.Timestamp contractToPermDate) {
    this.contractToPermDate = contractToPermDate;
  }

  public long getRenewalFlowStatus() {
    return this.renewalFlowStatus;
  }

  public void setRenewalFlowStatus(long renewalFlowStatus) {
    this.renewalFlowStatus = renewalFlowStatus;
  }
}
