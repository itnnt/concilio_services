package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_fee_fact")
public class PositionFeeFact {


  @Id
  @Column(name="fee_id")
  private String feeId;

  @Column(name="position_id")
  private String positionId;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="contract")
  private long contract;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="line_manager_id")
  private long lineManagerId;

  @Column(name="internal_recruiter_id")
  private long internalRecruiterId;

  @Column(name="invoiced_date_id")
  private long invoicedDateId;

  @Column(name="fee_charged")
  private String feeCharged;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="location_id")
  private long locationId;

  @Column(name="salary")
  private String salary;


  public String getFeeId() {
    return this.feeId;
  }

  public void setFeeId(String feeId) {
    this.feeId = feeId;
  }

  public String getPositionId() {
    return this.positionId;
  }

  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getVerticalId() {
    return this.verticalId;
  }

  public void setVerticalId(long verticalId) {
    this.verticalId = verticalId;
  }

  public long getContract() {
    return this.contract;
  }

  public void setContract(long contract) {
    this.contract = contract;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getLineManagerId() {
    return this.lineManagerId;
  }

  public void setLineManagerId(long lineManagerId) {
    this.lineManagerId = lineManagerId;
  }

  public long getInternalRecruiterId() {
    return this.internalRecruiterId;
  }

  public void setInternalRecruiterId(long internalRecruiterId) {
    this.internalRecruiterId = internalRecruiterId;
  }

  public long getInvoicedDateId() {
    return this.invoicedDateId;
  }

  public void setInvoicedDateId(long invoicedDateId) {
    this.invoicedDateId = invoicedDateId;
  }

  public String getFeeCharged() {
    return this.feeCharged;
  }

  public void setFeeCharged(String feeCharged) {
    this.feeCharged = feeCharged;
  }

  public long getCostCenterId() {
    return this.costCenterId;
  }

  public void setCostCenterId(long costCenterId) {
    this.costCenterId = costCenterId;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public String getSalary() {
    return this.salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }
}
