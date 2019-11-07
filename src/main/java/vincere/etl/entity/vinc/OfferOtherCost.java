package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="offer_other_cost")
public class OfferOtherCost {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="name")
  private String name;

  @Column(name="amount")
  private double amount;

  @Column(name="description")
  private String description;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="type")
  private long type;

  @Column(name="add_to_margin")
  private long addToMargin;

  @Column(name="add_to_pay_rate")
  private long addToPayRate;

  @Column(name="add_to_charge_rate")
  private long addToChargeRate;

  @Column(name="total_amount")
  private double totalAmount;

  @Column(name="profit")
  private double profit;

  @Column(name="pay_amount")
  private double payAmount;

  @Column(name="charge_amount")
  private double chargeAmount;


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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAmount() {
    return this.amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getType() {
    return this.type;
  }

  public void setType(long type) {
    this.type = type;
  }

  public long getAddToMargin() {
    return this.addToMargin;
  }

  public void setAddToMargin(long addToMargin) {
    this.addToMargin = addToMargin;
  }

  public long getAddToPayRate() {
    return this.addToPayRate;
  }

  public void setAddToPayRate(long addToPayRate) {
    this.addToPayRate = addToPayRate;
  }

  public long getAddToChargeRate() {
    return this.addToChargeRate;
  }

  public void setAddToChargeRate(long addToChargeRate) {
    this.addToChargeRate = addToChargeRate;
  }

  public double getTotalAmount() {
    return this.totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public double getProfit() {
    return this.profit;
  }

  public void setProfit(double profit) {
    this.profit = profit;
  }

  public double getPayAmount() {
    return this.payAmount;
  }

  public void setPayAmount(double payAmount) {
    this.payAmount = payAmount;
  }

  public double getChargeAmount() {
    return this.chargeAmount;
  }

  public void setChargeAmount(double chargeAmount) {
    this.chargeAmount = chargeAmount;
  }
}
