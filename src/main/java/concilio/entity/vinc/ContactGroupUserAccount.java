package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_group_user_account")
public class ContactGroupUserAccount {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="contact_group_id")
  private long contactGroupId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getContactGroupId() {
    return this.contactGroupId;
  }

  public void setContactGroupId(long contactGroupId) {
    this.contactGroupId = contactGroupId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
