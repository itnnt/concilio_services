package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_permission")
public class PositionPermission {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="type")
  private String type;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="location_id")
  private long locationId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="invited_date")
  private java.sql.Timestamp invitedDate;

  @Column(name="replied_date")
  private java.sql.Timestamp repliedDate;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getVerticalId() {
    return this.verticalId;
  }

  public void setVerticalId(long verticalId) {
    this.verticalId = verticalId;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public java.sql.Timestamp getInvitedDate() {
    return this.invitedDate;
  }

  public void setInvitedDate(java.sql.Timestamp invitedDate) {
    this.invitedDate = invitedDate;
  }

  public java.sql.Timestamp getRepliedDate() {
    return this.repliedDate;
  }

  public void setRepliedDate(java.sql.Timestamp repliedDate) {
    this.repliedDate = repliedDate;
  }
}
