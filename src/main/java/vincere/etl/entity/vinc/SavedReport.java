package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="saved_report")
public class SavedReport {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="owner_id")
  private long ownerId;

  @Column(name="title")
  private String title;

  @Column(name="params")
  private String params;

  @Column(name="report_permission_key")
  private String reportPermissionKey;

  @Column(name="legends")
  private String legends;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getOwnerId() {
    return this.ownerId;
  }

  public void setOwnerId(long ownerId) {
    this.ownerId = ownerId;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getParams() {
    return this.params;
  }

  public void setParams(String params) {
    this.params = params;
  }

  public String getReportPermissionKey() {
    return this.reportPermissionKey;
  }

  public void setReportPermissionKey(String reportPermissionKey) {
    this.reportPermissionKey = reportPermissionKey;
  }

  public String getLegends() {
    return this.legends;
  }

  public void setLegends(String legends) {
    this.legends = legends;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
