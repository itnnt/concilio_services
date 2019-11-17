package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="external_export_job_detail")
public class ExternalExportJobDetail {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="uid")
  private String uid;

  @Column(name="external_export_job_id")
  private long externalExportJobId;

  @Column(name="entity_id")
  private long entityId;

  @Column(name="entity_type")
  private String entityType;

  @Column(name="external_id")
  private String externalId;

  @Column(name="detail")
  private String detail;

  @Column(name="success")
  private long success;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUid() {
    return this.uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public long getExternalExportJobId() {
    return this.externalExportJobId;
  }

  public void setExternalExportJobId(long externalExportJobId) {
    this.externalExportJobId = externalExportJobId;
  }

  public long getEntityId() {
    return this.entityId;
  }

  public void setEntityId(long entityId) {
    this.entityId = entityId;
  }

  public String getEntityType() {
    return this.entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public String getDetail() {
    return this.detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public long getSuccess() {
    return this.success;
  }

  public void setSuccess(long success) {
    this.success = success;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
