package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_extension")
public class CandidateExtension {


  @Id
  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="candidate_owner_ids")
  private long candidateOwnerIds;

  @Column(name="candidate_owner_names")
  private String candidateOwnerNames;

  @Column(name="talent_pool_names")
  private String talentPoolNames;

  @Column(name="talent_pool_ids")
  private long talentPoolIds;

  @Column(name="job_types")
  private long jobTypes;

  @Column(name="current_job_title")
  private String currentJobTitle;

  @Column(name="current_employer")
  private String currentEmployer;

  @Column(name="candidate_next_availability_date")
  private java.sql.Timestamp candidateNextAvailabilityDate;

  @Column(name="available_next_week_status")
  private String availableNextWeekStatus;

  @Column(name="available_this_week_status")
  private String availableThisWeekStatus;

  @Column(name="last_activity_date")
  private java.sql.Timestamp lastActivityDate;

  @Column(name="team_group_ids")
  private long teamGroupIds;


  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getCandidateOwnerIds() {
    return this.candidateOwnerIds;
  }

  public void setCandidateOwnerIds(long candidateOwnerIds) {
    this.candidateOwnerIds = candidateOwnerIds;
  }

  public String getCandidateOwnerNames() {
    return this.candidateOwnerNames;
  }

  public void setCandidateOwnerNames(String candidateOwnerNames) {
    this.candidateOwnerNames = candidateOwnerNames;
  }

  public String getTalentPoolNames() {
    return this.talentPoolNames;
  }

  public void setTalentPoolNames(String talentPoolNames) {
    this.talentPoolNames = talentPoolNames;
  }

  public long getTalentPoolIds() {
    return this.talentPoolIds;
  }

  public void setTalentPoolIds(long talentPoolIds) {
    this.talentPoolIds = talentPoolIds;
  }

  public long getJobTypes() {
    return this.jobTypes;
  }

  public void setJobTypes(long jobTypes) {
    this.jobTypes = jobTypes;
  }

  public String getCurrentJobTitle() {
    return this.currentJobTitle;
  }

  public void setCurrentJobTitle(String currentJobTitle) {
    this.currentJobTitle = currentJobTitle;
  }

  public String getCurrentEmployer() {
    return this.currentEmployer;
  }

  public void setCurrentEmployer(String currentEmployer) {
    this.currentEmployer = currentEmployer;
  }

  public java.sql.Timestamp getCandidateNextAvailabilityDate() {
    return this.candidateNextAvailabilityDate;
  }

  public void setCandidateNextAvailabilityDate(java.sql.Timestamp candidateNextAvailabilityDate) {
    this.candidateNextAvailabilityDate = candidateNextAvailabilityDate;
  }

  public String getAvailableNextWeekStatus() {
    return this.availableNextWeekStatus;
  }

  public void setAvailableNextWeekStatus(String availableNextWeekStatus) {
    this.availableNextWeekStatus = availableNextWeekStatus;
  }

  public String getAvailableThisWeekStatus() {
    return this.availableThisWeekStatus;
  }

  public void setAvailableThisWeekStatus(String availableThisWeekStatus) {
    this.availableThisWeekStatus = availableThisWeekStatus;
  }

  public java.sql.Timestamp getLastActivityDate() {
    return this.lastActivityDate;
  }

  public void setLastActivityDate(java.sql.Timestamp lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public long getTeamGroupIds() {
    return this.teamGroupIds;
  }

  public void setTeamGroupIds(long teamGroupIds) {
    this.teamGroupIds = teamGroupIds;
  }
}
