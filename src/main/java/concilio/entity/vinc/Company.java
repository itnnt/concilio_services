package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="parent_id")
  private long parentId;

  @Column(name="name")
  private String name;

  @Column(name="switch_board")
  private String switchBoard;

  @Column(name="phone")
  private String phone;

  @Column(name="fax")
  private String fax;

  @Column(name="website")
  private String website;

  @Column(name="comment")
  private String comment;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="deleted_timestamp")
  private java.sql.Timestamp deletedTimestamp;

  @Column(name="company_owner_id")
  private long companyOwnerId;

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

  @Column(name="permanent_percentage")
  private double permanentPercentage;

  @Column(name="permanent_percentage_option")
  private long permanentPercentageOption;

  @Column(name="contract_percentage")
  private double contractPercentage;

  @Column(name="contract_percentage_option")
  private long contractPercentageOption;

  @Column(name="rss_urls")
  private String rssUrls;

  @Column(name="head_quarter")
  private String headQuarter;

  @Column(name="url_facebook")
  private String urlFacebook;

  @Column(name="url_linkedin")
  private String urlLinkedin;

  @Column(name="url_carrier_site")
  private String urlCarrierSite;

  @Column(name="org_company_id")
  private String orgCompanyId;

  @Column(name="trigger_index_update_timestamp")
  private java.sql.Timestamp triggerIndexUpdateTimestamp;

  @Column(name="logo_filename")
  private String logoFilename;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="company_owners")
  private String companyOwners;

  @Column(name="draft")
  private long draft;

  @Column(name="note")
  private String note;

  @Column(name="external_id")
  private String externalId;

  @Column(name="trading_name")
  private String tradingName;

  @Column(name="billing_group_name")
  private String billingGroupName;

  @Column(name="general_po_number")
  private String generalPoNumber;

  @Column(name="tax_exempt")
  private long taxExempt;

  @Column(name="hot_end_date")
  private java.sql.Timestamp hotEndDate;

  @Column(name="company_number")
  private String companyNumber;

  @Column(name="business_number")
  private String businessNumber;

  @Column(name="employees_number")
  private long employeesNumber;

  @Column(name="xero_contact_id")
  private String xeroContactId;

  @Column(name="company_owner_ids")
  private long companyOwnerIds;

  @Column(name="company_payment_term")
  private String companyPaymentTerm;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getParentId() {
    return this.parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSwitchBoard() {
    return this.switchBoard;
  }

  public void setSwitchBoard(String switchBoard) {
    this.switchBoard = switchBoard;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getFax() {
    return this.fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getWebsite() {
    return this.website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public String getComment() {
    return this.comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getDeletedTimestamp() {
    return this.deletedTimestamp;
  }

  public void setDeletedTimestamp(java.sql.Timestamp deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  public long getCompanyOwnerId() {
    return this.companyOwnerId;
  }

  public void setCompanyOwnerId(long companyOwnerId) {
    this.companyOwnerId = companyOwnerId;
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

  public double getPermanentPercentage() {
    return this.permanentPercentage;
  }

  public void setPermanentPercentage(double permanentPercentage) {
    this.permanentPercentage = permanentPercentage;
  }

  public long getPermanentPercentageOption() {
    return this.permanentPercentageOption;
  }

  public void setPermanentPercentageOption(long permanentPercentageOption) {
    this.permanentPercentageOption = permanentPercentageOption;
  }

  public double getContractPercentage() {
    return this.contractPercentage;
  }

  public void setContractPercentage(double contractPercentage) {
    this.contractPercentage = contractPercentage;
  }

  public long getContractPercentageOption() {
    return this.contractPercentageOption;
  }

  public void setContractPercentageOption(long contractPercentageOption) {
    this.contractPercentageOption = contractPercentageOption;
  }

  public String getRssUrls() {
    return this.rssUrls;
  }

  public void setRssUrls(String rssUrls) {
    this.rssUrls = rssUrls;
  }

  public String getHeadQuarter() {
    return this.headQuarter;
  }

  public void setHeadQuarter(String headQuarter) {
    this.headQuarter = headQuarter;
  }

  public String getUrlFacebook() {
    return this.urlFacebook;
  }

  public void setUrlFacebook(String urlFacebook) {
    this.urlFacebook = urlFacebook;
  }

  public String getUrlLinkedin() {
    return this.urlLinkedin;
  }

  public void setUrlLinkedin(String urlLinkedin) {
    this.urlLinkedin = urlLinkedin;
  }

  public String getUrlCarrierSite() {
    return this.urlCarrierSite;
  }

  public void setUrlCarrierSite(String urlCarrierSite) {
    this.urlCarrierSite = urlCarrierSite;
  }

  public String getOrgCompanyId() {
    return this.orgCompanyId;
  }

  public void setOrgCompanyId(String orgCompanyId) {
    this.orgCompanyId = orgCompanyId;
  }

  public java.sql.Timestamp getTriggerIndexUpdateTimestamp() {
    return this.triggerIndexUpdateTimestamp;
  }

  public void setTriggerIndexUpdateTimestamp(java.sql.Timestamp triggerIndexUpdateTimestamp) {
    this.triggerIndexUpdateTimestamp = triggerIndexUpdateTimestamp;
  }

  public String getLogoFilename() {
    return this.logoFilename;
  }

  public void setLogoFilename(String logoFilename) {
    this.logoFilename = logoFilename;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getCompanyOwners() {
    return this.companyOwners;
  }

  public void setCompanyOwners(String companyOwners) {
    this.companyOwners = companyOwners;
  }

  public long getDraft() {
    return this.draft;
  }

  public void setDraft(long draft) {
    this.draft = draft;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public String getTradingName() {
    return this.tradingName;
  }

  public void setTradingName(String tradingName) {
    this.tradingName = tradingName;
  }

  public String getBillingGroupName() {
    return this.billingGroupName;
  }

  public void setBillingGroupName(String billingGroupName) {
    this.billingGroupName = billingGroupName;
  }

  public String getGeneralPoNumber() {
    return this.generalPoNumber;
  }

  public void setGeneralPoNumber(String generalPoNumber) {
    this.generalPoNumber = generalPoNumber;
  }

  public long getTaxExempt() {
    return this.taxExempt;
  }

  public void setTaxExempt(long taxExempt) {
    this.taxExempt = taxExempt;
  }

  public java.sql.Timestamp getHotEndDate() {
    return this.hotEndDate;
  }

  public void setHotEndDate(java.sql.Timestamp hotEndDate) {
    this.hotEndDate = hotEndDate;
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

  public long getEmployeesNumber() {
    return this.employeesNumber;
  }

  public void setEmployeesNumber(long employeesNumber) {
    this.employeesNumber = employeesNumber;
  }

  public String getXeroContactId() {
    return this.xeroContactId;
  }

  public void setXeroContactId(String xeroContactId) {
    this.xeroContactId = xeroContactId;
  }

  public long getCompanyOwnerIds() {
    return this.companyOwnerIds;
  }

  public void setCompanyOwnerIds(long companyOwnerIds) {
    this.companyOwnerIds = companyOwnerIds;
  }

  public String getCompanyPaymentTerm() {
    return this.companyPaymentTerm;
  }

  public void setCompanyPaymentTerm(String companyPaymentTerm) {
    this.companyPaymentTerm = companyPaymentTerm;
  }
}
