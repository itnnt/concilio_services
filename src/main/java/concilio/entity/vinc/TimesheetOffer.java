package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timesheet_offer")
public class TimesheetOffer {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="timesheet_id")
  private long timesheetId;

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

  public long getTimesheetId() {
    return this.timesheetId;
  }

  public void setTimesheetId(long timesheetId) {
    this.timesheetId = timesheetId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
