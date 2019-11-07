package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="chat_sms_wildcard")
public class ChatSmsWildcard {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="label")
  private String label;

  @Column(name="code")
  private String code;

  @Column(name="category")
  private String category;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="key")
  private String key;

  @Column(name="sample_data")
  private String sampleData;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getSampleData() {
    return this.sampleData;
  }

  public void setSampleData(String sampleData) {
    this.sampleData = sampleData;
  }
}
