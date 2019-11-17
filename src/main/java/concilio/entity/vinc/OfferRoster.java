package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer_roster")
public class OfferRoster {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="roster_day")
  private String rosterDay;

  @Column(name="hours_per_day")
  private String hoursPerDay;

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

  public String getRosterDay() {
    return this.rosterDay;
  }

  public void setRosterDay(String rosterDay) {
    this.rosterDay = rosterDay;
  }

  public String getHoursPerDay() {
    return this.hoursPerDay;
  }

  public void setHoursPerDay(String hoursPerDay) {
    this.hoursPerDay = hoursPerDay;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
