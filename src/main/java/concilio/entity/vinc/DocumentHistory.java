package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="document_history")
public class DocumentHistory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="document_id")
  private long documentId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="uploaded_filename")
  private String uploadedFilename;

  @Column(name="filesize")
  private long filesize;

  @Column(name="saved_filename")
  private String savedFilename;

  @Column(name="mime_type")
  private String mimeType;

  @Column(name="version_no")
  private long versionNo;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="document_type")
  private String documentType;

  @Column(name="created")
  private java.sql.Timestamp created;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="successful_parsing_percent")
  private double successfulParsingPercent;

  @Column(name="job_names")
  private String jobNames;

  @Column(name="primary_document")
  private long primaryDocument;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="saved_local_filename")
  private String savedLocalFilename;

  @Column(name="action")
  private long action;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getDocumentId() {
    return this.documentId;
  }

  public void setDocumentId(long documentId) {
    this.documentId = documentId;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public String getUploadedFilename() {
    return this.uploadedFilename;
  }

  public void setUploadedFilename(String uploadedFilename) {
    this.uploadedFilename = uploadedFilename;
  }

  public long getFilesize() {
    return this.filesize;
  }

  public void setFilesize(long filesize) {
    this.filesize = filesize;
  }

  public String getSavedFilename() {
    return this.savedFilename;
  }

  public void setSavedFilename(String savedFilename) {
    this.savedFilename = savedFilename;
  }

  public String getMimeType() {
    return this.mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public long getVersionNo() {
    return this.versionNo;
  }

  public void setVersionNo(long versionNo) {
    this.versionNo = versionNo;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getDocumentType() {
    return this.documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public java.sql.Timestamp getCreated() {
    return this.created;
  }

  public void setCreated(java.sql.Timestamp created) {
    this.created = created;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public double getSuccessfulParsingPercent() {
    return this.successfulParsingPercent;
  }

  public void setSuccessfulParsingPercent(double successfulParsingPercent) {
    this.successfulParsingPercent = successfulParsingPercent;
  }

  public String getJobNames() {
    return this.jobNames;
  }

  public void setJobNames(String jobNames) {
    this.jobNames = jobNames;
  }

  public long getPrimaryDocument() {
    return this.primaryDocument;
  }

  public void setPrimaryDocument(long primaryDocument) {
    this.primaryDocument = primaryDocument;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public String getSavedLocalFilename() {
    return this.savedLocalFilename;
  }

  public void setSavedLocalFilename(String savedLocalFilename) {
    this.savedLocalFilename = savedLocalFilename;
  }

  public long getAction() {
    return this.action;
  }

  public void setAction(long action) {
    this.action = action;
  }
}
