package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sign_request_tracking_document")
public class SignRequestTrackingDocument {


  @Id
  @Column(name="id")
  private String id;

  @Column(name="document_name")
  private String documentName;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="company_id")
  private long companyId;

  @Column(name="offer_signatory_id")
  private long offerSignatoryId;

  @Column(name="requestor_id")
  private long requestorId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="status")
  private String status;

  @Column(name="download_url")
  private String downloadUrl;


  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDocumentName() {
    return this.documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public long getOfferSignatoryId() {
    return this.offerSignatoryId;
  }

  public void setOfferSignatoryId(long offerSignatoryId) {
    this.offerSignatoryId = offerSignatoryId;
  }

  public long getRequestorId() {
    return this.requestorId;
  }

  public void setRequestorId(long requestorId) {
    this.requestorId = requestorId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDownloadUrl() {
    return this.downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }
}
