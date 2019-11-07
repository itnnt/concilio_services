package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_sd_fact_past_place")
public class DwSdFactPastPlace {

  @Id
  @Column(name="date_key")
  private long dateKey;

  @Column(name="job_type")
  private long jobType;

  @Column(name="sale")
  private double sale;

  @Column(name="opportunity_key")
  private long opportunityKey;

  @Column(name="job_key")
  private long jobKey;

  @Column(name="candidate_key")
  private long candidateKey;

  @Column(name="stage_key")
  private long stageKey;

  @Column(name="job_type_key")
  private long jobTypeKey;

  @Column(name="salary")
  private double salary;

  @Column(name="margin")
  private double margin;

  @Column(name="days_to_fill")
  private long daysToFill;

  @Column(name="start_date")
  private java.sql.Timestamp startDate;


  public long getDateKey() {
    return this.dateKey;
  }

  public void setDateKey(long dateKey) {
    this.dateKey = dateKey;
  }

  public long getJobType() {
    return this.jobType;
  }

  public void setJobType(long jobType) {
    this.jobType = jobType;
  }

  public double getSale() {
    return this.sale;
  }

  public void setSale(double sale) {
    this.sale = sale;
  }

  public long getOpportunityKey() {
    return this.opportunityKey;
  }

  public void setOpportunityKey(long opportunityKey) {
    this.opportunityKey = opportunityKey;
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

  public long getStageKey() {
    return this.stageKey;
  }

  public void setStageKey(long stageKey) {
    this.stageKey = stageKey;
  }

  public long getJobTypeKey() {
    return this.jobTypeKey;
  }

  public void setJobTypeKey(long jobTypeKey) {
    this.jobTypeKey = jobTypeKey;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getMargin() {
    return this.margin;
  }

  public void setMargin(double margin) {
    this.margin = margin;
  }

  public long getDaysToFill() {
    return this.daysToFill;
  }

  public void setDaysToFill(long daysToFill) {
    this.daysToFill = daysToFill;
  }

  public java.sql.Timestamp getStartDate() {
    return this.startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }
}
