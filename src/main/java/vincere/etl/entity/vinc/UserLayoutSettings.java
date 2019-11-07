package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class UserLayoutSettingsId implements Serializable {
  private long userId;
  private String layoutId;

}
@Entity
@Table(name="user_layout_settings")
@IdClass(UserLayoutSettingsId.class)
public class UserLayoutSettings {


  @Column(name="id")
  private long id;

  @Id
  @Column(name="user_id")
  private long userId;

  @Column(name="display_settings")
  private String displaySettings;

  @Id
  @Column(name="layout_id")
  private String layoutId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getDisplaySettings() {
    return this.displaySettings;
  }

  public void setDisplaySettings(String displaySettings) {
    this.displaySettings = displaySettings;
  }

  public String getLayoutId() {
    return this.layoutId;
  }

  public void setLayoutId(String layoutId) {
    this.layoutId = layoutId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
