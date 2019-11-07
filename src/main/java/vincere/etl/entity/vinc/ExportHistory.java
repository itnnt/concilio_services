package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="export_history")
public class ExportHistory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_id")
  private long userId;

  @Column(name="history_content")
  private String historyContent;

  @Column(name="result")
  private long result;

  @Column(name="result_content")
  private String resultContent;

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

  public String getHistoryContent() {
    return this.historyContent;
  }

  public void setHistoryContent(String historyContent) {
    this.historyContent = historyContent;
  }

  public long getResult() {
    return this.result;
  }

  public void setResult(long result) {
    this.result = result;
  }

  public String getResultContent() {
    return this.resultContent;
  }

  public void setResultContent(String resultContent) {
    this.resultContent = resultContent;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
