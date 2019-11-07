package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="association_comment")
public class AssociationComment {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="trigger_comment_id")
  private long triggerCommentId;

  @Column(name="contact_comment_id")
  private long contactCommentId;

  @Column(name="feedback_comment_id")
  private long feedbackCommentId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getTriggerCommentId() {
    return this.triggerCommentId;
  }

  public void setTriggerCommentId(long triggerCommentId) {
    this.triggerCommentId = triggerCommentId;
  }

  public long getContactCommentId() {
    return this.contactCommentId;
  }

  public void setContactCommentId(long contactCommentId) {
    this.contactCommentId = contactCommentId;
  }

  public long getFeedbackCommentId() {
    return this.feedbackCommentId;
  }

  public void setFeedbackCommentId(long feedbackCommentId) {
    this.feedbackCommentId = feedbackCommentId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
