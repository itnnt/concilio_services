package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_candidate_source")
public class PositionCandidateSource {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="accepted_date")
  private java.sql.Timestamp acceptedDate;

  @Column(name="terminated_date")
  private java.sql.Timestamp terminatedDate;

  @Column(name="hired_candidate_id")
  private long hiredCandidateId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public java.sql.Timestamp getAcceptedDate() {
    return this.acceptedDate;
  }

  public void setAcceptedDate(java.sql.Timestamp acceptedDate) {
    this.acceptedDate = acceptedDate;
  }

  public java.sql.Timestamp getTerminatedDate() {
    return this.terminatedDate;
  }

  public void setTerminatedDate(java.sql.Timestamp terminatedDate) {
    this.terminatedDate = terminatedDate;
  }

  public long getHiredCandidateId() {
    return this.hiredCandidateId;
  }

  public void setHiredCandidateId(long hiredCandidateId) {
    this.hiredCandidateId = hiredCandidateId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
