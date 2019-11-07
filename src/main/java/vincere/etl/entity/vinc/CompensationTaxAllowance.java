package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="compensation_tax_allowance")
public class CompensationTaxAllowance {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="compensation_id")
  private long compensationId;

  @Column(name="comp_setting_id")
  private long compSettingId;

  @Column(name="pay_interval")
  private long payInterval;

  @Column(name="pay_amount")
  private double payAmount;

  @Column(name="handling_fee")
  private double handlingFee;

  @Column(name="charge_amount")
  private double chargeAmount;

  @Column(name="pay_period")
  private long payPeriod;

  @Column(name="custom_description")
  private String customDescription;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="pay_tax_amount")
  private double payTaxAmount;

  @Column(name="subject_to_stat_tax")
  private String subjectToStatTax;

  @Column(name="tax_period_id")
  private long taxPeriodId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCompensationId() {
    return this.compensationId;
  }

  public void setCompensationId(long compensationId) {
    this.compensationId = compensationId;
  }

  public long getCompSettingId() {
    return this.compSettingId;
  }

  public void setCompSettingId(long compSettingId) {
    this.compSettingId = compSettingId;
  }

  public long getPayInterval() {
    return this.payInterval;
  }

  public void setPayInterval(long payInterval) {
    this.payInterval = payInterval;
  }

  public double getPayAmount() {
    return this.payAmount;
  }

  public void setPayAmount(double payAmount) {
    this.payAmount = payAmount;
  }

  public double getHandlingFee() {
    return this.handlingFee;
  }

  public void setHandlingFee(double handlingFee) {
    this.handlingFee = handlingFee;
  }

  public double getChargeAmount() {
    return this.chargeAmount;
  }

  public void setChargeAmount(double chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public long getPayPeriod() {
    return this.payPeriod;
  }

  public void setPayPeriod(long payPeriod) {
    this.payPeriod = payPeriod;
  }

  public String getCustomDescription() {
    return this.customDescription;
  }

  public void setCustomDescription(String customDescription) {
    this.customDescription = customDescription;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public double getPayTaxAmount() {
    return this.payTaxAmount;
  }

  public void setPayTaxAmount(double payTaxAmount) {
    this.payTaxAmount = payTaxAmount;
  }

  public String getSubjectToStatTax() {
    return this.subjectToStatTax;
  }

  public void setSubjectToStatTax(String subjectToStatTax) {
    this.subjectToStatTax = subjectToStatTax;
  }

  public long getTaxPeriodId() {
    return this.taxPeriodId;
  }

  public void setTaxPeriodId(long taxPeriodId) {
    this.taxPeriodId = taxPeriodId;
  }
}
