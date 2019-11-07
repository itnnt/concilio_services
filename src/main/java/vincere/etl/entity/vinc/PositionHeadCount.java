package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_head_count")
public class PositionHeadCount {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="hired_candidate_id")
  private long hiredCandidateId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="cost_center_split_id")
  private long costCenterSplitId;

  @Column(name="hired_date")
  private java.sql.Timestamp hiredDate;

  @Column(name="compensation_xml")
  private String compensationXml;

  @Column(name="signoff_date")
  private java.sql.Timestamp signoffDate;

  @Column(name="reason_for_head_count")
  private String reasonForHeadCount;


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

  public long getHiredCandidateId() {
    return this.hiredCandidateId;
  }

  public void setHiredCandidateId(long hiredCandidateId) {
    this.hiredCandidateId = hiredCandidateId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getCostCenterSplitId() {
    return this.costCenterSplitId;
  }

  public void setCostCenterSplitId(long costCenterSplitId) {
    this.costCenterSplitId = costCenterSplitId;
  }

  public java.sql.Timestamp getHiredDate() {
    return this.hiredDate;
  }

  public void setHiredDate(java.sql.Timestamp hiredDate) {
    this.hiredDate = hiredDate;
  }

  public String getCompensationXml() {
    return this.compensationXml;
  }

  public void setCompensationXml(String compensationXml) {
    this.compensationXml = compensationXml;
  }

  public java.sql.Timestamp getSignoffDate() {
    return this.signoffDate;
  }

  public void setSignoffDate(java.sql.Timestamp signoffDate) {
    this.signoffDate = signoffDate;
  }

  public String getReasonForHeadCount() {
    return this.reasonForHeadCount;
  }

  public void setReasonForHeadCount(String reasonForHeadCount) {
    this.reasonForHeadCount = reasonForHeadCount;
  }
}
