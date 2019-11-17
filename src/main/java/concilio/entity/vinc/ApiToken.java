package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="api_token")
public class ApiToken {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="api_key")
  private String apiKey;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="last_updated_timestamp")
  private java.sql.Timestamp lastUpdatedTimestamp;

  @Column(name="status")
  private String status;

  @Column(name="user_id")
  private long userId;

  @Column(name="amazon_id")
  private String amazonId;

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

  public String getApiKey() {
    return this.apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getLastUpdatedTimestamp() {
    return this.lastUpdatedTimestamp;
  }

  public void setLastUpdatedTimestamp(java.sql.Timestamp lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
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

  public String getAmazonId() {
    return this.amazonId;
  }

  public void setAmazonId(String amazonId) {
    this.amazonId = amazonId;
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
