package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="accounting_invoice_retainer")
public class AccountingInvoiceRetainer {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="accounting_invoice_id")
  private long accountingInvoiceId;

  @Column(name="profit_split_mode")
  private long profitSplitMode;

  @Column(name="profit_split_user_account_id")
  private long profitSplitUserAccountId;

  @Column(name="profit_split_percent")
  private double profitSplitPercent;

  @Column(name="profit_split_amount")
  private double profitSplitAmount;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getAccountingInvoiceId() {
    return this.accountingInvoiceId;
  }

  public void setAccountingInvoiceId(long accountingInvoiceId) {
    this.accountingInvoiceId = accountingInvoiceId;
  }

  public long getProfitSplitMode() {
    return this.profitSplitMode;
  }

  public void setProfitSplitMode(long profitSplitMode) {
    this.profitSplitMode = profitSplitMode;
  }

  public long getProfitSplitUserAccountId() {
    return this.profitSplitUserAccountId;
  }

  public void setProfitSplitUserAccountId(long profitSplitUserAccountId) {
    this.profitSplitUserAccountId = profitSplitUserAccountId;
  }

  public double getProfitSplitPercent() {
    return this.profitSplitPercent;
  }

  public void setProfitSplitPercent(double profitSplitPercent) {
    this.profitSplitPercent = profitSplitPercent;
  }

  public double getProfitSplitAmount() {
    return this.profitSplitAmount;
  }

  public void setProfitSplitAmount(double profitSplitAmount) {
    this.profitSplitAmount = profitSplitAmount;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
