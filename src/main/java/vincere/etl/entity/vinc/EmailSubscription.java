package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="email_subscription")
public class EmailSubscription {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="email")
  private String email;

  @Column(name="subscribed")
  private long subscribed;

  @Column(name="last_modified_date")
  private java.sql.Timestamp lastModifiedDate;

  @Column(name="last_modified_by")
  private long lastModifiedBy;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getSubscribed() {
    return this.subscribed;
  }

  public void setSubscribed(long subscribed) {
    this.subscribed = subscribed;
  }

  public java.sql.Timestamp getLastModifiedDate() {
    return this.lastModifiedDate;
  }

  public void setLastModifiedDate(java.sql.Timestamp lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public long getLastModifiedBy() {
    return this.lastModifiedBy;
  }

  public void setLastModifiedBy(long lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
