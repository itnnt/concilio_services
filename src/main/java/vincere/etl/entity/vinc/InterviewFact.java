package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class InterviewFactId implements Serializable {
  private String interviewId;
  private long interviewerId;

}
@Entity
@Table(name="interview_fact")
@IdClass(InterviewFactId.class)
public class InterviewFact {


  @Id
  @Column(name="interview_id")
  private String interviewId;

  @Column(name="association_id")
  private String associationId;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="interview_no")
  private long interviewNo;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="contract")
  private long contract;

  @Id
  @Column(name="interviewer_id")
  private long interviewerId;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="line_manager_id")
  private long lineManagerId;

  @Column(name="internal_recruiter_id")
  private long internalRecruiterId;

  @Column(name="interview_date_id")
  private long interviewDateId;

  @Column(name="feedback_date_id")
  private long feedbackDateId;

  @Column(name="days_from_interview_to_feedback")
  private long daysFromInterviewToFeedback;

  @Column(name="location_id")
  private long locationId;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="active")
  private long active;

  @Column(name="next_interview_date_id")
  private long nextInterviewDateId;

  @Column(name="days_from_interview_to_next_interview")
  private long daysFromInterviewToNextInterview;


  public String getInterviewId() {
    return this.interviewId;
  }

  public void setInterviewId(String interviewId) {
    this.interviewId = interviewId;
  }

  public String getAssociationId() {
    return this.associationId;
  }

  public void setAssociationId(String associationId) {
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

  public long getInterviewNo() {
    return this.interviewNo;
  }

  public void setInterviewNo(long interviewNo) {
    this.interviewNo = interviewNo;
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

  public long getInterviewerId() {
    return this.interviewerId;
  }

  public void setInterviewerId(long interviewerId) {
    this.interviewerId = interviewerId;
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

  public long getInterviewDateId() {
    return this.interviewDateId;
  }

  public void setInterviewDateId(long interviewDateId) {
    this.interviewDateId = interviewDateId;
  }

  public long getFeedbackDateId() {
    return this.feedbackDateId;
  }

  public void setFeedbackDateId(long feedbackDateId) {
    this.feedbackDateId = feedbackDateId;
  }

  public long getDaysFromInterviewToFeedback() {
    return this.daysFromInterviewToFeedback;
  }

  public void setDaysFromInterviewToFeedback(long daysFromInterviewToFeedback) {
    this.daysFromInterviewToFeedback = daysFromInterviewToFeedback;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public long getCostCenterId() {
    return this.costCenterId;
  }

  public void setCostCenterId(long costCenterId) {
    this.costCenterId = costCenterId;
  }

  public long getActive() {
    return this.active;
  }

  public void setActive(long active) {
    this.active = active;
  }

  public long getNextInterviewDateId() {
    return this.nextInterviewDateId;
  }

  public void setNextInterviewDateId(long nextInterviewDateId) {
    this.nextInterviewDateId = nextInterviewDateId;
  }

  public long getDaysFromInterviewToNextInterview() {
    return this.daysFromInterviewToNextInterview;
  }

  public void setDaysFromInterviewToNextInterview(long daysFromInterviewToNextInterview) {
    this.daysFromInterviewToNextInterview = daysFromInterviewToNextInterview;
  }
}
