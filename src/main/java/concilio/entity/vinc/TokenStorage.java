package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="token_storage")
public class TokenStorage {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_id")
  private long userId;

  @Column(name="token")
  private String token;

  @Column(name="token_secret")
  private String tokenSecret;

  @Column(name="session_handle")
  private String sessionHandle;

  @Column(name="token_timestamp")
  private long tokenTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getToken() {
    return this.token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getTokenSecret() {
    return this.tokenSecret;
  }

  public void setTokenSecret(String tokenSecret) {
    this.tokenSecret = tokenSecret;
  }

  public String getSessionHandle() {
    return this.sessionHandle;
  }

  public void setSessionHandle(String sessionHandle) {
    this.sessionHandle = sessionHandle;
  }

  public long getTokenTimestamp() {
    return this.tokenTimestamp;
  }

  public void setTokenTimestamp(long tokenTimestamp) {
    this.tokenTimestamp = tokenTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
