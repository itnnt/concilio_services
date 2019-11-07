package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="vol_job_post")
public class VolJobPost {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="vol_id")
  private long volId;

  @Column(name="position_id")
  private long positionId;

  @Column(name="vol_url")
  private String volUrl;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="status")
  private String status;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="request")
  private String request;

  @Column(name="response")
  private String response;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getVolId() {
    return this.volId;
  }

  public void setVolId(long volId) {
    this.volId = volId;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public String getVolUrl() {
    return this.volUrl;
  }

  public void setVolUrl(String volUrl) {
    this.volUrl = volUrl;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getRequest() {
    return this.request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public String getResponse() {
    return this.response;
  }

  public void setResponse(String response) {
    this.response = response;
  }
}
