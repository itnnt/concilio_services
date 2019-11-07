package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="document_builder_wildcard")
public class DocumentBuilderWildcard {


  @Id
  @Column(name="id")
  private long id;

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

  @Column(name="category_key")
  private String categoryKey;

  @Column(name="subcategory_key")
  private String subcategoryKey;

  @Column(name="wildcard_order")
  private long wildcardOrder;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
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

  public String getCategoryKey() {
    return this.categoryKey;
  }

  public void setCategoryKey(String categoryKey) {
    this.categoryKey = categoryKey;
  }

  public String getSubcategoryKey() {
    return this.subcategoryKey;
  }

  public void setSubcategoryKey(String subcategoryKey) {
    this.subcategoryKey = subcategoryKey;
  }

  public long getWildcardOrder() {
    return this.wildcardOrder;
  }

  public void setWildcardOrder(long wildcardOrder) {
    this.wildcardOrder = wildcardOrder;
  }
}
