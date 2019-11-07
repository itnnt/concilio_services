package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="live_list_setting")
public class LiveListSetting {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="show_sub_status")
  private long showSubStatus;

  @Column(name="show_candidate_photo")
  private long showCandidatePhoto;

  @Column(name="position_id")
  private long positionId;

  @Column(name="created_by_id")
  private long createdById;

  @Column(name="last_updated_by_id")
  private long lastUpdatedById;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getShowSubStatus() {
    return this.showSubStatus;
  }

  public void setShowSubStatus(long showSubStatus) {
    this.showSubStatus = showSubStatus;
  }

  public long getShowCandidatePhoto() {
    return this.showCandidatePhoto;
  }

  public void setShowCandidatePhoto(long showCandidatePhoto) {
    this.showCandidatePhoto = showCandidatePhoto;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public long getCreatedById() {
    return this.createdById;
  }

  public void setCreatedById(long createdById) {
    this.createdById = createdById;
  }

  public long getLastUpdatedById() {
    return this.lastUpdatedById;
  }

  public void setLastUpdatedById(long lastUpdatedById) {
    this.lastUpdatedById = lastUpdatedById;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
