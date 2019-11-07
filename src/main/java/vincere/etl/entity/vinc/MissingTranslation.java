package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class MissingTranslationId implements Serializable {
  private String language;
  private String key;
  private long variation;

}
@Entity
@Table(name="missing_translation")
@IdClass(MissingTranslationId.class)
public class MissingTranslation {


  @Id
  @Column(name="language")
  private String language;

  @Id
  @Column(name="key")
  private String key;

  @Column(name="translation")
  private String translation;

  @Column(name="url")
  private String url;

  @Id
  @Column(name="variation")
  private long variation;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getTranslation() {
    return this.translation;
  }

  public void setTranslation(String translation) {
    this.translation = translation;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public long getVariation() {
    return this.variation;
  }

  public void setVariation(long variation) {
    this.variation = variation;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
