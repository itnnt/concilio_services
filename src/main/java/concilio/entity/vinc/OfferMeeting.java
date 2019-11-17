package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer_meeting")
public class OfferMeeting {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="time_zone")
  private String timeZone;

  @Column(name="date")
  private java.sql.Timestamp date;

  @Column(name="time_from")
  private String timeFrom;

  @Column(name="time_to")
  private String timeTo;

  @Column(name="type_of_meeting")
  private String typeOfMeeting;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public String getTimeZone() {
    return this.timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public java.sql.Timestamp getDate() {
    return this.date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }

  public String getTimeFrom() {
    return this.timeFrom;
  }

  public void setTimeFrom(String timeFrom) {
    this.timeFrom = timeFrom;
  }

  public String getTimeTo() {
    return this.timeTo;
  }

  public void setTimeTo(String timeTo) {
    this.timeTo = timeTo;
  }

  public String getTypeOfMeeting() {
    return this.typeOfMeeting;
  }

  public void setTypeOfMeeting(String typeOfMeeting) {
    this.typeOfMeeting = typeOfMeeting;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
