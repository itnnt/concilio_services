package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="configurable_form")
public class ConfigurableForm {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="title")
  private String title;

  @Column(name="update_timestamp")
  private java.sql.Timestamp updateTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="location_id")
  private long locationId;

  @Column(name="position_type")
  private long positionType;

  @Column(name="description")
  private String description;

  @Column(name="default_language")
  private String defaultLanguage;

  @Column(name="user_modified_id")
  private long userModifiedId;

  @Column(name="type")
  private String type;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public java.sql.Timestamp getUpdateTimestamp() {
    return this.updateTimestamp;
  }

  public void setUpdateTimestamp(java.sql.Timestamp updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
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

  public long getPositionType() {
    return this.positionType;
  }

  public void setPositionType(long positionType) {
    this.positionType = positionType;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDefaultLanguage() {
    return this.defaultLanguage;
  }

  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  public long getUserModifiedId() {
    return this.userModifiedId;
  }

  public void setUserModifiedId(long userModifiedId) {
    this.userModifiedId = userModifiedId;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
