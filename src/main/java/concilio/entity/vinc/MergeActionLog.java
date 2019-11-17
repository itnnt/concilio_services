package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="merge_action_log")
public class MergeActionLog {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="task")
  private String task;

  @Column(name="merge_form_json")
  private String mergeFormJson;

  @Column(name="merge_from_id")
  private long mergeFromId;

  @Column(name="merge_from_name")
  private String mergeFromName;

  @Column(name="merge_to_id")
  private long mergeToId;

  @Column(name="merge_to_name")
  private String mergeToName;

  @Column(name="entity_type")
  private String entityType;

  @Column(name="status")
  private long status;

  @Column(name="action_by_user_id")
  private long actionByUserId;

  @Column(name="action_by_user_name")
  private String actionByUserName;

  @Column(name="notes")
  private String notes;

  @Column(name="has_retry")
  private long hasRetry;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTask() {
    return this.task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public String getMergeFormJson() {
    return this.mergeFormJson;
  }

  public void setMergeFormJson(String mergeFormJson) {
    this.mergeFormJson = mergeFormJson;
  }

  public long getMergeFromId() {
    return this.mergeFromId;
  }

  public void setMergeFromId(long mergeFromId) {
    this.mergeFromId = mergeFromId;
  }

  public String getMergeFromName() {
    return this.mergeFromName;
  }

  public void setMergeFromName(String mergeFromName) {
    this.mergeFromName = mergeFromName;
  }

  public long getMergeToId() {
    return this.mergeToId;
  }

  public void setMergeToId(long mergeToId) {
    this.mergeToId = mergeToId;
  }

  public String getMergeToName() {
    return this.mergeToName;
  }

  public void setMergeToName(String mergeToName) {
    this.mergeToName = mergeToName;
  }

  public String getEntityType() {
    return this.entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public long getActionByUserId() {
    return this.actionByUserId;
  }

  public void setActionByUserId(long actionByUserId) {
    this.actionByUserId = actionByUserId;
  }

  public String getActionByUserName() {
    return this.actionByUserName;
  }

  public void setActionByUserName(String actionByUserName) {
    this.actionByUserName = actionByUserName;
  }

  public String getNotes() {
    return this.notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public long getHasRetry() {
    return this.hasRetry;
  }

  public void setHasRetry(long hasRetry) {
    this.hasRetry = hasRetry;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
