package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer_pay_charge_tax")
public class OfferPayChargeTax {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="pay_charge_id")
  private long payChargeId;

  @Column(name="tax_amount")
  private double taxAmount;

  @Column(name="tax_index")
  private long taxIndex;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPayChargeId() {
    return this.payChargeId;
  }

  public void setPayChargeId(long payChargeId) {
    this.payChargeId = payChargeId;
  }

  public double getTaxAmount() {
    return this.taxAmount;
  }

  public void setTaxAmount(double taxAmount) {
    this.taxAmount = taxAmount;
  }

  public long getTaxIndex() {
    return this.taxIndex;
  }

  public void setTaxIndex(long taxIndex) {
    this.taxIndex = taxIndex;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
