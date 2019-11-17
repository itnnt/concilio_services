package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kpi_library_association")
public class KpiLibraryAssociation {

  @Id
  @Column(name="kpi_library_id")
  private long kpiLibraryId;

  @Column(name="trigger_id")
  private long triggerId;

  @Column(name="predefined_comment_id")
  private long predefinedCommentId;

  @Column(name="system_action")
  private long systemAction;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getKpiLibraryId() {
    return this.kpiLibraryId;
  }

  public void setKpiLibraryId(long kpiLibraryId) {
    this.kpiLibraryId = kpiLibraryId;
  }

  public long getTriggerId() {
    return this.triggerId;
  }

  public void setTriggerId(long triggerId) {
    this.triggerId = triggerId;
  }

  public long getPredefinedCommentId() {
    return this.predefinedCommentId;
  }

  public void setPredefinedCommentId(long predefinedCommentId) {
    this.predefinedCommentId = predefinedCommentId;
  }

  public long getSystemAction() {
    return this.systemAction;
  }

  public void setSystemAction(long systemAction) {
    this.systemAction = systemAction;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
