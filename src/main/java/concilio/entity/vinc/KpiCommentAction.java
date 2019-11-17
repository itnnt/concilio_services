package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kpi_comment_action")
public class KpiCommentAction {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="kpi_related_lib")
  private String kpiRelatedLib;

  @Column(name="comment_id")
  private long commentId;

  @Column(name="type")
  private long type;

  @Column(name="trigger_id")
  private long triggerId;

  @Column(name="predefined_comment_id")
  private long predefinedCommentId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="task_id")
  private long taskId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="position_id")
  private long positionId;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="company_id")
  private long companyId;

  @Column(name="sub_task_id")
  private long subTaskId;

  @Column(name="deal_id")
  private long dealId;


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

  public String getKpiRelatedLib() {
    return this.kpiRelatedLib;
  }

  public void setKpiRelatedLib(String kpiRelatedLib) {
    this.kpiRelatedLib = kpiRelatedLib;
  }

  public long getCommentId() {
    return this.commentId;
  }

  public void setCommentId(long commentId) {
    this.commentId = commentId;
  }

  public long getType() {
    return this.type;
  }

  public void setType(long type) {
    this.type = type;
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

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getTaskId() {
    return this.taskId;
  }

  public void setTaskId(long taskId) {
    this.taskId = taskId;
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

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public long getSubTaskId() {
    return this.subTaskId;
  }

  public void setSubTaskId(long subTaskId) {
    this.subTaskId = subTaskId;
  }

  public long getDealId() {
    return this.dealId;
  }

  public void setDealId(long dealId) {
    this.dealId = dealId;
  }
}
