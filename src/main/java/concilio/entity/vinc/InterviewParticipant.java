package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="interview_participant")
public class InterviewParticipant {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="interview_id")
  private long interviewId;

  @Column(name="interviewer_id")
  private long interviewerId;

  @Column(name="public_comments")
  private String publicComments;

  @Column(name="reject_comments")
  private String rejectComments;

  @Column(name="result")
  private String result;

  @Column(name="refer_to_vertical_id")
  private long referToVerticalId;

  @Column(name="refer_to_hr_id")
  private long referToHrId;

  @Column(name="refer_to_position_id")
  private long referToPositionId;

  @Column(name="feedback_date")
  private java.sql.Timestamp feedbackDate;

  @Column(name="feedback_reminder1_sent_date")
  private java.sql.Timestamp feedbackReminder1SentDate;

  @Column(name="feedback_reminder2_sent_date")
  private java.sql.Timestamp feedbackReminder2SentDate;

  @Column(name="feedback_submitted_by_id")
  private long feedbackSubmittedById;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="interview_time_preference1")
  private long interviewTimePreference1;

  @Column(name="interview_time_preference2")
  private long interviewTimePreference2;

  @Column(name="interview_time_preference3")
  private long interviewTimePreference3;

  @Column(name="interview_time_preference_submitted_timestamp")
  private java.sql.Timestamp interviewTimePreferenceSubmittedTimestamp;

  @Column(name="refer_comments")
  private String referComments;

  @Column(name="cancelled_date")
  private java.sql.Timestamp cancelledDate;

  @Column(name="as_interviewer")
  private long asInterviewer;

  @Column(name="as_line_manager")
  private long asLineManager;

  @Column(name="as_internal_recruiter")
  private long asInternalRecruiter;

  @Column(name="final_decision")
  private long finalDecision;

  @Column(name="waiting_signoff")
  private long waitingSignoff;

  @Column(name="as_hr")
  private long asHr;

  @Column(name="confirmed_interview_time")
  private long confirmedInterviewTime;

  @Column(name="not_attend_interview_comments")
  private String notAttendInterviewComments;

  @Column(name="not_attend_interview_comments_date")
  private java.sql.Timestamp notAttendInterviewCommentsDate;

  @Column(name="remind_me")
  private long remindMe;

  @Column(name="as_matrix_manager")
  private long asMatrixManager;

  @Column(name="as_business_partner")
  private long asBusinessPartner;

  @Column(name="additional_interviewer_id")
  private long additionalInterviewerId;

  @Column(name="request_feedback_date")
  private java.sql.Timestamp requestFeedbackDate;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getInterviewId() {
    return this.interviewId;
  }

  public void setInterviewId(long interviewId) {
    this.interviewId = interviewId;
  }

  public long getInterviewerId() {
    return this.interviewerId;
  }

  public void setInterviewerId(long interviewerId) {
    this.interviewerId = interviewerId;
  }

  public String getPublicComments() {
    return this.publicComments;
  }

  public void setPublicComments(String publicComments) {
    this.publicComments = publicComments;
  }

  public String getRejectComments() {
    return this.rejectComments;
  }

  public void setRejectComments(String rejectComments) {
    this.rejectComments = rejectComments;
  }

  public String getResult() {
    return this.result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public long getReferToVerticalId() {
    return this.referToVerticalId;
  }

  public void setReferToVerticalId(long referToVerticalId) {
    this.referToVerticalId = referToVerticalId;
  }

  public long getReferToHrId() {
    return this.referToHrId;
  }

  public void setReferToHrId(long referToHrId) {
    this.referToHrId = referToHrId;
  }

  public long getReferToPositionId() {
    return this.referToPositionId;
  }

  public void setReferToPositionId(long referToPositionId) {
    this.referToPositionId = referToPositionId;
  }

  public java.sql.Timestamp getFeedbackDate() {
    return this.feedbackDate;
  }

  public void setFeedbackDate(java.sql.Timestamp feedbackDate) {
    this.feedbackDate = feedbackDate;
  }

  public java.sql.Timestamp getFeedbackReminder1SentDate() {
    return this.feedbackReminder1SentDate;
  }

  public void setFeedbackReminder1SentDate(java.sql.Timestamp feedbackReminder1SentDate) {
    this.feedbackReminder1SentDate = feedbackReminder1SentDate;
  }

  public java.sql.Timestamp getFeedbackReminder2SentDate() {
    return this.feedbackReminder2SentDate;
  }

  public void setFeedbackReminder2SentDate(java.sql.Timestamp feedbackReminder2SentDate) {
    this.feedbackReminder2SentDate = feedbackReminder2SentDate;
  }

  public long getFeedbackSubmittedById() {
    return this.feedbackSubmittedById;
  }

  public void setFeedbackSubmittedById(long feedbackSubmittedById) {
    this.feedbackSubmittedById = feedbackSubmittedById;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getInterviewTimePreference1() {
    return this.interviewTimePreference1;
  }

  public void setInterviewTimePreference1(long interviewTimePreference1) {
    this.interviewTimePreference1 = interviewTimePreference1;
  }

  public long getInterviewTimePreference2() {
    return this.interviewTimePreference2;
  }

  public void setInterviewTimePreference2(long interviewTimePreference2) {
    this.interviewTimePreference2 = interviewTimePreference2;
  }

  public long getInterviewTimePreference3() {
    return this.interviewTimePreference3;
  }

  public void setInterviewTimePreference3(long interviewTimePreference3) {
    this.interviewTimePreference3 = interviewTimePreference3;
  }

  public java.sql.Timestamp getInterviewTimePreferenceSubmittedTimestamp() {
    return this.interviewTimePreferenceSubmittedTimestamp;
  }

  public void setInterviewTimePreferenceSubmittedTimestamp(java.sql.Timestamp interviewTimePreferenceSubmittedTimestamp) {
    this.interviewTimePreferenceSubmittedTimestamp = interviewTimePreferenceSubmittedTimestamp;
  }

  public String getReferComments() {
    return this.referComments;
  }

  public void setReferComments(String referComments) {
    this.referComments = referComments;
  }

  public java.sql.Timestamp getCancelledDate() {
    return this.cancelledDate;
  }

  public void setCancelledDate(java.sql.Timestamp cancelledDate) {
    this.cancelledDate = cancelledDate;
  }

  public long getAsInterviewer() {
    return this.asInterviewer;
  }

  public void setAsInterviewer(long asInterviewer) {
    this.asInterviewer = asInterviewer;
  }

  public long getAsLineManager() {
    return this.asLineManager;
  }

  public void setAsLineManager(long asLineManager) {
    this.asLineManager = asLineManager;
  }

  public long getAsInternalRecruiter() {
    return this.asInternalRecruiter;
  }

  public void setAsInternalRecruiter(long asInternalRecruiter) {
    this.asInternalRecruiter = asInternalRecruiter;
  }

  public long getFinalDecision() {
    return this.finalDecision;
  }

  public void setFinalDecision(long finalDecision) {
    this.finalDecision = finalDecision;
  }

  public long getWaitingSignoff() {
    return this.waitingSignoff;
  }

  public void setWaitingSignoff(long waitingSignoff) {
    this.waitingSignoff = waitingSignoff;
  }

  public long getAsHr() {
    return this.asHr;
  }

  public void setAsHr(long asHr) {
    this.asHr = asHr;
  }

  public long getConfirmedInterviewTime() {
    return this.confirmedInterviewTime;
  }

  public void setConfirmedInterviewTime(long confirmedInterviewTime) {
    this.confirmedInterviewTime = confirmedInterviewTime;
  }

  public String getNotAttendInterviewComments() {
    return this.notAttendInterviewComments;
  }

  public void setNotAttendInterviewComments(String notAttendInterviewComments) {
    this.notAttendInterviewComments = notAttendInterviewComments;
  }

  public java.sql.Timestamp getNotAttendInterviewCommentsDate() {
    return this.notAttendInterviewCommentsDate;
  }

  public void setNotAttendInterviewCommentsDate(java.sql.Timestamp notAttendInterviewCommentsDate) {
    this.notAttendInterviewCommentsDate = notAttendInterviewCommentsDate;
  }

  public long getRemindMe() {
    return this.remindMe;
  }

  public void setRemindMe(long remindMe) {
    this.remindMe = remindMe;
  }

  public long getAsMatrixManager() {
    return this.asMatrixManager;
  }

  public void setAsMatrixManager(long asMatrixManager) {
    this.asMatrixManager = asMatrixManager;
  }

  public long getAsBusinessPartner() {
    return this.asBusinessPartner;
  }

  public void setAsBusinessPartner(long asBusinessPartner) {
    this.asBusinessPartner = asBusinessPartner;
  }

  public long getAdditionalInterviewerId() {
    return this.additionalInterviewerId;
  }

  public void setAdditionalInterviewerId(long additionalInterviewerId) {
    this.additionalInterviewerId = additionalInterviewerId;
  }

  public java.sql.Timestamp getRequestFeedbackDate() {
    return this.requestFeedbackDate;
  }

  public void setRequestFeedbackDate(java.sql.Timestamp requestFeedbackDate) {
    this.requestFeedbackDate = requestFeedbackDate;
  }
}
