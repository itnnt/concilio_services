package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ActivityJobId implements Serializable {
  private long activityId;
  private long jobId;

}

@Entity
@Table(name="activity_job")
@IdClass(ActivityJobId.class)
public class ActivityJob {


  @Id
  @Column(name="activity_id")
  private long activityId;

  @Id
  @Column(name="job_id")
  private long jobId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getActivityId() {
    return this.activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }

  public long getJobId() {
    return this.jobId;
  }

  public void setJobId(long jobId) {
    this.jobId = jobId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
