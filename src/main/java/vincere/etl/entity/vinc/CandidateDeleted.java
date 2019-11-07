package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_deleted")
public class CandidateDeleted {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="first_name")
  private String firstName;

  @Column(name="middle_name")
  private String middleName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="current_employer")
  private String currentEmployer;

  @Column(name="candidate_owner_names")
  private String candidateOwnerNames;

  @Column(name="jobs_applications")
  private long jobsApplications;

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

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
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

  public String getCurrentEmployer() {
    return this.currentEmployer;
  }

  public void setCurrentEmployer(String currentEmployer) {
    this.currentEmployer = currentEmployer;
  }

  public String getCandidateOwnerNames() {
    return this.candidateOwnerNames;
  }

  public void setCandidateOwnerNames(String candidateOwnerNames) {
    this.candidateOwnerNames = candidateOwnerNames;
  }

  public long getJobsApplications() {
    return this.jobsApplications;
  }

  public void setJobsApplications(long jobsApplications) {
    this.jobsApplications = jobsApplications;
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
