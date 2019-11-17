package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seminar_candidate_source")
public class SeminarCandidateSource {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="name")
  private String name;

  @Column(name="internal_staff_in_contact")
  private long internalStaffInContact;

  @Column(name="seminar_currency")
  private String seminarCurrency;

  @Column(name="total_cost")
  private double totalCost;

  @Column(name="title")
  private String title;

  @Column(name="quarter")
  private String quarter;

  @Column(name="seminar_year")
  private String seminarYear;

  @Column(name="building")
  private String building;

  @Column(name="floor")
  private String floor;

  @Column(name="room")
  private String room;

  @Column(name="seminar_address")
  private String seminarAddress;

  @Column(name="city")
  private String city;

  @Column(name="state")
  private String state;

  @Column(name="country")
  private String country;

  @Column(name="zip_code")
  private String zipCode;

  @Column(name="phone_no")
  private String phoneNo;

  @Column(name="email")
  private String email;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getInternalStaffInContact() {
    return this.internalStaffInContact;
  }

  public void setInternalStaffInContact(long internalStaffInContact) {
    this.internalStaffInContact = internalStaffInContact;
  }

  public String getSeminarCurrency() {
    return this.seminarCurrency;
  }

  public void setSeminarCurrency(String seminarCurrency) {
    this.seminarCurrency = seminarCurrency;
  }

  public double getTotalCost() {
    return this.totalCost;
  }

  public void setTotalCost(double totalCost) {
    this.totalCost = totalCost;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getQuarter() {
    return this.quarter;
  }

  public void setQuarter(String quarter) {
    this.quarter = quarter;
  }

  public String getSeminarYear() {
    return this.seminarYear;
  }

  public void setSeminarYear(String seminarYear) {
    this.seminarYear = seminarYear;
  }

  public String getBuilding() {
    return this.building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public String getFloor() {
    return this.floor;
  }

  public void setFloor(String floor) {
    this.floor = floor;
  }

  public String getRoom() {
    return this.room;
  }

  public void setRoom(String room) {
    this.room = room;
  }

  public String getSeminarAddress() {
    return this.seminarAddress;
  }

  public void setSeminarAddress(String seminarAddress) {
    this.seminarAddress = seminarAddress;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getZipCode() {
    return this.zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getPhoneNo() {
    return this.phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
