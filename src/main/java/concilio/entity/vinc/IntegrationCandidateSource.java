package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="integration_candidate_source")
public class IntegrationCandidateSource {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="job_board_id")
  private long jobBoardId;

  @Column(name="job_board_type")
  private String jobBoardType;

  @Column(name="external_name")
  private String externalName;

  @Column(name="external_id")
  private String externalId;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getJobBoardId() {
    return this.jobBoardId;
  }

  public void setJobBoardId(long jobBoardId) {
    this.jobBoardId = jobBoardId;
  }

  public String getJobBoardType() {
    return this.jobBoardType;
  }

  public void setJobBoardType(String jobBoardType) {
    this.jobBoardType = jobBoardType;
  }

  public String getExternalName() {
    return this.externalName;
  }

  public void setExternalName(String externalName) {
    this.externalName = externalName;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
