package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="export_setting")
public class ExportSetting {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="from_date")
  private java.sql.Timestamp fromDate;

  @Column(name="to_date")
  private java.sql.Timestamp toDate;

  @Column(name="file_name")
  private String fileName;

  @Column(name="time_frame")
  private String timeFrame;

  @Column(name="export_type")
  private String exportType;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
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

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getTimeFrame() {
    return this.timeFrame;
  }

  public void setTimeFrame(String timeFrame) {
    this.timeFrame = timeFrame;
  }

  public String getExportType() {
    return this.exportType;
  }

  public void setExportType(String exportType) {
    this.exportType = exportType;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
