package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="offer_optional_factor")
public class OfferOptionalFactor {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="comp_setting_id")
  private long compSettingId;

  @Column(name="pay_interval")
  private long payInterval;

  @Column(name="pay_amount")
  private double payAmount;

  @Column(name="handling_fee")
  private double handlingFee;

  @Column(name="charge_amount")
  private double chargeAmount;

  @Column(name="pay_period")
  private long payPeriod;

  @Column(name="custom_description")
  private String customDescription;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


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

  public long getCompSettingId() {
    return this.compSettingId;
  }

  public void setCompSettingId(long compSettingId) {
    this.compSettingId = compSettingId;
  }

  public long getPayInterval() {
    return this.payInterval;
  }

  public void setPayInterval(long payInterval) {
    this.payInterval = payInterval;
  }

  public double getPayAmount() {
    return this.payAmount;
  }

  public void setPayAmount(double payAmount) {
    this.payAmount = payAmount;
  }

  public double getHandlingFee() {
    return this.handlingFee;
  }

  public void setHandlingFee(double handlingFee) {
    this.handlingFee = handlingFee;
  }

  public double getChargeAmount() {
    return this.chargeAmount;
  }

  public void setChargeAmount(double chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public long getPayPeriod() {
    return this.payPeriod;
  }

  public void setPayPeriod(long payPeriod) {
    this.payPeriod = payPeriod;
  }

  public String getCustomDescription() {
    return this.customDescription;
  }

  public void setCustomDescription(String customDescription) {
    this.customDescription = customDescription;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
