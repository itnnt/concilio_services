package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vertical")
public class Vertical {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="hidden_timestamp")
  private java.sql.Timestamp hiddenTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="business_units")
  private String businessUnits;

  @Column(name="department")
  private String department;

  @Column(name="expertise")
  private String expertise;


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

  public java.sql.Timestamp getHiddenTimestamp() {
    return this.hiddenTimestamp;
  }

  public void setHiddenTimestamp(java.sql.Timestamp hiddenTimestamp) {
    this.hiddenTimestamp = hiddenTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getBusinessUnits() {
    return this.businessUnits;
  }

  public void setBusinessUnits(String businessUnits) {
    this.businessUnits = businessUnits;
  }

  public String getDepartment() {
    return this.department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getExpertise() {
    return this.expertise;
  }

  public void setExpertise(String expertise) {
    this.expertise = expertise;
  }
}
