package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="onboarding_document_type")
public class OnboardingDocumentType {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="job_id")
  private long jobId;

  @Column(name="document_type_id")
  private long documentTypeId;

  @Column(name="description")
  private String description;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getJobId() {
    return this.jobId;
  }

  public void setJobId(long jobId) {
    this.jobId = jobId;
  }

  public long getDocumentTypeId() {
    return this.documentTypeId;
  }

  public void setDocumentTypeId(long documentTypeId) {
    this.documentTypeId = documentTypeId;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
