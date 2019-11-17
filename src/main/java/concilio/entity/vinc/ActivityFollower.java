package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ActivityFollowerId implements Serializable {
  private long activityId;
  private long followerId;

}

@Entity
@Table(name="activity_follower")
@IdClass(ActivityFollowerId.class)
public class ActivityFollower {


  @Id
  @Column(name="activity_id")
  private long activityId;

  @Id
  @Column(name="follower_id")
  private long followerId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getActivityId() {
    return this.activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }

  public long getFollowerId() {
    return this.followerId;
  }

  public void setFollowerId(long followerId) {
    this.followerId = followerId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
