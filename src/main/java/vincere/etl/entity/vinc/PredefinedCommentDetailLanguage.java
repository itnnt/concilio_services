package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class PredefinedCommentDetailLanguageId implements Serializable {
  private long predefinedCommentId;
  private String language;

}
@Entity
@Table(name="predefined_comment_detail_language")
@IdClass(PredefinedCommentDetailLanguageId.class)
public class PredefinedCommentDetailLanguage {


  @Id
  @Column(name="predefined_comment_id")
  private long predefinedCommentId;

  @Id
  @Column(name="language")
  private String language;

  @Column(name="name_lang")
  private String nameLang;

  @Column(name="description_lang")
  private String descriptionLang;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getPredefinedCommentId() {
    return this.predefinedCommentId;
  }

  public void setPredefinedCommentId(long predefinedCommentId) {
    this.predefinedCommentId = predefinedCommentId;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getNameLang() {
    return this.nameLang;
  }

  public void setNameLang(String nameLang) {
    this.nameLang = nameLang;
  }

  public String getDescriptionLang() {
    return this.descriptionLang;
  }

  public void setDescriptionLang(String descriptionLang) {
    this.descriptionLang = descriptionLang;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
