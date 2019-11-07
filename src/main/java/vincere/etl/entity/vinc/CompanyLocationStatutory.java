package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="company_location_statutory")
public class CompanyLocationStatutory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="company_location_id")
  private long companyLocationId;

  @Column(name="description")
  private String description;

  @Column(name="employer_percent")
  private double employerPercent;

  @Column(name="employee_percent")
  private double employeePercent;

  @Column(name="employer_amount")
  private double employerAmount;

  @Column(name="employee_amount")
  private double employeeAmount;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCompanyLocationId() {
    return this.companyLocationId;
  }

  public void setCompanyLocationId(long companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getEmployerPercent() {
    return this.employerPercent;
  }

  public void setEmployerPercent(double employerPercent) {
    this.employerPercent = employerPercent;
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

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
