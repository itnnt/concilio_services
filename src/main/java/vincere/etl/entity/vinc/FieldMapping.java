package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="field_mapping")
public class FieldMapping {

  @Id
  @Column(name="id")
  private long id;

  @Column(name="template_id")
  private long templateId;

  @Column(name="field_name")
  private String fieldName;

  @Column(name="mapped_field")
  private String mappedField;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getTemplateId() {
    return this.templateId;
  }

  public void setTemplateId(long templateId) {
    this.templateId = templateId;
  }

  public String getFieldName() {
    return this.fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public String getMappedField() {
    return this.mappedField;
  }

  public void setMappedField(String mappedField) {
    this.mappedField = mappedField;
  }
}
