package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calendar_event")
public class CalendarEvent {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="title")
  private String title;

  @Column(name="notes")
  private String notes;

  @Column(name="location")
  private String location;

  @Column(name="reminder_minutes")
  private long reminderMinutes;

  @Column(name="start_timestamp")
  private java.sql.Timestamp startTimestamp;

  @Column(name="end_timestamp")
  private java.sql.Timestamp endTimestamp;

  @Column(name="all_day")
  private long allDay;

  @Column(name="calendar_id")
  private String calendarId;

  @Column(name="timezone")
  private String timezone;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getNotes() {
    return this.notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public long getReminderMinutes() {
    return this.reminderMinutes;
  }

  public void setReminderMinutes(long reminderMinutes) {
    this.reminderMinutes = reminderMinutes;
  }

  public java.sql.Timestamp getStartTimestamp() {
    return this.startTimestamp;
  }

  public void setStartTimestamp(java.sql.Timestamp startTimestamp) {
    this.startTimestamp = startTimestamp;
  }

  public java.sql.Timestamp getEndTimestamp() {
    return this.endTimestamp;
  }

  public void setEndTimestamp(java.sql.Timestamp endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  public long getAllDay() {
    return this.allDay;
  }

  public void setAllDay(long allDay) {
    this.allDay = allDay;
  }

  public String getCalendarId() {
    return this.calendarId;
  }

  public void setCalendarId(String calendarId) {
    this.calendarId = calendarId;
  }

  public String getTimezone() {
    return this.timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }
}
