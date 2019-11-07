package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_candidate_document_note")
public class PositionCandidateDocumentNote {


  @Id
  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="candidate_document_id")
  private long candidateDocumentId;

  @Column(name="candidate_note_id")
  private long candidateNoteId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="candidate_note_read")
  private long candidateNoteRead;


  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public long getCandidateDocumentId() {
    return this.candidateDocumentId;
  }

  public void setCandidateDocumentId(long candidateDocumentId) {
    this.candidateDocumentId = candidateDocumentId;
  }

  public long getCandidateNoteId() {
    return this.candidateNoteId;
  }

  public void setCandidateNoteId(long candidateNoteId) {
    this.candidateNoteId = candidateNoteId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getCandidateNoteRead() {
    return this.candidateNoteRead;
  }

  public void setCandidateNoteRead(long candidateNoteRead) {
    this.candidateNoteRead = candidateNoteRead;
  }
}
