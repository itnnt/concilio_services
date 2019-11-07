package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="app_configuration")
public class AppConfiguration {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="status")
  private String status;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="use_logo")
  private long useLogo;

  @Column(name="term_and_conditions")
  private String termAndConditions;

  @Column(name="term_and_conditions_employee")
  private String termAndConditionsEmployee;

  @Column(name="api_key")
  private String apiKey;

  @Column(name="username")
  private String username;

  @Column(name="password")
  private String password;

  @Column(name="phone_number")
  private String phoneNumber;

  @Column(name="api_url")
  private String apiUrl;

  @Column(name="last_retrieved_application_id")
  private long lastRetrievedApplicationId;

  @Column(name="use_application_form_url")
  private long useApplicationFormUrl;

  @Column(name="advertisement_type")
  private String advertisementType;

  @Column(name="enabled_date")
  private java.sql.Timestamp enabledDate;

  @Column(name="custom_config")
  private String customConfig;


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

  public long getUseLogo() {
    return this.useLogo;
  }

  public void setUseLogo(long useLogo) {
    this.useLogo = useLogo;
  }

  public String getTermAndConditions() {
    return this.termAndConditions;
  }

  public void setTermAndConditions(String termAndConditions) {
    this.termAndConditions = termAndConditions;
  }

  public String getTermAndConditionsEmployee() {
    return this.termAndConditionsEmployee;
  }

  public void setTermAndConditionsEmployee(String termAndConditionsEmployee) {
    this.termAndConditionsEmployee = termAndConditionsEmployee;
  }

  public String getApiKey() {
    return this.apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getApiUrl() {
    return this.apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  public long getLastRetrievedApplicationId() {
    return this.lastRetrievedApplicationId;
  }

  public void setLastRetrievedApplicationId(long lastRetrievedApplicationId) {
    this.lastRetrievedApplicationId = lastRetrievedApplicationId;
  }

  public long getUseApplicationFormUrl() {
    return this.useApplicationFormUrl;
  }

  public void setUseApplicationFormUrl(long useApplicationFormUrl) {
    this.useApplicationFormUrl = useApplicationFormUrl;
  }

  public String getAdvertisementType() {
    return this.advertisementType;
  }

  public void setAdvertisementType(String advertisementType) {
    this.advertisementType = advertisementType;
  }

  public java.sql.Timestamp getEnabledDate() {
    return this.enabledDate;
  }

  public void setEnabledDate(java.sql.Timestamp enabledDate) {
    this.enabledDate = enabledDate;
  }

  public String getCustomConfig() {
    return this.customConfig;
  }

  public void setCustomConfig(String customConfig) {
    this.customConfig = customConfig;
  }
}
