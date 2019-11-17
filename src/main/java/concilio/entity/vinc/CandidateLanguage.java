package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class CandidateLanguageId implements Serializable {
  private long candidateId;
  private String languageCode;

}

@Entity
@Table(name="candidate_language")
@IdClass(CandidateLanguageId.class)
public class CandidateLanguage {


  @Id
  @Column(name="candidate_id")
  private long candidateId;

  @Id
  @Column(name="language_code")
  private String languageCode;

  @Column(name="level")
  private long level;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public String getLanguageCode() {
    return this.languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public long getLevel() {
    return this.level;
  }

  public void setLevel(long level) {
    this.level = level;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
