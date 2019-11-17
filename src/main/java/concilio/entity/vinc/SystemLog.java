package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="system_log")
public class SystemLog {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="action_type")
  private String actionType;

  @Column(name="action_by")
  private long actionBy;

  @Column(name="email")
  private String email;

  @Column(name="status")
  private String status;

  @Column(name="trace_log")
  private String traceLog;

  @Column(name="remote_ip")
  private String remoteIp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="action_by_name")
  private String actionByName;

  @Column(name="action_by_type")
  private String actionByType;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="position_id")
  private long positionId;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="configurable_stage_id")
  private long configurableStageId;

  @Column(name="position_candidate_status")
  private long positionCandidateStatus;

  @Column(name="configurable_stage_name")
  private String configurableStageName;

  @Column(name="skipped_stage")
  private long skippedStage;

  @Column(name="contact_id")
  private long contactId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getActionType() {
    return this.actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public long getActionBy() {
    return this.actionBy;
  }

  public void setActionBy(long actionBy) {
    this.actionBy = actionBy;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getTraceLog() {
    return this.traceLog;
  }

  public void setTraceLog(String traceLog) {
    this.traceLog = traceLog;
  }

  public String getRemoteIp() {
    return this.remoteIp;
  }

  public void setRemoteIp(String remoteIp) {
    this.remoteIp = remoteIp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getActionByName() {
    return this.actionByName;
  }

  public void setActionByName(String actionByName) {
    this.actionByName = actionByName;
  }

  public String getActionByType() {
    return this.actionByType;
  }

  public void setActionByType(String actionByType) {
    this.actionByType = actionByType;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public long getConfigurableStageId() {
    return this.configurableStageId;
  }

  public void setConfigurableStageId(long configurableStageId) {
    this.configurableStageId = configurableStageId;
  }

  public long getPositionCandidateStatus() {
    return this.positionCandidateStatus;
  }

  public void setPositionCandidateStatus(long positionCandidateStatus) {
    this.positionCandidateStatus = positionCandidateStatus;
  }

  public String getConfigurableStageName() {
    return this.configurableStageName;
  }

  public void setConfigurableStageName(String configurableStageName) {
    this.configurableStageName = configurableStageName;
  }

  public long getSkippedStage() {
    return this.skippedStage;
  }

  public void setSkippedStage(long skippedStage) {
    this.skippedStage = skippedStage;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }
}
