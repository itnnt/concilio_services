package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_description_deleted")
public class PositionDescriptionDeleted {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="position_description_name")
  private String positionDescriptionName;

  @Column(name="company_name")
  private String companyName;

  @Column(name="no_of_application")
  private long noOfApplication;

  @Column(name="job_owner")
  private String jobOwner;

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

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public String getPositionDescriptionName() {
    return this.positionDescriptionName;
  }

  public void setPositionDescriptionName(String positionDescriptionName) {
    this.positionDescriptionName = positionDescriptionName;
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public long getNoOfApplication() {
    return this.noOfApplication;
  }

  public void setNoOfApplication(long noOfApplication) {
    this.noOfApplication = noOfApplication;
  }

  public String getJobOwner() {
    return this.jobOwner;
  }

  public void setJobOwner(String jobOwner) {
    this.jobOwner = jobOwner;
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
