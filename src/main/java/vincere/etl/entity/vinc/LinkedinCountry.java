package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="linkedin_country")
public class LinkedinCountry {


  @Id
  @Column(name="code")
  private String code;

  @Column(name="system_name")
  private String systemName;

  @Column(name="load_order")
  private long loadOrder;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="location")
  private String location;


  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getSystemName() {
    return this.systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public long getLoadOrder() {
    return this.loadOrder;
  }

  public void setLoadOrder(long loadOrder) {
    this.loadOrder = loadOrder;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
