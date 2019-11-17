package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class CandidateUserAddedDocumentCompositeId implements Serializable {
  private long tabId;
  private long candidateDocumentId;
}

@Entity
@Table(name="candidate_user_added_document")
@IdClass(CandidateUserAddedDocumentCompositeId.class)
public class CandidateUserAddedDocument {

  @Id
  @Column(name="tab_id")
  private long tabId;

  @Id
  @Column(name="candidate_document_id")
  private long candidateDocumentId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getTabId() {
    return this.tabId;
  }

  public void setTabId(long tabId) {
    this.tabId = tabId;
  }

  public long getCandidateDocumentId() {
    return this.candidateDocumentId;
  }

  public void setCandidateDocumentId(long candidateDocumentId) {
    this.candidateDocumentId = candidateDocumentId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
