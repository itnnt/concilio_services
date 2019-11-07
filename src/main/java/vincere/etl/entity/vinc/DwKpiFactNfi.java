package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_kpi_fact_nfi")
public class DwKpiFactNfi {


  @Column(name="job_key")
  private long jobKey;

  @Column(name="actual")
  private double actual;

  @Column(name="candidate_key")
  private long candidateKey;

  @Column(name="kpi_lib_key")
  private long kpiLibKey;

  @Column(name="consultant_key")
  private long consultantKey;

  @Id
  @Column(name="date_key")
  private long dateKey;


  public long getJobKey() {
    return this.jobKey;
  }

  public void setJobKey(long jobKey) {
    this.jobKey = jobKey;
  }

  public double getActual() {
    return this.actual;
  }

  public void setActual(double actual) {
    this.actual = actual;
  }

  public long getCandidateKey() {
    return this.candidateKey;
  }

  public void setCandidateKey(long candidateKey) {
    this.candidateKey = candidateKey;
  }

  public long getKpiLibKey() {
    return this.kpiLibKey;
  }

  public void setKpiLibKey(long kpiLibKey) {
    this.kpiLibKey = kpiLibKey;
  }

  public long getConsultantKey() {
    return this.consultantKey;
  }

  public void setConsultantKey(long consultantKey) {
    this.consultantKey = consultantKey;
  }

  public long getDateKey() {
    return this.dateKey;
  }

  public void setDateKey(long dateKey) {
    this.dateKey = dateKey;
  }
}
