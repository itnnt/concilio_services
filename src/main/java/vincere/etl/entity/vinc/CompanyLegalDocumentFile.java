package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="company_legal_document_file")
public class CompanyLegalDocumentFile {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="company_legal_document_id")
  private long companyLegalDocumentId;

  @Column(name="company_location_id")
  private long companyLocationId;

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

  @Column(name="document_type")
  private String documentType;

  @Column(name="modify_timestamp")
  private java.sql.Timestamp modifyTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCompanyLegalDocumentId() {
    return this.companyLegalDocumentId;
  }

  public void setCompanyLegalDocumentId(long companyLegalDocumentId) {
    this.companyLegalDocumentId = companyLegalDocumentId;
  }

  public long getCompanyLocationId() {
    return this.companyLocationId;
  }

  public void setCompanyLocationId(long companyLocationId) {
    this.companyLocationId = companyLocationId;
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

  public String getDocumentType() {
    return this.documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public java.sql.Timestamp getModifyTimestamp() {
    return this.modifyTimestamp;
  }

  public void setModifyTimestamp(java.sql.Timestamp modifyTimestamp) {
    this.modifyTimestamp = modifyTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
