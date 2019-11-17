package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deal")
public class Deal {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="stage_id")
  private long stageId;

  @Column(name="name")
  private String name;

  @Column(name="status")
  private String status;

  @Column(name="company_id")
  private long companyId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="company_location_id")
  private long companyLocationId;

  @Column(name="value")
  private double value;

  @Column(name="currency")
  private String currency;

  @Column(name="fee_forecast_percent")
  private double feeForecastPercent;

  @Column(name="creator_id")
  private long creatorId;

  @Column(name="expected_close_date")
  private java.sql.Timestamp expectedCloseDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="last_modified_date")
  private java.sql.Timestamp lastModifiedDate;

  @Column(name="last_modified_by_id")
  private long lastModifiedById;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getStageId() {
    return this.stageId;
  }

  public void setStageId(long stageId) {
    this.stageId = stageId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getCompanyLocationId() {
    return this.companyLocationId;
  }

  public void setCompanyLocationId(long companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  public double getValue() {
    return this.value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public double getFeeForecastPercent() {
    return this.feeForecastPercent;
  }

  public void setFeeForecastPercent(double feeForecastPercent) {
    this.feeForecastPercent = feeForecastPercent;
  }

  public long getCreatorId() {
    return this.creatorId;
  }

  public void setCreatorId(long creatorId) {
    this.creatorId = creatorId;
  }

  public java.sql.Timestamp getExpectedCloseDate() {
    return this.expectedCloseDate;
  }

  public void setExpectedCloseDate(java.sql.Timestamp expectedCloseDate) {
    this.expectedCloseDate = expectedCloseDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getLastModifiedDate() {
    return this.lastModifiedDate;
  }

  public void setLastModifiedDate(java.sql.Timestamp lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public long getLastModifiedById() {
    return this.lastModifiedById;
  }

  public void setLastModifiedById(long lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
  }
}
