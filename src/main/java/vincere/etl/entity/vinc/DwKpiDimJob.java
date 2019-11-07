package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_kpi_dim_job")
public class DwKpiDimJob {

  @Id
  @Column(name="job_key")
  private long jobKey;

  @Column(name="active_candidate")
  private long activeCandidate;


  public long getJobKey() {
    return this.jobKey;
  }

  public void setJobKey(long jobKey) {
    this.jobKey = jobKey;
  }

  public long getActiveCandidate() {
    return this.activeCandidate;
  }

  public void setActiveCandidate(long activeCandidate) {
    this.activeCandidate = activeCandidate;
  }
}
