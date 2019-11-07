package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="invoice_document")
public class InvoiceDocument {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="invoice_id")
  private long invoiceId;

  @Column(name="doc_id")
  private long docId;

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

  public long getDocId() {
    return this.docId;
  }

  public void setDocId(long docId) {
    this.docId = docId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
