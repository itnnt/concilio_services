package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="en_japan_import_schedule")
public class EnJapanImportSchedule {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="condition_flag")
  private long conditionFlag;

  @Column(name="import_interval")
  private String importInterval;

  @Column(name="owner_id")
  private long ownerId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getConditionFlag() {
    return this.conditionFlag;
  }

  public void setConditionFlag(long conditionFlag) {
    this.conditionFlag = conditionFlag;
  }

  public String getImportInterval() {
    return this.importInterval;
  }

  public void setImportInterval(String importInterval) {
    this.importInterval = importInterval;
  }

  public long getOwnerId() {
    return this.ownerId;
  }

  public void setOwnerId(long ownerId) {
    this.ownerId = ownerId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
