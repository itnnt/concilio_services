package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="slideshow")
public class Slideshow {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="owner_id")
  private long ownerId;

  @Column(name="date_modified")
  private java.sql.Timestamp dateModified;

  @Column(name="time_change_slide")
  private long timeChangeSlide;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getOwnerId() {
    return this.ownerId;
  }

  public void setOwnerId(long ownerId) {
    this.ownerId = ownerId;
  }

  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }

  public void setDateModified(java.sql.Timestamp dateModified) {
    this.dateModified = dateModified;
  }

  public long getTimeChangeSlide() {
    return this.timeChangeSlide;
  }

  public void setTimeChangeSlide(long timeChangeSlide) {
    this.timeChangeSlide = timeChangeSlide;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
