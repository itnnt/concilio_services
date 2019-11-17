package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_active_count_fact")
public class PositionActiveCountFact {

  @Id
  @Column(name="date_id")
  private long dateId;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="contract")
  private long contract;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="line_manager_id")
  private long lineManagerId;

  @Column(name="internal_recruiter_id")
  private long internalRecruiterId;

  @Column(name="accepted_count")
  private long acceptedCount;

  @Column(name="cv_received_count")
  private long cvReceivedCount;

  @Column(name="interview1_count")
  private long interview1Count;

  @Column(name="interview2_count")
  private long interview2Count;

  @Column(name="interview3_count")
  private long interview3Count;

  @Column(name="interview4_count")
  private long interview4Count;

  @Column(name="interview5_count")
  private long interview5Count;

  @Column(name="offer_count")
  private long offerCount;

  @Column(name="hire_count")
  private long hireCount;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="location_id")
  private long locationId;


  public long getDateId() {
    return this.dateId;
  }

  public void setDateId(long dateId) {
    this.dateId = dateId;
  }

  public long getVerticalId() {
    return this.verticalId;
  }

  public void setVerticalId(long verticalId) {
    this.verticalId = verticalId;
  }

  public long getContract() {
    return this.contract;
  }

  public void setContract(long contract) {
    this.contract = contract;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getLineManagerId() {
    return this.lineManagerId;
  }

  public void setLineManagerId(long lineManagerId) {
    this.lineManagerId = lineManagerId;
  }

  public long getInternalRecruiterId() {
    return this.internalRecruiterId;
  }

  public void setInternalRecruiterId(long internalRecruiterId) {
    this.internalRecruiterId = internalRecruiterId;
  }

  public long getAcceptedCount() {
    return this.acceptedCount;
  }

  public void setAcceptedCount(long acceptedCount) {
    this.acceptedCount = acceptedCount;
  }

  public long getCvReceivedCount() {
    return this.cvReceivedCount;
  }

  public void setCvReceivedCount(long cvReceivedCount) {
    this.cvReceivedCount = cvReceivedCount;
  }

  public long getInterview1Count() {
    return this.interview1Count;
  }

  public void setInterview1Count(long interview1Count) {
    this.interview1Count = interview1Count;
  }

  public long getInterview2Count() {
    return this.interview2Count;
  }

  public void setInterview2Count(long interview2Count) {
    this.interview2Count = interview2Count;
  }

  public long getInterview3Count() {
    return this.interview3Count;
  }

  public void setInterview3Count(long interview3Count) {
    this.interview3Count = interview3Count;
  }

  public long getInterview4Count() {
    return this.interview4Count;
  }

  public void setInterview4Count(long interview4Count) {
    this.interview4Count = interview4Count;
  }

  public long getInterview5Count() {
    return this.interview5Count;
  }

  public void setInterview5Count(long interview5Count) {
    this.interview5Count = interview5Count;
  }

  public long getOfferCount() {
    return this.offerCount;
  }

  public void setOfferCount(long offerCount) {
    this.offerCount = offerCount;
  }

  public long getHireCount() {
    return this.hireCount;
  }

  public void setHireCount(long hireCount) {
    this.hireCount = hireCount;
  }

  public long getCostCenterId() {
    return this.costCenterId;
  }

  public void setCostCenterId(long costCenterId) {
    this.costCenterId = costCenterId;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }
}
