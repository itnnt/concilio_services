package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="invoice_account")
public class InvoiceAccount {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="code")
  private String code;

  @Column(name="description")
  private String description;

  @Column(name="enable_payment")
  private long enablePayment;

  @Column(name="invoice_tax_id")
  private long invoiceTaxId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


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

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public long getEnablePayment() {
    return this.enablePayment;
  }

  public void setEnablePayment(long enablePayment) {
    this.enablePayment = enablePayment;
  }

  public long getInvoiceTaxId() {
    return this.invoiceTaxId;
  }

  public void setInvoiceTaxId(long invoiceTaxId) {
    this.invoiceTaxId = invoiceTaxId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
