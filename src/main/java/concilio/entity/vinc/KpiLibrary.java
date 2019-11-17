package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kpi_library")
public class KpiLibrary {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="kpi_type")
  private long kpiType;

  @Column(name="kpi_name")
  private String kpiName;

  @Column(name="activated")
  private long activated;

  @Column(name="business_status")
  private long businessStatus;

  @Column(name="contact_type")
  private long contactType;

  @Column(name="contact_action")
  private long contactAction;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="related_type")
  private long relatedType;

  @Column(name="activated_action")
  private long activatedAction;

  @Column(name="display")
  private long display;

  @Column(name="seq")
  private long seq;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getKpiType() {
    return this.kpiType;
  }

  public void setKpiType(long kpiType) {
    this.kpiType = kpiType;
  }

  public String getKpiName() {
    return this.kpiName;
  }

  public void setKpiName(String kpiName) {
    this.kpiName = kpiName;
  }

  public long getActivated() {
    return this.activated;
  }

  public void setActivated(long activated) {
    this.activated = activated;
  }

  public long getBusinessStatus() {
    return this.businessStatus;
  }

  public void setBusinessStatus(long businessStatus) {
    this.businessStatus = businessStatus;
  }

  public long getContactType() {
    return this.contactType;
  }

  public void setContactType(long contactType) {
    this.contactType = contactType;
  }

  public long getContactAction() {
    return this.contactAction;
  }

  public void setContactAction(long contactAction) {
    this.contactAction = contactAction;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getRelatedType() {
    return this.relatedType;
  }

  public void setRelatedType(long relatedType) {
    this.relatedType = relatedType;
  }

  public long getActivatedAction() {
    return this.activatedAction;
  }

  public void setActivatedAction(long activatedAction) {
    this.activatedAction = activatedAction;
  }

  public long getDisplay() {
    return this.display;
  }

  public void setDisplay(long display) {
    this.display = display;
  }

  public long getSeq() {
    return this.seq;
  }

  public void setSeq(long seq) {
    this.seq = seq;
  }
}
