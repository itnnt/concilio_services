package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="x_ray_search")
public class XRaySearch {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="country")
  private String country;

  @Column(name="include_keyword")
  private String includeKeyword;

  @Column(name="education")
  private String education;

  @Column(name="job_title")
  private String jobTitle;

  @Column(name="similar_job")
  private long similarJob;

  @Column(name="exclude_keyword")
  private String excludeKeyword;

  @Column(name="company")
  private String company;

  @Column(name="xray_search_text")
  private String xraySearchText;

  @Column(name="xray_search_url")
  private String xraySearchUrl;

  @Column(name="site_type")
  private String siteType;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="saved_search_name")
  private String savedSearchName;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getIncludeKeyword() {
    return this.includeKeyword;
  }

  public void setIncludeKeyword(String includeKeyword) {
    this.includeKeyword = includeKeyword;
  }

  public String getEducation() {
    return this.education;
  }

  public void setEducation(String education) {
    this.education = education;
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public long getSimilarJob() {
    return this.similarJob;
  }

  public void setSimilarJob(long similarJob) {
    this.similarJob = similarJob;
  }

  public String getExcludeKeyword() {
    return this.excludeKeyword;
  }

  public void setExcludeKeyword(String excludeKeyword) {
    this.excludeKeyword = excludeKeyword;
  }

  public String getCompany() {
    return this.company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getXraySearchText() {
    return this.xraySearchText;
  }

  public void setXraySearchText(String xraySearchText) {
    this.xraySearchText = xraySearchText;
  }

  public String getXraySearchUrl() {
    return this.xraySearchUrl;
  }

  public void setXraySearchUrl(String xraySearchUrl) {
    this.xraySearchUrl = xraySearchUrl;
  }

  public String getSiteType() {
    return this.siteType;
  }

  public void setSiteType(String siteType) {
    this.siteType = siteType;
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

  public String getSavedSearchName() {
    return this.savedSearchName;
  }

  public void setSavedSearchName(String savedSearchName) {
    this.savedSearchName = savedSearchName;
  }
}
