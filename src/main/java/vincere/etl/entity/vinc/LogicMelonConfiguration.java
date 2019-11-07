package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="logic_melon_configuration")
public class LogicMelonConfiguration {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="secret_key")
  private String secretKey;

  @Column(name="username")
  private String username;

  @Column(name="status")
  private String status;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="application_retrieve_timestamp")
  private java.sql.Timestamp applicationRetrieveTimestamp;

  @Column(name="application_retrieve_setting")
  private String applicationRetrieveSetting;

  @Column(name="unranked_setting")
  private String unrankedSetting;

  @Column(name="unsuitable_setting")
  private String unsuitableSetting;

  @Column(name="maybe_suitable_setting")
  private String maybeSuitableSetting;

  @Column(name="suitable_setting")
  private String suitableSetting;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSecretKey() {
    return this.secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getApplicationRetrieveTimestamp() {
    return this.applicationRetrieveTimestamp;
  }

  public void setApplicationRetrieveTimestamp(java.sql.Timestamp applicationRetrieveTimestamp) {
    this.applicationRetrieveTimestamp = applicationRetrieveTimestamp;
  }

  public String getApplicationRetrieveSetting() {
    return this.applicationRetrieveSetting;
  }

  public void setApplicationRetrieveSetting(String applicationRetrieveSetting) {
    this.applicationRetrieveSetting = applicationRetrieveSetting;
  }

  public String getUnrankedSetting() {
    return this.unrankedSetting;
  }

  public void setUnrankedSetting(String unrankedSetting) {
    this.unrankedSetting = unrankedSetting;
  }

  public String getUnsuitableSetting() {
    return this.unsuitableSetting;
  }

  public void setUnsuitableSetting(String unsuitableSetting) {
    this.unsuitableSetting = unsuitableSetting;
  }

  public String getMaybeSuitableSetting() {
    return this.maybeSuitableSetting;
  }

  public void setMaybeSuitableSetting(String maybeSuitableSetting) {
    this.maybeSuitableSetting = maybeSuitableSetting;
  }

  public String getSuitableSetting() {
    return this.suitableSetting;
  }

  public void setSuitableSetting(String suitableSetting) {
    this.suitableSetting = suitableSetting;
  }
}
