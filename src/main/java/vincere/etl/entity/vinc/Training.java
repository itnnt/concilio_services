package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class TrainingId implements Serializable {
  private long trainingId;
  private String language;

}
@Entity
@Table(name="training")
@IdClass(TrainingId.class)
public class Training {


  @Id
  @Column(name="training_id")
  private long trainingId;

  @Id
  @Column(name="language")
  private String language;

  @Column(name="url")
  private String url;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


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

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
