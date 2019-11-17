package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bulk_upload")
public class BulkUpload {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="external_id")
  private String externalId;

  @Column(name="source_bucket")
  private String sourceBucket;

  @Column(name="source_key")
  private String sourceKey;

  @Column(name="header_json")
  private String headerJson;

  @Column(name="sample_json")
  private String sampleJson;

  @Column(name="status")
  private String status;

  @Column(name="record_processed")
  private long recordProcessed;

  @Column(name="record_total")
  private long recordTotal;

  @Column(name="record_skipped")
  private long recordSkipped;

  @Column(name="company_processed")
  private long companyProcessed;

  @Column(name="candidate_processed")
  private long candidateProcessed;

  @Column(name="contact_processed")
  private long contactProcessed;

  @Column(name="position_processed")
  private long positionProcessed;

  @Column(name="application_processed")
  private long applicationProcessed;

  @Column(name="skip_file_path")
  private String skipFilePath;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="document_processed")
  private long documentProcessed;

  @Column(name="import_type")
  private String importType;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="file_name")
  private String fileName;

  @Column(name="record_reverted")
  private long recordReverted;

  @Column(name="entity_type")
  private String entityType;

  @Column(name="source")
  private String source;

  @Column(name="candidate_id")
  private long candidateId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public String getSourceBucket() {
    return this.sourceBucket;
  }

  public void setSourceBucket(String sourceBucket) {
    this.sourceBucket = sourceBucket;
  }

  public String getSourceKey() {
    return this.sourceKey;
  }

  public void setSourceKey(String sourceKey) {
    this.sourceKey = sourceKey;
  }

  public String getHeaderJson() {
    return this.headerJson;
  }

  public void setHeaderJson(String headerJson) {
    this.headerJson = headerJson;
  }

  public String getSampleJson() {
    return this.sampleJson;
  }

  public void setSampleJson(String sampleJson) {
    this.sampleJson = sampleJson;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getRecordProcessed() {
    return this.recordProcessed;
  }

  public void setRecordProcessed(long recordProcessed) {
    this.recordProcessed = recordProcessed;
  }

  public long getRecordTotal() {
    return this.recordTotal;
  }

  public void setRecordTotal(long recordTotal) {
    this.recordTotal = recordTotal;
  }

  public long getRecordSkipped() {
    return this.recordSkipped;
  }

  public void setRecordSkipped(long recordSkipped) {
    this.recordSkipped = recordSkipped;
  }

  public long getCompanyProcessed() {
    return this.companyProcessed;
  }

  public void setCompanyProcessed(long companyProcessed) {
    this.companyProcessed = companyProcessed;
  }

  public long getCandidateProcessed() {
    return this.candidateProcessed;
  }

  public void setCandidateProcessed(long candidateProcessed) {
    this.candidateProcessed = candidateProcessed;
  }

  public long getContactProcessed() {
    return this.contactProcessed;
  }

  public void setContactProcessed(long contactProcessed) {
    this.contactProcessed = contactProcessed;
  }

  public long getPositionProcessed() {
    return this.positionProcessed;
  }

  public void setPositionProcessed(long positionProcessed) {
    this.positionProcessed = positionProcessed;
  }

  public long getApplicationProcessed() {
    return this.applicationProcessed;
  }

  public void setApplicationProcessed(long applicationProcessed) {
    this.applicationProcessed = applicationProcessed;
  }

  public String getSkipFilePath() {
    return this.skipFilePath;
  }

  public void setSkipFilePath(String skipFilePath) {
    this.skipFilePath = skipFilePath;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getDocumentProcessed() {
    return this.documentProcessed;
  }

  public void setDocumentProcessed(long documentProcessed) {
    this.documentProcessed = documentProcessed;
  }

  public String getImportType() {
    return this.importType;
  }

  public void setImportType(String importType) {
    this.importType = importType;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public long getRecordReverted() {
    return this.recordReverted;
  }

  public void setRecordReverted(long recordReverted) {
    this.recordReverted = recordReverted;
  }

  public String getEntityType() {
    return this.entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public String getSource() {
    return this.source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }
}
