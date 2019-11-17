package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sign_request_history")
public class SignRequestHistory {


  @Id
  @Column(name="id")
  private String id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="status")
  private String status;

  @Column(name="sign_request_status")
  private String signRequestStatus;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="document_builder_type")
  private String documentBuilderType;


  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public long getOfferId() {
    return this.offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSignRequestStatus() {
    return this.signRequestStatus;
  }

  public void setSignRequestStatus(String signRequestStatus) {
    this.signRequestStatus = signRequestStatus;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getDocumentBuilderType() {
    return this.documentBuilderType;
  }

  public void setDocumentBuilderType(String documentBuilderType) {
    this.documentBuilderType = documentBuilderType;
  }
}
