package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_on_hold_fact")
public class PositionOnHoldFact {

  @Id
  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="location_id")
  private long locationId;

  @Column(name="contract")
  private long contract;

  @Column(name="line_manager_id")
  private long lineManagerId;

  @Column(name="internal_recruiter_id")
  private long internalRecruiterId;

  @Column(name="date_id")
  private long dateId;


  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getVerticalId() {
    return this.verticalId;
  }

  public void setVerticalId(long verticalId) {
    this.verticalId = verticalId;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public long getContract() {
    return this.contract;
  }

  public void setContract(long contract) {
    this.contract = contract;
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

  public long getDateId() {
    return this.dateId;
  }

  public void setDateId(long dateId) {
    this.dateId = dateId;
  }
}
