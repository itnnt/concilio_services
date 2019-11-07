package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="accounting_invoice")
public class AccountingInvoice {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="company_id")
  private long companyId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="position_id")
  private long positionId;

  @Column(name="location_id")
  private long locationId;

  @Column(name="invoice_no")
  private String invoiceNo;

  @Column(name="sale_original_invoice_no")
  private long saleOriginalInvoiceNo;

  @Column(name="purchase_original_invoice_no")
  private long purchaseOriginalInvoiceNo;

  @Column(name="credit_original_invoice_no")
  private long creditOriginalInvoiceNo;

  @Column(name="invoice_date")
  private java.sql.Timestamp invoiceDate;

  @Column(name="due_date")
  private java.sql.Timestamp dueDate;

  @Column(name="reference")
  private String reference;

  @Column(name="invoice_status")
  private long invoiceStatus;

  @Column(name="invoice_type")
  private long invoiceType;

  @Column(name="tax_inclusive")
  private long taxInclusive;

  @Column(name="term")
  private long term;

  @Column(name="currency")
  private String currency;

  @Column(name="parent_id")
  private long parentId;

  @Column(name="total_amount")
  private double totalAmount;

  @Column(name="sub_total_amount")
  private double subTotalAmount;

  @Column(name="tax_amount")
  private double taxAmount;

  @Column(name="discount_amount")
  private double discountAmount;

  @Column(name="amount_due")
  private double amountDue;

  @Column(name="amount_paid")
  private double amountPaid;

  @Column(name="last_update_by")
  private long lastUpdateBy;

  @Column(name="last_update_date")
  private java.sql.Timestamp lastUpdateDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="alloc_amount")
  private double allocAmount;

  @Column(name="document_builder_id")
  private long documentBuilderId;

  @Column(name="send_status")
  private long sendStatus;

  @Column(name="approved_date")
  private java.sql.Timestamp approvedDate;

  @Column(name="timesheet_id")
  private long timesheetId;

  @Column(name="invoice_sub_type")
  private long invoiceSubType;

  @Column(name="home_currency")
  private String homeCurrency;

  @Column(name="bank_spot_rate")
  private double bankSpotRate;

  @Column(name="conversion_total")
  private double conversionTotal;

  @Column(name="pay_calculation_type")
  private long payCalculationType;

  @Column(name="billing_type")
  private String billingType;


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

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public String getInvoiceNo() {
    return this.invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public long getSaleOriginalInvoiceNo() {
    return this.saleOriginalInvoiceNo;
  }

  public void setSaleOriginalInvoiceNo(long saleOriginalInvoiceNo) {
    this.saleOriginalInvoiceNo = saleOriginalInvoiceNo;
  }

  public long getPurchaseOriginalInvoiceNo() {
    return this.purchaseOriginalInvoiceNo;
  }

  public void setPurchaseOriginalInvoiceNo(long purchaseOriginalInvoiceNo) {
    this.purchaseOriginalInvoiceNo = purchaseOriginalInvoiceNo;
  }

  public long getCreditOriginalInvoiceNo() {
    return this.creditOriginalInvoiceNo;
  }

  public void setCreditOriginalInvoiceNo(long creditOriginalInvoiceNo) {
    this.creditOriginalInvoiceNo = creditOriginalInvoiceNo;
  }

  public java.sql.Timestamp getInvoiceDate() {
    return this.invoiceDate;
  }

  public void setInvoiceDate(java.sql.Timestamp invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public java.sql.Timestamp getDueDate() {
    return this.dueDate;
  }

  public void setDueDate(java.sql.Timestamp dueDate) {
    this.dueDate = dueDate;
  }

  public String getReference() {
    return this.reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public long getInvoiceStatus() {
    return this.invoiceStatus;
  }

  public void setInvoiceStatus(long invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }

  public long getInvoiceType() {
    return this.invoiceType;
  }

  public void setInvoiceType(long invoiceType) {
    this.invoiceType = invoiceType;
  }

  public long getTaxInclusive() {
    return this.taxInclusive;
  }

  public void setTaxInclusive(long taxInclusive) {
    this.taxInclusive = taxInclusive;
  }

  public long getTerm() {
    return this.term;
  }

  public void setTerm(long term) {
    this.term = term;
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public long getParentId() {
    return this.parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }

  public double getTotalAmount() {
    return this.totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public double getSubTotalAmount() {
    return this.subTotalAmount;
  }

  public void setSubTotalAmount(double subTotalAmount) {
    this.subTotalAmount = subTotalAmount;
  }

  public double getTaxAmount() {
    return this.taxAmount;
  }

  public void setTaxAmount(double taxAmount) {
    this.taxAmount = taxAmount;
  }

  public double getDiscountAmount() {
    return this.discountAmount;
  }

  public void setDiscountAmount(double discountAmount) {
    this.discountAmount = discountAmount;
  }

  public double getAmountDue() {
    return this.amountDue;
  }

  public void setAmountDue(double amountDue) {
    this.amountDue = amountDue;
  }

  public double getAmountPaid() {
    return this.amountPaid;
  }

  public void setAmountPaid(double amountPaid) {
    this.amountPaid = amountPaid;
  }

  public long getLastUpdateBy() {
    return this.lastUpdateBy;
  }

  public void setLastUpdateBy(long lastUpdateBy) {
    this.lastUpdateBy = lastUpdateBy;
  }

  public java.sql.Timestamp getLastUpdateDate() {
    return this.lastUpdateDate;
  }

  public void setLastUpdateDate(java.sql.Timestamp lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public double getAllocAmount() {
    return this.allocAmount;
  }

  public void setAllocAmount(double allocAmount) {
    this.allocAmount = allocAmount;
  }

  public long getDocumentBuilderId() {
    return this.documentBuilderId;
  }

  public void setDocumentBuilderId(long documentBuilderId) {
    this.documentBuilderId = documentBuilderId;
  }

  public long getSendStatus() {
    return this.sendStatus;
  }

  public void setSendStatus(long sendStatus) {
    this.sendStatus = sendStatus;
  }

  public java.sql.Timestamp getApprovedDate() {
    return this.approvedDate;
  }

  public void setApprovedDate(java.sql.Timestamp approvedDate) {
    this.approvedDate = approvedDate;
  }

  public long getTimesheetId() {
    return this.timesheetId;
  }

  public void setTimesheetId(long timesheetId) {
    this.timesheetId = timesheetId;
  }

  public long getInvoiceSubType() {
    return this.invoiceSubType;
  }

  public void setInvoiceSubType(long invoiceSubType) {
    this.invoiceSubType = invoiceSubType;
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

  public long getPayCalculationType() {
    return this.payCalculationType;
  }

  public void setPayCalculationType(long payCalculationType) {
    this.payCalculationType = payCalculationType;
  }

  public String getBillingType() {
    return this.billingType;
  }

  public void setBillingType(String billingType) {
    this.billingType = billingType;
  }
}
