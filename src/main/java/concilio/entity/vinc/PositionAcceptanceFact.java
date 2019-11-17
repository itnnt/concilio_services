package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class PositionAcceptanceFactId implements Serializable {
  private String acceptanceId;
  private long positionDescriptionId;
  private long candidateSourceId;

}

@Entity
@Table(name="position_acceptance_fact")
@IdClass(PositionAcceptanceFactId.class)
public class PositionAcceptanceFact {


  @Id
  @Column(name="acceptance_id")
  private String acceptanceId;

  @Id
  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="contract")
  private long contract;

  @Column(name="line_manager_id")
  private long lineManagerId;

  @Column(name="internal_recruiter_id")
  private long internalRecruiterId;

  @Id
  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="announcement_date_id")
  private long announcementDateId;

  @Column(name="termination_date_id")
  private long terminationDateId;

  @Column(name="acceptance_date_id")
  private long acceptanceDateId;

  @Column(name="latest_acceptance_date_id")
  private long latestAcceptanceDateId;

  @Column(name="days_lag_before_acceptance")
  private long daysLagBeforeAcceptance;

  @Column(name="first_cv_received_date_id")
  private long firstCvReceivedDateId;

  @Column(name="days_from_announcement_to_first_cv_received")
  private long daysFromAnnouncementToFirstCvReceived;

  @Column(name="hired_date_id")
  private long hiredDateId;

  @Column(name="days_from_announcement_to_hired")
  private long daysFromAnnouncementToHired;

  @Column(name="location_id")
  private long locationId;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="first_interview_date_id")
  private long firstInterviewDateId;

  @Column(name="days_from_announcement_to_first_interview")
  private long daysFromAnnouncementToFirstInterview;


  public String getAcceptanceId() {
    return this.acceptanceId;
  }

  public void setAcceptanceId(String acceptanceId) {
    this.acceptanceId = acceptanceId;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
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

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getAnnouncementDateId() {
    return this.announcementDateId;
  }

  public void setAnnouncementDateId(long announcementDateId) {
    this.announcementDateId = announcementDateId;
  }

  public long getTerminationDateId() {
    return this.terminationDateId;
  }

  public void setTerminationDateId(long terminationDateId) {
    this.terminationDateId = terminationDateId;
  }

  public long getAcceptanceDateId() {
    return this.acceptanceDateId;
  }

  public void setAcceptanceDateId(long acceptanceDateId) {
    this.acceptanceDateId = acceptanceDateId;
  }

  public long getLatestAcceptanceDateId() {
    return this.latestAcceptanceDateId;
  }

  public void setLatestAcceptanceDateId(long latestAcceptanceDateId) {
    this.latestAcceptanceDateId = latestAcceptanceDateId;
  }

  public long getDaysLagBeforeAcceptance() {
    return this.daysLagBeforeAcceptance;
  }

  public void setDaysLagBeforeAcceptance(long daysLagBeforeAcceptance) {
    this.daysLagBeforeAcceptance = daysLagBeforeAcceptance;
  }

  public long getFirstCvReceivedDateId() {
    return this.firstCvReceivedDateId;
  }

  public void setFirstCvReceivedDateId(long firstCvReceivedDateId) {
    this.firstCvReceivedDateId = firstCvReceivedDateId;
  }

  public long getDaysFromAnnouncementToFirstCvReceived() {
    return this.daysFromAnnouncementToFirstCvReceived;
  }

  public void setDaysFromAnnouncementToFirstCvReceived(long daysFromAnnouncementToFirstCvReceived) {
    this.daysFromAnnouncementToFirstCvReceived = daysFromAnnouncementToFirstCvReceived;
  }

  public long getHiredDateId() {
    return this.hiredDateId;
  }

  public void setHiredDateId(long hiredDateId) {
    this.hiredDateId = hiredDateId;
  }

  public long getDaysFromAnnouncementToHired() {
    return this.daysFromAnnouncementToHired;
  }

  public void setDaysFromAnnouncementToHired(long daysFromAnnouncementToHired) {
    this.daysFromAnnouncementToHired = daysFromAnnouncementToHired;
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

  public long getFirstInterviewDateId() {
    return this.firstInterviewDateId;
  }

  public void setFirstInterviewDateId(long firstInterviewDateId) {
    this.firstInterviewDateId = firstInterviewDateId;
  }

  public long getDaysFromAnnouncementToFirstInterview() {
    return this.daysFromAnnouncementToFirstInterview;
  }

  public void setDaysFromAnnouncementToFirstInterview(long daysFromAnnouncementToFirstInterview) {
    this.daysFromAnnouncementToFirstInterview = daysFromAnnouncementToFirstInterview;
  }
}
