package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_description_cost_center")
public class PositionDescriptionCostCenter {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="signatory_id")
  private long signatoryId;

  @Column(name="percentage_split")
  private long percentageSplit;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="type")
  private String type;

  @Column(name="index")
  private long index;

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

  public long getPercentageSplit() {
    return this.percentageSplit;
  }

  public void setPercentageSplit(long percentageSplit) {
    this.percentageSplit = percentageSplit;
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

  public long getExternalApproverId() {
    return this.externalApproverId;
  }

  public void setExternalApproverId(long externalApproverId) {
    this.externalApproverId = externalApproverId;
  }
}
