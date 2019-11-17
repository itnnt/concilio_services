package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_location")
public class CompanyLocation {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="company_id")
  private long companyId;

  @Column(name="state")
  private String state;

  @Column(name="post_code")
  private String postCode;

  @Column(name="city")
  private String city;

  @Column(name="district")
  private String district;

  @Column(name="address")
  private String address;

  @Column(name="latitude")
  private double latitude;

  @Column(name="longitude")
  private double longitude;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="country")
  private String country;

  @Column(name="location_name")
  private String locationName;

  @Column(name="nearest_train_station")
  private String nearestTrainStation;

  @Column(name="geo_name_id")
  private long geoNameId;

  @Column(name="country_code")
  private String countryCode;

  @Column(name="state_code")
  private String stateCode;

  @Column(name="city_code")
  private String cityCode;

  @Column(name="desired_location_candidate_id")
  private long desiredLocationCandidateId;

  @Column(name="personal_location_candidate_id")
  private long personalLocationCandidateId;

  @Column(name="current_location_candidate_id")
  private long currentLocationCandidateId;

  @Column(name="trigger_index_update_timestamp")
  private java.sql.Timestamp triggerIndexUpdateTimestamp;

  @Column(name="location_type")
  private String locationType;

  @Column(name="phone_number")
  private String phoneNumber;

  @Column(name="note")
  private String note;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPostCode() {
    return this.postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getDistrict() {
    return this.district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public double getLatitude() {
    return this.latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return this.longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getLocationName() {
    return this.locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public String getNearestTrainStation() {
    return this.nearestTrainStation;
  }

  public void setNearestTrainStation(String nearestTrainStation) {
    this.nearestTrainStation = nearestTrainStation;
  }

  public long getGeoNameId() {
    return this.geoNameId;
  }

  public void setGeoNameId(long geoNameId) {
    this.geoNameId = geoNameId;
  }

  public String getCountryCode() {
    return this.countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getStateCode() {
    return this.stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public String getCityCode() {
    return this.cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public long getDesiredLocationCandidateId() {
    return this.desiredLocationCandidateId;
  }

  public void setDesiredLocationCandidateId(long desiredLocationCandidateId) {
    this.desiredLocationCandidateId = desiredLocationCandidateId;
  }

  public long getPersonalLocationCandidateId() {
    return this.personalLocationCandidateId;
  }

  public void setPersonalLocationCandidateId(long personalLocationCandidateId) {
    this.personalLocationCandidateId = personalLocationCandidateId;
  }

  public long getCurrentLocationCandidateId() {
    return this.currentLocationCandidateId;
  }

  public void setCurrentLocationCandidateId(long currentLocationCandidateId) {
    this.currentLocationCandidateId = currentLocationCandidateId;
  }

  public java.sql.Timestamp getTriggerIndexUpdateTimestamp() {
    return this.triggerIndexUpdateTimestamp;
  }

  public void setTriggerIndexUpdateTimestamp(java.sql.Timestamp triggerIndexUpdateTimestamp) {
    this.triggerIndexUpdateTimestamp = triggerIndexUpdateTimestamp;
  }

  public String getLocationType() {
    return this.locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }
}
