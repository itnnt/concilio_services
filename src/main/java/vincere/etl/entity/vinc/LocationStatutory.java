package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="location_statutory")
public class LocationStatutory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="location_id")
  private long locationId;

  @Column(name="name")
  private String name;

  @Column(name="percent")
  private double percent;

  @Column(name="disabled")
  private long disabled;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="employee_percent")
  private double employeePercent;

  @Column(name="employer_amount")
  private double employerAmount;

  @Column(name="employee_amount")
  private double employeeAmount;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPercent() {
    return this.percent;
  }

  public void setPercent(double percent) {
    this.percent = percent;
  }

  public long getDisabled() {
    return this.disabled;
  }

  public void setDisabled(long disabled) {
    this.disabled = disabled;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public double getEmployeePercent() {
    return this.employeePercent;
  }

  public void setEmployeePercent(double employeePercent) {
    this.employeePercent = employeePercent;
  }

  public double getEmployerAmount() {
    return this.employerAmount;
  }

  public void setEmployerAmount(double employerAmount) {
    this.employerAmount = employerAmount;
  }

  public double getEmployeeAmount() {
    return this.employeeAmount;
  }

  public void setEmployeeAmount(double employeeAmount) {
    this.employeeAmount = employeeAmount;
  }
}
