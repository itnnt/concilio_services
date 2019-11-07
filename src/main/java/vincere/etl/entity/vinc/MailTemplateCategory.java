package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="mail_template_category")
public class MailTemplateCategory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="default_version_id")
  private long defaultVersionId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="language_expression")
  private String languageExpression;

  @Column(name="key")
  private String key;

  @Column(name="reserved")
  private long reserved;

  @Column(name="category_key")
  private String categoryKey;

  @Column(name="load_order")
  private long loadOrder;

  @Column(name="send_type")
  private long sendType;


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

  public long getDefaultVersionId() {
    return this.defaultVersionId;
  }

  public void setDefaultVersionId(long defaultVersionId) {
    this.defaultVersionId = defaultVersionId;
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

  public long getReserved() {
    return this.reserved;
  }

  public void setReserved(long reserved) {
    this.reserved = reserved;
  }

  public String getCategoryKey() {
    return this.categoryKey;
  }

  public void setCategoryKey(String categoryKey) {
    this.categoryKey = categoryKey;
  }

  public long getLoadOrder() {
    return this.loadOrder;
  }

  public void setLoadOrder(long loadOrder) {
    this.loadOrder = loadOrder;
  }

  public long getSendType() {
    return this.sendType;
  }

  public void setSendType(long sendType) {
    this.sendType = sendType;
  }
}
