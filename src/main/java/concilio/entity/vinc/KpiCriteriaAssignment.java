package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class KpiCriteriaAssignmentId implements Serializable {
  private long kpiCriteriaId;
  private long userId;
  private long timeFrame;
  private java.sql.Timestamp startDate;

}

@Entity
@Table(name="kpi_criteria_assignment")
@IdClass(KpiCriteriaAssignmentId.class)
public class KpiCriteriaAssignment {


  @Id
  @Column(name="kpi_criteria_id")
  private long kpiCriteriaId;

  @Id
  @Column(name="user_id")
  private long userId;

  @Column(name="target_score")
  private long targetScore;

  @Id
  @Column(name="time_frame")
  private long timeFrame;

  @Id
  @Column(name="start_date")
  private java.sql.Timestamp startDate;

  @Column(name="end_date")
  private java.sql.Timestamp endDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getKpiCriteriaId() {
    return this.kpiCriteriaId;
  }

  public void setKpiCriteriaId(long kpiCriteriaId) {
    this.kpiCriteriaId = kpiCriteriaId;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public long getTargetScore() {
    return this.targetScore;
  }

  public void setTargetScore(long targetScore) {
    this.targetScore = targetScore;
  }

  public long getTimeFrame() {
    return this.timeFrame;
  }

  public void setTimeFrame(long timeFrame) {
    this.timeFrame = timeFrame;
  }

  public java.sql.Timestamp getStartDate() {
    return this.startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }

  public java.sql.Timestamp getEndDate() {
    return this.endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
