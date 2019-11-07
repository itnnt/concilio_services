package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="deal_profit_split")
public class DealProfitSplit {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="deal_id")
  private long dealId;

  @Column(name="mode")
  private long mode;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="percent")
  private double percent;

  @Column(name="amount")
  private double amount;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getDealId() {
    return this.dealId;
  }

  public void setDealId(long dealId) {
    this.dealId = dealId;
  }

  public long getMode() {
    return this.mode;
  }

  public void setMode(long mode) {
    this.mode = mode;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public double getPercent() {
    return this.percent;
  }

  public void setPercent(double percent) {
    this.percent = percent;
  }

  public double getAmount() {
    return this.amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
