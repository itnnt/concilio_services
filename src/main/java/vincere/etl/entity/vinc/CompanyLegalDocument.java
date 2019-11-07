package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="company_legal_document")
public class CompanyLegalDocument {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="company_id")
  private long companyId;

  @Column(name="type")
  private String type;

  @Column(name="title")
  private String title;

  @Column(name="date_start")
  private java.sql.Timestamp dateStart;

  @Column(name="date_end")
  private java.sql.Timestamp dateEnd;

  @Column(name="account_contact")
  private String accountContact;

  @Column(name="account_contact_email")
  private String accountContactEmail;

  @Column(name="renewal_notice")
  private java.sql.Timestamp renewalNotice;

  @Column(name="employee_responsible")
  private String employeeResponsible;

  @Column(name="employee_email")
  private String employeeEmail;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public java.sql.Timestamp getDateStart() {
    return this.dateStart;
  }

  public void setDateStart(java.sql.Timestamp dateStart) {
    this.dateStart = dateStart;
  }

  public java.sql.Timestamp getDateEnd() {
    return this.dateEnd;
  }

  public void setDateEnd(java.sql.Timestamp dateEnd) {
    this.dateEnd = dateEnd;
  }

  public String getAccountContact() {
    return this.accountContact;
  }

  public void setAccountContact(String accountContact) {
    this.accountContact = accountContact;
  }

  public String getAccountContactEmail() {
    return this.accountContactEmail;
  }

  public void setAccountContactEmail(String accountContactEmail) {
    this.accountContactEmail = accountContactEmail;
  }

  public java.sql.Timestamp getRenewalNotice() {
    return this.renewalNotice;
  }

  public void setRenewalNotice(java.sql.Timestamp renewalNotice) {
    this.renewalNotice = renewalNotice;
  }

  public String getEmployeeResponsible() {
    return this.employeeResponsible;
  }

  public void setEmployeeResponsible(String employeeResponsible) {
    this.employeeResponsible = employeeResponsible;
  }

  public String getEmployeeEmail() {
    return this.employeeEmail;
  }

  public void setEmployeeEmail(String employeeEmail) {
    this.employeeEmail = employeeEmail;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
