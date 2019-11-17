package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="locked_date")
public class LockedDate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="date_locked")
  private java.sql.Timestamp dateLocked;

  @Column(name="time_locked_from")
  private java.sql.Timestamp timeLockedFrom;

  @Column(name="time_locked_to")
  private java.sql.Timestamp timeLockedTo;

  @Column(name="expire_time")
  private java.sql.Timestamp expireTime;


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

  public java.sql.Timestamp getDateLocked() {
    return this.dateLocked;
  }

  public void setDateLocked(java.sql.Timestamp dateLocked) {
    this.dateLocked = dateLocked;
  }

  public java.sql.Timestamp getTimeLockedFrom() {
    return this.timeLockedFrom;
  }

  public void setTimeLockedFrom(java.sql.Timestamp timeLockedFrom) {
    this.timeLockedFrom = timeLockedFrom;
  }

  public java.sql.Timestamp getTimeLockedTo() {
    return this.timeLockedTo;
  }

  public void setTimeLockedTo(java.sql.Timestamp timeLockedTo) {
    this.timeLockedTo = timeLockedTo;
  }

  public java.sql.Timestamp getExpireTime() {
    return this.expireTime;
  }

  public void setExpireTime(java.sql.Timestamp expireTime) {
    this.expireTime = expireTime;
  }
}
