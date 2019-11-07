package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="import_files_temp")
public class ImportFilesTemp {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="candidate_document_id")
  private long candidateDocumentId;

  @Column(name="original_filename")
  private String originalFilename;

  @Column(name="saved_filename")
  private String savedFilename;

  @Column(name="document_type")
  private String documentType;

  @Column(name="uploaded")
  private long uploaded;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getCandidateDocumentId() {
    return this.candidateDocumentId;
  }

  public void setCandidateDocumentId(long candidateDocumentId) {
    this.candidateDocumentId = candidateDocumentId;
  }

  public String getOriginalFilename() {
    return this.originalFilename;
  }

  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }

  public String getSavedFilename() {
    return this.savedFilename;
  }

  public void setSavedFilename(String savedFilename) {
    this.savedFilename = savedFilename;
  }

  public String getDocumentType() {
    return this.documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public long getUploaded() {
    return this.uploaded;
  }

  public void setUploaded(long uploaded) {
    this.uploaded = uploaded;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
