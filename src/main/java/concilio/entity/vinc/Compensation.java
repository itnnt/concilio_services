package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compensation")
public class Compensation {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_id")
  private long positionId;

  @Column(name="currency_type")
  private String currencyType;

  @Column(name="payment_interval")
  private long paymentInterval;

  @Column(name="contract_rate_type")
  private long contractRateType;

  @Column(name="contract_length")
  private double contractLength;

  @Column(name="contract_length_type")
  private long contractLengthType;

  @Column(name="contract_rate_from")
  private double contractRateFrom;

  @Column(name="contract_rate_to")
  private double contractRateTo;

  @Column(name="pay_rate")
  private double payRate;

  @Column(name="annual_paid_holiday")
  private double annualPaidHoliday;

  @Column(name="annual_paid_sick_day")
  private double annualPaidSickDay;

  @Column(name="working_hour_per_day")
  private double workingHourPerDay;

  @Column(name="working_day_per_week")
  private double workingDayPerWeek;

  @Column(name="working_day_per_month")
  private double workingDayPerMonth;

  @Column(name="working_week_per_month")
  private double workingWeekPerMonth;

  @Column(name="annual_paid_holiday_charge_client")
  private long annualPaidHolidayChargeClient;

  @Column(name="annual_paid_sick_day_charge_client")
  private long annualPaidSickDayChargeClient;

  @Column(name="gross_annual_salary")
  private double grossAnnualSalary;

  @Column(name="real_charge_number")
  private double realChargeNumber;

  @Column(name="projected_pay_rate")
  private double projectedPayRate;

  @Column(name="projected_charge_rate")
  private double projectedChargeRate;

  @Column(name="projected_profit")
  private double projectedProfit;

  @Column(name="annual_salary_from")
  private double annualSalaryFrom;

  @Column(name="annual_salary_to")
  private double annualSalaryTo;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="payment_amount")
  private double paymentAmount;

  @Column(name="salary_type")
  private long salaryType;

  @Column(name="months_per_year")
  private double monthsPerYear;

  @Column(name="present_salary_rate")
  private double presentSalaryRate;

  @Column(name="use_quick_fee_forecast")
  private long useQuickFeeForecast;

  @Column(name="percentage_of_annual_salary")
  private double percentageOfAnnualSalary;

  @Column(name="use_quick_margin_forecast")
  private long useQuickMarginForecast;

  @Column(name="quick_charge_rate")
  private double quickChargeRate;

  @Column(name="quick_charge_rate_updated")
  private long quickChargeRateUpdated;

  @Column(name="roster_all_days_1")
  private String rosterAllDays1;

  @Column(name="roster_monday_1")
  private String rosterMonday1;

  @Column(name="roster_tuesday_1")
  private String rosterTuesday1;

  @Column(name="roster_wednesday_1")
  private String rosterWednesday1;

  @Column(name="roster_thursday_1")
  private String rosterThursday1;

  @Column(name="roster_friday_1")
  private String rosterFriday1;

  @Column(name="roster_saturday_1")
  private String rosterSaturday1;

  @Column(name="roster_sunday_1")
  private String rosterSunday1;

  @Column(name="roster_custom")
  private String rosterCustom;

  @Column(name="start_of_week")
  private String startOfWeek;

  @Column(name="overtime_averaging_period")
  private String overtimeAveragingPeriod;

  @Column(name="country_code")
  private String countryCode;

  @Column(name="worker_type")
  private String workerType;

  @Column(name="visa_check")
  private String visaCheck;

  @Column(name="medical_check")
  private String medicalCheck;

  @Column(name="cv_check")
  private String cvCheck;

  @Column(name="police_check")
  private String policeCheck;

  @Column(name="security_check")
  private String securityCheck;

  @Column(name="ticket_and_license_req")
  private String ticketAndLicenseReq;

  @Column(name="contract_start_date")
  private java.sql.Timestamp contractStartDate;

  @Column(name="contract_end_date")
  private java.sql.Timestamp contractEndDate;

  @Column(name="pay_period")
  private String payPeriod;

  @Column(name="classification_code")
  private String classificationCode;

  @Column(name="charge_rate_type")
  private String chargeRateType;

  @Column(name="custom_description")
  private String customDescription;

  @Column(name="tax_period_id")
  private long taxPeriodId;

  @Column(name="award_comp_setting_id")
  private long awardCompSettingId;

  @Column(name="wic_comp_setting_id")
  private long wicCompSettingId;

  @Column(name="state_id")
  private long stateId;

  @Column(name="day_of_week_start")
  private String dayOfWeekStart;

  @Column(name="calculation_mode")
  private long calculationMode;

  @Column(name="stat_govt_tax_note")
  private String statGovtTaxNote;

  @Column(name="profit")
  private double profit;

  @Column(name="margin_percent")
  private double marginPercent;

  @Column(name="markup_percent")
  private double markupPercent;

  @Column(name="charge_rate")
  private double chargeRate;

  @Column(name="pay_calculation_type")
  private long payCalculationType;

  @Column(name="total_pay_rate")
  private double totalPayRate;

  @Column(name="on_cost")
  private double onCost;

  @Column(name="on_cost_percentage")
  private double onCostPercentage;

  @Column(name="astute_rule_group_id")
  private long astuteRuleGroupId;

  @Column(name="astute_rate_card_id")
  private long astuteRateCardId;

  @Column(name="astute_pay_cycle_id")
  private long astutePayCycleId;

  @Column(name="end_of_first_period")
  private long endOfFirstPeriod;

  @Column(name="working_hour_per_week")
  private double workingHourPerWeek;

  @Column(name="end_of_second_period")
  private long endOfSecondPeriod;

  @Column(name="timesheet_mode")
  private String timesheetMode;

  @Column(name="timesheet_input_method")
  private String timesheetInputMethod;

  @Column(name="roster_all_days")
  private long rosterAllDays;

  @Column(name="roster_monday")
  private long rosterMonday;

  @Column(name="roster_tuesday")
  private long rosterTuesday;

  @Column(name="roster_wednesday")
  private long rosterWednesday;

  @Column(name="roster_thursday")
  private long rosterThursday;

  @Column(name="roster_friday")
  private long rosterFriday;

  @Column(name="roster_saturday")
  private long rosterSaturday;

  @Column(name="roster_sunday")
  private long rosterSunday;

  @Column(name="pay_calculation_type_1")
  private long payCalculationType1;

  @Column(name="charge_rate_type_1")
  private String chargeRateType1;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public String getCurrencyType() {
    return this.currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }

  public long getPaymentInterval() {
    return this.paymentInterval;
  }

  public void setPaymentInterval(long paymentInterval) {
    this.paymentInterval = paymentInterval;
  }

  public long getContractRateType() {
    return this.contractRateType;
  }

  public void setContractRateType(long contractRateType) {
    this.contractRateType = contractRateType;
  }

  public double getContractLength() {
    return this.contractLength;
  }

  public void setContractLength(double contractLength) {
    this.contractLength = contractLength;
  }

  public long getContractLengthType() {
    return this.contractLengthType;
  }

  public void setContractLengthType(long contractLengthType) {
    this.contractLengthType = contractLengthType;
  }

  public double getContractRateFrom() {
    return this.contractRateFrom;
  }

  public void setContractRateFrom(double contractRateFrom) {
    this.contractRateFrom = contractRateFrom;
  }

  public double getContractRateTo() {
    return this.contractRateTo;
  }

  public void setContractRateTo(double contractRateTo) {
    this.contractRateTo = contractRateTo;
  }

  public double getPayRate() {
    return this.payRate;
  }

  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }

  public double getAnnualPaidHoliday() {
    return this.annualPaidHoliday;
  }

  public void setAnnualPaidHoliday(double annualPaidHoliday) {
    this.annualPaidHoliday = annualPaidHoliday;
  }

  public double getAnnualPaidSickDay() {
    return this.annualPaidSickDay;
  }

  public void setAnnualPaidSickDay(double annualPaidSickDay) {
    this.annualPaidSickDay = annualPaidSickDay;
  }

  public double getWorkingHourPerDay() {
    return this.workingHourPerDay;
  }

  public void setWorkingHourPerDay(double workingHourPerDay) {
    this.workingHourPerDay = workingHourPerDay;
  }

  public double getWorkingDayPerWeek() {
    return this.workingDayPerWeek;
  }

  public void setWorkingDayPerWeek(double workingDayPerWeek) {
    this.workingDayPerWeek = workingDayPerWeek;
  }

  public double getWorkingDayPerMonth() {
    return this.workingDayPerMonth;
  }

  public void setWorkingDayPerMonth(double workingDayPerMonth) {
    this.workingDayPerMonth = workingDayPerMonth;
  }

  public double getWorkingWeekPerMonth() {
    return this.workingWeekPerMonth;
  }

  public void setWorkingWeekPerMonth(double workingWeekPerMonth) {
    this.workingWeekPerMonth = workingWeekPerMonth;
  }

  public long getAnnualPaidHolidayChargeClient() {
    return this.annualPaidHolidayChargeClient;
  }

  public void setAnnualPaidHolidayChargeClient(long annualPaidHolidayChargeClient) {
    this.annualPaidHolidayChargeClient = annualPaidHolidayChargeClient;
  }

  public long getAnnualPaidSickDayChargeClient() {
    return this.annualPaidSickDayChargeClient;
  }

  public void setAnnualPaidSickDayChargeClient(long annualPaidSickDayChargeClient) {
    this.annualPaidSickDayChargeClient = annualPaidSickDayChargeClient;
  }

  public double getGrossAnnualSalary() {
    return this.grossAnnualSalary;
  }

  public void setGrossAnnualSalary(double grossAnnualSalary) {
    this.grossAnnualSalary = grossAnnualSalary;
  }

  public double getRealChargeNumber() {
    return this.realChargeNumber;
  }

  public void setRealChargeNumber(double realChargeNumber) {
    this.realChargeNumber = realChargeNumber;
  }

  public double getProjectedPayRate() {
    return this.projectedPayRate;
  }

  public void setProjectedPayRate(double projectedPayRate) {
    this.projectedPayRate = projectedPayRate;
  }

  public double getProjectedChargeRate() {
    return this.projectedChargeRate;
  }

  public void setProjectedChargeRate(double projectedChargeRate) {
    this.projectedChargeRate = projectedChargeRate;
  }

  public double getProjectedProfit() {
    return this.projectedProfit;
  }

  public void setProjectedProfit(double projectedProfit) {
    this.projectedProfit = projectedProfit;
  }

  public double getAnnualSalaryFrom() {
    return this.annualSalaryFrom;
  }

  public void setAnnualSalaryFrom(double annualSalaryFrom) {
    this.annualSalaryFrom = annualSalaryFrom;
  }

  public double getAnnualSalaryTo() {
    return this.annualSalaryTo;
  }

  public void setAnnualSalaryTo(double annualSalaryTo) {
    this.annualSalaryTo = annualSalaryTo;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public double getPaymentAmount() {
    return this.paymentAmount;
  }

  public void setPaymentAmount(double paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public long getSalaryType() {
    return this.salaryType;
  }

  public void setSalaryType(long salaryType) {
    this.salaryType = salaryType;
  }

  public double getMonthsPerYear() {
    return this.monthsPerYear;
  }

  public void setMonthsPerYear(double monthsPerYear) {
    this.monthsPerYear = monthsPerYear;
  }

  public double getPresentSalaryRate() {
    return this.presentSalaryRate;
  }

  public void setPresentSalaryRate(double presentSalaryRate) {
    this.presentSalaryRate = presentSalaryRate;
  }

  public long getUseQuickFeeForecast() {
    return this.useQuickFeeForecast;
  }

  public void setUseQuickFeeForecast(long useQuickFeeForecast) {
    this.useQuickFeeForecast = useQuickFeeForecast;
  }

  public double getPercentageOfAnnualSalary() {
    return this.percentageOfAnnualSalary;
  }

  public void setPercentageOfAnnualSalary(double percentageOfAnnualSalary) {
    this.percentageOfAnnualSalary = percentageOfAnnualSalary;
  }

  public long getUseQuickMarginForecast() {
    return this.useQuickMarginForecast;
  }

  public void setUseQuickMarginForecast(long useQuickMarginForecast) {
    this.useQuickMarginForecast = useQuickMarginForecast;
  }

  public double getQuickChargeRate() {
    return this.quickChargeRate;
  }

  public void setQuickChargeRate(double quickChargeRate) {
    this.quickChargeRate = quickChargeRate;
  }

  public long getQuickChargeRateUpdated() {
    return this.quickChargeRateUpdated;
  }

  public void setQuickChargeRateUpdated(long quickChargeRateUpdated) {
    this.quickChargeRateUpdated = quickChargeRateUpdated;
  }

  public String getRosterAllDays1() {
    return this.rosterAllDays1;
  }

  public void setRosterAllDays1(String rosterAllDays1) {
    this.rosterAllDays1 = rosterAllDays1;
  }

  public String getRosterMonday1() {
    return this.rosterMonday1;
  }

  public void setRosterMonday1(String rosterMonday1) {
    this.rosterMonday1 = rosterMonday1;
  }

  public String getRosterTuesday1() {
    return this.rosterTuesday1;
  }

  public void setRosterTuesday1(String rosterTuesday1) {
    this.rosterTuesday1 = rosterTuesday1;
  }

  public String getRosterWednesday1() {
    return this.rosterWednesday1;
  }

  public void setRosterWednesday1(String rosterWednesday1) {
    this.rosterWednesday1 = rosterWednesday1;
  }

  public String getRosterThursday1() {
    return this.rosterThursday1;
  }

  public void setRosterThursday1(String rosterThursday1) {
    this.rosterThursday1 = rosterThursday1;
  }

  public String getRosterFriday1() {
    return this.rosterFriday1;
  }

  public void setRosterFriday1(String rosterFriday1) {
    this.rosterFriday1 = rosterFriday1;
  }

  public String getRosterSaturday1() {
    return this.rosterSaturday1;
  }

  public void setRosterSaturday1(String rosterSaturday1) {
    this.rosterSaturday1 = rosterSaturday1;
  }

  public String getRosterSunday1() {
    return this.rosterSunday1;
  }

  public void setRosterSunday1(String rosterSunday1) {
    this.rosterSunday1 = rosterSunday1;
  }

  public String getRosterCustom() {
    return this.rosterCustom;
  }

  public void setRosterCustom(String rosterCustom) {
    this.rosterCustom = rosterCustom;
  }

  public String getStartOfWeek() {
    return this.startOfWeek;
  }

  public void setStartOfWeek(String startOfWeek) {
    this.startOfWeek = startOfWeek;
  }

  public String getOvertimeAveragingPeriod() {
    return this.overtimeAveragingPeriod;
  }

  public void setOvertimeAveragingPeriod(String overtimeAveragingPeriod) {
    this.overtimeAveragingPeriod = overtimeAveragingPeriod;
  }

  public String getCountryCode() {
    return this.countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getWorkerType() {
    return this.workerType;
  }

  public void setWorkerType(String workerType) {
    this.workerType = workerType;
  }

  public String getVisaCheck() {
    return this.visaCheck;
  }

  public void setVisaCheck(String visaCheck) {
    this.visaCheck = visaCheck;
  }

  public String getMedicalCheck() {
    return this.medicalCheck;
  }

  public void setMedicalCheck(String medicalCheck) {
    this.medicalCheck = medicalCheck;
  }

  public String getCvCheck() {
    return this.cvCheck;
  }

  public void setCvCheck(String cvCheck) {
    this.cvCheck = cvCheck;
  }

  public String getPoliceCheck() {
    return this.policeCheck;
  }

  public void setPoliceCheck(String policeCheck) {
    this.policeCheck = policeCheck;
  }

  public String getSecurityCheck() {
    return this.securityCheck;
  }

  public void setSecurityCheck(String securityCheck) {
    this.securityCheck = securityCheck;
  }

  public String getTicketAndLicenseReq() {
    return this.ticketAndLicenseReq;
  }

  public void setTicketAndLicenseReq(String ticketAndLicenseReq) {
    this.ticketAndLicenseReq = ticketAndLicenseReq;
  }

  public java.sql.Timestamp getContractStartDate() {
    return this.contractStartDate;
  }

  public void setContractStartDate(java.sql.Timestamp contractStartDate) {
    this.contractStartDate = contractStartDate;
  }

  public java.sql.Timestamp getContractEndDate() {
    return this.contractEndDate;
  }

  public void setContractEndDate(java.sql.Timestamp contractEndDate) {
    this.contractEndDate = contractEndDate;
  }

  public String getPayPeriod() {
    return this.payPeriod;
  }

  public void setPayPeriod(String payPeriod) {
    this.payPeriod = payPeriod;
  }

  public String getClassificationCode() {
    return this.classificationCode;
  }

  public void setClassificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
  }

  public String getChargeRateType() {
    return this.chargeRateType;
  }

  public void setChargeRateType(String chargeRateType) {
    this.chargeRateType = chargeRateType;
  }

  public String getCustomDescription() {
    return this.customDescription;
  }

  public void setCustomDescription(String customDescription) {
    this.customDescription = customDescription;
  }

  public long getTaxPeriodId() {
    return this.taxPeriodId;
  }

  public void setTaxPeriodId(long taxPeriodId) {
    this.taxPeriodId = taxPeriodId;
  }

  public long getAwardCompSettingId() {
    return this.awardCompSettingId;
  }

  public void setAwardCompSettingId(long awardCompSettingId) {
    this.awardCompSettingId = awardCompSettingId;
  }

  public long getWicCompSettingId() {
    return this.wicCompSettingId;
  }

  public void setWicCompSettingId(long wicCompSettingId) {
    this.wicCompSettingId = wicCompSettingId;
  }

  public long getStateId() {
    return this.stateId;
  }

  public void setStateId(long stateId) {
    this.stateId = stateId;
  }

  public String getDayOfWeekStart() {
    return this.dayOfWeekStart;
  }

  public void setDayOfWeekStart(String dayOfWeekStart) {
    this.dayOfWeekStart = dayOfWeekStart;
  }

  public long getCalculationMode() {
    return this.calculationMode;
  }

  public void setCalculationMode(long calculationMode) {
    this.calculationMode = calculationMode;
  }

  public String getStatGovtTaxNote() {
    return this.statGovtTaxNote;
  }

  public void setStatGovtTaxNote(String statGovtTaxNote) {
    this.statGovtTaxNote = statGovtTaxNote;
  }

  public double getProfit() {
    return this.profit;
  }

  public void setProfit(double profit) {
    this.profit = profit;
  }

  public double getMarginPercent() {
    return this.marginPercent;
  }

  public void setMarginPercent(double marginPercent) {
    this.marginPercent = marginPercent;
  }

  public double getMarkupPercent() {
    return this.markupPercent;
  }

  public void setMarkupPercent(double markupPercent) {
    this.markupPercent = markupPercent;
  }

  public double getChargeRate() {
    return this.chargeRate;
  }

  public void setChargeRate(double chargeRate) {
    this.chargeRate = chargeRate;
  }

  public long getPayCalculationType() {
    return this.payCalculationType;
  }

  public void setPayCalculationType(long payCalculationType) {
    this.payCalculationType = payCalculationType;
  }

  public double getTotalPayRate() {
    return this.totalPayRate;
  }

  public void setTotalPayRate(double totalPayRate) {
    this.totalPayRate = totalPayRate;
  }

  public double getOnCost() {
    return this.onCost;
  }

  public void setOnCost(double onCost) {
    this.onCost = onCost;
  }

  public double getOnCostPercentage() {
    return this.onCostPercentage;
  }

  public void setOnCostPercentage(double onCostPercentage) {
    this.onCostPercentage = onCostPercentage;
  }

  public long getAstuteRuleGroupId() {
    return this.astuteRuleGroupId;
  }

  public void setAstuteRuleGroupId(long astuteRuleGroupId) {
    this.astuteRuleGroupId = astuteRuleGroupId;
  }

  public long getAstuteRateCardId() {
    return this.astuteRateCardId;
  }

  public void setAstuteRateCardId(long astuteRateCardId) {
    this.astuteRateCardId = astuteRateCardId;
  }

  public long getAstutePayCycleId() {
    return this.astutePayCycleId;
  }

  public void setAstutePayCycleId(long astutePayCycleId) {
    this.astutePayCycleId = astutePayCycleId;
  }

  public long getEndOfFirstPeriod() {
    return this.endOfFirstPeriod;
  }

  public void setEndOfFirstPeriod(long endOfFirstPeriod) {
    this.endOfFirstPeriod = endOfFirstPeriod;
  }

  public double getWorkingHourPerWeek() {
    return this.workingHourPerWeek;
  }

  public void setWorkingHourPerWeek(double workingHourPerWeek) {
    this.workingHourPerWeek = workingHourPerWeek;
  }

  public long getEndOfSecondPeriod() {
    return this.endOfSecondPeriod;
  }

  public void setEndOfSecondPeriod(long endOfSecondPeriod) {
    this.endOfSecondPeriod = endOfSecondPeriod;
  }

  public String getTimesheetMode() {
    return this.timesheetMode;
  }

  public void setTimesheetMode(String timesheetMode) {
    this.timesheetMode = timesheetMode;
  }

  public String getTimesheetInputMethod() {
    return this.timesheetInputMethod;
  }

  public void setTimesheetInputMethod(String timesheetInputMethod) {
    this.timesheetInputMethod = timesheetInputMethod;
  }

  public long getRosterAllDays() {
    return this.rosterAllDays;
  }

  public void setRosterAllDays(long rosterAllDays) {
    this.rosterAllDays = rosterAllDays;
  }

  public long getRosterMonday() {
    return this.rosterMonday;
  }

  public void setRosterMonday(long rosterMonday) {
    this.rosterMonday = rosterMonday;
  }

  public long getRosterTuesday() {
    return this.rosterTuesday;
  }

  public void setRosterTuesday(long rosterTuesday) {
    this.rosterTuesday = rosterTuesday;
  }

  public long getRosterWednesday() {
    return this.rosterWednesday;
  }

  public void setRosterWednesday(long rosterWednesday) {
    this.rosterWednesday = rosterWednesday;
  }

  public long getRosterThursday() {
    return this.rosterThursday;
  }

  public void setRosterThursday(long rosterThursday) {
    this.rosterThursday = rosterThursday;
  }

  public long getRosterFriday() {
    return this.rosterFriday;
  }

  public void setRosterFriday(long rosterFriday) {
    this.rosterFriday = rosterFriday;
  }

  public long getRosterSaturday() {
    return this.rosterSaturday;
  }

  public void setRosterSaturday(long rosterSaturday) {
    this.rosterSaturday = rosterSaturday;
  }

  public long getRosterSunday() {
    return this.rosterSunday;
  }

  public void setRosterSunday(long rosterSunday) {
    this.rosterSunday = rosterSunday;
  }

  public long getPayCalculationType1() {
    return this.payCalculationType1;
  }

  public void setPayCalculationType1(long payCalculationType1) {
    this.payCalculationType1 = payCalculationType1;
  }

  public String getChargeRateType1() {
    return this.chargeRateType1;
  }

  public void setChargeRateType1(String chargeRateType1) {
    this.chargeRateType1 = chargeRateType1;
  }
}
