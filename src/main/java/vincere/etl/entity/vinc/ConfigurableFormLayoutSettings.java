package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="configurable_form_layout_settings")
public class ConfigurableFormLayoutSettings {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="tab_id")
  private long tabId;

  @Column(name="static_field_id")
  private String staticFieldId;

  @Column(name="configurable_form_field_id")
  private long configurableFormFieldId;

  @Column(name="sub_heading_id")
  private long subHeadingId;

  @Column(name="x")
  private long X;

  @Column(name="y")
  private long Y;

  @Column(name="w")
  private long W;

  @Column(name="h")
  private long H;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="parent_id")
  private long parentId;

  @Column(name="category")
  private String category;

  @Column(name="hidden")
  private long hidden;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getTabId() {
    return this.tabId;
  }

  public void setTabId(long tabId) {
    this.tabId = tabId;
  }

  public String getStaticFieldId() {
    return this.staticFieldId;
  }

  public void setStaticFieldId(String staticFieldId) {
    this.staticFieldId = staticFieldId;
  }

  public long getConfigurableFormFieldId() {
    return this.configurableFormFieldId;
  }

  public void setConfigurableFormFieldId(long configurableFormFieldId) {
    this.configurableFormFieldId = configurableFormFieldId;
  }

  public long getSubHeadingId() {
    return this.subHeadingId;
  }

  public void setSubHeadingId(long subHeadingId) {
    this.subHeadingId = subHeadingId;
  }

  public long getX() {
    return this.X;
  }

  public void setX(long X) {
    this.X = X;
  }

  public long getY() {
    return this.Y;
  }

  public void setY(long Y) {
    this.Y = Y;
  }

  public long getW() {
    return this.W;
  }

  public void setW(long W) {
    this.W = W;
  }

  public long getH() {
    return this.H;
  }

  public void setH(long H) {
    this.H = H;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getParentId() {
    return this.parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public long getHidden() {
    return this.hidden;
  }

  public void setHidden(long hidden) {
    this.hidden = hidden;
  }
}
