package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="careersite_configuration")
public class CareersiteConfiguration {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="site_logo")
  private long siteLogo;

  @Column(name="banner_image")
  private long bannerImage;

  @Column(name="footer_image")
  private long footerImage;

  @Column(name="page_title")
  private String pageTitle;

  @Column(name="button_color")
  private String buttonColor;

  @Column(name="apply_button")
  private long applyButton;

  @Column(name="show_industry")
  private long showIndustry;

  @Column(name="show_expertise")
  private long showExpertise;

  @Column(name="show_salary")
  private long showSalary;

  @Column(name="show_salary_type")
  private long showSalaryType;

  @Column(name="show_contact_name")
  private long showContactName;

  @Column(name="show_phone_number")
  private long showPhoneNumber;

  @Column(name="show_contact_email")
  private long showContactEmail;

  @Column(name="phone_number_require")
  private long phoneNumberRequire;

  @Column(name="address_location_require")
  private long addressLocationRequire;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="language")
  private String language;

  @Column(name="status")
  private String status;

  @Column(name="radius_search_unit")
  private String radiusSearchUnit;

  @Column(name="submit_button")
  private long submitButton;

  @Column(name="mask_url")
  private String maskUrl;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSiteLogo() {
    return this.siteLogo;
  }

  public void setSiteLogo(long siteLogo) {
    this.siteLogo = siteLogo;
  }

  public long getBannerImage() {
    return this.bannerImage;
  }

  public void setBannerImage(long bannerImage) {
    this.bannerImage = bannerImage;
  }

  public long getFooterImage() {
    return this.footerImage;
  }

  public void setFooterImage(long footerImage) {
    this.footerImage = footerImage;
  }

  public String getPageTitle() {
    return this.pageTitle;
  }

  public void setPageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
  }

  public String getButtonColor() {
    return this.buttonColor;
  }

  public void setButtonColor(String buttonColor) {
    this.buttonColor = buttonColor;
  }

  public long getApplyButton() {
    return this.applyButton;
  }

  public void setApplyButton(long applyButton) {
    this.applyButton = applyButton;
  }

  public long getShowIndustry() {
    return this.showIndustry;
  }

  public void setShowIndustry(long showIndustry) {
    this.showIndustry = showIndustry;
  }

  public long getShowExpertise() {
    return this.showExpertise;
  }

  public void setShowExpertise(long showExpertise) {
    this.showExpertise = showExpertise;
  }

  public long getShowSalary() {
    return this.showSalary;
  }

  public void setShowSalary(long showSalary) {
    this.showSalary = showSalary;
  }

  public long getShowSalaryType() {
    return this.showSalaryType;
  }

  public void setShowSalaryType(long showSalaryType) {
    this.showSalaryType = showSalaryType;
  }

  public long getShowContactName() {
    return this.showContactName;
  }

  public void setShowContactName(long showContactName) {
    this.showContactName = showContactName;
  }

  public long getShowPhoneNumber() {
    return this.showPhoneNumber;
  }

  public void setShowPhoneNumber(long showPhoneNumber) {
    this.showPhoneNumber = showPhoneNumber;
  }

  public long getShowContactEmail() {
    return this.showContactEmail;
  }

  public void setShowContactEmail(long showContactEmail) {
    this.showContactEmail = showContactEmail;
  }

  public long getPhoneNumberRequire() {
    return this.phoneNumberRequire;
  }

  public void setPhoneNumberRequire(long phoneNumberRequire) {
    this.phoneNumberRequire = phoneNumberRequire;
  }

  public long getAddressLocationRequire() {
    return this.addressLocationRequire;
  }

  public void setAddressLocationRequire(long addressLocationRequire) {
    this.addressLocationRequire = addressLocationRequire;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getRadiusSearchUnit() {
    return this.radiusSearchUnit;
  }

  public void setRadiusSearchUnit(String radiusSearchUnit) {
    this.radiusSearchUnit = radiusSearchUnit;
  }

  public long getSubmitButton() {
    return this.submitButton;
  }

  public void setSubmitButton(long submitButton) {
    this.submitButton = submitButton;
  }

  public String getMaskUrl() {
    return this.maskUrl;
  }

  public void setMaskUrl(String maskUrl) {
    this.maskUrl = maskUrl;
  }
}
