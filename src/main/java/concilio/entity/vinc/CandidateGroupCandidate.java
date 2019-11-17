package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_group_candidate")
public class CandidateGroupCandidate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="candidate_group_id")
  private long candidateGroupId;

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

  public long getCandidateGroupId() {
    return this.candidateGroupId;
  }

  public void setCandidateGroupId(long candidateGroupId) {
    this.candidateGroupId = candidateGroupId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
