package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mail_template_category_recipient")
public class MailTemplateCategoryRecipient {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="recipient_id")
  private long recipientId;

  @Column(name="category_id")
  private long categoryId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getRecipientId() {
    return this.recipientId;
  }

  public void setRecipientId(long recipientId) {
    this.recipientId = recipientId;
  }

  public long getCategoryId() {
    return this.categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
