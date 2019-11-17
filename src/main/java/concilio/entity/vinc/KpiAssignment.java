package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class KpiAssignmentId implements Serializable {
  private long kpiLibraryId;
  private long userAccountId;
  private long timeFrame;
  private java.sql.Timestamp startDate;

}

@Entity
@Table(name="kpi_assignment")
@IdClass(KpiAssignmentId.class)
public class KpiAssignment {


  @Id
  @Column(name="kpi_library_id")
  private long kpiLibraryId;

  @Id
  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="target_score")
  private double targetScore;

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

  @Column(name="currency_type")
  private String currencyType;


  public long getKpiLibraryId() {
    return this.kpiLibraryId;
  }

  public void setKpiLibraryId(long kpiLibraryId) {
    this.kpiLibraryId = kpiLibraryId;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public double getTargetScore() {
    return this.targetScore;
  }

  public void setTargetScore(double targetScore) {
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

  public String getCurrencyType() {
    return this.currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }
}
