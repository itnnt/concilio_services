package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="offer_overtime")
public class OfferOvertime {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="name")
  private String name;

  @Column(name="day_from")
  private long dayFrom;

  @Column(name="day_to")
  private long dayTo;

  @Column(name="time_from")
  private long timeFrom;

  @Column(name="time_to")
  private long timeTo;

  @Column(name="amount")
  private double amount;

  @Column(name="description")
  private String description;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getDayFrom() {
    return this.dayFrom;
  }

  public void setDayFrom(long dayFrom) {
    this.dayFrom = dayFrom;
  }

  public long getDayTo() {
    return this.dayTo;
  }

  public void setDayTo(long dayTo) {
    this.dayTo = dayTo;
  }

  public long getTimeFrom() {
    return this.timeFrom;
  }

  public void setTimeFrom(long timeFrom) {
    this.timeFrom = timeFrom;
  }

  public long getTimeTo() {
    return this.timeTo;
  }

  public void setTimeTo(long timeTo) {
    this.timeTo = timeTo;
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

  public long getType() {
    return this.type;
  }

  public void setType(long type) {
    this.type = type;
  }
}
