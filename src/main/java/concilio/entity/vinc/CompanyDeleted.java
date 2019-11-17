package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_deleted")
public class CompanyDeleted {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="company_id")
  private long companyId;

  @Column(name="company_name")
  private String companyName;

  @Column(name="no_of_contacts")
  private long noOfContacts;

  @Column(name="no_of_jobs")
  private long noOfJobs;

  @Column(name="company_owners")
  private String companyOwners;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="deleted_by")
  private String deletedBy;

  @Column(name="deleted_ip_address")
  private String deletedIpAddress;

  @Column(name="delete_by_user_id")
  private long deleteByUserId;


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

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public long getNoOfContacts() {
    return this.noOfContacts;
  }

  public void setNoOfContacts(long noOfContacts) {
    this.noOfContacts = noOfContacts;
  }

  public long getNoOfJobs() {
    return this.noOfJobs;
  }

  public void setNoOfJobs(long noOfJobs) {
    this.noOfJobs = noOfJobs;
  }

  public String getCompanyOwners() {
    return this.companyOwners;
  }

  public void setCompanyOwners(String companyOwners) {
    this.companyOwners = companyOwners;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getDeletedBy() {
    return this.deletedBy;
  }

  public void setDeletedBy(String deletedBy) {
    this.deletedBy = deletedBy;
  }

  public String getDeletedIpAddress() {
    return this.deletedIpAddress;
  }

  public void setDeletedIpAddress(String deletedIpAddress) {
    this.deletedIpAddress = deletedIpAddress;
  }

  public long getDeleteByUserId() {
    return this.deleteByUserId;
  }

  public void setDeleteByUserId(long deleteByUserId) {
    this.deleteByUserId = deleteByUserId;
  }
}
