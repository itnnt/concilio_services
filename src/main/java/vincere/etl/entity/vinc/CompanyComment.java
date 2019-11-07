package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="company_comment")
public class CompanyComment {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="company_id")
  private long companyId;

  @Column(name="user_id")
  private long userId;

  @Column(name="comment_timestamp")
  private java.sql.Timestamp commentTimestamp;

  @Column(name="comment_content")
  private String commentContent;

  @Column(name="json_relate_info")
  private String jsonRelateInfo;

  @Column(name="kpi_related_lib")
  private String kpiRelatedLib;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


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

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public java.sql.Timestamp getCommentTimestamp() {
    return this.commentTimestamp;
  }

  public void setCommentTimestamp(java.sql.Timestamp commentTimestamp) {
    this.commentTimestamp = commentTimestamp;
  }

  public String getCommentContent() {
    return this.commentContent;
  }

  public void setCommentContent(String commentContent) {
    this.commentContent = commentContent;
  }

  public String getJsonRelateInfo() {
    return this.jsonRelateInfo;
  }

  public void setJsonRelateInfo(String jsonRelateInfo) {
    this.jsonRelateInfo = jsonRelateInfo;
  }

  public String getKpiRelatedLib() {
    return this.kpiRelatedLib;
  }

  public void setKpiRelatedLib(String kpiRelatedLib) {
    this.kpiRelatedLib = kpiRelatedLib;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
