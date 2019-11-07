package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="receipt")
public class Receipt {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="amount")
  private double amount;

  @Column(name="date")
  private java.sql.Timestamp date;

  @Column(name="description")
  private String description;

  @Column(name="image")
  private String image;

  @Column(name="candidate_document_id")
  private long candidateDocumentId;

  @Column(name="allowance_id")
  private long allowanceId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public double getAmount() {
    return this.amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public java.sql.Timestamp getDate() {
    return this.date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImage() {
    return this.image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public long getCandidateDocumentId() {
    return this.candidateDocumentId;
  }

  public void setCandidateDocumentId(long candidateDocumentId) {
    this.candidateDocumentId = candidateDocumentId;
  }

  public long getAllowanceId() {
    return this.allowanceId;
  }

  public void setAllowanceId(long allowanceId) {
    this.allowanceId = allowanceId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
