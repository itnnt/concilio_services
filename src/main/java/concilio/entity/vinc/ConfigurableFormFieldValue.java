package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="configurable_form_field_value")
public class ConfigurableFormFieldValue {


  @Column(name="field_id")
  private long fieldId;

  @Column(name="field_value")
  private String fieldValue;

  @Column(name="title_language_code")
  private String titleLanguageCode;

  @Column(name="default_value")
  private long defaultValue;

  @Column(name="form_id")
  private long formId;

  @Id
  @Column(name="id")
  private long id;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getFieldId() {
    return this.fieldId;
  }

  public void setFieldId(long fieldId) {
    this.fieldId = fieldId;
  }

  public String getFieldValue() {
    return this.fieldValue;
  }

  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }

  public String getTitleLanguageCode() {
    return this.titleLanguageCode;
  }

  public void setTitleLanguageCode(String titleLanguageCode) {
    this.titleLanguageCode = titleLanguageCode;
  }

  public long getDefaultValue() {
    return this.defaultValue;
  }

  public void setDefaultValue(long defaultValue) {
    this.defaultValue = defaultValue;
  }

  public long getFormId() {
    return this.formId;
  }

  public void setFormId(long formId) {
    this.formId = formId;
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
