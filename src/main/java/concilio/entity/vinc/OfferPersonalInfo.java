package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer_personal_info")
public class OfferPersonalInfo {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="gender_title")
  private String genderTitle;

  @Column(name="last_name")
  private String lastName;

  @Column(name="first_name")
  private String firstName;

  @Column(name="middle_name")
  private String middleName;

  @Column(name="male")
  private long male;

  @Column(name="phone")
  private String phone;

  @Column(name="home_phone")
  private String homePhone;

  @Column(name="email")
  private String email;

  @Column(name="address1")
  private String address1;

  @Column(name="work_address")
  private String workAddress;

  @Column(name="city")
  private String city;

  @Column(name="zipcode")
  private String zipcode;

  @Column(name="country")
  private String country;

  @Column(name="state")
  private String state;

  @Column(name="date_of_birth")
  private java.sql.Timestamp dateOfBirth;

  @Column(name="offer_date")
  private java.sql.Timestamp offerDate;

  @Column(name="start_date")
  private java.sql.Timestamp startDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="notice_period")
  private long noticePeriod;

  @Column(name="preferred_name")
  private String preferredName;

  @Column(name="current_location_id")
  private long currentLocationId;

  @Column(name="payslip_email")
  private String payslipEmail;

  @Column(name="end_date")
  private java.sql.Timestamp endDate;

  @Column(name="job_site_detail")
  private String jobSiteDetail;

  @Column(name="site_manager_contact_phone")
  private String siteManagerContactPhone;

  @Column(name="site_manager_contact_id")
  private long siteManagerContactId;

  @Column(name="job_site_location_id")
  private long jobSiteLocationId;

  @Column(name="primary_approver_id")
  private long primaryApproverId;

  @Column(name="primary_approver_name")
  private String primaryApproverName;

  @Column(name="second_approver_id")
  private long secondApproverId;

  @Column(name="second_approver_name")
  private String secondApproverName;

  @Column(name="payroll")
  private long payroll;

  @Column(name="invoicing")
  private long invoicing;

  @Column(name="expenses")
  private long expenses;

  @Column(name="fixed_timesheet")
  private long fixedTimesheet;

  @Column(name="client_company_id")
  private long clientCompanyId;

  @Column(name="client_company_name")
  private String clientCompanyName;

  @Column(name="client_trading_name")
  private String clientTradingName;

  @Column(name="client_contact_id")
  private long clientContactId;

  @Column(name="client_contact_name")
  private String clientContactName;

  @Column(name="client_department")
  private String clientDepartment;

  @Column(name="client_contact_email")
  private String clientContactEmail;

  @Column(name="client_contact_phone")
  private String clientContactPhone;

  @Column(name="client_billing_location_id")
  private long clientBillingLocationId;

  @Column(name="client_billing_group_name")
  private String clientBillingGroupName;

  @Column(name="client_invoice_name")
  private String clientInvoiceName;

  @Column(name="client_invoice_code")
  private String clientInvoiceCode;

  @Column(name="client_invoice_no")
  private String clientInvoiceNo;

  @Column(name="client_general_po_number")
  private String clientGeneralPoNumber;

  @Column(name="client_purchase_order")
  private String clientPurchaseOrder;

  @Column(name="client_tax_exempt")
  private long clientTaxExempt;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="bill_through_entity")
  private String billThroughEntity;

  @Column(name="branch")
  private String branch;

  @Column(name="division")
  private String division;

  @Column(name="billing_group")
  private String billingGroup;

  @Column(name="invoice_from")
  private java.sql.Timestamp invoiceFrom;

  @Column(name="invoice_date")
  private java.sql.Timestamp invoiceDate;

  @Column(name="terms")
  private long terms;

  @Column(name="site_manager_contact_name")
  private String siteManagerContactName;

  @Column(name="placed_date")
  private java.sql.Timestamp placedDate;

  @Column(name="site_manager_contact_email")
  private String siteManagerContactEmail;

  @Column(name="note")
  private String note;

  @Column(name="paying_through_entity")
  private String payingThroughEntity;

  @Column(name="tax_rate")
  private double taxRate;

  @Column(name="invoice_consolidation_method")
  private String invoiceConsolidationMethod;

  @Column(name="consolidation_code")
  private String consolidationCode;

  @Column(name="export_data_when")
  private long exportDataWhen;

  @Column(name="payment_method")
  private long paymentMethod;

  @Column(name="export_data_to")
  private String exportDataTo;

  @Column(name="company_number")
  private String companyNumber;

  @Column(name="business_number")
  private String businessNumber;

  @Column(name="invoice_no")
  private String invoiceNo;

  @Column(name="timezone")
  private String timezone;

  @Column(name="client_cost_center")
  private String clientCostCenter;

  @Column(name="invoice_due_date")
  private java.sql.Timestamp invoiceDueDate;

  @Column(name="net_total")
  private double netTotal;

  @Column(name="other_invoice_items_total")
  private double otherInvoiceItemsTotal;

  @Column(name="invoice_total")
  private double invoiceTotal;

  @Column(name="use_profit")
  private long useProfit;

  @Column(name="invoice_message")
  private String invoiceMessage;

  @Column(name="job_site_name")
  private String jobSiteName;

  @Column(name="other_invoice_recipients")
  private String otherInvoiceRecipients;

  @Column(name="astute_primary_approver_id")
  private String astutePrimaryApproverId;

  @Column(name="astute_secondary_approver_id")
  private String astuteSecondaryApproverId;

  @Column(name="astute_bill_through_entity")
  private long astuteBillThroughEntity;

  @Column(name="astute_pay_through_entity")
  private long astutePayThroughEntity;

  @Column(name="astute_billing_group_id")
  private long astuteBillingGroupId;

  @Column(name="astute_primary_approver_name")
  private String astutePrimaryApproverName;

  @Column(name="astute_secondary_approver_name")
  private String astuteSecondaryApproverName;

  @Column(name="offer_letter_signatory_user_id")
  private long offerLetterSignatoryUserId;

  @Column(name="approval_required")
  private long approvalRequired;

  @Column(name="candidate_company_name")
  private String candidateCompanyName;

  @Column(name="candidate_company_number")
  private String candidateCompanyNumber;

  @Column(name="home_currency")
  private String homeCurrency;

  @Column(name="bank_spot_rate")
  private double bankSpotRate;

  @Column(name="conversion_total")
  private double conversionTotal;

  @Column(name="company_payment_term")
  private String companyPaymentTerm;

  @Column(name="company_location_id")
  private long companyLocationId;

  @Column(name="proposal_signatory_user_id")
  private long proposalSignatoryUserId;

  @Column(name="department_id")
  private long departmentId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getOfferId() {
    return this.offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }

  public String getGenderTitle() {
    return this.genderTitle;
  }

  public void setGenderTitle(String genderTitle) {
    this.genderTitle = genderTitle;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return this.middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public long getMale() {
    return this.male;
  }

  public void setMale(long male) {
    this.male = male;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getHomePhone() {
    return this.homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress1() {
    return this.address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getWorkAddress() {
    return this.workAddress;
  }

  public void setWorkAddress(String workAddress) {
    this.workAddress = workAddress;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZipcode() {
    return this.zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public java.sql.Timestamp getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(java.sql.Timestamp dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public java.sql.Timestamp getOfferDate() {
    return this.offerDate;
  }

  public void setOfferDate(java.sql.Timestamp offerDate) {
    this.offerDate = offerDate;
  }

  public java.sql.Timestamp getStartDate() {
    return this.startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getNoticePeriod() {
    return this.noticePeriod;
  }

  public void setNoticePeriod(long noticePeriod) {
    this.noticePeriod = noticePeriod;
  }

  public String getPreferredName() {
    return this.preferredName;
  }

  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  public long getCurrentLocationId() {
    return this.currentLocationId;
  }

  public void setCurrentLocationId(long currentLocationId) {
    this.currentLocationId = currentLocationId;
  }

  public String getPayslipEmail() {
    return this.payslipEmail;
  }

  public void setPayslipEmail(String payslipEmail) {
    this.payslipEmail = payslipEmail;
  }

  public java.sql.Timestamp getEndDate() {
    return this.endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }

  public String getJobSiteDetail() {
    return this.jobSiteDetail;
  }

  public void setJobSiteDetail(String jobSiteDetail) {
    this.jobSiteDetail = jobSiteDetail;
  }

  public String getSiteManagerContactPhone() {
    return this.siteManagerContactPhone;
  }

  public void setSiteManagerContactPhone(String siteManagerContactPhone) {
    this.siteManagerContactPhone = siteManagerContactPhone;
  }

  public long getSiteManagerContactId() {
    return this.siteManagerContactId;
  }

  public void setSiteManagerContactId(long siteManagerContactId) {
    this.siteManagerContactId = siteManagerContactId;
  }

  public long getJobSiteLocationId() {
    return this.jobSiteLocationId;
  }

  public void setJobSiteLocationId(long jobSiteLocationId) {
    this.jobSiteLocationId = jobSiteLocationId;
  }

  public long getPrimaryApproverId() {
    return this.primaryApproverId;
  }

  public void setPrimaryApproverId(long primaryApproverId) {
    this.primaryApproverId = primaryApproverId;
  }

  public String getPrimaryApproverName() {
    return this.primaryApproverName;
  }

  public void setPrimaryApproverName(String primaryApproverName) {
    this.primaryApproverName = primaryApproverName;
  }

  public long getSecondApproverId() {
    return this.secondApproverId;
  }

  public void setSecondApproverId(long secondApproverId) {
    this.secondApproverId = secondApproverId;
  }

  public String getSecondApproverName() {
    return this.secondApproverName;
  }

  public void setSecondApproverName(String secondApproverName) {
    this.secondApproverName = secondApproverName;
  }

  public long getPayroll() {
    return this.payroll;
  }

  public void setPayroll(long payroll) {
    this.payroll = payroll;
  }

  public long getInvoicing() {
    return this.invoicing;
  }

  public void setInvoicing(long invoicing) {
    this.invoicing = invoicing;
  }

  public long getExpenses() {
    return this.expenses;
  }

  public void setExpenses(long expenses) {
    this.expenses = expenses;
  }

  public long getFixedTimesheet() {
    return this.fixedTimesheet;
  }

  public void setFixedTimesheet(long fixedTimesheet) {
    this.fixedTimesheet = fixedTimesheet;
  }

  public long getClientCompanyId() {
    return this.clientCompanyId;
  }

  public void setClientCompanyId(long clientCompanyId) {
    this.clientCompanyId = clientCompanyId;
  }

  public String getClientCompanyName() {
    return this.clientCompanyName;
  }

  public void setClientCompanyName(String clientCompanyName) {
    this.clientCompanyName = clientCompanyName;
  }

  public String getClientTradingName() {
    return this.clientTradingName;
  }

  public void setClientTradingName(String clientTradingName) {
    this.clientTradingName = clientTradingName;
  }

  public long getClientContactId() {
    return this.clientContactId;
  }

  public void setClientContactId(long clientContactId) {
    this.clientContactId = clientContactId;
  }

  public String getClientContactName() {
    return this.clientContactName;
  }

  public void setClientContactName(String clientContactName) {
    this.clientContactName = clientContactName;
  }

  public String getClientDepartment() {
    return this.clientDepartment;
  }

  public void setClientDepartment(String clientDepartment) {
    this.clientDepartment = clientDepartment;
  }

  public String getClientContactEmail() {
    return this.clientContactEmail;
  }

  public void setClientContactEmail(String clientContactEmail) {
    this.clientContactEmail = clientContactEmail;
  }

  public String getClientContactPhone() {
    return this.clientContactPhone;
  }

  public void setClientContactPhone(String clientContactPhone) {
    this.clientContactPhone = clientContactPhone;
  }

  public long getClientBillingLocationId() {
    return this.clientBillingLocationId;
  }

  public void setClientBillingLocationId(long clientBillingLocationId) {
    this.clientBillingLocationId = clientBillingLocationId;
  }

  public String getClientBillingGroupName() {
    return this.clientBillingGroupName;
  }

  public void setClientBillingGroupName(String clientBillingGroupName) {
    this.clientBillingGroupName = clientBillingGroupName;
  }

  public String getClientInvoiceName() {
    return this.clientInvoiceName;
  }

  public void setClientInvoiceName(String clientInvoiceName) {
    this.clientInvoiceName = clientInvoiceName;
  }

  public String getClientInvoiceCode() {
    return this.clientInvoiceCode;
  }

  public void setClientInvoiceCode(String clientInvoiceCode) {
    this.clientInvoiceCode = clientInvoiceCode;
  }

  public String getClientInvoiceNo() {
    return this.clientInvoiceNo;
  }

  public void setClientInvoiceNo(String clientInvoiceNo) {
    this.clientInvoiceNo = clientInvoiceNo;
  }

  public String getClientGeneralPoNumber() {
    return this.clientGeneralPoNumber;
  }

  public void setClientGeneralPoNumber(String clientGeneralPoNumber) {
    this.clientGeneralPoNumber = clientGeneralPoNumber;
  }

  public String getClientPurchaseOrder() {
    return this.clientPurchaseOrder;
  }

  public void setClientPurchaseOrder(String clientPurchaseOrder) {
    this.clientPurchaseOrder = clientPurchaseOrder;
  }

  public long getClientTaxExempt() {
    return this.clientTaxExempt;
  }

  public void setClientTaxExempt(long clientTaxExempt) {
    this.clientTaxExempt = clientTaxExempt;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getBillThroughEntity() {
    return this.billThroughEntity;
  }

  public void setBillThroughEntity(String billThroughEntity) {
    this.billThroughEntity = billThroughEntity;
  }

  public String getBranch() {
    return this.branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public String getDivision() {
    return this.division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public String getBillingGroup() {
    return this.billingGroup;
  }

  public void setBillingGroup(String billingGroup) {
    this.billingGroup = billingGroup;
  }

  public java.sql.Timestamp getInvoiceFrom() {
    return this.invoiceFrom;
  }

  public void setInvoiceFrom(java.sql.Timestamp invoiceFrom) {
    this.invoiceFrom = invoiceFrom;
  }

  public java.sql.Timestamp getInvoiceDate() {
    return this.invoiceDate;
  }

  public void setInvoiceDate(java.sql.Timestamp invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public long getTerms() {
    return this.terms;
  }

  public void setTerms(long terms) {
    this.terms = terms;
  }

  public String getSiteManagerContactName() {
    return this.siteManagerContactName;
  }

  public void setSiteManagerContactName(String siteManagerContactName) {
    this.siteManagerContactName = siteManagerContactName;
  }

  public java.sql.Timestamp getPlacedDate() {
    return this.placedDate;
  }

  public void setPlacedDate(java.sql.Timestamp placedDate) {
    this.placedDate = placedDate;
  }

  public String getSiteManagerContactEmail() {
    return this.siteManagerContactEmail;
  }

  public void setSiteManagerContactEmail(String siteManagerContactEmail) {
    this.siteManagerContactEmail = siteManagerContactEmail;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getPayingThroughEntity() {
    return this.payingThroughEntity;
  }

  public void setPayingThroughEntity(String payingThroughEntity) {
    this.payingThroughEntity = payingThroughEntity;
  }

  public double getTaxRate() {
    return this.taxRate;
  }

  public void setTaxRate(double taxRate) {
    this.taxRate = taxRate;
  }

  public String getInvoiceConsolidationMethod() {
    return this.invoiceConsolidationMethod;
  }

  public void setInvoiceConsolidationMethod(String invoiceConsolidationMethod) {
    this.invoiceConsolidationMethod = invoiceConsolidationMethod;
  }

  public String getConsolidationCode() {
    return this.consolidationCode;
  }

  public void setConsolidationCode(String consolidationCode) {
    this.consolidationCode = consolidationCode;
  }

  public long getExportDataWhen() {
    return this.exportDataWhen;
  }

  public void setExportDataWhen(long exportDataWhen) {
    this.exportDataWhen = exportDataWhen;
  }

  public long getPaymentMethod() {
    return this.paymentMethod;
  }

  public void setPaymentMethod(long paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public String getExportDataTo() {
    return this.exportDataTo;
  }

  public void setExportDataTo(String exportDataTo) {
    this.exportDataTo = exportDataTo;
  }

  public String getCompanyNumber() {
    return this.companyNumber;
  }

  public void setCompanyNumber(String companyNumber) {
    this.companyNumber = companyNumber;
  }

  public String getBusinessNumber() {
    return this.businessNumber;
  }

  public void setBusinessNumber(String businessNumber) {
    this.businessNumber = businessNumber;
  }

  public String getInvoiceNo() {
    return this.invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public String getTimezone() {
    return this.timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public String getClientCostCenter() {
    return this.clientCostCenter;
  }

  public void setClientCostCenter(String clientCostCenter) {
    this.clientCostCenter = clientCostCenter;
  }

  public java.sql.Timestamp getInvoiceDueDate() {
    return this.invoiceDueDate;
  }

  public void setInvoiceDueDate(java.sql.Timestamp invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }

  public double getNetTotal() {
    return this.netTotal;
  }

  public void setNetTotal(double netTotal) {
    this.netTotal = netTotal;
  }

  public double getOtherInvoiceItemsTotal() {
    return this.otherInvoiceItemsTotal;
  }

  public void setOtherInvoiceItemsTotal(double otherInvoiceItemsTotal) {
    this.otherInvoiceItemsTotal = otherInvoiceItemsTotal;
  }

  public double getInvoiceTotal() {
    return this.invoiceTotal;
  }

  public void setInvoiceTotal(double invoiceTotal) {
    this.invoiceTotal = invoiceTotal;
  }

  public long getUseProfit() {
    return this.useProfit;
  }

  public void setUseProfit(long useProfit) {
    this.useProfit = useProfit;
  }

  public String getInvoiceMessage() {
    return this.invoiceMessage;
  }

  public void setInvoiceMessage(String invoiceMessage) {
    this.invoiceMessage = invoiceMessage;
  }

  public String getJobSiteName() {
    return this.jobSiteName;
  }

  public void setJobSiteName(String jobSiteName) {
    this.jobSiteName = jobSiteName;
  }

  public String getOtherInvoiceRecipients() {
    return this.otherInvoiceRecipients;
  }

  public void setOtherInvoiceRecipients(String otherInvoiceRecipients) {
    this.otherInvoiceRecipients = otherInvoiceRecipients;
  }

  public String getAstutePrimaryApproverId() {
    return this.astutePrimaryApproverId;
  }

  public void setAstutePrimaryApproverId(String astutePrimaryApproverId) {
    this.astutePrimaryApproverId = astutePrimaryApproverId;
  }

  public String getAstuteSecondaryApproverId() {
    return this.astuteSecondaryApproverId;
  }

  public void setAstuteSecondaryApproverId(String astuteSecondaryApproverId) {
    this.astuteSecondaryApproverId = astuteSecondaryApproverId;
  }

  public long getAstuteBillThroughEntity() {
    return this.astuteBillThroughEntity;
  }

  public void setAstuteBillThroughEntity(long astuteBillThroughEntity) {
    this.astuteBillThroughEntity = astuteBillThroughEntity;
  }

  public long getAstutePayThroughEntity() {
    return this.astutePayThroughEntity;
  }

  public void setAstutePayThroughEntity(long astutePayThroughEntity) {
    this.astutePayThroughEntity = astutePayThroughEntity;
  }

  public long getAstuteBillingGroupId() {
    return this.astuteBillingGroupId;
  }

  public void setAstuteBillingGroupId(long astuteBillingGroupId) {
    this.astuteBillingGroupId = astuteBillingGroupId;
  }

  public String getAstutePrimaryApproverName() {
    return this.astutePrimaryApproverName;
  }

  public void setAstutePrimaryApproverName(String astutePrimaryApproverName) {
    this.astutePrimaryApproverName = astutePrimaryApproverName;
  }

  public String getAstuteSecondaryApproverName() {
    return this.astuteSecondaryApproverName;
  }

  public void setAstuteSecondaryApproverName(String astuteSecondaryApproverName) {
    this.astuteSecondaryApproverName = astuteSecondaryApproverName;
  }

  public long getOfferLetterSignatoryUserId() {
    return this.offerLetterSignatoryUserId;
  }

  public void setOfferLetterSignatoryUserId(long offerLetterSignatoryUserId) {
    this.offerLetterSignatoryUserId = offerLetterSignatoryUserId;
  }

  public long getApprovalRequired() {
    return this.approvalRequired;
  }

  public void setApprovalRequired(long approvalRequired) {
    this.approvalRequired = approvalRequired;
  }

  public String getCandidateCompanyName() {
    return this.candidateCompanyName;
  }

  public void setCandidateCompanyName(String candidateCompanyName) {
    this.candidateCompanyName = candidateCompanyName;
  }

  public String getCandidateCompanyNumber() {
    return this.candidateCompanyNumber;
  }

  public void setCandidateCompanyNumber(String candidateCompanyNumber) {
    this.candidateCompanyNumber = candidateCompanyNumber;
  }

  public String getHomeCurrency() {
    return this.homeCurrency;
  }

  public void setHomeCurrency(String homeCurrency) {
    this.homeCurrency = homeCurrency;
  }

  public double getBankSpotRate() {
    return this.bankSpotRate;
  }

  public void setBankSpotRate(double bankSpotRate) {
    this.bankSpotRate = bankSpotRate;
  }

  public double getConversionTotal() {
    return this.conversionTotal;
  }

  public void setConversionTotal(double conversionTotal) {
    this.conversionTotal = conversionTotal;
  }

  public String getCompanyPaymentTerm() {
    return this.companyPaymentTerm;
  }

  public void setCompanyPaymentTerm(String companyPaymentTerm) {
    this.companyPaymentTerm = companyPaymentTerm;
  }

  public long getCompanyLocationId() {
    return this.companyLocationId;
  }

  public void setCompanyLocationId(long companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  public long getProposalSignatoryUserId() {
    return this.proposalSignatoryUserId;
  }

  public void setProposalSignatoryUserId(long proposalSignatoryUserId) {
    this.proposalSignatoryUserId = proposalSignatoryUserId;
  }

  public long getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }
}
