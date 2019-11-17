package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rejected_slideshow_sharing")
public class RejectedSlideshowSharing {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="slideshow_id")
  private long slideshowId;

  @Column(name="user_id")
  private long userId;

  @Column(name="reject_date")
  private java.sql.Timestamp rejectDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSlideshowId() {
    return this.slideshowId;
  }

  public void setSlideshowId(long slideshowId) {
    this.slideshowId = slideshowId;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public java.sql.Timestamp getRejectDate() {
    return this.rejectDate;
  }

  public void setRejectDate(java.sql.Timestamp rejectDate) {
    this.rejectDate = rejectDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
