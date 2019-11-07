package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="invoice_log")
public class InvoiceLog {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="invoice_id")
  private long invoiceId;

  @Column(name="invoice_no")
  private String invoiceNo;

  @Column(name="invoice_type")
  private long invoiceType;

  @Column(name="invoice_sub_type")
  private long invoiceSubType;

  @Column(name="action_by_id")
  private long actionById;

  @Column(name="action_by_name")
  private String actionByName;

  @Column(name="note")
  private String note;

  @Column(name="invoice_log_type")
  private String invoiceLogType;

  @Column(name="company_id")
  private long companyId;

  @Column(name="parent_invoice_id")
  private long parentInvoiceId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


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

  public String getInvoiceNo() {
    return this.invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public long getInvoiceType() {
    return this.invoiceType;
  }

  public void setInvoiceType(long invoiceType) {
    this.invoiceType = invoiceType;
  }

  public long getInvoiceSubType() {
    return this.invoiceSubType;
  }

  public void setInvoiceSubType(long invoiceSubType) {
    this.invoiceSubType = invoiceSubType;
  }

  public long getActionById() {
    return this.actionById;
  }

  public void setActionById(long actionById) {
    this.actionById = actionById;
  }

  public String getActionByName() {
    return this.actionByName;
  }

  public void setActionByName(String actionByName) {
    this.actionByName = actionByName;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getInvoiceLogType() {
    return this.invoiceLogType;
  }

  public void setInvoiceLogType(String invoiceLogType) {
    this.invoiceLogType = invoiceLogType;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public long getParentInvoiceId() {
    return this.parentInvoiceId;
  }

  public void setParentInvoiceId(long parentInvoiceId) {
    this.parentInvoiceId = parentInvoiceId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
