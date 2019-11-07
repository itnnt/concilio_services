package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class UserAccountTrainingId implements Serializable {
  private long userAccountId;
  private long trainingId;
  private String language;

}

@Entity
@Table(name="user_account_training")
@IdClass(UserAccountTrainingId.class)
public class UserAccountTraining {


  @Id
  @Column(name="user_account_id")
  private long userAccountId;

  @Id
  @Column(name="training_id")
  private long trainingId;

  @Id
  @Column(name="language")
  private String language;

  @Column(name="status")
  private long status;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getTrainingId() {
    return this.trainingId;
  }

  public void setTrainingId(long trainingId) {
    this.trainingId = trainingId;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
