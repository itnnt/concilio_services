package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="document_builder_original_template")
public class DocumentBuilderOriginalTemplate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="builder_type")
  private String builderType;

  @Column(name="html_content")
  private String htmlContent;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="name")
  private String name;

  @Column(name="default_flag")
  private long defaultFlag;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBuilderType() {
    return this.builderType;
  }

  public void setBuilderType(String builderType) {
    this.builderType = builderType;
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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getDefaultFlag() {
    return this.defaultFlag;
  }

  public void setDefaultFlag(long defaultFlag) {
    this.defaultFlag = defaultFlag;
  }
}
