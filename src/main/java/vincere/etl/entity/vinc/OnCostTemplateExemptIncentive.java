package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="on_cost_template_exempt_incentive")
public class OnCostTemplateExemptIncentive {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="on_cost_template_id")
  private long onCostTemplateId;

  @Column(name="name")
  private String name;

  @Column(name="type")
  private long type;

  @Column(name="amount")
  private double amount;

  @Column(name="add_to_margin")
  private long addToMargin;

  @Column(name="add_to_pay_rate")
  private long addToPayRate;

  @Column(name="add_to_charge_rate")
  private long addToChargeRate;

  @Column(name="budget_by")
  private long budgetBy;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getOnCostTemplateId() {
    return this.onCostTemplateId;
  }

  public void setOnCostTemplateId(long onCostTemplateId) {
    this.onCostTemplateId = onCostTemplateId;
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

  public long getBudgetBy() {
    return this.budgetBy;
  }

  public void setBudgetBy(long budgetBy) {
    this.budgetBy = budgetBy;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
