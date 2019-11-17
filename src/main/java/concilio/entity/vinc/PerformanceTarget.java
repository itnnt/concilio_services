package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="performance_target")
public class PerformanceTarget {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="valid_from_timestamp")
  private java.sql.Timestamp validFromTimestamp;

  @Column(name="valid_to_timestamp")
  private java.sql.Timestamp validToTimestamp;

  @Column(name="target_xml")
  private String targetXml;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="internal")
  private long internal;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public java.sql.Timestamp getValidFromTimestamp() {
    return this.validFromTimestamp;
  }

  public void setValidFromTimestamp(java.sql.Timestamp validFromTimestamp) {
    this.validFromTimestamp = validFromTimestamp;
  }

  public java.sql.Timestamp getValidToTimestamp() {
    return this.validToTimestamp;
  }

  public void setValidToTimestamp(java.sql.Timestamp validToTimestamp) {
    this.validToTimestamp = validToTimestamp;
  }

  public String getTargetXml() {
    return this.targetXml;
  }

  public void setTargetXml(String targetXml) {
    this.targetXml = targetXml;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getInternal() {
    return this.internal;
  }

  public void setInternal(long internal) {
    this.internal = internal;
  }
}
