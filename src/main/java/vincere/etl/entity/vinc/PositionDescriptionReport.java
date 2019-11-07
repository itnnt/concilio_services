package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_description_report")
public class PositionDescriptionReport {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="company_id")
  private long companyId;

  @Column(name="status")
  private String status;

  @Column(name="fore_cast_fees")
  private double foreCastFees;

  @Column(name="placement_fees")
  private double placementFees;

  @Column(name="base_currency_type")
  private String baseCurrencyType;

  @Column(name="updated_timestamp")
  private java.sql.Timestamp updatedTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="updated_date")
  private String updatedDate;

  @Column(name="correlation_id")
  private String correlationId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public double getForeCastFees() {
    return this.foreCastFees;
  }

  public void setForeCastFees(double foreCastFees) {
    this.foreCastFees = foreCastFees;
  }

  public double getPlacementFees() {
    return this.placementFees;
  }

  public void setPlacementFees(double placementFees) {
    this.placementFees = placementFees;
  }

  public String getBaseCurrencyType() {
    return this.baseCurrencyType;
  }

  public void setBaseCurrencyType(String baseCurrencyType) {
    this.baseCurrencyType = baseCurrencyType;
  }

  public java.sql.Timestamp getUpdatedTimestamp() {
    return this.updatedTimestamp;
  }

  public void setUpdatedTimestamp(java.sql.Timestamp updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getUpdatedDate() {
    return this.updatedDate;
  }

  public void setUpdatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
  }

  public String getCorrelationId() {
    return this.correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }
}
