package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="compensation_roster")
public class CompensationRoster {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="compensation_id")
  private long compensationId;

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

  public long getCompensationId() {
    return this.compensationId;
  }

  public void setCompensationId(long compensationId) {
    this.compensationId = compensationId;
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
