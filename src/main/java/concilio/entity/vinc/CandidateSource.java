package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_source")
public class CandidateSource {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="source_type")
  private long sourceType;

  @Column(name="hidden_timestamp")
  private java.sql.Timestamp hiddenTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="contract_margin_style")
  private long contractMarginStyle;

  @Column(name="permanent_percentage")
  private double permanentPercentage;

  @Column(name="contract_percentage")
  private double contractPercentage;

  @Column(name="internal")
  private long internal;

  @Column(name="payment_style")
  private long paymentStyle;

  @Column(name="periodic_payment_fee")
  private double periodicPaymentFee;

  @Column(name="periodic_payment_fee_currency_type")
  private String periodicPaymentFeeCurrencyType;

  @Column(name="periodic_payment_start_date")
  private java.sql.Timestamp periodicPaymentStartDate;

  @Column(name="periodic_payment_end_date")
  private java.sql.Timestamp periodicPaymentEndDate;

  @Column(name="included_job_count")
  private double includedJobCount;

  @Column(name="percentage_option")
  private long percentageOption;

  @Column(name="percentage_option_plus")
  private long percentageOptionPlus;

  @Column(name="contract_percentage_option")
  private long contractPercentageOption;

  @Column(name="location_id")
  private long locationId;

  @Column(name="other_system_type")
  private String otherSystemType;

  @Column(name="candidate_method")
  private long candidateMethod;

  @Column(name="show_job")
  private long showJob;

  @Column(name="show_careersite")
  private long showCareersite;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getSourceType() {
    return this.sourceType;
  }

  public void setSourceType(long sourceType) {
    this.sourceType = sourceType;
  }

  public java.sql.Timestamp getHiddenTimestamp() {
    return this.hiddenTimestamp;
  }

  public void setHiddenTimestamp(java.sql.Timestamp hiddenTimestamp) {
    this.hiddenTimestamp = hiddenTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getContractMarginStyle() {
    return this.contractMarginStyle;
  }

  public void setContractMarginStyle(long contractMarginStyle) {
    this.contractMarginStyle = contractMarginStyle;
  }

  public double getPermanentPercentage() {
    return this.permanentPercentage;
  }

  public void setPermanentPercentage(double permanentPercentage) {
    this.permanentPercentage = permanentPercentage;
  }

  public double getContractPercentage() {
    return this.contractPercentage;
  }

  public void setContractPercentage(double contractPercentage) {
    this.contractPercentage = contractPercentage;
  }

  public long getInternal() {
    return this.internal;
  }

  public void setInternal(long internal) {
    this.internal = internal;
  }

  public long getPaymentStyle() {
    return this.paymentStyle;
  }

  public void setPaymentStyle(long paymentStyle) {
    this.paymentStyle = paymentStyle;
  }

  public double getPeriodicPaymentFee() {
    return this.periodicPaymentFee;
  }

  public void setPeriodicPaymentFee(double periodicPaymentFee) {
    this.periodicPaymentFee = periodicPaymentFee;
  }

  public String getPeriodicPaymentFeeCurrencyType() {
    return this.periodicPaymentFeeCurrencyType;
  }

  public void setPeriodicPaymentFeeCurrencyType(String periodicPaymentFeeCurrencyType) {
    this.periodicPaymentFeeCurrencyType = periodicPaymentFeeCurrencyType;
  }

  public java.sql.Timestamp getPeriodicPaymentStartDate() {
    return this.periodicPaymentStartDate;
  }

  public void setPeriodicPaymentStartDate(java.sql.Timestamp periodicPaymentStartDate) {
    this.periodicPaymentStartDate = periodicPaymentStartDate;
  }

  public java.sql.Timestamp getPeriodicPaymentEndDate() {
    return this.periodicPaymentEndDate;
  }

  public void setPeriodicPaymentEndDate(java.sql.Timestamp periodicPaymentEndDate) {
    this.periodicPaymentEndDate = periodicPaymentEndDate;
  }

  public double getIncludedJobCount() {
    return this.includedJobCount;
  }

  public void setIncludedJobCount(double includedJobCount) {
    this.includedJobCount = includedJobCount;
  }

  public long getPercentageOption() {
    return this.percentageOption;
  }

  public void setPercentageOption(long percentageOption) {
    this.percentageOption = percentageOption;
  }

  public long getPercentageOptionPlus() {
    return this.percentageOptionPlus;
  }

  public void setPercentageOptionPlus(long percentageOptionPlus) {
    this.percentageOptionPlus = percentageOptionPlus;
  }

  public long getContractPercentageOption() {
    return this.contractPercentageOption;
  }

  public void setContractPercentageOption(long contractPercentageOption) {
    this.contractPercentageOption = contractPercentageOption;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public String getOtherSystemType() {
    return this.otherSystemType;
  }

  public void setOtherSystemType(String otherSystemType) {
    this.otherSystemType = otherSystemType;
  }

  public long getCandidateMethod() {
    return this.candidateMethod;
  }

  public void setCandidateMethod(long candidateMethod) {
    this.candidateMethod = candidateMethod;
  }

  public long getShowJob() {
    return this.showJob;
  }

  public void setShowJob(long showJob) {
    this.showJob = showJob;
  }

  public long getShowCareersite() {
    return this.showCareersite;
  }

  public void setShowCareersite(long showCareersite) {
    this.showCareersite = showCareersite;
  }
}
