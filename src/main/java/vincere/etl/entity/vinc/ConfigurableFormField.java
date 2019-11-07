package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="configurable_form_field")
public class ConfigurableFormField {


  @Column(name="form_id")
  private long formId;

  @Id
  @Column(name="id")
  private long id;

  @Column(name="position")
  private long position;

  @Column(name="field_type")
  private long fieldType;

  @Column(name="label_language_code")
  private String labelLanguageCode;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="block")
  private long block;

  @Column(name="name")
  private String name;

  @Column(name="field_key")
  private String fieldKey;

  @Column(name="parent_id")
  private long parentId;

  @Column(name="constraint_id")
  private String constraintId;

  @Column(name="required")
  private long required;


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

  public long getPosition() {
    return this.position;
  }

  public void setPosition(long position) {
    this.position = position;
  }

  public long getFieldType() {
    return this.fieldType;
  }

  public void setFieldType(long fieldType) {
    this.fieldType = fieldType;
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

  public long getBlock() {
    return this.block;
  }

  public void setBlock(long block) {
    this.block = block;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFieldKey() {
    return this.fieldKey;
  }

  public void setFieldKey(String fieldKey) {
    this.fieldKey = fieldKey;
  }

  public long getParentId() {
    return this.parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }

  public String getConstraintId() {
    return this.constraintId;
  }

  public void setConstraintId(String constraintId) {
    this.constraintId = constraintId;
  }

  public long getRequired() {
    return this.required;
  }

  public void setRequired(long required) {
    this.required = required;
  }
}
