package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="location")
public class Location {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="address")
  private String address;

  @Column(name="city")
  private String city;

  @Column(name="country")
  private String country;

  @Column(name="zipcode")
  private String zipcode;

  @Column(name="latitude")
  private double latitude;

  @Column(name="longitude")
  private double longitude;

  @Column(name="benefits_healthcare_percent")
  private double benefitsHealthcarePercent;

  @Column(name="benefits_unemployment_percent")
  private double benefitsUnemploymentPercent;

  @Column(name="benefits_welfare_pension_percent")
  private double benefitsWelfarePensionPercent;

  @Column(name="benefits_workers_comp_percent")
  private double benefitsWorkersCompPercent;

  @Column(name="currency_type")
  private String currencyType;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="state")
  private String state;

  @Column(name="timezone")
  private String timezone;

  @Column(name="country2")
  private String country2;

  @Column(name="region")
  private String region;

  @Column(name="sub_region")
  private String subRegion;

  @Column(name="district")
  private String district;

  @Column(name="country_code")
  private String countryCode;


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

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getZipcode() {
    return this.zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
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

  public double getBenefitsHealthcarePercent() {
    return this.benefitsHealthcarePercent;
  }

  public void setBenefitsHealthcarePercent(double benefitsHealthcarePercent) {
    this.benefitsHealthcarePercent = benefitsHealthcarePercent;
  }

  public double getBenefitsUnemploymentPercent() {
    return this.benefitsUnemploymentPercent;
  }

  public void setBenefitsUnemploymentPercent(double benefitsUnemploymentPercent) {
    this.benefitsUnemploymentPercent = benefitsUnemploymentPercent;
  }

  public double getBenefitsWelfarePensionPercent() {
    return this.benefitsWelfarePensionPercent;
  }

  public void setBenefitsWelfarePensionPercent(double benefitsWelfarePensionPercent) {
    this.benefitsWelfarePensionPercent = benefitsWelfarePensionPercent;
  }

  public double getBenefitsWorkersCompPercent() {
    return this.benefitsWorkersCompPercent;
  }

  public void setBenefitsWorkersCompPercent(double benefitsWorkersCompPercent) {
    this.benefitsWorkersCompPercent = benefitsWorkersCompPercent;
  }

  public String getCurrencyType() {
    return this.currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getTimezone() {
    return this.timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public String getCountry2() {
    return this.country2;
  }

  public void setCountry2(String country2) {
    this.country2 = country2;
  }

  public String getRegion() {
    return this.region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getSubRegion() {
    return this.subRegion;
  }

  public void setSubRegion(String subRegion) {
    this.subRegion = subRegion;
  }

  public String getDistrict() {
    return this.district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getCountryCode() {
    return this.countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }
}
