package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seek_job_posting")
public class SeekJobPosting {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="job_id")
  private long jobId;

  @Column(name="advertiser_id")
  private String advertiserId;

  @Column(name="advertisement_type")
  private String advertisementType;

  @Column(name="job_title")
  private String jobTitle;

  @Column(name="search_job_title")
  private String searchJobTitle;

  @Column(name="location_id")
  private String locationId;

  @Column(name="area_id")
  private String areaId;

  @Column(name="classification_id")
  private String classificationId;

  @Column(name="subclassification_id")
  private String subclassificationId;

  @Column(name="work_type")
  private String workType;

  @Column(name="salary_type")
  private String salaryType;

  @Column(name="salary_from")
  private String salaryFrom;

  @Column(name="salary_to")
  private String salaryTo;

  @Column(name="job_summary")
  private String jobSummary;

  @Column(name="advertisement_details")
  private String advertisementDetails;

  @Column(name="video_url")
  private String videoUrl;

  @Column(name="template_id")
  private long templateId;

  @Column(name="screen_id")
  private long screenId;

  @Column(name="recruiter_id")
  private long recruiterId;

  @Column(name="job_reference")
  private String jobReference;

  @Column(name="creation_id")
  private String creationId;

  @Column(name="advertisement_id")
  private String advertisementId;

  @Column(name="expiry_date")
  private java.sql.Timestamp expiryDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="application_form_url")
  private String applicationFormUrl;

  @Column(name="logo_id")
  private long logoId;

  @Column(name="salary_description")
  private String salaryDescription;

  @Column(name="bullet_point1")
  private String bulletPoint1;

  @Column(name="bullet_point2")
  private String bulletPoint2;

  @Column(name="bullet_point3")
  private String bulletPoint3;

  @Column(name="application_email")
  private String applicationEmail;

  @Column(name="template_items")
  private String templateItems;

  @Column(name="contact_name")
  private String contactName;

  @Column(name="contact_email")
  private String contactEmail;

  @Column(name="contact_phone")
  private String contactPhone;

  @Column(name="video_position")
  private String videoPosition;

  @Column(name="ap_residents_only")
  private String apResidentsOnly;

  @Column(name="ap_graduate")
  private String apGraduate;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getJobId() {
    return this.jobId;
  }

  public void setJobId(long jobId) {
    this.jobId = jobId;
  }

  public String getAdvertiserId() {
    return this.advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public String getAdvertisementType() {
    return this.advertisementType;
  }

  public void setAdvertisementType(String advertisementType) {
    this.advertisementType = advertisementType;
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getSearchJobTitle() {
    return this.searchJobTitle;
  }

  public void setSearchJobTitle(String searchJobTitle) {
    this.searchJobTitle = searchJobTitle;
  }

  public String getLocationId() {
    return this.locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public String getAreaId() {
    return this.areaId;
  }

  public void setAreaId(String areaId) {
    this.areaId = areaId;
  }

  public String getClassificationId() {
    return this.classificationId;
  }

  public void setClassificationId(String classificationId) {
    this.classificationId = classificationId;
  }

  public String getSubclassificationId() {
    return this.subclassificationId;
  }

  public void setSubclassificationId(String subclassificationId) {
    this.subclassificationId = subclassificationId;
  }

  public String getWorkType() {
    return this.workType;
  }

  public void setWorkType(String workType) {
    this.workType = workType;
  }

  public String getSalaryType() {
    return this.salaryType;
  }

  public void setSalaryType(String salaryType) {
    this.salaryType = salaryType;
  }

  public String getSalaryFrom() {
    return this.salaryFrom;
  }

  public void setSalaryFrom(String salaryFrom) {
    this.salaryFrom = salaryFrom;
  }

  public String getSalaryTo() {
    return this.salaryTo;
  }

  public void setSalaryTo(String salaryTo) {
    this.salaryTo = salaryTo;
  }

  public String getJobSummary() {
    return this.jobSummary;
  }

  public void setJobSummary(String jobSummary) {
    this.jobSummary = jobSummary;
  }

  public String getAdvertisementDetails() {
    return this.advertisementDetails;
  }

  public void setAdvertisementDetails(String advertisementDetails) {
    this.advertisementDetails = advertisementDetails;
  }

  public String getVideoUrl() {
    return this.videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public long getTemplateId() {
    return this.templateId;
  }

  public void setTemplateId(long templateId) {
    this.templateId = templateId;
  }

  public long getScreenId() {
    return this.screenId;
  }

  public void setScreenId(long screenId) {
    this.screenId = screenId;
  }

  public long getRecruiterId() {
    return this.recruiterId;
  }

  public void setRecruiterId(long recruiterId) {
    this.recruiterId = recruiterId;
  }

  public String getJobReference() {
    return this.jobReference;
  }

  public void setJobReference(String jobReference) {
    this.jobReference = jobReference;
  }

  public String getCreationId() {
    return this.creationId;
  }

  public void setCreationId(String creationId) {
    this.creationId = creationId;
  }

  public String getAdvertisementId() {
    return this.advertisementId;
  }

  public void setAdvertisementId(String advertisementId) {
    this.advertisementId = advertisementId;
  }

  public java.sql.Timestamp getExpiryDate() {
    return this.expiryDate;
  }

  public void setExpiryDate(java.sql.Timestamp expiryDate) {
    this.expiryDate = expiryDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getApplicationFormUrl() {
    return this.applicationFormUrl;
  }

  public void setApplicationFormUrl(String applicationFormUrl) {
    this.applicationFormUrl = applicationFormUrl;
  }

  public long getLogoId() {
    return this.logoId;
  }

  public void setLogoId(long logoId) {
    this.logoId = logoId;
  }

  public String getSalaryDescription() {
    return this.salaryDescription;
  }

  public void setSalaryDescription(String salaryDescription) {
    this.salaryDescription = salaryDescription;
  }

  public String getBulletPoint1() {
    return this.bulletPoint1;
  }

  public void setBulletPoint1(String bulletPoint1) {
    this.bulletPoint1 = bulletPoint1;
  }

  public String getBulletPoint2() {
    return this.bulletPoint2;
  }

  public void setBulletPoint2(String bulletPoint2) {
    this.bulletPoint2 = bulletPoint2;
  }

  public String getBulletPoint3() {
    return this.bulletPoint3;
  }

  public void setBulletPoint3(String bulletPoint3) {
    this.bulletPoint3 = bulletPoint3;
  }

  public String getApplicationEmail() {
    return this.applicationEmail;
  }

  public void setApplicationEmail(String applicationEmail) {
    this.applicationEmail = applicationEmail;
  }

  public String getTemplateItems() {
    return this.templateItems;
  }

  public void setTemplateItems(String templateItems) {
    this.templateItems = templateItems;
  }

  public String getContactName() {
    return this.contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public String getContactEmail() {
    return this.contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public String getContactPhone() {
    return this.contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public String getVideoPosition() {
    return this.videoPosition;
  }

  public void setVideoPosition(String videoPosition) {
    this.videoPosition = videoPosition;
  }

  public String getApResidentsOnly() {
    return this.apResidentsOnly;
  }

  public void setApResidentsOnly(String apResidentsOnly) {
    this.apResidentsOnly = apResidentsOnly;
  }

  public String getApGraduate() {
    return this.apGraduate;
  }

  public void setApGraduate(String apGraduate) {
    this.apGraduate = apGraduate;
  }
}
