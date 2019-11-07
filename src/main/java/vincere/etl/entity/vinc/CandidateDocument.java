package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_document")
public class CandidateDocument {


  @Id
  @Column(name="id")
  private long id;

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

  @Column(name="saved_local_filename")
  private String savedLocalFilename;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="google_viewer")
  private long googleViewer;

  @Column(name="parser_name")
  private String parserName;

  @Column(name="parsed_doc_obj")
  private String parsedDocObj;

  @Column(name="parsed_doc_xml")
  private String parsedDocXml;

  @Column(name="candidate_email_id")
  private long candidateEmailId;

  @Column(name="temporary")
  private long temporary;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="legal_doc_id")
  private long legalDocId;

  @Column(name="task_id")
  private long taskId;

  @Column(name="task_comment_id")
  private long taskCommentId;

  @Column(name="trigger_index_update_timestamp")
  private java.sql.Timestamp triggerIndexUpdateTimestamp;

  @Column(name="external_id")
  private String externalId;

  @Column(name="document_types_id")
  private long documentTypesId;

  @Column(name="user_id")
  private String userId;

  @Column(name="timesheet_id")
  private long timesheetId;

  @Column(name="expiry_date")
  private java.sql.Timestamp expiryDate;

  @Column(name="s3_bucket")
  private String s3Bucket;

  @Column(name="s3_region")
  private String s3Region;

  @Column(name="s3_html_key")
  private String s3HtmlKey;

  @Column(name="s3_html_support")
  private long s3HtmlSupport;

  @Column(name="reminder_date")
  private java.sql.Timestamp reminderDate;

  @Column(name="customer_portal")
  private long customerPortal;

  @Column(name="candidate_formatted_resume_id")
  private long candidateFormattedResumeId;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="sign_request_status")
  private String signRequestStatus;

  @Column(name="visible")
  private long visible;

  @Column(name="deal_id")
  private long dealId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
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

  public String getSavedLocalFilename() {
    return this.savedLocalFilename;
  }

  public void setSavedLocalFilename(String savedLocalFilename) {
    this.savedLocalFilename = savedLocalFilename;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getGoogleViewer() {
    return this.googleViewer;
  }

  public void setGoogleViewer(long googleViewer) {
    this.googleViewer = googleViewer;
  }

  public String getParserName() {
    return this.parserName;
  }

  public void setParserName(String parserName) {
    this.parserName = parserName;
  }

  public String getParsedDocObj() {
    return this.parsedDocObj;
  }

  public void setParsedDocObj(String parsedDocObj) {
    this.parsedDocObj = parsedDocObj;
  }

  public String getParsedDocXml() {
    return this.parsedDocXml;
  }

  public void setParsedDocXml(String parsedDocXml) {
    this.parsedDocXml = parsedDocXml;
  }

  public long getCandidateEmailId() {
    return this.candidateEmailId;
  }

  public void setCandidateEmailId(long candidateEmailId) {
    this.candidateEmailId = candidateEmailId;
  }

  public long getTemporary() {
    return this.temporary;
  }

  public void setTemporary(long temporary) {
    this.temporary = temporary;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getLegalDocId() {
    return this.legalDocId;
  }

  public void setLegalDocId(long legalDocId) {
    this.legalDocId = legalDocId;
  }

  public long getTaskId() {
    return this.taskId;
  }

  public void setTaskId(long taskId) {
    this.taskId = taskId;
  }

  public long getTaskCommentId() {
    return this.taskCommentId;
  }

  public void setTaskCommentId(long taskCommentId) {
    this.taskCommentId = taskCommentId;
  }

  public java.sql.Timestamp getTriggerIndexUpdateTimestamp() {
    return this.triggerIndexUpdateTimestamp;
  }

  public void setTriggerIndexUpdateTimestamp(java.sql.Timestamp triggerIndexUpdateTimestamp) {
    this.triggerIndexUpdateTimestamp = triggerIndexUpdateTimestamp;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public long getDocumentTypesId() {
    return this.documentTypesId;
  }

  public void setDocumentTypesId(long documentTypesId) {
    this.documentTypesId = documentTypesId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public long getTimesheetId() {
    return this.timesheetId;
  }

  public void setTimesheetId(long timesheetId) {
    this.timesheetId = timesheetId;
  }

  public java.sql.Timestamp getExpiryDate() {
    return this.expiryDate;
  }

  public void setExpiryDate(java.sql.Timestamp expiryDate) {
    this.expiryDate = expiryDate;
  }

  public String getS3Bucket() {
    return this.s3Bucket;
  }

  public void setS3Bucket(String s3Bucket) {
    this.s3Bucket = s3Bucket;
  }

  public String getS3Region() {
    return this.s3Region;
  }

  public void setS3Region(String s3Region) {
    this.s3Region = s3Region;
  }

  public String getS3HtmlKey() {
    return this.s3HtmlKey;
  }

  public void setS3HtmlKey(String s3HtmlKey) {
    this.s3HtmlKey = s3HtmlKey;
  }

  public long getS3HtmlSupport() {
    return this.s3HtmlSupport;
  }

  public void setS3HtmlSupport(long s3HtmlSupport) {
    this.s3HtmlSupport = s3HtmlSupport;
  }

  public java.sql.Timestamp getReminderDate() {
    return this.reminderDate;
  }

  public void setReminderDate(java.sql.Timestamp reminderDate) {
    this.reminderDate = reminderDate;
  }

  public long getCustomerPortal() {
    return this.customerPortal;
  }

  public void setCustomerPortal(long customerPortal) {
    this.customerPortal = customerPortal;
  }

  public long getCandidateFormattedResumeId() {
    return this.candidateFormattedResumeId;
  }

  public void setCandidateFormattedResumeId(long candidateFormattedResumeId) {
    this.candidateFormattedResumeId = candidateFormattedResumeId;
  }

  public long getOfferId() {
    return this.offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }

  public String getSignRequestStatus() {
    return this.signRequestStatus;
  }

  public void setSignRequestStatus(String signRequestStatus) {
    this.signRequestStatus = signRequestStatus;
  }

  public long getVisible() {
    return this.visible;
  }

  public void setVisible(long visible) {
    this.visible = visible;
  }

  public long getDealId() {
    return this.dealId;
  }

  public void setDealId(long dealId) {
    this.dealId = dealId;
  }
}
