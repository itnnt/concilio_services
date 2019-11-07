package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="offer_revenue_split")
public class OfferRevenueSplit {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="user_id")
  private long userId;

  @Column(name="shared")
  private double shared;

  @Column(name="amount")
  private double amount;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="astute_user_id")
  private String astuteUserId;

  @Column(name="astute_user_name")
  private String astuteUserName;

  @Column(name="profit_split_mode")
  private long profitSplitMode;


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

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public double getShared() {
    return this.shared;
  }

  public void setShared(double shared) {
    this.shared = shared;
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

  public String getAstuteUserId() {
    return this.astuteUserId;
  }

  public void setAstuteUserId(String astuteUserId) {
    this.astuteUserId = astuteUserId;
  }

  public String getAstuteUserName() {
    return this.astuteUserName;
  }

  public void setAstuteUserName(String astuteUserName) {
    this.astuteUserName = astuteUserName;
  }

  public long getProfitSplitMode() {
    return this.profitSplitMode;
  }

  public void setProfitSplitMode(long profitSplitMode) {
    this.profitSplitMode = profitSplitMode;
  }
}
