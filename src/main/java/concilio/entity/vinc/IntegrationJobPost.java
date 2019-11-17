package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="integration_job_post")
public class IntegrationJobPost {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="job_board_id")
  private long jobBoardId;

  @Column(name="job_board_type")
  private String jobBoardType;

  @Column(name="position_id")
  private long positionId;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="status")
  private String status;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="deleted_timestamp")
  private java.sql.Timestamp deletedTimestamp;

  @Column(name="external_id")
  private String externalId;

  @Column(name="job_reference_id")
  private String jobReferenceId;

  @Column(name="latest")
  private long latest;

  @Column(name="retrieve_timestamp")
  private java.sql.Timestamp retrieveTimestamp;

  @Column(name="external_user_ref")
  private String externalUserRef;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getJobBoardId() {
    return this.jobBoardId;
  }

  public void setJobBoardId(long jobBoardId) {
    this.jobBoardId = jobBoardId;
  }

  public String getJobBoardType() {
    return this.jobBoardType;
  }

  public void setJobBoardType(String jobBoardType) {
    this.jobBoardType = jobBoardType;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getDeletedTimestamp() {
    return this.deletedTimestamp;
  }

  public void setDeletedTimestamp(java.sql.Timestamp deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public String getJobReferenceId() {
    return this.jobReferenceId;
  }

  public void setJobReferenceId(String jobReferenceId) {
    this.jobReferenceId = jobReferenceId;
  }

  public long getLatest() {
    return this.latest;
  }

  public void setLatest(long latest) {
    this.latest = latest;
  }

  public java.sql.Timestamp getRetrieveTimestamp() {
    return this.retrieveTimestamp;
  }

  public void setRetrieveTimestamp(java.sql.Timestamp retrieveTimestamp) {
    this.retrieveTimestamp = retrieveTimestamp;
  }

  public String getExternalUserRef() {
    return this.externalUserRef;
  }

  public void setExternalUserRef(String externalUserRef) {
    this.externalUserRef = externalUserRef;
  }
}
