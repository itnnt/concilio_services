package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bulk_upload_detail")
public class BulkUploadDetail {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="entity_id")
  private long entityId;

  @Column(name="bulk_upload_external_id")
  private String bulkUploadExternalId;

  @Column(name="entity_type")
  private String entityType;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="file_name")
  private String fileName;

  @Column(name="s3_file_path")
  private String s3FilePath;

  @Column(name="deleted_timestamp")
  private java.sql.Timestamp deletedTimestamp;

  @Column(name="parsing_status")
  private long parsingStatus;

  @Column(name="duplicated_with_id")
  private long duplicatedWithId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getEntityId() {
    return this.entityId;
  }

  public void setEntityId(long entityId) {
    this.entityId = entityId;
  }

  public String getBulkUploadExternalId() {
    return this.bulkUploadExternalId;
  }

  public void setBulkUploadExternalId(String bulkUploadExternalId) {
    this.bulkUploadExternalId = bulkUploadExternalId;
  }

  public String getEntityType() {
    return this.entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getS3FilePath() {
    return this.s3FilePath;
  }

  public void setS3FilePath(String s3FilePath) {
    this.s3FilePath = s3FilePath;
  }

  public java.sql.Timestamp getDeletedTimestamp() {
    return this.deletedTimestamp;
  }

  public void setDeletedTimestamp(java.sql.Timestamp deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  public long getParsingStatus() {
    return this.parsingStatus;
  }

  public void setParsingStatus(long parsingStatus) {
    this.parsingStatus = parsingStatus;
  }

  public long getDuplicatedWithId() {
    return this.duplicatedWithId;
  }

  public void setDuplicatedWithId(long duplicatedWithId) {
    this.duplicatedWithId = duplicatedWithId;
  }
}
