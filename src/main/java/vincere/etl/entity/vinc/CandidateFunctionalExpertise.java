package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_functional_expertise")
public class CandidateFunctionalExpertise {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="functional_expertise_id")
  private long functionalExpertiseId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="sub_functional_expertise_id")
  private long subFunctionalExpertiseId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getFunctionalExpertiseId() {
    return this.functionalExpertiseId;
  }

  public void setFunctionalExpertiseId(long functionalExpertiseId) {
    this.functionalExpertiseId = functionalExpertiseId;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getSubFunctionalExpertiseId() {
    return this.subFunctionalExpertiseId;
  }

  public void setSubFunctionalExpertiseId(long subFunctionalExpertiseId) {
    this.subFunctionalExpertiseId = subFunctionalExpertiseId;
  }
}
