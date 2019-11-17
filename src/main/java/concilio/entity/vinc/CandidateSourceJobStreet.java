package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_source_job_street")
public class CandidateSourceJobStreet {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="user_id")
  private String userId;

  @Column(name="template_id")
  private String templateId;

  @Column(name="advert_id")
  private String advertId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="applied_website")
  private String appliedWebsite;

  @Column(name="company_name")
  private String companyName;

  @Column(name="site_to_post")
  private String siteToPost;

  @Column(name="company_introduction")
  private String companyIntroduction;

  @Column(name="company_web_site")
  private String companyWebSite;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTemplateId() {
    return this.templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public String getAdvertId() {
    return this.advertId;
  }

  public void setAdvertId(String advertId) {
    this.advertId = advertId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getAppliedWebsite() {
    return this.appliedWebsite;
  }

  public void setAppliedWebsite(String appliedWebsite) {
    this.appliedWebsite = appliedWebsite;
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getSiteToPost() {
    return this.siteToPost;
  }

  public void setSiteToPost(String siteToPost) {
    this.siteToPost = siteToPost;
  }

  public String getCompanyIntroduction() {
    return this.companyIntroduction;
  }

  public void setCompanyIntroduction(String companyIntroduction) {
    this.companyIntroduction = companyIntroduction;
  }

  public String getCompanyWebSite() {
    return this.companyWebSite;
  }

  public void setCompanyWebSite(String companyWebSite) {
    this.companyWebSite = companyWebSite;
  }
}
