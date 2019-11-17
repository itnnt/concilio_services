package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_ff_fact_forecast_key")
public class DwFfFactForecastKey {

  @Id
  @Column(name="opportunity_key")
  private long opportunityKey;

  @Column(name="location_key")
  private long locationKey;

  @Column(name="consultant_key")
  private long consultantKey;

  @Column(name="team_key")
  private long teamKey;

  @Column(name="job_key")
  private long jobKey;


  public long getOpportunityKey() {
    return this.opportunityKey;
  }

  public void setOpportunityKey(long opportunityKey) {
    this.opportunityKey = opportunityKey;
  }

  public long getLocationKey() {
    return this.locationKey;
  }

  public void setLocationKey(long locationKey) {
    this.locationKey = locationKey;
  }

  public long getConsultantKey() {
    return this.consultantKey;
  }

  public void setConsultantKey(long consultantKey) {
    this.consultantKey = consultantKey;
  }

  public long getTeamKey() {
    return this.teamKey;
  }

  public void setTeamKey(long teamKey) {
    this.teamKey = teamKey;
  }

  public long getJobKey() {
    return this.jobKey;
  }

  public void setJobKey(long jobKey) {
    this.jobKey = jobKey;
  }
}
