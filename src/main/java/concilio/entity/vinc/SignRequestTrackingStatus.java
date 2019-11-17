package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sign_request_tracking_status")
public class SignRequestTrackingStatus {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="sign_request_uuid")
  private String signRequestUuid;

  @Column(name="signer_id")
  private long signerId;

  @Column(name="signer_order")
  private long signerOrder;

  @Column(name="email")
  private String email;

  @Column(name="signer_status")
  private String signerStatus;

  @Column(name="signer_type")
  private String signerType;

  @Column(name="document_builder_type")
  private String documentBuilderType;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getSignRequestUuid() {
    return this.signRequestUuid;
  }

  public void setSignRequestUuid(String signRequestUuid) {
    this.signRequestUuid = signRequestUuid;
  }

  public long getSignerId() {
    return this.signerId;
  }

  public void setSignerId(long signerId) {
    this.signerId = signerId;
  }

  public long getSignerOrder() {
    return this.signerOrder;
  }

  public void setSignerOrder(long signerOrder) {
    this.signerOrder = signerOrder;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSignerStatus() {
    return this.signerStatus;
  }

  public void setSignerStatus(String signerStatus) {
    this.signerStatus = signerStatus;
  }

  public String getSignerType() {
    return this.signerType;
  }

  public void setSignerType(String signerType) {
    this.signerType = signerType;
  }

  public String getDocumentBuilderType() {
    return this.documentBuilderType;
  }

  public void setDocumentBuilderType(String documentBuilderType) {
    this.documentBuilderType = documentBuilderType;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
