package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_log")
public class PositionLog {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="event_type")
  private long eventType;

  @Column(name="interview_id")
  private long interviewId;

  @Column(name="head_count")
  private long headCount;

  @Column(name="occurred_date")
  private java.sql.Timestamp occurredDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="interview_status")
  private String interviewStatus;


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

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public long getEventType() {
    return this.eventType;
  }

  public void setEventType(long eventType) {
    this.eventType = eventType;
  }

  public long getInterviewId() {
    return this.interviewId;
  }

  public void setInterviewId(long interviewId) {
    this.interviewId = interviewId;
  }

  public long getHeadCount() {
    return this.headCount;
  }

  public void setHeadCount(long headCount) {
    this.headCount = headCount;
  }

  public java.sql.Timestamp getOccurredDate() {
    return this.occurredDate;
  }

  public void setOccurredDate(java.sql.Timestamp occurredDate) {
    this.occurredDate = occurredDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getInterviewStatus() {
    return this.interviewStatus;
  }

  public void setInterviewStatus(String interviewStatus) {
    this.interviewStatus = interviewStatus;
  }
}
