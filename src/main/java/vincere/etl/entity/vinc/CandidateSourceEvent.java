package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_source_event")
public class CandidateSourceEvent {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="event_name")
  private String eventName;

  @Column(name="search_location")
  private String searchLocation;

  @Column(name="country")
  private String country;

  @Column(name="postal_code")
  private String postalCode;

  @Column(name="state")
  private String state;

  @Column(name="city")
  private String city;

  @Column(name="address")
  private String address;

  @Column(name="building")
  private String building;

  @Column(name="floor_room")
  private String floorRoom;

  @Column(name="from_date")
  private java.sql.Timestamp fromDate;

  @Column(name="to_date")
  private java.sql.Timestamp toDate;

  @Column(name="event_type")
  private String eventType;

  @Column(name="event_url")
  private String eventUrl;

  @Column(name="linkedin_url")
  private String linkedinUrl;

  @Column(name="facebook_url")
  private String facebookUrl;

  @Column(name="event_blog")
  private String eventBlog;

  @Column(name="contact_email")
  private String contactEmail;

  @Column(name="contact_phone")
  private String contactPhone;

  @Column(name="event_details")
  private String eventDetails;

  @Column(name="qr_code")
  private String qrCode;

  @Column(name="total_cost")
  private double totalCost;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="latitude")
  private double latitude;

  @Column(name="longitude")
  private double longitude;


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

  public String getEventName() {
    return this.eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public String getSearchLocation() {
    return this.searchLocation;
  }

  public void setSearchLocation(String searchLocation) {
    this.searchLocation = searchLocation;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getPostalCode() {
    return this.postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getBuilding() {
    return this.building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public String getFloorRoom() {
    return this.floorRoom;
  }

  public void setFloorRoom(String floorRoom) {
    this.floorRoom = floorRoom;
  }

  public java.sql.Timestamp getFromDate() {
    return this.fromDate;
  }

  public void setFromDate(java.sql.Timestamp fromDate) {
    this.fromDate = fromDate;
  }

  public java.sql.Timestamp getToDate() {
    return this.toDate;
  }

  public void setToDate(java.sql.Timestamp toDate) {
    this.toDate = toDate;
  }

  public String getEventType() {
    return this.eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public String getEventUrl() {
    return this.eventUrl;
  }

  public void setEventUrl(String eventUrl) {
    this.eventUrl = eventUrl;
  }

  public String getLinkedinUrl() {
    return this.linkedinUrl;
  }

  public void setLinkedinUrl(String linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
  }

  public String getFacebookUrl() {
    return this.facebookUrl;
  }

  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  public String getEventBlog() {
    return this.eventBlog;
  }

  public void setEventBlog(String eventBlog) {
    this.eventBlog = eventBlog;
  }

  public String getContactEmail() {
    return this.contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public String getContactPhone() {
    return this.contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public String getEventDetails() {
    return this.eventDetails;
  }

  public void setEventDetails(String eventDetails) {
    this.eventDetails = eventDetails;
  }

  public String getQrCode() {
    return this.qrCode;
  }

  public void setQrCode(String qrCode) {
    this.qrCode = qrCode;
  }

  public double getTotalCost() {
    return this.totalCost;
  }

  public void setTotalCost(double totalCost) {
    this.totalCost = totalCost;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public double getLatitude() {
    return this.latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return this.longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }
}
