package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_description_question")
public class PositionDescriptionQuestion {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_template_id")
  private long positionDescriptionTemplateId;

  @Column(name="display_order")
  private long displayOrder;

  @Column(name="label")
  private String label;

  @Column(name="type")
  private String type;

  @Column(name="support_data_xml")
  private String supportDataXml;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionDescriptionTemplateId() {
    return this.positionDescriptionTemplateId;
  }

  public void setPositionDescriptionTemplateId(long positionDescriptionTemplateId) {
    this.positionDescriptionTemplateId = positionDescriptionTemplateId;
  }

  public long getDisplayOrder() {
    return this.displayOrder;
  }

  public void setDisplayOrder(long displayOrder) {
    this.displayOrder = displayOrder;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSupportDataXml() {
    return this.supportDataXml;
  }

  public void setSupportDataXml(String supportDataXml) {
    this.supportDataXml = supportDataXml;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
