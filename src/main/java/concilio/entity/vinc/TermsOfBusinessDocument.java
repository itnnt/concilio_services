package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="terms_of_business_document")
public class TermsOfBusinessDocument {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="uploaded_filename")
  private String uploadedFilename;

  @Column(name="filesize")
  private long filesize;

  @Column(name="saved_filename")
  private String savedFilename;

  @Column(name="mime_type")
  private String mimeType;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
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

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
