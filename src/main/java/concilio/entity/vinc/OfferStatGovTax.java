package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer_stat_gov_tax")
public class OfferStatGovTax {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="tax_period_id")
  private long taxPeriodId;

  @Column(name="comp_setting_id")
  private long compSettingId;

  @Column(name="tax_value")
  private double taxValue;

  @Column(name="tax_amount_1")
  private double taxAmount1;

  @Column(name="tax_amount_2")
  private double taxAmount2;

  @Column(name="tax_amount_3")
  private double taxAmount3;

  @Column(name="tax_amount_4")
  private double taxAmount4;

  @Column(name="tax_amount_5")
  private double taxAmount5;

  @Column(name="tax_amount_6")
  private double taxAmount6;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="tax_allowance_amount_1")
  private double taxAllowanceAmount1;

  @Column(name="tax_allowance_amount_2")
  private double taxAllowanceAmount2;

  @Column(name="tax_allowance_amount_3")
  private double taxAllowanceAmount3;

  @Column(name="tax_allowance_amount_4")
  private double taxAllowanceAmount4;

  @Column(name="tax_allowance_amount_5")
  private double taxAllowanceAmount5;

  @Column(name="tax_allowance_amount_6")
  private double taxAllowanceAmount6;

  @Column(name="tax_allowance_amount_7")
  private double taxAllowanceAmount7;

  @Column(name="tax_allowance_amount_8")
  private double taxAllowanceAmount8;

  @Column(name="tax_allowance_amount_9")
  private double taxAllowanceAmount9;

  @Column(name="tax_allowance_amount_10")
  private double taxAllowanceAmount10;

  @Column(name="tax_allowance_amount_11")
  private double taxAllowanceAmount11;

  @Column(name="tax_allowance_amount_12")
  private double taxAllowanceAmount12;

  @Column(name="tax_allowance_amount_13")
  private double taxAllowanceAmount13;

  @Column(name="tax_allowance_amount_14")
  private double taxAllowanceAmount14;

  @Column(name="tax_allowance_amount_15")
  private double taxAllowanceAmount15;

  @Column(name="tax_allowance_amount_16")
  private double taxAllowanceAmount16;

  @Column(name="tax_allowance_amount_17")
  private double taxAllowanceAmount17;

  @Column(name="tax_allowance_amount_18")
  private double taxAllowanceAmount18;

  @Column(name="tax_allowance_amount_19")
  private double taxAllowanceAmount19;

  @Column(name="tax_allowance_amount_20")
  private double taxAllowanceAmount20;


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

  public double getTaxValue() {
    return this.taxValue;
  }

  public void setTaxValue(double taxValue) {
    this.taxValue = taxValue;
  }

  public double getTaxAmount1() {
    return this.taxAmount1;
  }

  public void setTaxAmount1(double taxAmount1) {
    this.taxAmount1 = taxAmount1;
  }

  public double getTaxAmount2() {
    return this.taxAmount2;
  }

  public void setTaxAmount2(double taxAmount2) {
    this.taxAmount2 = taxAmount2;
  }

  public double getTaxAmount3() {
    return this.taxAmount3;
  }

  public void setTaxAmount3(double taxAmount3) {
    this.taxAmount3 = taxAmount3;
  }

  public double getTaxAmount4() {
    return this.taxAmount4;
  }

  public void setTaxAmount4(double taxAmount4) {
    this.taxAmount4 = taxAmount4;
  }

  public double getTaxAmount5() {
    return this.taxAmount5;
  }

  public void setTaxAmount5(double taxAmount5) {
    this.taxAmount5 = taxAmount5;
  }

  public double getTaxAmount6() {
    return this.taxAmount6;
  }

  public void setTaxAmount6(double taxAmount6) {
    this.taxAmount6 = taxAmount6;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public double getTaxAllowanceAmount1() {
    return this.taxAllowanceAmount1;
  }

  public void setTaxAllowanceAmount1(double taxAllowanceAmount1) {
    this.taxAllowanceAmount1 = taxAllowanceAmount1;
  }

  public double getTaxAllowanceAmount2() {
    return this.taxAllowanceAmount2;
  }

  public void setTaxAllowanceAmount2(double taxAllowanceAmount2) {
    this.taxAllowanceAmount2 = taxAllowanceAmount2;
  }

  public double getTaxAllowanceAmount3() {
    return this.taxAllowanceAmount3;
  }

  public void setTaxAllowanceAmount3(double taxAllowanceAmount3) {
    this.taxAllowanceAmount3 = taxAllowanceAmount3;
  }

  public double getTaxAllowanceAmount4() {
    return this.taxAllowanceAmount4;
  }

  public void setTaxAllowanceAmount4(double taxAllowanceAmount4) {
    this.taxAllowanceAmount4 = taxAllowanceAmount4;
  }

  public double getTaxAllowanceAmount5() {
    return this.taxAllowanceAmount5;
  }

  public void setTaxAllowanceAmount5(double taxAllowanceAmount5) {
    this.taxAllowanceAmount5 = taxAllowanceAmount5;
  }

  public double getTaxAllowanceAmount6() {
    return this.taxAllowanceAmount6;
  }

  public void setTaxAllowanceAmount6(double taxAllowanceAmount6) {
    this.taxAllowanceAmount6 = taxAllowanceAmount6;
  }

  public double getTaxAllowanceAmount7() {
    return this.taxAllowanceAmount7;
  }

  public void setTaxAllowanceAmount7(double taxAllowanceAmount7) {
    this.taxAllowanceAmount7 = taxAllowanceAmount7;
  }

  public double getTaxAllowanceAmount8() {
    return this.taxAllowanceAmount8;
  }

  public void setTaxAllowanceAmount8(double taxAllowanceAmount8) {
    this.taxAllowanceAmount8 = taxAllowanceAmount8;
  }

  public double getTaxAllowanceAmount9() {
    return this.taxAllowanceAmount9;
  }

  public void setTaxAllowanceAmount9(double taxAllowanceAmount9) {
    this.taxAllowanceAmount9 = taxAllowanceAmount9;
  }

  public double getTaxAllowanceAmount10() {
    return this.taxAllowanceAmount10;
  }

  public void setTaxAllowanceAmount10(double taxAllowanceAmount10) {
    this.taxAllowanceAmount10 = taxAllowanceAmount10;
  }

  public double getTaxAllowanceAmount11() {
    return this.taxAllowanceAmount11;
  }

  public void setTaxAllowanceAmount11(double taxAllowanceAmount11) {
    this.taxAllowanceAmount11 = taxAllowanceAmount11;
  }

  public double getTaxAllowanceAmount12() {
    return this.taxAllowanceAmount12;
  }

  public void setTaxAllowanceAmount12(double taxAllowanceAmount12) {
    this.taxAllowanceAmount12 = taxAllowanceAmount12;
  }

  public double getTaxAllowanceAmount13() {
    return this.taxAllowanceAmount13;
  }

  public void setTaxAllowanceAmount13(double taxAllowanceAmount13) {
    this.taxAllowanceAmount13 = taxAllowanceAmount13;
  }

  public double getTaxAllowanceAmount14() {
    return this.taxAllowanceAmount14;
  }

  public void setTaxAllowanceAmount14(double taxAllowanceAmount14) {
    this.taxAllowanceAmount14 = taxAllowanceAmount14;
  }

  public double getTaxAllowanceAmount15() {
    return this.taxAllowanceAmount15;
  }

  public void setTaxAllowanceAmount15(double taxAllowanceAmount15) {
    this.taxAllowanceAmount15 = taxAllowanceAmount15;
  }

  public double getTaxAllowanceAmount16() {
    return this.taxAllowanceAmount16;
  }

  public void setTaxAllowanceAmount16(double taxAllowanceAmount16) {
    this.taxAllowanceAmount16 = taxAllowanceAmount16;
  }

  public double getTaxAllowanceAmount17() {
    return this.taxAllowanceAmount17;
  }

  public void setTaxAllowanceAmount17(double taxAllowanceAmount17) {
    this.taxAllowanceAmount17 = taxAllowanceAmount17;
  }

  public double getTaxAllowanceAmount18() {
    return this.taxAllowanceAmount18;
  }

  public void setTaxAllowanceAmount18(double taxAllowanceAmount18) {
    this.taxAllowanceAmount18 = taxAllowanceAmount18;
  }

  public double getTaxAllowanceAmount19() {
    return this.taxAllowanceAmount19;
  }

  public void setTaxAllowanceAmount19(double taxAllowanceAmount19) {
    this.taxAllowanceAmount19 = taxAllowanceAmount19;
  }

  public double getTaxAllowanceAmount20() {
    return this.taxAllowanceAmount20;
  }

  public void setTaxAllowanceAmount20(double taxAllowanceAmount20) {
    this.taxAllowanceAmount20 = taxAllowanceAmount20;
  }
}
