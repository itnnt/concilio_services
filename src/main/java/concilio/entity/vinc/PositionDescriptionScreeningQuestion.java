package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_description_screening_question")
public class PositionDescriptionScreeningQuestion {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="index")
  private long index;

  @Column(name="question_text")
  private String questionText;

  @Column(name="success_answer")
  private String successAnswer;

  @Column(name="fail_answer")
  private String failAnswer;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getIndex() {
    return this.index;
  }

  public void setIndex(long index) {
    this.index = index;
  }

  public String getQuestionText() {
    return this.questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public String getSuccessAnswer() {
    return this.successAnswer;
  }

  public void setSuccessAnswer(String successAnswer) {
    this.successAnswer = successAnswer;
  }

  public String getFailAnswer() {
    return this.failAnswer;
  }

  public void setFailAnswer(String failAnswer) {
    this.failAnswer = failAnswer;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
