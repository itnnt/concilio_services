package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobs_view")
public class JobsView {

  @Id
  @Column(name="position_id")
  private long positionId;

  @Column(name="position_name")
  private String positionName;

  @Column(name="company_id")
  private long companyId;

  @Column(name="company_name")
  private String companyName;

  @Column(name="location_id")
  private long locationId;

  @Column(name="location_name")
  private String locationName;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="contact_lastname")
  private String contactLastname;

  @Column(name="contact_firstname")
  private String contactFirstname;

  @Column(name="contact_middlename")
  private String contactMiddlename;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="vertical_name")
  private String verticalName;

  @Column(name="company_owner_id")
  private long companyOwnerId;

  @Column(name="company_owner_name")
  private String companyOwnerName;

  @Column(name="head_count_open_date")
  private java.sql.Timestamp headCountOpenDate;

  @Column(name="head_count_close_date")
  private java.sql.Timestamp headCountCloseDate;


  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public String getPositionName() {
    return this.positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public String getLocationName() {
    return this.locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public String getContactLastname() {
    return this.contactLastname;
  }

  public void setContactLastname(String contactLastname) {
    this.contactLastname = contactLastname;
  }

  public String getContactFirstname() {
    return this.contactFirstname;
  }

  public void setContactFirstname(String contactFirstname) {
    this.contactFirstname = contactFirstname;
  }

  public String getContactMiddlename() {
    return this.contactMiddlename;
  }

  public void setContactMiddlename(String contactMiddlename) {
    this.contactMiddlename = contactMiddlename;
  }

  public long getVerticalId() {
    return this.verticalId;
  }

  public void setVerticalId(long verticalId) {
    this.verticalId = verticalId;
  }

  public String getVerticalName() {
    return this.verticalName;
  }

  public void setVerticalName(String verticalName) {
    this.verticalName = verticalName;
  }

  public long getCompanyOwnerId() {
    return this.companyOwnerId;
  }

  public void setCompanyOwnerId(long companyOwnerId) {
    this.companyOwnerId = companyOwnerId;
  }

  public String getCompanyOwnerName() {
    return this.companyOwnerName;
  }

  public void setCompanyOwnerName(String companyOwnerName) {
    this.companyOwnerName = companyOwnerName;
  }

  public java.sql.Timestamp getHeadCountOpenDate() {
    return this.headCountOpenDate;
  }

  public void setHeadCountOpenDate(java.sql.Timestamp headCountOpenDate) {
    this.headCountOpenDate = headCountOpenDate;
  }

  public java.sql.Timestamp getHeadCountCloseDate() {
    return this.headCountCloseDate;
  }

  public void setHeadCountCloseDate(java.sql.Timestamp headCountCloseDate) {
    this.headCountCloseDate = headCountCloseDate;
  }
}
