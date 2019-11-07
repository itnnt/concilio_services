package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="job_board")
public class JobBoard {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="type")
  private String type;

  @Column(name="username")
  private String username;

  @Column(name="password")
  private String password;

  @Column(name="start_date")
  private java.sql.Timestamp startDate;

  @Column(name="end_date")
  private java.sql.Timestamp endDate;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="create_date")
  private java.sql.Timestamp createDate;

  @Column(name="company_name")
  private String companyName;

  @Column(name="description")
  private String description;

  @Column(name="company_address")
  private String companyAddress;

  @Column(name="company_department")
  private String companyDepartment;

  @Column(name="company_division")
  private String companyDivision;

  @Column(name="country")
  private String country;

  @Column(name="state")
  private String state;

  @Column(name="city")
  private String city;

  @Column(name="zip_code")
  private String zipCode;

  @Column(name="phone")
  private String phone;

  @Column(name="fax")
  private String fax;

  @Column(name="account_organization")
  private String accountOrganization;

  @Column(name="account_name")
  private String accountName;

  @Column(name="account_email")
  private String accountEmail;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="allocated_credit")
  private long allocatedCredit;

  @Column(name="used_credit")
  private long usedCredit;

  @Column(name="expiry_date")
  private java.sql.Timestamp expiryDate;

  @Column(name="status")
  private String status;


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

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public java.sql.Timestamp getStartDate() {
    return this.startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }

  public java.sql.Timestamp getEndDate() {
    return this.endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public java.sql.Timestamp getCreateDate() {
    return this.createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCompanyAddress() {
    return this.companyAddress;
  }

  public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
  }

  public String getCompanyDepartment() {
    return this.companyDepartment;
  }

  public void setCompanyDepartment(String companyDepartment) {
    this.companyDepartment = companyDepartment;
  }

  public String getCompanyDivision() {
    return this.companyDivision;
  }

  public void setCompanyDivision(String companyDivision) {
    this.companyDivision = companyDivision;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZipCode() {
    return this.zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getFax() {
    return this.fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getAccountOrganization() {
    return this.accountOrganization;
  }

  public void setAccountOrganization(String accountOrganization) {
    this.accountOrganization = accountOrganization;
  }

  public String getAccountName() {
    return this.accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getAccountEmail() {
    return this.accountEmail;
  }

  public void setAccountEmail(String accountEmail) {
    this.accountEmail = accountEmail;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getAllocatedCredit() {
    return this.allocatedCredit;
  }

  public void setAllocatedCredit(long allocatedCredit) {
    this.allocatedCredit = allocatedCredit;
  }

  public long getUsedCredit() {
    return this.usedCredit;
  }

  public void setUsedCredit(long usedCredit) {
    this.usedCredit = usedCredit;
  }

  public java.sql.Timestamp getExpiryDate() {
    return this.expiryDate;
  }

  public void setExpiryDate(java.sql.Timestamp expiryDate) {
    this.expiryDate = expiryDate;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
