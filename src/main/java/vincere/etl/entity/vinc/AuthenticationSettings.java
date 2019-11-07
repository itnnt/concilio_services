package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="authentication_settings")
public class AuthenticationSettings {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="client_id")
  private String clientId;

  @Column(name="status")
  private String status;

  @Column(name="user_id")
  private long userId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="deleted_by_user_id")
  private long deletedByUserId;

  @Column(name="deleted_timestamp")
  private java.sql.Timestamp deletedTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getClientId() {
    return this.clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getDeletedByUserId() {
    return this.deletedByUserId;
  }

  public void setDeletedByUserId(long deletedByUserId) {
    this.deletedByUserId = deletedByUserId;
  }

  public java.sql.Timestamp getDeletedTimestamp() {
    return this.deletedTimestamp;
  }

  public void setDeletedTimestamp(java.sql.Timestamp deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }
}
