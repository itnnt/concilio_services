package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deal_cost_of_sale")
public class DealCostOfSale {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="deal_id")
  private long dealId;

  @Column(name="description")
  private String description;

  @Column(name="quantity")
  private double quantity;

  @Column(name="rate")
  private double rate;

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

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
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
