package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chat_sms_template")
public class ChatSmsTemplate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="category")
  private String category;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="default_template")
  private long defaultTemplate;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
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

  public long getDefaultTemplate() {
    return this.defaultTemplate;
  }

  public void setDefaultTemplate(long defaultTemplate) {
    this.defaultTemplate = defaultTemplate;
  }
}
