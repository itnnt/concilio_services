package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="configurable_form_tab")
public class ConfigurableFormTab {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="entity")
  private String entity;

  @Column(name="index")
  private long index;

  @Column(name="layout_type")
  private String layoutType;

  @Column(name="fix_layout")
  private long fixLayout;

  @Column(name="country_code")
  private String countryCode;


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

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
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

  public String getLayoutType() {
    return this.layoutType;
  }

  public void setLayoutType(String layoutType) {
    this.layoutType = layoutType;
  }

  public long getFixLayout() {
    return this.fixLayout;
  }

  public void setFixLayout(long fixLayout) {
    this.fixLayout = fixLayout;
  }

  public String getCountryCode() {
    return this.countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }
}
