package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="location_exempt_incentive")
public class LocationExemptIncentive {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="location_id")
  private long locationId;

  @Column(name="name")
  private String name;

  @Column(name="type")
  private long type;

  @Column(name="payment_schedule")
  private long paymentSchedule;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
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

  public long getPaymentSchedule() {
    return this.paymentSchedule;
  }

  public void setPaymentSchedule(long paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
