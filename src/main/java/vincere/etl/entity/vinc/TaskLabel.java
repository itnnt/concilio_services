package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="task_label")
public class TaskLabel {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="label_id")
  private long labelId;

  @Column(name="task_id")
  private long taskId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="position_candidate_feedback_id")
  private long positionCandidateFeedbackId;

  @Column(name="contact_comment_id")
  private long contactCommentId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getLabelId() {
    return this.labelId;
  }

  public void setLabelId(long labelId) {
    this.labelId = labelId;
  }

  public long getTaskId() {
    return this.taskId;
  }

  public void setTaskId(long taskId) {
    this.taskId = taskId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getPositionCandidateFeedbackId() {
    return this.positionCandidateFeedbackId;
  }

  public void setPositionCandidateFeedbackId(long positionCandidateFeedbackId) {
    this.positionCandidateFeedbackId = positionCandidateFeedbackId;
  }

  public long getContactCommentId() {
    return this.contactCommentId;
  }

  public void setContactCommentId(long contactCommentId) {
    this.contactCommentId = contactCommentId;
  }
}
