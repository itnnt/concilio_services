package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_position_skill")
public class CandidatePositionSkill {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="position_rating_skill_id")
  private long positionRatingSkillId;

  @Column(name="rating")
  private long rating;

  @Column(name="user_id")
  private long userId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="interview_id")
  private long interviewId;

  @Column(name="additional_user_id")
  private long additionalUserId;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="rating_question")
  private String ratingQuestion;

  @Column(name="stage")
  private long stage;

  @Column(name="user_name")
  private String userName;


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

  public long getPositionRatingSkillId() {
    return this.positionRatingSkillId;
  }

  public void setPositionRatingSkillId(long positionRatingSkillId) {
    this.positionRatingSkillId = positionRatingSkillId;
  }

  public long getRating() {
    return this.rating;
  }

  public void setRating(long rating) {
    this.rating = rating;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getInterviewId() {
    return this.interviewId;
  }

  public void setInterviewId(long interviewId) {
    this.interviewId = interviewId;
  }

  public long getAdditionalUserId() {
    return this.additionalUserId;
  }

  public void setAdditionalUserId(long additionalUserId) {
    this.additionalUserId = additionalUserId;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public String getRatingQuestion() {
    return this.ratingQuestion;
  }

  public void setRatingQuestion(String ratingQuestion) {
    this.ratingQuestion = ratingQuestion;
  }

  public long getStage() {
    return this.stage;
  }

  public void setStage(long stage) {
    this.stage = stage;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
