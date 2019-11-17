package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_status_log")
public class ContactStatusLog {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="company_id")
  private long companyId;

  @Column(name="new_board")
  private long newBoard;

  @Column(name="old_board")
  private long oldBoard;

  @Column(name="new_status")
  private long newStatus;

  @Column(name="old_status")
  private long oldStatus;

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

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public long getNewBoard() {
    return this.newBoard;
  }

  public void setNewBoard(long newBoard) {
    this.newBoard = newBoard;
  }

  public long getOldBoard() {
    return this.oldBoard;
  }

  public void setOldBoard(long oldBoard) {
    this.oldBoard = oldBoard;
  }

  public long getNewStatus() {
    return this.newStatus;
  }

  public void setNewStatus(long newStatus) {
    this.newStatus = newStatus;
  }

  public long getOldStatus() {
    return this.oldStatus;
  }

  public void setOldStatus(long oldStatus) {
    this.oldStatus = oldStatus;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
