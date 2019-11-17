package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="document_verifier")
public class DocumentVerifier {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="doc_id")
  private long docId;

  @Column(name="verifier_id")
  private long verifierId;

  @Column(name="verification_status")
  private String verificationStatus;

  @Column(name="verification_reason")
  private String verificationReason;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="verified_date")
  private java.sql.Timestamp verifiedDate;

  @Column(name="doc_type_id")
  private long docTypeId;


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

  public String getVerificationStatus() {
    return this.verificationStatus;
  }

  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  public String getVerificationReason() {
    return this.verificationReason;
  }

  public void setVerificationReason(String verificationReason) {
    this.verificationReason = verificationReason;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getVerifiedDate() {
    return this.verifiedDate;
  }

  public void setVerifiedDate(java.sql.Timestamp verifiedDate) {
    this.verifiedDate = verifiedDate;
  }

  public long getDocTypeId() {
    return this.docTypeId;
  }

  public void setDocTypeId(long docTypeId) {
    this.docTypeId = docTypeId;
  }
}
