package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compensation_exempt_incentive")
public class CompensationExemptIncentive {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="compensation_id")
  private long compensationId;

  @Column(name="name")
  private String name;

  @Column(name="type")
  private long type;

  @Column(name="amount")
  private double amount;

  @Column(name="description")
  private String description;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="budget_by")
  private long budgetBy;

  @Column(name="add_to_margin")
  private long addToMargin;

  @Column(name="total_amount")
  private double totalAmount;

  @Column(name="profit")
  private double profit;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCompensationId() {
    return this.compensationId;
  }

  public void setCompensationId(long compensationId) {
    this.compensationId = compensationId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getType() {
    return this.type;
  }

  public void setType(long type) {
    this.type = type;
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

  public long getBudgetBy() {
    return this.budgetBy;
  }

  public void setBudgetBy(long budgetBy) {
    this.budgetBy = budgetBy;
  }

  public long getAddToMargin() {
    return this.addToMargin;
  }

  public void setAddToMargin(long addToMargin) {
    this.addToMargin = addToMargin;
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
}
