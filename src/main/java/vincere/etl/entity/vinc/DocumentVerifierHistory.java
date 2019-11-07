package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="document_verifier_history")
public class DocumentVerifierHistory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="doc_id")
  private long docId;

  @Column(name="verifier_id")
  private long verifierId;

  @Column(name="insert_timestamp")
  private java.sql.Time insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getDocId() {
    return this.docId;
  }

  public void setDocId(long docId) {
    this.docId = docId;
  }

  public long getVerifierId() {
    return this.verifierId;
  }

  public void setVerifierId(long verifierId) {
    this.verifierId = verifierId;
  }

  public java.sql.Time getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Time insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
