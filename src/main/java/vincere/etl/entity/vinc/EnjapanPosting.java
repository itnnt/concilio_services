package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="enjapan_posting")
public class EnjapanPosting {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="job_detail_id")
  private long jobDetailId;

  @Column(name="code")
  private String code;

  @Column(name="result")
  private String result;

  @Column(name="message")
  private String message;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="user_id")
  private long userId;

  @Column(name="action")
  private String action;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getJobDetailId() {
    return this.jobDetailId;
  }

  public void setJobDetailId(long jobDetailId) {
    this.jobDetailId = jobDetailId;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getResult() {
    return this.result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(String action) {
    this.action = action;
  }
}
