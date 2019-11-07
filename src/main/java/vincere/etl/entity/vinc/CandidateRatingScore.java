package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_rating_score")
public class CandidateRatingScore {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_rating_id")
  private long candidateRatingId;

  @Column(name="position_rating_id")
  private long positionRatingId;

  @Column(name="rating_score")
  private long ratingScore;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateRatingId() {
    return this.candidateRatingId;
  }

  public void setCandidateRatingId(long candidateRatingId) {
    this.candidateRatingId = candidateRatingId;
  }

  public long getPositionRatingId() {
    return this.positionRatingId;
  }

  public void setPositionRatingId(long positionRatingId) {
    this.positionRatingId = positionRatingId;
  }

  public long getRatingScore() {
    return this.ratingScore;
  }

  public void setRatingScore(long ratingScore) {
    this.ratingScore = ratingScore;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
