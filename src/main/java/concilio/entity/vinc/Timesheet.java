package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timesheet")
public class Timesheet {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="timezone")
  private String timezone;

  @Column(name="period")
  private long period;

  @Column(name="start_date")
  private java.sql.Timestamp startDate;

  @Column(name="end_date")
  private java.sql.Timestamp endDate;

  @Column(name="timesheet_status")
  private long timesheetStatus;

  @Column(name="payroll_status")
  private long payrollStatus;

  @Column(name="modified_by")
  private long modifiedBy;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="approved_date")
  private java.sql.Timestamp approvedDate;

  @Column(name="rejected_date")
  private java.sql.Timestamp rejectedDate;

  @Column(name="external_id")
  private String externalId;

  @Column(name="merge_tsheet")
  private long mergeTsheet;

  @Column(name="timesheet_mode")
  private String timesheetMode;

  @Column(name="unapproved_date")
  private java.sql.Timestamp unapprovedDate;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public String getTimezone() {
    return this.timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public long getPeriod() {
    return this.period;
  }

  public void setPeriod(long period) {
    this.period = period;
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

  public long getTimesheetStatus() {
    return this.timesheetStatus;
  }

  public void setTimesheetStatus(long timesheetStatus) {
    this.timesheetStatus = timesheetStatus;
  }

  public long getPayrollStatus() {
    return this.payrollStatus;
  }

  public void setPayrollStatus(long payrollStatus) {
    this.payrollStatus = payrollStatus;
  }

  public long getModifiedBy() {
    return this.modifiedBy;
  }

  public void setModifiedBy(long modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getApprovedDate() {
    return this.approvedDate;
  }

  public void setApprovedDate(java.sql.Timestamp approvedDate) {
    this.approvedDate = approvedDate;
  }

  public java.sql.Timestamp getRejectedDate() {
    return this.rejectedDate;
  }

  public void setRejectedDate(java.sql.Timestamp rejectedDate) {
    this.rejectedDate = rejectedDate;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public long getMergeTsheet() {
    return this.mergeTsheet;
  }

  public void setMergeTsheet(long mergeTsheet) {
    this.mergeTsheet = mergeTsheet;
  }

  public String getTimesheetMode() {
    return this.timesheetMode;
  }

  public void setTimesheetMode(String timesheetMode) {
    this.timesheetMode = timesheetMode;
  }

  public java.sql.Timestamp getUnapprovedDate() {
    return this.unapprovedDate;
  }

  public void setUnapprovedDate(java.sql.Timestamp unapprovedDate) {
    this.unapprovedDate = unapprovedDate;
  }
}
