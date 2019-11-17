package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_head_count_allocation")
public class PositionHeadCountAllocation {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="signoff_date")
  private java.sql.Timestamp signoffDate;

  @Column(name="reason_for_head_count")
  private String reasonForHeadCount;

  @Column(name="head_count")
  private long headCount;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public java.sql.Timestamp getSignoffDate() {
    return this.signoffDate;
  }

  public void setSignoffDate(java.sql.Timestamp signoffDate) {
    this.signoffDate = signoffDate;
  }

  public String getReasonForHeadCount() {
    return this.reasonForHeadCount;
  }

  public void setReasonForHeadCount(String reasonForHeadCount) {
    this.reasonForHeadCount = reasonForHeadCount;
  }

  public long getHeadCount() {
    return this.headCount;
  }

  public void setHeadCount(long headCount) {
    this.headCount = headCount;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
