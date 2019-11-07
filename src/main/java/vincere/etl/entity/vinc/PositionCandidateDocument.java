package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class PositionCandidateDocumentId implements Serializable {
  private long positionCandidateId;
  private long documentId;

}
@Entity
@Table(name="position_candidate_document")
@IdClass(PositionCandidateDocumentId.class)
public class PositionCandidateDocument {


  @Id
  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Id
  @Column(name="document_id")
  private long documentId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public long getDocumentId() {
    return this.documentId;
  }

  public void setDocumentId(long documentId) {
    this.documentId = documentId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
