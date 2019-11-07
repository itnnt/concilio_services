package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="configurable_form_static_field")
public class ConfigurableFormStaticField {


  @Id
  @Column(name="field_id")
  private String fieldId;

  @Column(name="field_type")
  private String fieldType;

  @Column(name="required")
  private long required;

  @Column(name="label_language_code")
  private String labelLanguageCode;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="suggestion_type")
  private String suggestionType;

  @Column(name="max_length")
  private long maxLength;

  @Column(name="category")
  private String category;

  @Column(name="entity")
  private String entity;

  @Column(name="index")
  private long index;

  @Column(name="expression")
  private String expression;

  @Column(name="editable")
  private long editable;

  @Column(name="parent_id")
  private String parentId;

  @Column(name="db_column")
  private String dbColumn;

  @Column(name="has_children")
  private long hasChildren;

  @Column(name="force_required")
  private long forceRequired;

  @Column(name="field_key")
  private String fieldKey;


  public String getFieldId() {
    return this.fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public String getFieldType() {
    return this.fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public long getRequired() {
    return this.required;
  }

  public void setRequired(long required) {
    this.required = required;
  }

  public String getLabelLanguageCode() {
    return this.labelLanguageCode;
  }

  public void setLabelLanguageCode(String labelLanguageCode) {
    this.labelLanguageCode = labelLanguageCode;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getSuggestionType() {
    return this.suggestionType;
  }

  public void setSuggestionType(String suggestionType) {
    this.suggestionType = suggestionType;
  }

  public long getMaxLength() {
    return this.maxLength;
  }

  public void setMaxLength(long maxLength) {
    this.maxLength = maxLength;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getEntity() {
    return this.entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public long getIndex() {
    return this.index;
  }

  public void setIndex(long index) {
    this.index = index;
  }

  public String getExpression() {
    return this.expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public long getEditable() {
    return this.editable;
  }

  public void setEditable(long editable) {
    this.editable = editable;
  }

  public String getParentId() {
    return this.parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public String getDbColumn() {
    return this.dbColumn;
  }

  public void setDbColumn(String dbColumn) {
    this.dbColumn = dbColumn;
  }

  public long getHasChildren() {
    return this.hasChildren;
  }

  public void setHasChildren(long hasChildren) {
    this.hasChildren = hasChildren;
  }

  public long getForceRequired() {
    return this.forceRequired;
  }

  public void setForceRequired(long forceRequired) {
    this.forceRequired = forceRequired;
  }

  public String getFieldKey() {
    return this.fieldKey;
  }

  public void setFieldKey(String fieldKey) {
    this.fieldKey = fieldKey;
  }
}
