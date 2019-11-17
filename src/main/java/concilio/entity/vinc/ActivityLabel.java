package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ActivityLabelId implements Serializable {
  private long activityId;
  private long labelId;

}

@Entity
@Table(name="activity_label")
@IdClass(ActivityLabelId.class)
public class ActivityLabel {


  @Id
  @Column(name="activity_id")
  private long activityId;

  @Id
  @Column(name="label_id")
  private long labelId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getActivityId() {
    return this.activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }

  public long getLabelId() {
    return this.labelId;
  }

  public void setLabelId(long labelId) {
    this.labelId = labelId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
