package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_formatted_resume")
public class CandidateFormattedResume {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="resume_name")
  private String resumeName;

  @Column(name="mime_type")
  private String mimeType;

  @Column(name="version_no")
  private long versionNo;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="created")
  private java.sql.Timestamp created;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="html_header")
  private String htmlHeader;

  @Column(name="html_footer")
  private String htmlFooter;

  @Column(name="html_content")
  private String htmlContent;

  @Column(name="footer_height")
  private double footerHeight;

  @Column(name="header_height")
  private double headerHeight;

  @Column(name="html_header_cover")
  private String htmlHeaderCover;

  @Column(name="html_content_cover")
  private String htmlContentCover;

  @Column(name="html_footer_cover")
  private String htmlFooterCover;

  @Column(name="header_cover_height")
  private double headerCoverHeight;

  @Column(name="footer_cover_height")
  private double footerCoverHeight;

  @Column(name="include_cover_page")
  private long includeCoverPage;

  @Column(name="resume_template_id")
  private long resumeTemplateId;

  @Column(name="team_group_id")
  private long teamGroupId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public String getResumeName() {
    return this.resumeName;
  }

  public void setResumeName(String resumeName) {
    this.resumeName = resumeName;
  }

  public String getMimeType() {
    return this.mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public long getVersionNo() {
    return this.versionNo;
  }

  public void setVersionNo(long versionNo) {
    this.versionNo = versionNo;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getCreated() {
    return this.created;
  }

  public void setCreated(java.sql.Timestamp created) {
    this.created = created;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getHtmlHeader() {
    return this.htmlHeader;
  }

  public void setHtmlHeader(String htmlHeader) {
    this.htmlHeader = htmlHeader;
  }

  public String getHtmlFooter() {
    return this.htmlFooter;
  }

  public void setHtmlFooter(String htmlFooter) {
    this.htmlFooter = htmlFooter;
  }

  public String getHtmlContent() {
    return this.htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public double getFooterHeight() {
    return this.footerHeight;
  }

  public void setFooterHeight(double footerHeight) {
    this.footerHeight = footerHeight;
  }

  public double getHeaderHeight() {
    return this.headerHeight;
  }

  public void setHeaderHeight(double headerHeight) {
    this.headerHeight = headerHeight;
  }

  public String getHtmlHeaderCover() {
    return this.htmlHeaderCover;
  }

  public void setHtmlHeaderCover(String htmlHeaderCover) {
    this.htmlHeaderCover = htmlHeaderCover;
  }

  public String getHtmlContentCover() {
    return this.htmlContentCover;
  }

  public void setHtmlContentCover(String htmlContentCover) {
    this.htmlContentCover = htmlContentCover;
  }

  public String getHtmlFooterCover() {
    return this.htmlFooterCover;
  }

  public void setHtmlFooterCover(String htmlFooterCover) {
    this.htmlFooterCover = htmlFooterCover;
  }

  public double getHeaderCoverHeight() {
    return this.headerCoverHeight;
  }

  public void setHeaderCoverHeight(double headerCoverHeight) {
    this.headerCoverHeight = headerCoverHeight;
  }

  public double getFooterCoverHeight() {
    return this.footerCoverHeight;
  }

  public void setFooterCoverHeight(double footerCoverHeight) {
    this.footerCoverHeight = footerCoverHeight;
  }

  public long getIncludeCoverPage() {
    return this.includeCoverPage;
  }

  public void setIncludeCoverPage(long includeCoverPage) {
    this.includeCoverPage = includeCoverPage;
  }

  public long getResumeTemplateId() {
    return this.resumeTemplateId;
  }

  public void setResumeTemplateId(long resumeTemplateId) {
    this.resumeTemplateId = resumeTemplateId;
  }

  public long getTeamGroupId() {
    return this.teamGroupId;
  }

  public void setTeamGroupId(long teamGroupId) {
    this.teamGroupId = teamGroupId;
  }
}
