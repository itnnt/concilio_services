package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_deleted")
public class ContactDeleted {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="first_name")
  private String firstName;

  @Column(name="middle_name")
  private String middleName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="company_name")
  private String companyName;

  @Column(name="contact_owners")
  private String contactOwners;

  @Column(name="no_of_jobs")
  private long noOfJobs;

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

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return this.middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getContactOwners() {
    return this.contactOwners;
  }

  public void setContactOwners(String contactOwners) {
    this.contactOwners = contactOwners;
  }

  public long getNoOfJobs() {
    return this.noOfJobs;
  }

  public void setNoOfJobs(long noOfJobs) {
    this.noOfJobs = noOfJobs;
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
