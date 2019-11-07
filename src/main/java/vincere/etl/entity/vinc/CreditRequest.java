package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="credit_request")
public class CreditRequest {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="status")
  private String status;

  @Column(name="requester_id")
  private long requesterId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="credit_added_date")
  private java.sql.Timestamp creditAddedDate;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getRequesterId() {
    return this.requesterId;
  }

  public void setRequesterId(long requesterId) {
    this.requesterId = requesterId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getCreditAddedDate() {
    return this.creditAddedDate;
  }

  public void setCreditAddedDate(java.sql.Timestamp creditAddedDate) {
    this.creditAddedDate = creditAddedDate;
  }
}
