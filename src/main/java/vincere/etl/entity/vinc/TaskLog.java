package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="task_log")
public class TaskLog {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="task_id")
  private long taskId;

  @Column(name="user_id")
  private long userId;

  @Column(name="field_name")
  private String fieldName;

  @Column(name="before_value")
  private String beforeValue;

  @Column(name="after_value")
  private String afterValue;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getTaskId() {
    return this.taskId;
  }

  public void setTaskId(long taskId) {
    this.taskId = taskId;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getFieldName() {
    return this.fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public String getBeforeValue() {
    return this.beforeValue;
  }

  public void setBeforeValue(String beforeValue) {
    this.beforeValue = beforeValue;
  }

  public String getAfterValue() {
    return this.afterValue;
  }

  public void setAfterValue(String afterValue) {
    this.afterValue = afterValue;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
