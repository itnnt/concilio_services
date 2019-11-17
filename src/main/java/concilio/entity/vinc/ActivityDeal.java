package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ActivityDealId implements Serializable {
  private long activityId;
  private long dealId;

}

@Entity
@Table(name="activity_deal")
@IdClass(ActivityDealId.class)
public class ActivityDeal {


  @Id
  @Column(name="activity_id")
  private long activityId;

  @Id
  @Column(name="deal_id")
  private long dealId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getActivityId() {
    return this.activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }

  public long getDealId() {
    return this.dealId;
  }

  public void setDealId(long dealId) {
    this.dealId = dealId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
