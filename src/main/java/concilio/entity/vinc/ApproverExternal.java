package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="approver_external")
public class ApproverExternal {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="fname")
  private String fname;

  @Column(name="lname")
  private String lname;

  @Column(name="email")
  private String email;

  @Column(name="approval_type")
  private long approvalType;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFname() {
    return this.fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getLname() {
    return this.lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getApprovalType() {
    return this.approvalType;
  }

  public void setApprovalType(long approvalType) {
    this.approvalType = approvalType;
  }

  public long getCostCenterId() {
    return this.costCenterId;
  }

  public void setCostCenterId(long costCenterId) {
    this.costCenterId = costCenterId;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
