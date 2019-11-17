package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_additional_form")
public class PositionAdditionalForm {

  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="field_id")
  private long fieldId;

  @Column(name="field_value")
  private String fieldValue;

  @Column(name="form_id")
  private long formId;

  @Column(name="field_value_id")
  private long fieldValueId;

  @Column(name="form_update_timestamp")
  private java.sql.Timestamp formUpdateTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
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

  public long getFormId() {
    return this.formId;
  }

  public void setFormId(long formId) {
    this.formId = formId;
  }

  public long getFieldValueId() {
    return this.fieldValueId;
  }

  public void setFieldValueId(long fieldValueId) {
    this.fieldValueId = fieldValueId;
  }

  public java.sql.Timestamp getFormUpdateTimestamp() {
    return this.formUpdateTimestamp;
  }

  public void setFormUpdateTimestamp(java.sql.Timestamp formUpdateTimestamp) {
    this.formUpdateTimestamp = formUpdateTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
