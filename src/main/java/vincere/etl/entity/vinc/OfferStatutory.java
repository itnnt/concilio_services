package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="offer_statutory")
public class OfferStatutory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="description")
  private String description;

  @Column(name="employer_percent")
  private double employerPercent;

  @Column(name="employee_percent")
  private double employeePercent;

  @Column(name="employer_amount")
  private double employerAmount;

  @Column(name="employee_amount")
  private double employeeAmount;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

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

  @Column(name="amount")
  private double amount;

  @Column(name="type")
  private long type;


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

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getEmployerPercent() {
    return this.employerPercent;
  }

  public void setEmployerPercent(double employerPercent) {
    this.employerPercent = employerPercent;
  }

  public double getEmployeePercent() {
    return this.employeePercent;
  }

  public void setEmployeePercent(double employeePercent) {
    this.employeePercent = employeePercent;
  }

  public double getEmployerAmount() {
    return this.employerAmount;
  }

  public void setEmployerAmount(double employerAmount) {
    this.employerAmount = employerAmount;
  }

  public double getEmployeeAmount() {
    return this.employeeAmount;
  }

  public void setEmployeeAmount(double employeeAmount) {
    this.employeeAmount = employeeAmount;
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

  public double getAmount() {
    return this.amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public long getType() {
    return this.type;
  }

  public void setType(long type) {
    this.type = type;
  }
}
