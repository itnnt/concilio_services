package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="on_cost_template")
public class OnCostTemplate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="country_code")
  private String countryCode;

  @Column(name="country_state_id")
  private long countryStateId;

  @Column(name="pay_calculation_type_id")
  private long payCalculationTypeId;

  @Column(name="note")
  private String note;

  @Column(name="details_json")
  private String detailsJson;

  @Column(name="created_by_id")
  private long createdById;

  @Column(name="updated_by_id")
  private long updatedById;

  @Column(name="updated_timestamp")
  private java.sql.Timestamp updatedTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="contract_rate_type_id")
  private long contractRateTypeId;

  @Column(name="base_pay_rate")
  private double basePayRate;

  @Column(name="charge_rate")
  private double chargeRate;

  @Column(name="company_id")
  private long companyId;

  @Column(name="template_code")
  private String templateCode;

  @Column(name="currency_type")
  private String currencyType;

  @Column(name="company_location_id")
  private long companyLocationId;

  @Column(name="start_of_week")
  private String startOfWeek;

  @Column(name="pay_period")
  private String payPeriod;

  @Column(name="charge_rate_type")
  private String chargeRateType;

  @Column(name="timesheet_input_method")
  private String timesheetInputMethod;

  @Column(name="timesheet_mode")
  private String timesheetMode;

  @Column(name="end_of_first_period")
  private long endOfFirstPeriod;

  @Column(name="end_of_second_period")
  private long endOfSecondPeriod;


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

  public String getCountryCode() {
    return this.countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public long getCountryStateId() {
    return this.countryStateId;
  }

  public void setCountryStateId(long countryStateId) {
    this.countryStateId = countryStateId;
  }

  public long getPayCalculationTypeId() {
    return this.payCalculationTypeId;
  }

  public void setPayCalculationTypeId(long payCalculationTypeId) {
    this.payCalculationTypeId = payCalculationTypeId;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getDetailsJson() {
    return this.detailsJson;
  }

  public void setDetailsJson(String detailsJson) {
    this.detailsJson = detailsJson;
  }

  public long getCreatedById() {
    return this.createdById;
  }

  public void setCreatedById(long createdById) {
    this.createdById = createdById;
  }

  public long getUpdatedById() {
    return this.updatedById;
  }

  public void setUpdatedById(long updatedById) {
    this.updatedById = updatedById;
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

  public long getContractRateTypeId() {
    return this.contractRateTypeId;
  }

  public void setContractRateTypeId(long contractRateTypeId) {
    this.contractRateTypeId = contractRateTypeId;
  }

  public double getBasePayRate() {
    return this.basePayRate;
  }

  public void setBasePayRate(double basePayRate) {
    this.basePayRate = basePayRate;
  }

  public double getChargeRate() {
    return this.chargeRate;
  }

  public void setChargeRate(double chargeRate) {
    this.chargeRate = chargeRate;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public String getTemplateCode() {
    return this.templateCode;
  }

  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }

  public String getCurrencyType() {
    return this.currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }

  public long getCompanyLocationId() {
    return this.companyLocationId;
  }

  public void setCompanyLocationId(long companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  public String getStartOfWeek() {
    return this.startOfWeek;
  }

  public void setStartOfWeek(String startOfWeek) {
    this.startOfWeek = startOfWeek;
  }

  public String getPayPeriod() {
    return this.payPeriod;
  }

  public void setPayPeriod(String payPeriod) {
    this.payPeriod = payPeriod;
  }

  public String getChargeRateType() {
    return this.chargeRateType;
  }

  public void setChargeRateType(String chargeRateType) {
    this.chargeRateType = chargeRateType;
  }

  public String getTimesheetInputMethod() {
    return this.timesheetInputMethod;
  }

  public void setTimesheetInputMethod(String timesheetInputMethod) {
    this.timesheetInputMethod = timesheetInputMethod;
  }

  public String getTimesheetMode() {
    return this.timesheetMode;
  }

  public void setTimesheetMode(String timesheetMode) {
    this.timesheetMode = timesheetMode;
  }

  public long getEndOfFirstPeriod() {
    return this.endOfFirstPeriod;
  }

  public void setEndOfFirstPeriod(long endOfFirstPeriod) {
    this.endOfFirstPeriod = endOfFirstPeriod;
  }

  public long getEndOfSecondPeriod() {
    return this.endOfSecondPeriod;
  }

  public void setEndOfSecondPeriod(long endOfSecondPeriod) {
    this.endOfSecondPeriod = endOfSecondPeriod;
  }
}
