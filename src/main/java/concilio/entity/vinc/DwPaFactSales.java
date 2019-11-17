package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_pa_fact_sales")
public class DwPaFactSales {


  @Column(name="client_key")
  private long clientKey;

  @Column(name="consultant_key")
  private long consultantKey;

  @Column(name="stage_key")
  private long stageKey;

  @Id
  @Column(name="created_date_key")
  private long createdDateKey;

  @Column(name="duration")
  private double duration;

  @Column(name="opportunity_id")
  private long opportunityId;

  @Column(name="location_key")
  private long locationKey;

  @Column(name="status")
  private String status;

  @Column(name="team_key")
  private long teamKey;

  @Column(name="industry_key")
  private long industryKey;

  @Column(name="function_key")
  private long functionKey;

  @Column(name="job_key")
  private long jobKey;

  @Column(name="candidate_key")
  private long candidateKey;


  public long getClientKey() {
    return this.clientKey;
  }

  public void setClientKey(long clientKey) {
    this.clientKey = clientKey;
  }

  public long getConsultantKey() {
    return this.consultantKey;
  }

  public void setConsultantKey(long consultantKey) {
    this.consultantKey = consultantKey;
  }

  public long getStageKey() {
    return this.stageKey;
  }

  public void setStageKey(long stageKey) {
    this.stageKey = stageKey;
  }

  public long getCreatedDateKey() {
    return this.createdDateKey;
  }

  public void setCreatedDateKey(long createdDateKey) {
    this.createdDateKey = createdDateKey;
  }

  public double getDuration() {
    return this.duration;
  }

  public void setDuration(double duration) {
    this.duration = duration;
  }

  public long getOpportunityId() {
    return this.opportunityId;
  }

  public void setOpportunityId(long opportunityId) {
    this.opportunityId = opportunityId;
  }

  public long getLocationKey() {
    return this.locationKey;
  }

  public void setLocationKey(long locationKey) {
    this.locationKey = locationKey;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getTeamKey() {
    return this.teamKey;
  }

  public void setTeamKey(long teamKey) {
    this.teamKey = teamKey;
  }

  public long getIndustryKey() {
    return this.industryKey;
  }

  public void setIndustryKey(long industryKey) {
    this.industryKey = industryKey;
  }

  public long getFunctionKey() {
    return this.functionKey;
  }

  public void setFunctionKey(long functionKey) {
    this.functionKey = functionKey;
  }

  public long getJobKey() {
    return this.jobKey;
  }

  public void setJobKey(long jobKey) {
    this.jobKey = jobKey;
  }

  public long getCandidateKey() {
    return this.candidateKey;
  }

  public void setCandidateKey(long candidateKey) {
    this.candidateKey = candidateKey;
  }
}
