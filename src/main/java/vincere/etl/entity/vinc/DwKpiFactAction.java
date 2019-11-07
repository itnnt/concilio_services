package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_kpi_fact_action")
public class DwKpiFactAction {

  @Id
  @Column(name="date_key")
  private long dateKey;

  @Column(name="time_key")
  private long timeKey;

  @Column(name="consultant_key")
  private long consultantKey;

  @Column(name="kpi_lib_key")
  private long kpiLibKey;

  @Column(name="candidate_key")
  private long candidateKey;

  @Column(name="job_key")
  private long jobKey;

  @Column(name="contact_key")
  private long contactKey;

  @Column(name="company_key")
  private long companyKey;


  public long getDateKey() {
    return this.dateKey;
  }

  public void setDateKey(long dateKey) {
    this.dateKey = dateKey;
  }

  public long getTimeKey() {
    return this.timeKey;
  }

  public void setTimeKey(long timeKey) {
    this.timeKey = timeKey;
  }

  public long getConsultantKey() {
    return this.consultantKey;
  }

  public void setConsultantKey(long consultantKey) {
    this.consultantKey = consultantKey;
  }

  public long getKpiLibKey() {
    return this.kpiLibKey;
  }

  public void setKpiLibKey(long kpiLibKey) {
    this.kpiLibKey = kpiLibKey;
  }

  public long getCandidateKey() {
    return this.candidateKey;
  }

  public void setCandidateKey(long candidateKey) {
    this.candidateKey = candidateKey;
  }

  public long getJobKey() {
    return this.jobKey;
  }

  public void setJobKey(long jobKey) {
    this.jobKey = jobKey;
  }

  public long getContactKey() {
    return this.contactKey;
  }

  public void setContactKey(long contactKey) {
    this.contactKey = contactKey;
  }

  public long getCompanyKey() {
    return this.companyKey;
  }

  public void setCompanyKey(long companyKey) {
    this.companyKey = companyKey;
  }
}
