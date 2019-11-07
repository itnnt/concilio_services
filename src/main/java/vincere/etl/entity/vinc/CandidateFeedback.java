package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_feedback")
public class CandidateFeedback {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="interview_id")
  private long interviewId;

  @Column(name="feedback_timestamp")
  private java.sql.Timestamp feedbackTimestamp;

  @Column(name="comment_body")
  private String commentBody;

  @Column(name="feedback_score")
  private double feedbackScore;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getInterviewId() {
    return this.interviewId;
  }

  public void setInterviewId(long interviewId) {
    this.interviewId = interviewId;
  }

  public java.sql.Timestamp getFeedbackTimestamp() {
    return this.feedbackTimestamp;
  }

  public void setFeedbackTimestamp(java.sql.Timestamp feedbackTimestamp) {
    this.feedbackTimestamp = feedbackTimestamp;
  }

  public String getCommentBody() {
    return this.commentBody;
  }

  public void setCommentBody(String commentBody) {
    this.commentBody = commentBody;
  }

  public double getFeedbackScore() {
    return this.feedbackScore;
  }

  public void setFeedbackScore(double feedbackScore) {
    this.feedbackScore = feedbackScore;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
