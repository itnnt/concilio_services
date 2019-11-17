package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="document_builder")
public class DocumentBuilder {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="builder_type")
  private String builderType;

  @Column(name="default_flag")
  private long defaultFlag;

  @Column(name="html_content")
  private String htmlContent;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="html_footer")
  private String htmlFooter;

  @Column(name="html_header")
  private String htmlHeader;

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

  @Column(name="team_group_id")
  private long teamGroupId;


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

  public String getBuilderType() {
    return this.builderType;
  }

  public void setBuilderType(String builderType) {
    this.builderType = builderType;
  }

  public long getDefaultFlag() {
    return this.defaultFlag;
  }

  public void setDefaultFlag(long defaultFlag) {
    this.defaultFlag = defaultFlag;
  }

  public String getHtmlContent() {
    return this.htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getHtmlFooter() {
    return this.htmlFooter;
  }

  public void setHtmlFooter(String htmlFooter) {
    this.htmlFooter = htmlFooter;
  }

  public String getHtmlHeader() {
    return this.htmlHeader;
  }

  public void setHtmlHeader(String htmlHeader) {
    this.htmlHeader = htmlHeader;
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

  public long getTeamGroupId() {
    return this.teamGroupId;
  }

  public void setTeamGroupId(long teamGroupId) {
    this.teamGroupId = teamGroupId;
  }
}
