package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="brand_invoice_setting")
public class BrandInvoiceSetting {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="team_group_id")
  private long teamGroupId;

  @Column(name="company_name")
  private String companyName;

  @Column(name="company_address")
  private String companyAddress;

  @Column(name="company_tax_name")
  private String companyTaxName;

  @Column(name="company_tax_number")
  private String companyTaxNumber;

  @Column(name="company_telephone")
  private String companyTelephone;

  @Column(name="company_fax")
  private String companyFax;

  @Column(name="tax_code_type")
  private String taxCodeType;

  @Column(name="your_contact_detail")
  private String yourContactDetail;

  @Column(name="terms_payment_advice")
  private String termsPaymentAdvice;

  @Column(name="sales_invoice")
  private String salesInvoice;

  @Column(name="purchase_invoice")
  private String purchaseInvoice;

  @Column(name="credit_invoice")
  private String creditInvoice;

  @Column(name="draft_quotation_title")
  private String draftQuotationTitle;

  @Column(name="quotation_title")
  private String quotationTitle;

  @Column(name="quotation_terms")
  private String quotationTerms;

  @Column(name="business_number")
  private String businessNumber;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getTeamGroupId() {
    return this.teamGroupId;
  }

  public void setTeamGroupId(long teamGroupId) {
    this.teamGroupId = teamGroupId;
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getCompanyAddress() {
    return this.companyAddress;
  }

  public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
  }

  public String getCompanyTaxName() {
    return this.companyTaxName;
  }

  public void setCompanyTaxName(String companyTaxName) {
    this.companyTaxName = companyTaxName;
  }

  public String getCompanyTaxNumber() {
    return this.companyTaxNumber;
  }

  public void setCompanyTaxNumber(String companyTaxNumber) {
    this.companyTaxNumber = companyTaxNumber;
  }

  public String getCompanyTelephone() {
    return this.companyTelephone;
  }

  public void setCompanyTelephone(String companyTelephone) {
    this.companyTelephone = companyTelephone;
  }

  public String getCompanyFax() {
    return this.companyFax;
  }

  public void setCompanyFax(String companyFax) {
    this.companyFax = companyFax;
  }

  public String getTaxCodeType() {
    return this.taxCodeType;
  }

  public void setTaxCodeType(String taxCodeType) {
    this.taxCodeType = taxCodeType;
  }

  public String getYourContactDetail() {
    return this.yourContactDetail;
  }

  public void setYourContactDetail(String yourContactDetail) {
    this.yourContactDetail = yourContactDetail;
  }

  public String getTermsPaymentAdvice() {
    return this.termsPaymentAdvice;
  }

  public void setTermsPaymentAdvice(String termsPaymentAdvice) {
    this.termsPaymentAdvice = termsPaymentAdvice;
  }

  public String getSalesInvoice() {
    return this.salesInvoice;
  }

  public void setSalesInvoice(String salesInvoice) {
    this.salesInvoice = salesInvoice;
  }

  public String getPurchaseInvoice() {
    return this.purchaseInvoice;
  }

  public void setPurchaseInvoice(String purchaseInvoice) {
    this.purchaseInvoice = purchaseInvoice;
  }

  public String getCreditInvoice() {
    return this.creditInvoice;
  }

  public void setCreditInvoice(String creditInvoice) {
    this.creditInvoice = creditInvoice;
  }

  public String getDraftQuotationTitle() {
    return this.draftQuotationTitle;
  }

  public void setDraftQuotationTitle(String draftQuotationTitle) {
    this.draftQuotationTitle = draftQuotationTitle;
  }

  public String getQuotationTitle() {
    return this.quotationTitle;
  }

  public void setQuotationTitle(String quotationTitle) {
    this.quotationTitle = quotationTitle;
  }

  public String getQuotationTerms() {
    return this.quotationTerms;
  }

  public void setQuotationTerms(String quotationTerms) {
    this.quotationTerms = quotationTerms;
  }

  public String getBusinessNumber() {
    return this.businessNumber;
  }

  public void setBusinessNumber(String businessNumber) {
    this.businessNumber = businessNumber;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
