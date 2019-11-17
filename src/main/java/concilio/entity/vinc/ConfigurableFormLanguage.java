package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="configurable_form_language")
public class ConfigurableFormLanguage {


  @Column(name="language_code")
  private String languageCode;

  @Column(name="language")
  private String language;

  @Column(name="translate")
  private String translate;

  @Id
  @Column(name="id")
  private long id;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public String getLanguageCode() {
    return this.languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getTranslate() {
    return this.translate;
  }

  public void setTranslate(String translate) {
    this.translate = translate;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
