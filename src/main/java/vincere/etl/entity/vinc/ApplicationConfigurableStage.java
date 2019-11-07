package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="application_configurable_stage")
public class ApplicationConfigurableStage {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="status")
  private long status;

  @Column(name="enabled")
  private long enabled;

  @Column(name="name")
  private String name;

  @Column(name="index")
  private long index;

  @Column(name="system_stage")
  private long systemStage;

  @Column(name="sub_action_type")
  private String subActionType;

  @Column(name="propagate")
  private long propagate;

  @Column(name="message_resource_code")
  private String messageResourceCode;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public long getEnabled() {
    return this.enabled;
  }

  public void setEnabled(long enabled) {
    this.enabled = enabled;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getIndex() {
    return this.index;
  }

  public void setIndex(long index) {
    this.index = index;
  }

  public long getSystemStage() {
    return this.systemStage;
  }

  public void setSystemStage(long systemStage) {
    this.systemStage = systemStage;
  }

  public String getSubActionType() {
    return this.subActionType;
  }

  public void setSubActionType(String subActionType) {
    this.subActionType = subActionType;
  }

  public long getPropagate() {
    return this.propagate;
  }

  public void setPropagate(long propagate) {
    this.propagate = propagate;
  }

  public String getMessageResourceCode() {
    return this.messageResourceCode;
  }

  public void setMessageResourceCode(String messageResourceCode) {
    this.messageResourceCode = messageResourceCode;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
