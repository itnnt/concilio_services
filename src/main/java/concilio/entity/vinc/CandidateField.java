package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_field")
public class CandidateField {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="code")
  private String code;

  @Column(name="field_type")
  private long fieldType;

  @Column(name="expression")
  private String expression;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="field_group")
  private long fieldGroup;

  @Column(name="has_children")
  private long hasChildren;

  @Column(name="category")
  private long category;

  @Column(name="summary_type")
  private long summaryType;

  @Column(name="max_length")
  private long maxLength;

  @Column(name="desc_code")
  private String descCode;

  @Column(name="display_order")
  private long displayOrder;


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

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public long getFieldType() {
    return this.fieldType;
  }

  public void setFieldType(long fieldType) {
    this.fieldType = fieldType;
  }

  public String getExpression() {
    return this.expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getFieldGroup() {
    return this.fieldGroup;
  }

  public void setFieldGroup(long fieldGroup) {
    this.fieldGroup = fieldGroup;
  }

  public long getHasChildren() {
    return this.hasChildren;
  }

  public void setHasChildren(long hasChildren) {
    this.hasChildren = hasChildren;
  }

  public long getCategory() {
    return this.category;
  }

  public void setCategory(long category) {
    this.category = category;
  }

  public long getSummaryType() {
    return this.summaryType;
  }

  public void setSummaryType(long summaryType) {
    this.summaryType = summaryType;
  }

  public long getMaxLength() {
    return this.maxLength;
  }

  public void setMaxLength(long maxLength) {
    this.maxLength = maxLength;
  }

  public String getDescCode() {
    return this.descCode;
  }

  public void setDescCode(String descCode) {
    this.descCode = descCode;
  }

  public long getDisplayOrder() {
    return this.displayOrder;
  }

  public void setDisplayOrder(long displayOrder) {
    this.displayOrder = displayOrder;
  }
}
