package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_dim_job_type")
public class DwDimJobType {

  @Id
  @Column(name="job_type_key")
  private long jobTypeKey;

  @Column(name="job_type_name")
  private String jobTypeName;


  public long getJobTypeKey() {
    return this.jobTypeKey;
  }

  public void setJobTypeKey(long jobTypeKey) {
    this.jobTypeKey = jobTypeKey;
  }

  public String getJobTypeName() {
    return this.jobTypeName;
  }

  public void setJobTypeName(String jobTypeName) {
    this.jobTypeName = jobTypeName;
  }
}
