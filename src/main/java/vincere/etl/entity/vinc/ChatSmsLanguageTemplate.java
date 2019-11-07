package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="chat_sms_language_template")
public class ChatSmsLanguageTemplate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="lang")
  private String lang;

  @Column(name="content")
  private String content;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="chat_sms_template_id")
  private long chatSmsTemplateId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLang() {
    return this.lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getChatSmsTemplateId() {
    return this.chatSmsTemplateId;
  }

  public void setChatSmsTemplateId(long chatSmsTemplateId) {
    this.chatSmsTemplateId = chatSmsTemplateId;
  }
}
