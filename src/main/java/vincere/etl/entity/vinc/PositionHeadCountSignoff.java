package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_head_count_signoff")
public class PositionHeadCountSignoff {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="position_head_count_allocation_id")
  private long positionHeadCountAllocationId;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="signatory_id")
  private long signatoryId;

  @Column(name="signoff_date")
  private java.sql.Timestamp signoffDate;

  @Column(name="rejection_date")
  private java.sql.Timestamp rejectionDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="type")
  private String type;

  @Column(name="index")
  private long index;

  @Column(name="reason_for_rejection")
  private String reasonForRejection;

  @Column(name="external_approver_id")
  private long externalApproverId;


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

  public long getPositionHeadCountAllocationId() {
    return this.positionHeadCountAllocationId;
  }

  public void setPositionHeadCountAllocationId(long positionHeadCountAllocationId) {
    this.positionHeadCountAllocationId = positionHeadCountAllocationId;
  }

  public long getCostCenterId() {
    return this.costCenterId;
  }

  public void setCostCenterId(long costCenterId) {
    this.costCenterId = costCenterId;
  }

  public long getSignatoryId() {
    return this.signatoryId;
  }

  public void setSignatoryId(long signatoryId) {
    this.signatoryId = signatoryId;
  }

  public java.sql.Timestamp getSignoffDate() {
    return this.signoffDate;
  }

  public void setSignoffDate(java.sql.Timestamp signoffDate) {
    this.signoffDate = signoffDate;
  }

  public java.sql.Timestamp getRejectionDate() {
    return this.rejectionDate;
  }

  public void setRejectionDate(java.sql.Timestamp rejectionDate) {
    this.rejectionDate = rejectionDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getIndex() {
    return this.index;
  }

  public void setIndex(long index) {
    this.index = index;
  }

  public String getReasonForRejection() {
    return this.reasonForRejection;
  }

  public void setReasonForRejection(String reasonForRejection) {
    this.reasonForRejection = reasonForRejection;
  }

  public long getExternalApproverId() {
    return this.externalApproverId;
  }

  public void setExternalApproverId(long externalApproverId) {
    this.externalApproverId = externalApproverId;
  }
}
