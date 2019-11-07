package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_linked_in_resume")
public class CandidateLinkedInResume {


  @Column(name="id")
  private long id;

  @Id
  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="linked_in_resume_content")
  private String linkedInResumeContent;

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

  public String getLinkedInResumeContent() {
    return this.linkedInResumeContent;
  }

  public void setLinkedInResumeContent(String linkedInResumeContent) {
    this.linkedInResumeContent = linkedInResumeContent;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
