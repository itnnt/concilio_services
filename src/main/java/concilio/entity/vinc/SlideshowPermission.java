package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="slideshow_permission")
public class SlideshowPermission {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="slideshow_id")
  private long slideshowId;

  @Column(name="hr")
  private String hr;

  @Column(name="ir")
  private String ir;

  @Column(name="lm")
  private String lm;

  @Column(name="date_modified")
  private java.sql.Timestamp dateModified;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSlideshowId() {
    return this.slideshowId;
  }

  public void setSlideshowId(long slideshowId) {
    this.slideshowId = slideshowId;
  }

  public String getHr() {
    return this.hr;
  }

  public void setHr(String hr) {
    this.hr = hr;
  }

  public String getIr() {
    return this.ir;
  }

  public void setIr(String ir) {
    this.ir = ir;
  }

  public String getLm() {
    return this.lm;
  }

  public void setLm(String lm) {
    this.lm = lm;
  }

  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }

  public void setDateModified(java.sql.Timestamp dateModified) {
    this.dateModified = dateModified;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
