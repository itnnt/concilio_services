package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_sd_fact_present_candidate")
public class DwSdFactPresentCandidate {

  @Id
  @Column(name="candidate_key")
  private long candidateKey;

  @Column(name="forecast")
  private double forecast;

  @Column(name="weighted")
  private double weighted;

  @Column(name="pcid")
  private long pcid;

  @Column(name="stage_key")
  private long stageKey;

  @Column(name="associated_date")
  private java.sql.Timestamp associatedDate;

  @Column(name="job_key")
  private long jobKey;


  public long getCandidateKey() {
    return this.candidateKey;
  }

  public void setCandidateKey(long candidateKey) {
    this.candidateKey = candidateKey;
  }

  public double getForecast() {
    return this.forecast;
  }

  public void setForecast(double forecast) {
    this.forecast = forecast;
  }

  public double getWeighted() {
    return this.weighted;
  }

  public void setWeighted(double weighted) {
    this.weighted = weighted;
  }

  public long getPcid() {
    return this.pcid;
  }

  public void setPcid(long pcid) {
    this.pcid = pcid;
  }

  public long getStageKey() {
    return this.stageKey;
  }

  public void setStageKey(long stageKey) {
    this.stageKey = stageKey;
  }

  public java.sql.Timestamp getAssociatedDate() {
    return this.associatedDate;
  }

  public void setAssociatedDate(java.sql.Timestamp associatedDate) {
    this.associatedDate = associatedDate;
  }

  public long getJobKey() {
    return this.jobKey;
  }

  public void setJobKey(long jobKey) {
    this.jobKey = jobKey;
  }
}
