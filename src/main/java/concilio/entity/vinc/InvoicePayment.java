package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoice_payment")
public class InvoicePayment {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="invoice_id")
  private long invoiceId;

  @Column(name="receive_amount")
  private double receiveAmount;

  @Column(name="paid_to_account_id")
  private long paidToAccountId;

  @Column(name="payment_date")
  private java.sql.Timestamp paymentDate;

  @Column(name="invoice_type")
  private long invoiceType;

  @Column(name="note")
  private String note;

  @Column(name="paid_by")
  private long paidBy;

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

  public double getReceiveAmount() {
    return this.receiveAmount;
  }

  public void setReceiveAmount(double receiveAmount) {
    this.receiveAmount = receiveAmount;
  }

  public long getPaidToAccountId() {
    return this.paidToAccountId;
  }

  public void setPaidToAccountId(long paidToAccountId) {
    this.paidToAccountId = paidToAccountId;
  }

  public java.sql.Timestamp getPaymentDate() {
    return this.paymentDate;
  }

  public void setPaymentDate(java.sql.Timestamp paymentDate) {
    this.paymentDate = paymentDate;
  }

  public long getInvoiceType() {
    return this.invoiceType;
  }

  public void setInvoiceType(long invoiceType) {
    this.invoiceType = invoiceType;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public long getPaidBy() {
    return this.paidBy;
  }

  public void setPaidBy(long paidBy) {
    this.paidBy = paidBy;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
