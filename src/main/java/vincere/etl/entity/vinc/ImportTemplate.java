package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="import_template")
public class ImportTemplate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="template_id")
  private long templateId;

  @Column(name="category")
  private String category;

  @Column(name="column_gui_name")
  private String columnGuiName;

  @Column(name="column_system_name")
  private String columnSystemName;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


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

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getColumnGuiName() {
    return this.columnGuiName;
  }

  public void setColumnGuiName(String columnGuiName) {
    this.columnGuiName = columnGuiName;
  }

  public String getColumnSystemName() {
    return this.columnSystemName;
  }

  public void setColumnSystemName(String columnSystemName) {
    this.columnSystemName = columnSystemName;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
