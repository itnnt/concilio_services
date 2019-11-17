package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_faq")
public class PositionFaq {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="question")
  private String question;

  @Column(name="asked_user_id")
  private long askedUserId;

  @Column(name="answer")
  private String answer;

  @Column(name="answered_user_id")
  private long answeredUserId;

  @Column(name="email_notify")
  private long emailNotify;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="asked_candidate_id")
  private long askedCandidateId;

  @Column(name="public_faq")
  private long publicFaq;

  @Column(name="answer_timestamp")
  private java.sql.Timestamp answerTimestamp;

  @Column(name="asked_external_approver_id")
  private long askedExternalApproverId;

  @Column(name="answered_external_approver_id")
  private long answeredExternalApproverId;


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

  public String getQuestion() {
    return this.question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public long getAskedUserId() {
    return this.askedUserId;
  }

  public void setAskedUserId(long askedUserId) {
    this.askedUserId = askedUserId;
  }

  public String getAnswer() {
    return this.answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public long getAnsweredUserId() {
    return this.answeredUserId;
  }

  public void setAnsweredUserId(long answeredUserId) {
    this.answeredUserId = answeredUserId;
  }

  public long getEmailNotify() {
    return this.emailNotify;
  }

  public void setEmailNotify(long emailNotify) {
    this.emailNotify = emailNotify;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getAskedCandidateId() {
    return this.askedCandidateId;
  }

  public void setAskedCandidateId(long askedCandidateId) {
    this.askedCandidateId = askedCandidateId;
  }

  public long getPublicFaq() {
    return this.publicFaq;
  }

  public void setPublicFaq(long publicFaq) {
    this.publicFaq = publicFaq;
  }

  public java.sql.Timestamp getAnswerTimestamp() {
    return this.answerTimestamp;
  }

  public void setAnswerTimestamp(java.sql.Timestamp answerTimestamp) {
    this.answerTimestamp = answerTimestamp;
  }

  public long getAskedExternalApproverId() {
    return this.askedExternalApproverId;
  }

  public void setAskedExternalApproverId(long askedExternalApproverId) {
    this.askedExternalApproverId = askedExternalApproverId;
  }

  public long getAnsweredExternalApproverId() {
    return this.answeredExternalApproverId;
  }

  public void setAnsweredExternalApproverId(long answeredExternalApproverId) {
    this.answeredExternalApproverId = answeredExternalApproverId;
  }
}
