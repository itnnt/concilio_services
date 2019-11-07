package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_head_count_cost_center")
public class PositionHeadCountCostCenter {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="cost_center_split_id")
  private long costCenterSplitId;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="signatory_id")
  private long signatoryId;

  @Column(name="percentage_split")
  private long percentageSplit;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


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

  public long getCostCenterSplitId() {
    return this.costCenterSplitId;
  }

  public void setCostCenterSplitId(long costCenterSplitId) {
    this.costCenterSplitId = costCenterSplitId;
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
}
