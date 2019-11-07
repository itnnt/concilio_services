package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="equest_posting")
public class EquestPosting {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="job_detail_id")
  private long jobDetailId;

  @Column(name="requisition_number")
  private String requisitionNumber;

  @Column(name="return_data")
  private String returnData;

  @Column(name="state")
  private long state;

  @Column(name="create_date")
  private java.sql.Timestamp createDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="action")
  private String action;

  @Column(name="user_id")
  private long userId;

  @Column(name="action_name")
  private String actionName;

  @Column(name="message")
  private String message;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getJobDetailId() {
    return this.jobDetailId;
  }

  public void setJobDetailId(long jobDetailId) {
    this.jobDetailId = jobDetailId;
  }

  public String getRequisitionNumber() {
    return this.requisitionNumber;
  }

  public void setRequisitionNumber(String requisitionNumber) {
    this.requisitionNumber = requisitionNumber;
  }

  public String getReturnData() {
    return this.returnData;
  }

  public void setReturnData(String returnData) {
    this.returnData = returnData;
  }

  public long getState() {
    return this.state;
  }

  public void setState(long state) {
    this.state = state;
  }

  public java.sql.Timestamp getCreateDate() {
    return this.createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getActionName() {
    return this.actionName;
  }

  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
