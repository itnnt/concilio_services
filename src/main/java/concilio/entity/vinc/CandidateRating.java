package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_rating")
public class CandidateRating {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="average_rating_score")
  private String averageRatingScore;

  @Column(name="rating_comment")
  private String ratingComment;

  @Column(name="user_id")
  private long userId;

  @Column(name="stage")
  private long stage;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="contact_id")
  private long contactId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public String getAverageRatingScore() {
    return this.averageRatingScore;
  }

  public void setAverageRatingScore(String averageRatingScore) {
    this.averageRatingScore = averageRatingScore;
  }

  public String getRatingComment() {
    return this.ratingComment;
  }

  public void setRatingComment(String ratingComment) {
    this.ratingComment = ratingComment;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public long getStage() {
    return this.stage;
  }

  public void setStage(long stage) {
    this.stage = stage;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }
}
