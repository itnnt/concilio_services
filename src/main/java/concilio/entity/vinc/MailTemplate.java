package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mail_template")
public class MailTemplate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="mail_template_category_id")
  private long mailTemplateCategoryId;

  @Column(name="name")
  private String name;

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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
