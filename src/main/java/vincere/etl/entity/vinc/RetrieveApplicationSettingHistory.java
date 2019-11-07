package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="retrieve_application_setting_history")
public class RetrieveApplicationSettingHistory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="app_id")
  private String appId;

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

  @Column(name="progressed_setting")
  private String progressedSetting;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAppId() {
    return this.appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
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

  public String getProgressedSetting() {
    return this.progressedSetting;
  }

  public void setProgressedSetting(String progressedSetting) {
    this.progressedSetting = progressedSetting;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
