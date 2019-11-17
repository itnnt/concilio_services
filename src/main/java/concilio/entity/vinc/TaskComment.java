package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task_comment")
public class TaskComment {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="task_id")
  private long taskId;

  @Column(name="comment")
  private String comment;

  @Column(name="comment_by")
  private long commentBy;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="candidate_id")
  private long candidateId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getTaskId() {
    return this.taskId;
  }

  public void setTaskId(long taskId) {
    this.taskId = taskId;
  }

  public String getComment() {
    return this.comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public long getCommentBy() {
    return this.commentBy;
  }

  public void setCommentBy(long commentBy) {
    this.commentBy = commentBy;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }
}
