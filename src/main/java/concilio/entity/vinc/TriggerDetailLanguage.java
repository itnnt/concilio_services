package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class TriggerDetailLanguageId implements Serializable {
  private long triggerId;
  private String language;

}

@Entity
@Table(name="trigger_detail_language")
@IdClass(TriggerDetailLanguageId.class)
public class TriggerDetailLanguage {


  @Id
  @Column(name="trigger_id")
  private long triggerId;

  @Id
  @Column(name="language")
  private String language;

  @Column(name="name_lang")
  private String nameLang;

  @Column(name="description_lang")
  private String descriptionLang;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getTriggerId() {
    return this.triggerId;
  }

  public void setTriggerId(long triggerId) {
    this.triggerId = triggerId;
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
