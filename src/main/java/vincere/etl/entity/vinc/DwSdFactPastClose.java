package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_sd_fact_past_close")
public class DwSdFactPastClose {


  @Column(name="job_key")
  private long jobKey;

  @Column(name="no_job_close")
  private long noJobClose;

  @Id
  @Column(name="date_key")
  private long dateKey;


  public long getJobKey() {
    return this.jobKey;
  }

  public void setJobKey(long jobKey) {
    this.jobKey = jobKey;
  }

  public long getNoJobClose() {
    return this.noJobClose;
  }

  public void setNoJobClose(long noJobClose) {
    this.noJobClose = noJobClose;
  }

  public long getDateKey() {
    return this.dateKey;
  }

  public void setDateKey(long dateKey) {
    this.dateKey = dateKey;
  }
}
