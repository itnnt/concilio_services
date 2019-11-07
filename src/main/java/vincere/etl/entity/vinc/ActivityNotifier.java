package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ActivityNotifierId implements Serializable {
  private long activityId;
  private long notifierId;

}
@Entity
@Table(name="activity_notifier")
@IdClass(ActivityNotifierId.class)
public class ActivityNotifier {


  @Id
  @Column(name="activity_id")
  private long activityId;

  @Id
  @Column(name="notifier_id")
  private long notifierId;

  @Column(name="comment_by")
  private long commentBy;

  @Column(name="read_flag")
  private long readFlag;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getActivityId() {
    return this.activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }

  public long getNotifierId() {
    return this.notifierId;
  }

  public void setNotifierId(long notifierId) {
    this.notifierId = notifierId;
  }

  public long getCommentBy() {
    return this.commentBy;
  }

  public void setCommentBy(long commentBy) {
    this.commentBy = commentBy;
  }

  public long getReadFlag() {
    return this.readFlag;
  }

  public void setReadFlag(long readFlag) {
    this.readFlag = readFlag;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
