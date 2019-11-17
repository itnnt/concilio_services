package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sms_template_wildcard")
public class SmsTemplateWildcard {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="sms_template_category_id")
  private long smsTemplateCategoryId;

  @Column(name="key")
  private String key;

  @Column(name="label")
  private String label;

  @Column(name="description")
  private String description;

  @Column(name="sample_value")
  private String sampleValue;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="expression")
  private String expression;


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

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getSampleValue() {
    return this.sampleValue;
  }

  public void setSampleValue(String sampleValue) {
    this.sampleValue = sampleValue;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getExpression() {
    return this.expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }
}
