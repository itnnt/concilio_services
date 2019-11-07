package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="placement_export_history")
public class PlacementExportHistory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="exported_by_user_id")
  private long exportedByUserId;

  @Column(name="exported_by_name")
  private String exportedByName;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="candidate_name")
  private String candidateName;

  @Column(name="position_type")
  private long positionType;

  @Column(name="invoice_number")
  private String invoiceNumber;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="export_to")
  private String exportTo;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public long getExportedByUserId() {
    return this.exportedByUserId;
  }

  public void setExportedByUserId(long exportedByUserId) {
    this.exportedByUserId = exportedByUserId;
  }

  public String getExportedByName() {
    return this.exportedByName;
  }

  public void setExportedByName(String exportedByName) {
    this.exportedByName = exportedByName;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public String getCandidateName() {
    return this.candidateName;
  }

  public void setCandidateName(String candidateName) {
    this.candidateName = candidateName;
  }

  public long getPositionType() {
    return this.positionType;
  }

  public void setPositionType(long positionType) {
    this.positionType = positionType;
  }

  public String getInvoiceNumber() {
    return this.invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getExportTo() {
    return this.exportTo;
  }

  public void setExportTo(String exportTo) {
    this.exportTo = exportTo;
  }
}
