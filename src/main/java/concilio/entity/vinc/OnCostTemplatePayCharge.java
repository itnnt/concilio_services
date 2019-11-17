package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="on_cost_template_pay_charge")
public class OnCostTemplatePayCharge {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="on_cost_template_id")
  private long onCostTemplateId;

  @Column(name="comp_setting_id")
  private long compSettingId;

  @Column(name="pay_rate")
  private double payRate;

  @Column(name="total_pay_rate")
  private double totalPayRate;

  @Column(name="profit")
  private double profit;

  @Column(name="charge_rate")
  private double chargeRate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="on_cost")
  private double onCost;


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

  public long getCompSettingId() {
    return this.compSettingId;
  }

  public void setCompSettingId(long compSettingId) {
    this.compSettingId = compSettingId;
  }

  public double getPayRate() {
    return this.payRate;
  }

  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }

  public double getTotalPayRate() {
    return this.totalPayRate;
  }

  public void setTotalPayRate(double totalPayRate) {
    this.totalPayRate = totalPayRate;
  }

  public double getProfit() {
    return this.profit;
  }

  public void setProfit(double profit) {
    this.profit = profit;
  }

  public double getChargeRate() {
    return this.chargeRate;
  }

  public void setChargeRate(double chargeRate) {
    this.chargeRate = chargeRate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public double getOnCost() {
    return this.onCost;
  }

  public void setOnCost(double onCost) {
    this.onCost = onCost;
  }
}
