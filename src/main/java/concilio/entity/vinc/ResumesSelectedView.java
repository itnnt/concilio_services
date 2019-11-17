package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resumes_selected_view")
public class ResumesSelectedView {

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

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="candidate_lastname")
  private String candidateLastname;

  @Column(name="candidate_firstname")
  private String candidateFirstname;

  @Column(name="candidate_middlename")
  private String candidateMiddlename;

  @Column(name="position_candidate_status")
  private long positionCandidateStatus;

  @Column(name="candidate_status")
  private long candidateStatus;

  @Column(name="associated_date")
  private java.sql.Timestamp associatedDate;


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

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public String getCandidateLastname() {
    return this.candidateLastname;
  }

  public void setCandidateLastname(String candidateLastname) {
    this.candidateLastname = candidateLastname;
  }

  public String getCandidateFirstname() {
    return this.candidateFirstname;
  }

  public void setCandidateFirstname(String candidateFirstname) {
    this.candidateFirstname = candidateFirstname;
  }

  public String getCandidateMiddlename() {
    return this.candidateMiddlename;
  }

  public void setCandidateMiddlename(String candidateMiddlename) {
    this.candidateMiddlename = candidateMiddlename;
  }

  public long getPositionCandidateStatus() {
    return this.positionCandidateStatus;
  }

  public void setPositionCandidateStatus(long positionCandidateStatus) {
    this.positionCandidateStatus = positionCandidateStatus;
  }

  public long getCandidateStatus() {
    return this.candidateStatus;
  }

  public void setCandidateStatus(long candidateStatus) {
    this.candidateStatus = candidateStatus;
  }

  public java.sql.Timestamp getAssociatedDate() {
    return this.associatedDate;
  }

  public void setAssociatedDate(java.sql.Timestamp associatedDate) {
    this.associatedDate = associatedDate;
  }
}
