package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer_invoice_item")
public class OfferInvoiceItem {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="item_name")
  private String itemName;

  @Column(name="item_quantity")
  private double itemQuantity;

  @Column(name="item_charge")
  private double itemCharge;

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

  public String getItemName() {
    return this.itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public double getItemQuantity() {
    return this.itemQuantity;
  }

  public void setItemQuantity(double itemQuantity) {
    this.itemQuantity = itemQuantity;
  }

  public double getItemCharge() {
    return this.itemCharge;
  }

  public void setItemCharge(double itemCharge) {
    this.itemCharge = itemCharge;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
