package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="offer_pay_charge")
public class OfferPayCharge {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="tax_period_id")
  private long taxPeriodId;

  @Column(name="comp_setting_id")
  private long compSettingId;

  @Column(name="pay_rate")
  private double payRate;

  @Column(name="shift_percent")
  private double shiftPercent;

  @Column(name="gov_tax")
  private double govTax;

  @Column(name="total_pay_rate")
  private double totalPayRate;

  @Column(name="profit")
  private double profit;

  @Column(name="charge_rate")
  private double chargeRate;

  @Column(name="margin_percent")
  private double marginPercent;

  @Column(name="markup_percent")
  private double markupPercent;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="on_cost")
  private double onCost;

  @Column(name="tax_period_id_bk")
  private long taxPeriodIdBk;


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

  public long getTaxPeriodId() {
    return this.taxPeriodId;
  }

  public void setTaxPeriodId(long taxPeriodId) {
    this.taxPeriodId = taxPeriodId;
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

  public double getShiftPercent() {
    return this.shiftPercent;
  }

  public void setShiftPercent(double shiftPercent) {
    this.shiftPercent = shiftPercent;
  }

  public double getGovTax() {
    return this.govTax;
  }

  public void setGovTax(double govTax) {
    this.govTax = govTax;
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

  public double getMarginPercent() {
    return this.marginPercent;
  }

  public void setMarginPercent(double marginPercent) {
    this.marginPercent = marginPercent;
  }

  public double getMarkupPercent() {
    return this.markupPercent;
  }

  public void setMarkupPercent(double markupPercent) {
    this.markupPercent = markupPercent;
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

  public long getTaxPeriodIdBk() {
    return this.taxPeriodIdBk;
  }

  public void setTaxPeriodIdBk(long taxPeriodIdBk) {
    this.taxPeriodIdBk = taxPeriodIdBk;
  }
}
