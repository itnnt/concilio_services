package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ActivityAttendeeId implements Serializable {
  private long activityId;
  private long attendeeId;

}

@Entity
@Table(name="activity_attendee")
@IdClass(ActivityAttendeeId.class)
public class ActivityAttendee {


  @Id
  @Column(name="activity_id")
  private long activityId;

  @Id
  @Column(name="attendee_id")
  private long attendeeId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getActivityId() {
    return this.activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }

  public long getAttendeeId() {
    return this.attendeeId;
  }

  public void setAttendeeId(long attendeeId) {
    this.attendeeId = attendeeId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
