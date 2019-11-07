package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="sms_template_language")
public class SmsTemplateLanguage {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="sms_template_category_id")
  private long smsTemplateCategoryId;

  @Column(name="language")
  private String language;

  @Column(name="to_phone")
  private String toPhone;

  @Column(name="body")
  private String body;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSmsTemplateCategoryId() {
    return this.smsTemplateCategoryId;
  }

  public void setSmsTemplateCategoryId(long smsTemplateCategoryId) {
    this.smsTemplateCategoryId = smsTemplateCategoryId;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getToPhone() {
    return this.toPhone;
  }

  public void setToPhone(String toPhone) {
    this.toPhone = toPhone;
  }

  public String getBody() {
    return this.body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
