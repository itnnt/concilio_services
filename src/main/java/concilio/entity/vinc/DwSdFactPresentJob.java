package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_sd_fact_present_job")
public class DwSdFactPresentJob {

  @Id
  @Column(name="job_key")
  private long jobKey;

  @Column(name="forecast")
  private double forecast;

  @Column(name="weighted")
  private double weighted;

  @Column(name="pcid")
  private long pcid;

  @Column(name="stage_key")
  private long stageKey;

  @Column(name="job_type_key")
  private long jobTypeKey;


  public long getJobKey() {
    return this.jobKey;
  }

  public void setJobKey(long jobKey) {
    this.jobKey = jobKey;
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

  public long getJobTypeKey() {
    return this.jobTypeKey;
  }

  public void setJobTypeKey(long jobTypeKey) {
    this.jobTypeKey = jobTypeKey;
  }
}
