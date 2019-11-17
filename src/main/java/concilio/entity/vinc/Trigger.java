package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trigger")
public class Trigger {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="display_on_company")
  private long displayOnCompany;

  @Column(name="display_on_lead")
  private long displayOnLead;

  @Column(name="display_on_opportunity")
  private long displayOnOpportunity;

  @Column(name="display_on_account")
  private long displayOnAccount;

  @Column(name="dest_status")
  private long destStatus;

  @Column(name="dest_board")
  private long destBoard;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="deleted_timestamp")
  private java.sql.Timestamp deletedTimestamp;

  @Column(name="additional_trigger")
  private long additionalTrigger;

  @Column(name="manual_trigger")
  private long manualTrigger;


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

  public long getDisplayOnCompany() {
    return this.displayOnCompany;
  }

  public void setDisplayOnCompany(long displayOnCompany) {
    this.displayOnCompany = displayOnCompany;
  }

  public long getDisplayOnLead() {
    return this.displayOnLead;
  }

  public void setDisplayOnLead(long displayOnLead) {
    this.displayOnLead = displayOnLead;
  }

  public long getDisplayOnOpportunity() {
    return this.displayOnOpportunity;
  }

  public void setDisplayOnOpportunity(long displayOnOpportunity) {
    this.displayOnOpportunity = displayOnOpportunity;
  }

  public long getDisplayOnAccount() {
    return this.displayOnAccount;
  }

  public void setDisplayOnAccount(long displayOnAccount) {
    this.displayOnAccount = displayOnAccount;
  }

  public long getDestStatus() {
    return this.destStatus;
  }

  public void setDestStatus(long destStatus) {
    this.destStatus = destStatus;
  }

  public long getDestBoard() {
    return this.destBoard;
  }

  public void setDestBoard(long destBoard) {
    this.destBoard = destBoard;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getDeletedTimestamp() {
    return this.deletedTimestamp;
  }

  public void setDeletedTimestamp(java.sql.Timestamp deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  public long getAdditionalTrigger() {
    return this.additionalTrigger;
  }

  public void setAdditionalTrigger(long additionalTrigger) {
    this.additionalTrigger = additionalTrigger;
  }

  public long getManualTrigger() {
    return this.manualTrigger;
  }

  public void setManualTrigger(long manualTrigger) {
    this.manualTrigger = manualTrigger;
  }
}
