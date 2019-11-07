package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="user_account_cost_center")
public class UserAccountCostCenter {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="cost_center_id")
  private long costCenterId;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="signatory")
  private long signatory;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCostCenterId() {
    return this.costCenterId;
  }

  public void setCostCenterId(long costCenterId) {
    this.costCenterId = costCenterId;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getSignatory() {
    return this.signatory;
  }

  public void setSignatory(long signatory) {
    this.signatory = signatory;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
