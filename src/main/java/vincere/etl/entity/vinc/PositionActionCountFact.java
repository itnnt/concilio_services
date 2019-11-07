package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_action_count_fact")
public class PositionActionCountFact {

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

  @Column(name="interview_count")
  private long interviewCount;

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

  @Column(name="rejection_count")
  private long rejectionCount;

  @Column(name="decline_count")
  private long declineCount;

  @Column(name="resigned_count")
  private long resignedCount;

  @Column(name="total_fee_charged")
  private String totalFeeCharged;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="location_id")
  private long locationId;

  @Column(name="invited_to_interview_count")
  private long invitedToInterviewCount;

  @Column(name="average_rank_hired_candidate")
  private double averageRankHiredCandidate;

  @Column(name="average_rank")
  private double averageRank;


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

  public long getInterviewCount() {
    return this.interviewCount;
  }

  public void setInterviewCount(long interviewCount) {
    this.interviewCount = interviewCount;
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

  public long getRejectionCount() {
    return this.rejectionCount;
  }

  public void setRejectionCount(long rejectionCount) {
    this.rejectionCount = rejectionCount;
  }

  public long getDeclineCount() {
    return this.declineCount;
  }

  public void setDeclineCount(long declineCount) {
    this.declineCount = declineCount;
  }

  public long getResignedCount() {
    return this.resignedCount;
  }

  public void setResignedCount(long resignedCount) {
    this.resignedCount = resignedCount;
  }

  public String getTotalFeeCharged() {
    return this.totalFeeCharged;
  }

  public void setTotalFeeCharged(String totalFeeCharged) {
    this.totalFeeCharged = totalFeeCharged;
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

  public long getInvitedToInterviewCount() {
    return this.invitedToInterviewCount;
  }

  public void setInvitedToInterviewCount(long invitedToInterviewCount) {
    this.invitedToInterviewCount = invitedToInterviewCount;
  }

  public double getAverageRankHiredCandidate() {
    return this.averageRankHiredCandidate;
  }

  public void setAverageRankHiredCandidate(double averageRankHiredCandidate) {
    this.averageRankHiredCandidate = averageRankHiredCandidate;
  }

  public double getAverageRank() {
    return this.averageRank;
  }

  public void setAverageRank(double averageRank) {
    this.averageRank = averageRank;
  }
}
