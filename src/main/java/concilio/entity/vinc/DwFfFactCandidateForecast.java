package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class DwFfFactCandidateForecastId implements Serializable {
  private long candidateKey;
  private long dateKey;

}

@Entity
@Table(name="dw_ff_fact_candidate_forecast")
@IdClass(DwFfFactCandidateForecastId.class)
public class DwFfFactCandidateForecast {


  @Id
  @Column(name="candidate_key")
  private long candidateKey;

  @Id
  @Column(name="date_key")
  private long dateKey;

  @Column(name="stage_sales_cycle")
  private double stageSalesCycle;

  @Column(name="assumption_total_sales_cycle")
  private double assumptionTotalSalesCycle;

  @Column(name="assumption_overdue_date")
  private double assumptionOverdueDate;

  @Column(name="assumption_date_forecast")
  private java.sql.Date assumptionDateForecast;

  @Column(name="forecast")
  private double forecast;

  @Column(name="assumption_weighted")
  private double assumptionWeighted;

  @Column(name="status")
  private String status;

  @Column(name="opportunity_key")
  private long opportunityKey;

  @Column(name="stage_key")
  private long stageKey;

  @Column(name="job_key")
  private long jobKey;

  @Column(name="client_key")
  private long clientKey;

  @Column(name="real_total_sales_cycle")
  private double realTotalSalesCycle;

  @Column(name="real_overdue_date")
  private double realOverdueDate;

  @Column(name="real_date_forecast")
  private java.sql.Date realDateForecast;

  @Column(name="real_weighted")
  private double realWeighted;

  @Column(name="pc_timestamp")
  private java.sql.Timestamp pcTimestamp;

  @Column(name="shortlisted_date")
  private java.sql.Timestamp shortlistedDate;

  @Column(name="assumption_time_key")
  private long assumptionTimeKey;

  @Column(name="real_time_key")
  private long realTimeKey;


  public long getCandidateKey() {
    return this.candidateKey;
  }

  public void setCandidateKey(long candidateKey) {
    this.candidateKey = candidateKey;
  }

  public long getDateKey() {
    return this.dateKey;
  }

  public void setDateKey(long dateKey) {
    this.dateKey = dateKey;
  }

  public double getStageSalesCycle() {
    return this.stageSalesCycle;
  }

  public void setStageSalesCycle(double stageSalesCycle) {
    this.stageSalesCycle = stageSalesCycle;
  }

  public double getAssumptionTotalSalesCycle() {
    return this.assumptionTotalSalesCycle;
  }

  public void setAssumptionTotalSalesCycle(double assumptionTotalSalesCycle) {
    this.assumptionTotalSalesCycle = assumptionTotalSalesCycle;
  }

  public double getAssumptionOverdueDate() {
    return this.assumptionOverdueDate;
  }

  public void setAssumptionOverdueDate(double assumptionOverdueDate) {
    this.assumptionOverdueDate = assumptionOverdueDate;
  }

  public java.sql.Date getAssumptionDateForecast() {
    return this.assumptionDateForecast;
  }

  public void setAssumptionDateForecast(java.sql.Date assumptionDateForecast) {
    this.assumptionDateForecast = assumptionDateForecast;
  }

  public double getForecast() {
    return this.forecast;
  }

  public void setForecast(double forecast) {
    this.forecast = forecast;
  }

  public double getAssumptionWeighted() {
    return this.assumptionWeighted;
  }

  public void setAssumptionWeighted(double assumptionWeighted) {
    this.assumptionWeighted = assumptionWeighted;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getOpportunityKey() {
    return this.opportunityKey;
  }

  public void setOpportunityKey(long opportunityKey) {
    this.opportunityKey = opportunityKey;
  }

  public long getStageKey() {
    return this.stageKey;
  }

  public void setStageKey(long stageKey) {
    this.stageKey = stageKey;
  }

  public long getJobKey() {
    return this.jobKey;
  }

  public void setJobKey(long jobKey) {
    this.jobKey = jobKey;
  }

  public long getClientKey() {
    return this.clientKey;
  }

  public void setClientKey(long clientKey) {
    this.clientKey = clientKey;
  }

  public double getRealTotalSalesCycle() {
    return this.realTotalSalesCycle;
  }

  public void setRealTotalSalesCycle(double realTotalSalesCycle) {
    this.realTotalSalesCycle = realTotalSalesCycle;
  }

  public double getRealOverdueDate() {
    return this.realOverdueDate;
  }

  public void setRealOverdueDate(double realOverdueDate) {
    this.realOverdueDate = realOverdueDate;
  }

  public java.sql.Date getRealDateForecast() {
    return this.realDateForecast;
  }

  public void setRealDateForecast(java.sql.Date realDateForecast) {
    this.realDateForecast = realDateForecast;
  }

  public double getRealWeighted() {
    return this.realWeighted;
  }

  public void setRealWeighted(double realWeighted) {
    this.realWeighted = realWeighted;
  }

  public java.sql.Timestamp getPcTimestamp() {
    return this.pcTimestamp;
  }

  public void setPcTimestamp(java.sql.Timestamp pcTimestamp) {
    this.pcTimestamp = pcTimestamp;
  }

  public java.sql.Timestamp getShortlistedDate() {
    return this.shortlistedDate;
  }

  public void setShortlistedDate(java.sql.Timestamp shortlistedDate) {
    this.shortlistedDate = shortlistedDate;
  }

  public long getAssumptionTimeKey() {
    return this.assumptionTimeKey;
  }

  public void setAssumptionTimeKey(long assumptionTimeKey) {
    this.assumptionTimeKey = assumptionTimeKey;
  }

  public long getRealTimeKey() {
    return this.realTimeKey;
  }

  public void setRealTimeKey(long realTimeKey) {
    this.realTimeKey = realTimeKey;
  }
}
