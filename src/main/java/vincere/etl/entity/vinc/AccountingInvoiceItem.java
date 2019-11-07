package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="accounting_invoice_item")
public class AccountingInvoiceItem {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="invoice_id")
  private long invoiceId;

  @Column(name="item_name")
  private String itemName;

  @Column(name="quantity")
  private double quantity;

  @Column(name="rate")
  private double rate;

  @Column(name="discount")
  private double discount;

  @Column(name="tax_id")
  private long taxId;

  @Column(name="tax_name")
  private String taxName;

  @Column(name="tax")
  private double tax;

  @Column(name="account_id")
  private long accountId;

  @Column(name="total_amount")
  private double totalAmount;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="discount_amount")
  private double discountAmount;

  @Column(name="tax_amount")
  private double taxAmount;


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

  public String getItemName() {
    return this.itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public double getQuantity() {
    return this.quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  public double getRate() {
    return this.rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getDiscount() {
    return this.discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public long getTaxId() {
    return this.taxId;
  }

  public void setTaxId(long taxId) {
    this.taxId = taxId;
  }

  public String getTaxName() {
    return this.taxName;
  }

  public void setTaxName(String taxName) {
    this.taxName = taxName;
  }

  public double getTax() {
    return this.tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  public long getAccountId() {
    return this.accountId;
  }

  public void setAccountId(long accountId) {
    this.accountId = accountId;
  }

  public double getTotalAmount() {
    return this.totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public double getDiscountAmount() {
    return this.discountAmount;
  }

  public void setDiscountAmount(double discountAmount) {
    this.discountAmount = discountAmount;
  }

  public double getTaxAmount() {
    return this.taxAmount;
  }

  public void setTaxAmount(double taxAmount) {
    this.taxAmount = taxAmount;
  }
}
