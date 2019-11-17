package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="document_types_verifier")
public class DocumentTypesVerifier {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="verifier_id")
  private long verifierId;

  @Column(name="document_types_id")
  private long documentTypesId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getVerifierId() {
    return this.verifierId;
  }

  public void setVerifierId(long verifierId) {
    this.verifierId = verifierId;
  }

  public long getDocumentTypesId() {
    return this.documentTypesId;
  }

  public void setDocumentTypesId(long documentTypesId) {
    this.documentTypesId = documentTypesId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
