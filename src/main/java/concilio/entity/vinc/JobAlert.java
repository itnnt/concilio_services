package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_alert")
public class JobAlert {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="location_id")
  private long locationId;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="career_site_id")
  private long careerSiteId;

  @Column(name="first_name")
  private String firstName;

  @Column(name="family_name")
  private String familyName;

  @Column(name="language")
  private String language;

  @Column(name="email")
  private String email;

  @Column(name="job_type")
  private long jobType;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public long getVerticalId() {
    return this.verticalId;
  }

  public void setVerticalId(long verticalId) {
    this.verticalId = verticalId;
  }

  public long getCareerSiteId() {
    return this.careerSiteId;
  }

  public void setCareerSiteId(long careerSiteId) {
    this.careerSiteId = careerSiteId;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFamilyName() {
    return this.familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getJobType() {
    return this.jobType;
  }

  public void setJobType(long jobType) {
    this.jobType = jobType;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
