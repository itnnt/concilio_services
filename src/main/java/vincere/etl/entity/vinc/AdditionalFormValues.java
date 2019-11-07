package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class AdditionalFormValuesId implements Serializable {
  private long additionalId;
  private long fieldId;
}
@Entity
@Table(name="additional_form_values")
@IdClass(AdditionalFormValuesId.class)
public class AdditionalFormValues {


  @Column(name="additional_type")
  private String additionalType;

  @Id
  @Column(name="additional_id")
  private long additionalId;

  @Column(name="form_id")
  private long formId;

  @Id
  @Column(name="field_id")
  private long fieldId;

  @Column(name="field_value")
  private String fieldValue;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="field_date_value")
  private java.sql.Timestamp fieldDateValue;

  @Column(name="constraint_id")
  private String constraintId;


  public String getAdditionalType() {
    return this.additionalType;
  }

  public void setAdditionalType(String additionalType) {
    this.additionalType = additionalType;
  }

  public long getAdditionalId() {
    return this.additionalId;
  }

  public void setAdditionalId(long additionalId) {
    this.additionalId = additionalId;
  }

  public long getFormId() {
    return this.formId;
  }

  public void setFormId(long formId) {
    this.formId = formId;
  }

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

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getFieldDateValue() {
    return this.fieldDateValue;
  }

  public void setFieldDateValue(java.sql.Timestamp fieldDateValue) {
    this.fieldDateValue = fieldDateValue;
  }

  public String getConstraintId() {
    return this.constraintId;
  }

  public void setConstraintId(String constraintId) {
    this.constraintId = constraintId;
  }
}
