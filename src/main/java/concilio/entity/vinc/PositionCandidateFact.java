package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class PositionCandidateFactId implements Serializable {
  private long associationId;
  private long positionDescriptionId;
  private long candidateId;

}

@Entity
@Table(name="position_candidate_fact")
@IdClass(PositionCandidateFactId.class)
public class PositionCandidateFact {


  @Id
  @Column(name="association_id")
  private long associationId;

  @Id
  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Id
  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="contract")
  private long contract;

  @Column(name="line_manager_id")
  private long lineManagerId;

  @Column(name="internal_recruiter_id")
  private long internalRecruiterId;

  @Column(name="hired_position_id")
  private long hiredPositionId;

  @Column(name="announcement_date_id")
  private long announcementDateId;

  @Column(name="accepted_date_id")
  private long acceptedDateId;

  @Column(name="cv_received_date_id")
  private long cvReceivedDateId;

  @Column(name="interview1_date_id")
  private long interview1DateId;

  @Column(name="interview2_date_id")
  private long interview2DateId;

  @Column(name="interview3_date_id")
  private long interview3DateId;

  @Column(name="interview4_date_id")
  private long interview4DateId;

  @Column(name="interview5_date_id")
  private long interview5DateId;

  @Column(name="offer_date_id")
  private long offerDateId;

  @Column(name="hire_date_id")
  private long hireDateId;

  @Column(name="rejection_date_id")
  private long rejectionDateId;

  @Column(name="decline_date_id")
  private long declineDateId;

  @Column(name="resignation_date_id")
  private long resignationDateId;

  @Column(name="days_from_announcement_to_acceptance")
  private long daysFromAnnouncementToAcceptance;

  @Column(name="days_from_announcement_to_cv_receipt")
  private long daysFromAnnouncementToCvReceipt;

  @Column(name="days_from_announcement_to_interview1")
  private long daysFromAnnouncementToInterview1;

  @Column(name="days_from_announcement_to_interview2")
  private long daysFromAnnouncementToInterview2;

  @Column(name="days_from_announcement_to_interview3")
  private long daysFromAnnouncementToInterview3;

  @Column(name="days_from_announcement_to_interview4")
  private long daysFromAnnouncementToInterview4;

  @Column(name="days_from_announcement_to_interview5")
  private long daysFromAnnouncementToInterview5;

  @Column(name="days_from_announcement_to_offer")
  private long daysFromAnnouncementToOffer;

  @Column(name="days_from_announcement_to_hire")
  private long daysFromAnnouncementToHire;

  @Column(name="days_from_announcement_to_rejection")
  private long daysFromAnnouncementToRejection;

  @Column(name="days_from_announcement_to_decline")
  private long daysFromAnnouncementToDecline;

  @Column(name="days_from_announcement_to_resignation")
  private long daysFromAnnouncementToResignation;

  @Column(name="interviewed1")
  private long interviewed1;

  @Column(name="interviewed2")
  private long interviewed2;

  @Column(name="interviewed3")
  private long interviewed3;

  @Column(name="interviewed4")
  private long interviewed4;

  @Column(name="interviewed5")
  private long interviewed5;

  @Column(name="offered")
  private long offered;

  @Column(name="hired")
  private long hired;

  @Column(name="rejected")
  private long rejected;

  @Column(name="resigned")
  private long resigned;

  @Column(name="declined")
  private long declined;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="location_id")
  private long locationId;

  @Column(name="invited_to_interview_date_id")
  private long invitedToInterviewDateId;

  @Column(name="fee_percent")
  private String feePercent;

  @Column(name="rating_score")
  private String ratingScore;

  @Column(name="termination_date_id")
  private long terminationDateId;

  @Column(name="terminated")
  private long terminated;

  @Column(name="days_from_announcement_to_termination")
  private long daysFromAnnouncementToTermination;

  @Column(name="rejection_reason_id")
  private long rejectionReasonId;

  @Column(name="invited_to_interview")
  private long invitedToInterview;

  @Column(name="days_from_announcement_to_background_check_finish")
  private long daysFromAnnouncementToBackgroundCheckFinish;

  @Column(name="days_from_announcement_to_background_check_start")
  private long daysFromAnnouncementToBackgroundCheckStart;

  @Column(name="background_check_started")
  private long backgroundCheckStarted;

  @Column(name="background_check_finished")
  private long backgroundCheckFinished;

  @Column(name="background_check_start_date_id")
  private long backgroundCheckStartDateId;

  @Column(name="background_check_finish_date_id")
  private long backgroundCheckFinishDateId;

  @Column(name="days_from_announcement_to_invited_to_interview")
  private double daysFromAnnouncementToInvitedToInterview;

  @Column(name="active")
  private long active;


  public long getAssociationId() {
    return this.associationId;
  }

  public void setAssociationId(long associationId) {
    this.associationId = associationId;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
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

  public long getHiredPositionId() {
    return this.hiredPositionId;
  }

  public void setHiredPositionId(long hiredPositionId) {
    this.hiredPositionId = hiredPositionId;
  }

  public long getAnnouncementDateId() {
    return this.announcementDateId;
  }

  public void setAnnouncementDateId(long announcementDateId) {
    this.announcementDateId = announcementDateId;
  }

  public long getAcceptedDateId() {
    return this.acceptedDateId;
  }

  public void setAcceptedDateId(long acceptedDateId) {
    this.acceptedDateId = acceptedDateId;
  }

  public long getCvReceivedDateId() {
    return this.cvReceivedDateId;
  }

  public void setCvReceivedDateId(long cvReceivedDateId) {
    this.cvReceivedDateId = cvReceivedDateId;
  }

  public long getInterview1DateId() {
    return this.interview1DateId;
  }

  public void setInterview1DateId(long interview1DateId) {
    this.interview1DateId = interview1DateId;
  }

  public long getInterview2DateId() {
    return this.interview2DateId;
  }

  public void setInterview2DateId(long interview2DateId) {
    this.interview2DateId = interview2DateId;
  }

  public long getInterview3DateId() {
    return this.interview3DateId;
  }

  public void setInterview3DateId(long interview3DateId) {
    this.interview3DateId = interview3DateId;
  }

  public long getInterview4DateId() {
    return this.interview4DateId;
  }

  public void setInterview4DateId(long interview4DateId) {
    this.interview4DateId = interview4DateId;
  }

  public long getInterview5DateId() {
    return this.interview5DateId;
  }

  public void setInterview5DateId(long interview5DateId) {
    this.interview5DateId = interview5DateId;
  }

  public long getOfferDateId() {
    return this.offerDateId;
  }

  public void setOfferDateId(long offerDateId) {
    this.offerDateId = offerDateId;
  }

  public long getHireDateId() {
    return this.hireDateId;
  }

  public void setHireDateId(long hireDateId) {
    this.hireDateId = hireDateId;
  }

  public long getRejectionDateId() {
    return this.rejectionDateId;
  }

  public void setRejectionDateId(long rejectionDateId) {
    this.rejectionDateId = rejectionDateId;
  }

  public long getDeclineDateId() {
    return this.declineDateId;
  }

  public void setDeclineDateId(long declineDateId) {
    this.declineDateId = declineDateId;
  }

  public long getResignationDateId() {
    return this.resignationDateId;
  }

  public void setResignationDateId(long resignationDateId) {
    this.resignationDateId = resignationDateId;
  }

  public long getDaysFromAnnouncementToAcceptance() {
    return this.daysFromAnnouncementToAcceptance;
  }

  public void setDaysFromAnnouncementToAcceptance(long daysFromAnnouncementToAcceptance) {
    this.daysFromAnnouncementToAcceptance = daysFromAnnouncementToAcceptance;
  }

  public long getDaysFromAnnouncementToCvReceipt() {
    return this.daysFromAnnouncementToCvReceipt;
  }

  public void setDaysFromAnnouncementToCvReceipt(long daysFromAnnouncementToCvReceipt) {
    this.daysFromAnnouncementToCvReceipt = daysFromAnnouncementToCvReceipt;
  }

  public long getDaysFromAnnouncementToInterview1() {
    return this.daysFromAnnouncementToInterview1;
  }

  public void setDaysFromAnnouncementToInterview1(long daysFromAnnouncementToInterview1) {
    this.daysFromAnnouncementToInterview1 = daysFromAnnouncementToInterview1;
  }

  public long getDaysFromAnnouncementToInterview2() {
    return this.daysFromAnnouncementToInterview2;
  }

  public void setDaysFromAnnouncementToInterview2(long daysFromAnnouncementToInterview2) {
    this.daysFromAnnouncementToInterview2 = daysFromAnnouncementToInterview2;
  }

  public long getDaysFromAnnouncementToInterview3() {
    return this.daysFromAnnouncementToInterview3;
  }

  public void setDaysFromAnnouncementToInterview3(long daysFromAnnouncementToInterview3) {
    this.daysFromAnnouncementToInterview3 = daysFromAnnouncementToInterview3;
  }

  public long getDaysFromAnnouncementToInterview4() {
    return this.daysFromAnnouncementToInterview4;
  }

  public void setDaysFromAnnouncementToInterview4(long daysFromAnnouncementToInterview4) {
    this.daysFromAnnouncementToInterview4 = daysFromAnnouncementToInterview4;
  }

  public long getDaysFromAnnouncementToInterview5() {
    return this.daysFromAnnouncementToInterview5;
  }

  public void setDaysFromAnnouncementToInterview5(long daysFromAnnouncementToInterview5) {
    this.daysFromAnnouncementToInterview5 = daysFromAnnouncementToInterview5;
  }

  public long getDaysFromAnnouncementToOffer() {
    return this.daysFromAnnouncementToOffer;
  }

  public void setDaysFromAnnouncementToOffer(long daysFromAnnouncementToOffer) {
    this.daysFromAnnouncementToOffer = daysFromAnnouncementToOffer;
  }

  public long getDaysFromAnnouncementToHire() {
    return this.daysFromAnnouncementToHire;
  }

  public void setDaysFromAnnouncementToHire(long daysFromAnnouncementToHire) {
    this.daysFromAnnouncementToHire = daysFromAnnouncementToHire;
  }

  public long getDaysFromAnnouncementToRejection() {
    return this.daysFromAnnouncementToRejection;
  }

  public void setDaysFromAnnouncementToRejection(long daysFromAnnouncementToRejection) {
    this.daysFromAnnouncementToRejection = daysFromAnnouncementToRejection;
  }

  public long getDaysFromAnnouncementToDecline() {
    return this.daysFromAnnouncementToDecline;
  }

  public void setDaysFromAnnouncementToDecline(long daysFromAnnouncementToDecline) {
    this.daysFromAnnouncementToDecline = daysFromAnnouncementToDecline;
  }

  public long getDaysFromAnnouncementToResignation() {
    return this.daysFromAnnouncementToResignation;
  }

  public void setDaysFromAnnouncementToResignation(long daysFromAnnouncementToResignation) {
    this.daysFromAnnouncementToResignation = daysFromAnnouncementToResignation;
  }

  public long getInterviewed1() {
    return this.interviewed1;
  }

  public void setInterviewed1(long interviewed1) {
    this.interviewed1 = interviewed1;
  }

  public long getInterviewed2() {
    return this.interviewed2;
  }

  public void setInterviewed2(long interviewed2) {
    this.interviewed2 = interviewed2;
  }

  public long getInterviewed3() {
    return this.interviewed3;
  }

  public void setInterviewed3(long interviewed3) {
    this.interviewed3 = interviewed3;
  }

  public long getInterviewed4() {
    return this.interviewed4;
  }

  public void setInterviewed4(long interviewed4) {
    this.interviewed4 = interviewed4;
  }

  public long getInterviewed5() {
    return this.interviewed5;
  }

  public void setInterviewed5(long interviewed5) {
    this.interviewed5 = interviewed5;
  }

  public long getOffered() {
    return this.offered;
  }

  public void setOffered(long offered) {
    this.offered = offered;
  }

  public long getHired() {
    return this.hired;
  }

  public void setHired(long hired) {
    this.hired = hired;
  }

  public long getRejected() {
    return this.rejected;
  }

  public void setRejected(long rejected) {
    this.rejected = rejected;
  }

  public long getResigned() {
    return this.resigned;
  }

  public void setResigned(long resigned) {
    this.resigned = resigned;
  }

  public long getDeclined() {
    return this.declined;
  }

  public void setDeclined(long declined) {
    this.declined = declined;
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

  public long getInvitedToInterviewDateId() {
    return this.invitedToInterviewDateId;
  }

  public void setInvitedToInterviewDateId(long invitedToInterviewDateId) {
    this.invitedToInterviewDateId = invitedToInterviewDateId;
  }

  public String getFeePercent() {
    return this.feePercent;
  }

  public void setFeePercent(String feePercent) {
    this.feePercent = feePercent;
  }

  public String getRatingScore() {
    return this.ratingScore;
  }

  public void setRatingScore(String ratingScore) {
    this.ratingScore = ratingScore;
  }

  public long getTerminationDateId() {
    return this.terminationDateId;
  }

  public void setTerminationDateId(long terminationDateId) {
    this.terminationDateId = terminationDateId;
  }

  public long getTerminated() {
    return this.terminated;
  }

  public void setTerminated(long terminated) {
    this.terminated = terminated;
  }

  public long getDaysFromAnnouncementToTermination() {
    return this.daysFromAnnouncementToTermination;
  }

  public void setDaysFromAnnouncementToTermination(long daysFromAnnouncementToTermination) {
    this.daysFromAnnouncementToTermination = daysFromAnnouncementToTermination;
  }

  public long getRejectionReasonId() {
    return this.rejectionReasonId;
  }

  public void setRejectionReasonId(long rejectionReasonId) {
    this.rejectionReasonId = rejectionReasonId;
  }

  public long getInvitedToInterview() {
    return this.invitedToInterview;
  }

  public void setInvitedToInterview(long invitedToInterview) {
    this.invitedToInterview = invitedToInterview;
  }

  public long getDaysFromAnnouncementToBackgroundCheckFinish() {
    return this.daysFromAnnouncementToBackgroundCheckFinish;
  }

  public void setDaysFromAnnouncementToBackgroundCheckFinish(long daysFromAnnouncementToBackgroundCheckFinish) {
    this.daysFromAnnouncementToBackgroundCheckFinish = daysFromAnnouncementToBackgroundCheckFinish;
  }

  public long getDaysFromAnnouncementToBackgroundCheckStart() {
    return this.daysFromAnnouncementToBackgroundCheckStart;
  }

  public void setDaysFromAnnouncementToBackgroundCheckStart(long daysFromAnnouncementToBackgroundCheckStart) {
    this.daysFromAnnouncementToBackgroundCheckStart = daysFromAnnouncementToBackgroundCheckStart;
  }

  public long getBackgroundCheckStarted() {
    return this.backgroundCheckStarted;
  }

  public void setBackgroundCheckStarted(long backgroundCheckStarted) {
    this.backgroundCheckStarted = backgroundCheckStarted;
  }

  public long getBackgroundCheckFinished() {
    return this.backgroundCheckFinished;
  }

  public void setBackgroundCheckFinished(long backgroundCheckFinished) {
    this.backgroundCheckFinished = backgroundCheckFinished;
  }

  public long getBackgroundCheckStartDateId() {
    return this.backgroundCheckStartDateId;
  }

  public void setBackgroundCheckStartDateId(long backgroundCheckStartDateId) {
    this.backgroundCheckStartDateId = backgroundCheckStartDateId;
  }

  public long getBackgroundCheckFinishDateId() {
    return this.backgroundCheckFinishDateId;
  }

  public void setBackgroundCheckFinishDateId(long backgroundCheckFinishDateId) {
    this.backgroundCheckFinishDateId = backgroundCheckFinishDateId;
  }

  public double getDaysFromAnnouncementToInvitedToInterview() {
    return this.daysFromAnnouncementToInvitedToInterview;
  }

  public void setDaysFromAnnouncementToInvitedToInterview(double daysFromAnnouncementToInvitedToInterview) {
    this.daysFromAnnouncementToInvitedToInterview = daysFromAnnouncementToInvitedToInterview;
  }

  public long getActive() {
    return this.active;
  }

  public void setActive(long active) {
    this.active = active;
  }
}
