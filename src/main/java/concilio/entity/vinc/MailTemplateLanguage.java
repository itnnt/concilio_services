package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mail_template_language")
public class MailTemplateLanguage {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="mail_template_category_id")
  private long mailTemplateCategoryId;

  @Column(name="mail_template_id")
  private long mailTemplateId;

  @Column(name="language")
  private String language;

  @Column(name="to_address")
  private String toAddress;

  @Column(name="cc_address")
  private String ccAddress;

  @Column(name="subject")
  private String subject;

  @Column(name="body")
  private String body;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getMailTemplateCategoryId() {
    return this.mailTemplateCategoryId;
  }

  public void setMailTemplateCategoryId(long mailTemplateCategoryId) {
    this.mailTemplateCategoryId = mailTemplateCategoryId;
  }

  public long getMailTemplateId() {
    return this.mailTemplateId;
  }

  public void setMailTemplateId(long mailTemplateId) {
    this.mailTemplateId = mailTemplateId;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getToAddress() {
    return this.toAddress;
  }

  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }

  public String getCcAddress() {
    return this.ccAddress;
  }

  public void setCcAddress(String ccAddress) {
    this.ccAddress = ccAddress;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getBody() {
    return this.body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
