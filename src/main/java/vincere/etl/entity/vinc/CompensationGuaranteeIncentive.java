package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="compensation_guarantee_incentive")
public class CompensationGuaranteeIncentive {


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

  @Column(name="add_to_margin")
  private long addToMargin;

  @Column(name="salary_sacrifice")
  private double salarySacrifice;

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

  public long getAddToMargin() {
    return this.addToMargin;
  }

  public void setAddToMargin(long addToMargin) {
    this.addToMargin = addToMargin;
  }

  public double getSalarySacrifice() {
    return this.salarySacrifice;
  }

  public void setSalarySacrifice(double salarySacrifice) {
    this.salarySacrifice = salarySacrifice;
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
