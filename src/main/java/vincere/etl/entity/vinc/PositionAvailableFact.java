package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_available_fact")
public class PositionAvailableFact {


  @Id
  @Column(name="position_id")
  private String positionId;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="contract")
  private long contract;

  @Column(name="line_manager_id")
  private long lineManagerId;

  @Column(name="internal_recruiter_id")
  private long internalRecruiterId;

  @Column(name="announcement_date_id")
  private long announcementDateId;

  @Column(name="latest_announcement_date_id")
  private long latestAnnouncementDateId;

  @Column(name="hired_date_id")
  private long hiredDateId;

  @Column(name="termination_date_id")
  private long terminationDateId;

  @Column(name="location_id")
  private long locationId;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="days_open")
  private long daysOpen;

  @Column(name="signoff_delay")
  private long signoffDelay;

  @Column(name="signoff_date_id")
  private long signoffDateId;


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

  public long getAnnouncementDateId() {
    return this.announcementDateId;
  }

  public void setAnnouncementDateId(long announcementDateId) {
    this.announcementDateId = announcementDateId;
  }

  public long getLatestAnnouncementDateId() {
    return this.latestAnnouncementDateId;
  }

  public void setLatestAnnouncementDateId(long latestAnnouncementDateId) {
    this.latestAnnouncementDateId = latestAnnouncementDateId;
  }

  public long getHiredDateId() {
    return this.hiredDateId;
  }

  public void setHiredDateId(long hiredDateId) {
    this.hiredDateId = hiredDateId;
  }

  public long getTerminationDateId() {
    return this.terminationDateId;
  }

  public void setTerminationDateId(long terminationDateId) {
    this.terminationDateId = terminationDateId;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public long getCostCenterId() {
    return this.costCenterId;
  }

  public void setCostCenterId(long costCenterId) {
    this.costCenterId = costCenterId;
  }

  public long getDaysOpen() {
    return this.daysOpen;
  }

  public void setDaysOpen(long daysOpen) {
    this.daysOpen = daysOpen;
  }

  public long getSignoffDelay() {
    return this.signoffDelay;
  }

  public void setSignoffDelay(long signoffDelay) {
    this.signoffDelay = signoffDelay;
  }

  public long getSignoffDateId() {
    return this.signoffDateId;
  }

  public void setSignoffDateId(long signoffDateId) {
    this.signoffDateId = signoffDateId;
  }
}
