package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="contact_document")
public class ContactDocument {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="contact_email_id")
  private long contactEmailId;

  @Column(name="filesize")
  private long filesize;

  @Column(name="uploaded_filename")
  private String uploadedFilename;

  @Column(name="saved_filename")
  private String savedFilename;

  @Column(name="saved_local_filename")
  private String savedLocalFilename;

  @Column(name="mime_type")
  private String mimeType;

  @Column(name="upload_by_user_id")
  private long uploadByUserId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="google_viewer")
  private long googleViewer;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getContactEmailId() {
    return this.contactEmailId;
  }

  public void setContactEmailId(long contactEmailId) {
    this.contactEmailId = contactEmailId;
  }

  public long getFilesize() {
    return this.filesize;
  }

  public void setFilesize(long filesize) {
    this.filesize = filesize;
  }

  public String getUploadedFilename() {
    return this.uploadedFilename;
  }

  public void setUploadedFilename(String uploadedFilename) {
    this.uploadedFilename = uploadedFilename;
  }

  public String getSavedFilename() {
    return this.savedFilename;
  }

  public void setSavedFilename(String savedFilename) {
    this.savedFilename = savedFilename;
  }

  public String getSavedLocalFilename() {
    return this.savedLocalFilename;
  }

  public void setSavedLocalFilename(String savedLocalFilename) {
    this.savedLocalFilename = savedLocalFilename;
  }

  public String getMimeType() {
    return this.mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public long getUploadByUserId() {
    return this.uploadByUserId;
  }

  public void setUploadByUserId(long uploadByUserId) {
    this.uploadByUserId = uploadByUserId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getGoogleViewer() {
    return this.googleViewer;
  }

  public void setGoogleViewer(long googleViewer) {
    this.googleViewer = googleViewer;
  }
}
