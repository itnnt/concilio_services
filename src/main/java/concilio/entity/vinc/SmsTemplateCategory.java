package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sms_template_category")
public class SmsTemplateCategory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="language_expression")
  private String languageExpression;

  @Column(name="key")
  private String key;

  @Column(name="category_type")
  private String categoryType;


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

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getLanguageExpression() {
    return this.languageExpression;
  }

  public void setLanguageExpression(String languageExpression) {
    this.languageExpression = languageExpression;
  }

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getCategoryType() {
    return this.categoryType;
  }

  public void setCategoryType(String categoryType) {
    this.categoryType = categoryType;
  }
}
