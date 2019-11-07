package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_source_document")
public class CandidateSourceDocument {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="terms_of_business_document_id")
  private long termsOfBusinessDocumentId;

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

  public long getTermsOfBusinessDocumentId() {
    return this.termsOfBusinessDocumentId;
  }

  public void setTermsOfBusinessDocumentId(long termsOfBusinessDocumentId) {
    this.termsOfBusinessDocumentId = termsOfBusinessDocumentId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
