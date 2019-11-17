package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ActivityCandidateId implements Serializable {
  private long activityId;
  private long candidateId;

}

@Entity
@Table(name="activity_candidate")
@IdClass(ActivityCandidateId.class)
public class ActivityCandidate {


  @Id
  @Column(name="activity_id")
  private long activityId;

  @Id
  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getActivityId() {
    return this.activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
