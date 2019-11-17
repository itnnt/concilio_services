package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compensation_fee_model")
public class CompensationFeeModel {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="compensation_id")
  private long compensationId;

  @Column(name="fee_model_name")
  private String feeModelName;

  @Column(name="fee_model_type")
  private long feeModelType;

  @Column(name="invoice_payment_interval")
  private long invoicePaymentInterval;

  @Column(name="first_invoice_date")
  private java.sql.Timestamp firstInvoiceDate;

  @Column(name="payment_term")
  private long paymentTerm;

  @Column(name="currency")
  private String currency;

  @Column(name="start_date")
  private java.sql.Timestamp startDate;

  @Column(name="end_date")
  private java.sql.Timestamp endDate;

  @Column(name="contract_type")
  private long contractType;

  @Column(name="contract_category")
  private long contractCategory;

  @Column(name="charge_rate")
  private double chargeRate;

  @Column(name="gross_annual_salary")
  private long grossAnnualSalary;

  @Column(name="incentives_guarantees")
  private long incentivesGuarantees;

  @Column(name="statutory_goverment_taxes")
  private long statutoryGovermentTaxes;

  @Column(name="exempt_incentives")
  private long exemptIncentives;

  @Column(name="other_costs")
  private long otherCosts;

  @Column(name="description")
  private String description;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="amount")
  private double amount;

  @Column(name="fixed_period")
  private long fixedPeriod;


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

  public String getFeeModelName() {
    return this.feeModelName;
  }

  public void setFeeModelName(String feeModelName) {
    this.feeModelName = feeModelName;
  }

  public long getFeeModelType() {
    return this.feeModelType;
  }

  public void setFeeModelType(long feeModelType) {
    this.feeModelType = feeModelType;
  }

  public long getInvoicePaymentInterval() {
    return this.invoicePaymentInterval;
  }

  public void setInvoicePaymentInterval(long invoicePaymentInterval) {
    this.invoicePaymentInterval = invoicePaymentInterval;
  }

  public java.sql.Timestamp getFirstInvoiceDate() {
    return this.firstInvoiceDate;
  }

  public void setFirstInvoiceDate(java.sql.Timestamp firstInvoiceDate) {
    this.firstInvoiceDate = firstInvoiceDate;
  }

  public long getPaymentTerm() {
    return this.paymentTerm;
  }

  public void setPaymentTerm(long paymentTerm) {
    this.paymentTerm = paymentTerm;
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public java.sql.Timestamp getStartDate() {
    return this.startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }

  public java.sql.Timestamp getEndDate() {
    return this.endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }

  public long getContractType() {
    return this.contractType;
  }

  public void setContractType(long contractType) {
    this.contractType = contractType;
  }

  public long getContractCategory() {
    return this.contractCategory;
  }

  public void setContractCategory(long contractCategory) {
    this.contractCategory = contractCategory;
  }

  public double getChargeRate() {
    return this.chargeRate;
  }

  public void setChargeRate(double chargeRate) {
    this.chargeRate = chargeRate;
  }

  public long getGrossAnnualSalary() {
    return this.grossAnnualSalary;
  }

  public void setGrossAnnualSalary(long grossAnnualSalary) {
    this.grossAnnualSalary = grossAnnualSalary;
  }

  public long getIncentivesGuarantees() {
    return this.incentivesGuarantees;
  }

  public void setIncentivesGuarantees(long incentivesGuarantees) {
    this.incentivesGuarantees = incentivesGuarantees;
  }

  public long getStatutoryGovermentTaxes() {
    return this.statutoryGovermentTaxes;
  }

  public void setStatutoryGovermentTaxes(long statutoryGovermentTaxes) {
    this.statutoryGovermentTaxes = statutoryGovermentTaxes;
  }

  public long getExemptIncentives() {
    return this.exemptIncentives;
  }

  public void setExemptIncentives(long exemptIncentives) {
    this.exemptIncentives = exemptIncentives;
  }

  public long getOtherCosts() {
    return this.otherCosts;
  }

  public void setOtherCosts(long otherCosts) {
    this.otherCosts = otherCosts;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public double getAmount() {
    return this.amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public long getFixedPeriod() {
    return this.fixedPeriod;
  }

  public void setFixedPeriod(long fixedPeriod) {
    this.fixedPeriod = fixedPeriod;
  }
}
