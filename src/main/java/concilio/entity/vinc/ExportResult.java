package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="export_result")
public class ExportResult {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="uuid")
  private String uuid;

  @Column(name="requested_by")
  private long requestedBy;

  @Column(name="export_setting_id")
  private long exportSettingId;

  @Column(name="export_date")
  private java.sql.Timestamp exportDate;

  @Column(name="file_name")
  private String fileName;

  @Column(name="number_of_items")
  private long numberOfItems;

  @Column(name="file_size")
  private long fileSize;

  @Column(name="available_until")
  private java.sql.Timestamp availableUntil;

  @Column(name="download_url")
  private String downloadUrl;

  @Column(name="from_date")
  private java.sql.Timestamp fromDate;

  @Column(name="to_date")
  private java.sql.Timestamp toDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="status")
  private String status;

  @Column(name="export_type")
  private String exportType;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public long getRequestedBy() {
    return this.requestedBy;
  }

  public void setRequestedBy(long requestedBy) {
    this.requestedBy = requestedBy;
  }

  public long getExportSettingId() {
    return this.exportSettingId;
  }

  public void setExportSettingId(long exportSettingId) {
    this.exportSettingId = exportSettingId;
  }

  public java.sql.Timestamp getExportDate() {
    return this.exportDate;
  }

  public void setExportDate(java.sql.Timestamp exportDate) {
    this.exportDate = exportDate;
  }

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public long getNumberOfItems() {
    return this.numberOfItems;
  }

  public void setNumberOfItems(long numberOfItems) {
    this.numberOfItems = numberOfItems;
  }

  public long getFileSize() {
    return this.fileSize;
  }

  public void setFileSize(long fileSize) {
    this.fileSize = fileSize;
  }

  public java.sql.Timestamp getAvailableUntil() {
    return this.availableUntil;
  }

  public void setAvailableUntil(java.sql.Timestamp availableUntil) {
    this.availableUntil = availableUntil;
  }

  public String getDownloadUrl() {
    return this.downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public java.sql.Timestamp getFromDate() {
    return this.fromDate;
  }

  public void setFromDate(java.sql.Timestamp fromDate) {
    this.fromDate = fromDate;
  }

  public java.sql.Timestamp getToDate() {
    return this.toDate;
  }

  public void setToDate(java.sql.Timestamp toDate) {
    this.toDate = toDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getExportType() {
    return this.exportType;
  }

  public void setExportType(String exportType) {
    this.exportType = exportType;
  }
}
