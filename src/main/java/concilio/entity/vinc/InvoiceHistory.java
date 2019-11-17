package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoice_history")
public class InvoiceHistory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="invoice_id")
  private long invoiceId;

  @Column(name="action_by")
  private long actionBy;

  @Column(name="action_type")
  private long actionType;

  @Column(name="content")
  private String content;

  @Column(name="company_id")
  private long companyId;

  @Column(name="total_amount")
  private double totalAmount;

  @Column(name="receive_amount")
  private double receiveAmount;

  @Column(name="remain_amount")
  private double remainAmount;

  @Column(name="paid_account_no")
  private String paidAccountNo;

  @Column(name="url")
  private String url;

  @Column(name="due_amount")
  private double dueAmount;

  @Column(name="parent_invoice_no")
  private String parentInvoiceNo;

  @Column(name="parent_due_amount")
  private double parentDueAmount;

  @Column(name="alloc_amount")
  private double allocAmount;

  @Column(name="invoice_no")
  private String invoiceNo;

  @Column(name="previous_invoice_no")
  private String previousInvoiceNo;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="candidate_company_name")
  private String candidateCompanyName;

  @Column(name="pay_calculation_type")
  private long payCalculationType;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getInvoiceId() {
    return this.invoiceId;
  }

  public void setInvoiceId(long invoiceId) {
    this.invoiceId = invoiceId;
  }

  public long getActionBy() {
    return this.actionBy;
  }

  public void setActionBy(long actionBy) {
    this.actionBy = actionBy;
  }

  public long getActionType() {
    return this.actionType;
  }

  public void setActionType(long actionType) {
    this.actionType = actionType;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public double getTotalAmount() {
    return this.totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public double getReceiveAmount() {
    return this.receiveAmount;
  }

  public void setReceiveAmount(double receiveAmount) {
    this.receiveAmount = receiveAmount;
  }

  public double getRemainAmount() {
    return this.remainAmount;
  }

  public void setRemainAmount(double remainAmount) {
    this.remainAmount = remainAmount;
  }

  public String getPaidAccountNo() {
    return this.paidAccountNo;
  }

  public void setPaidAccountNo(String paidAccountNo) {
    this.paidAccountNo = paidAccountNo;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public double getDueAmount() {
    return this.dueAmount;
  }

  public void setDueAmount(double dueAmount) {
    this.dueAmount = dueAmount;
  }

  public String getParentInvoiceNo() {
    return this.parentInvoiceNo;
  }

  public void setParentInvoiceNo(String parentInvoiceNo) {
    this.parentInvoiceNo = parentInvoiceNo;
  }

  public double getParentDueAmount() {
    return this.parentDueAmount;
  }

  public void setParentDueAmount(double parentDueAmount) {
    this.parentDueAmount = parentDueAmount;
  }

  public double getAllocAmount() {
    return this.allocAmount;
  }

  public void setAllocAmount(double allocAmount) {
    this.allocAmount = allocAmount;
  }

  public String getInvoiceNo() {
    return this.invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public String getPreviousInvoiceNo() {
    return this.previousInvoiceNo;
  }

  public void setPreviousInvoiceNo(String previousInvoiceNo) {
    this.previousInvoiceNo = previousInvoiceNo;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getCandidateCompanyName() {
    return this.candidateCompanyName;
  }

  public void setCandidateCompanyName(String candidateCompanyName) {
    this.candidateCompanyName = candidateCompanyName;
  }

  public long getPayCalculationType() {
    return this.payCalculationType;
  }

  public void setPayCalculationType(long payCalculationType) {
    this.payCalculationType = payCalculationType;
  }
}
