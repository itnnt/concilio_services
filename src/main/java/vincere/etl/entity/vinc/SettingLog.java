package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="setting_log")
public class SettingLog {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="action_page")
  private long actionPage;

  @Column(name="action_type")
  private String actionType;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="field_key")
  private String fieldKey;

  @Column(name="old_value")
  private String oldValue;

  @Column(name="new_value")
  private String newValue;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getActionPage() {
    return this.actionPage;
  }

  public void setActionPage(long actionPage) {
    this.actionPage = actionPage;
  }

  public String getActionType() {
    return this.actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getFieldKey() {
    return this.fieldKey;
  }

  public void setFieldKey(String fieldKey) {
    this.fieldKey = fieldKey;
  }

  public String getOldValue() {
    return this.oldValue;
  }

  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }

  public String getNewValue() {
    return this.newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }
}
