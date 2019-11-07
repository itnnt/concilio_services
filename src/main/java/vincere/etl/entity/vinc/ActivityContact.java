package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ActivityContactId implements Serializable {
  private long activityId;
  private long contactId;

}
@Entity
@Table(name="activity_contact")
@IdClass(ActivityContactId.class)
public class ActivityContact {


  @Id
  @Column(name="activity_id")
  private long activityId;

  @Id
  @Column(name="contact_id")
  private long contactId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getActivityId() {
    return this.activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
