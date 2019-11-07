package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="interview")
public class Interview {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="interview_date")
  private java.sql.Timestamp interviewDate;

  @Column(name="interview_date_time_from")
  private java.sql.Timestamp interviewDateTimeFrom;

  @Column(name="interview_no")
  private long interviewNo;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="recommended_date_time1")
  private java.sql.Timestamp recommendedDateTime1;

  @Column(name="recommended_date_time2")
  private java.sql.Timestamp recommendedDateTime2;

  @Column(name="recommended_date_time3")
  private java.sql.Timestamp recommendedDateTime3;

  @Column(name="meeting_length_mins")
  private long meetingLengthMins;

  @Column(name="cancelled_date")
  private java.sql.Timestamp cancelledDate;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="candidate_rejected_date1")
  private long candidateRejectedDate1;

  @Column(name="candidate_rejected_date2")
  private long candidateRejectedDate2;

  @Column(name="candidate_rejected_date3")
  private long candidateRejectedDate3;

  @Column(name="end_recommended_date_time1")
  private java.sql.Timestamp endRecommendedDateTime1;

  @Column(name="end_recommended_date_time2")
  private java.sql.Timestamp endRecommendedDateTime2;

  @Column(name="end_recommended_date_time3")
  private java.sql.Timestamp endRecommendedDateTime3;

  @Column(name="time_zone")
  private String timeZone;

  @Column(name="additional_user_id")
  private long additionalUserId;

  @Column(name="company_location_id")
  private long companyLocationId;

  @Column(name="contact_person_name")
  private String contactPersonName;

  @Column(name="interview_date_time_to")
  private java.sql.Timestamp interviewDateTimeTo;

  @Column(name="interview_key")
  private long interviewKey;

  @Column(name="other_location")
  private String otherLocation;


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

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public java.sql.Timestamp getInterviewDate() {
    return this.interviewDate;
  }

  public void setInterviewDate(java.sql.Timestamp interviewDate) {
    this.interviewDate = interviewDate;
  }

  public java.sql.Timestamp getInterviewDateTimeFrom() {
    return this.interviewDateTimeFrom;
  }

  public void setInterviewDateTimeFrom(java.sql.Timestamp interviewDateTimeFrom) {
    this.interviewDateTimeFrom = interviewDateTimeFrom;
  }

  public long getInterviewNo() {
    return this.interviewNo;
  }

  public void setInterviewNo(long interviewNo) {
    this.interviewNo = interviewNo;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getRecommendedDateTime1() {
    return this.recommendedDateTime1;
  }

  public void setRecommendedDateTime1(java.sql.Timestamp recommendedDateTime1) {
    this.recommendedDateTime1 = recommendedDateTime1;
  }

  public java.sql.Timestamp getRecommendedDateTime2() {
    return this.recommendedDateTime2;
  }

  public void setRecommendedDateTime2(java.sql.Timestamp recommendedDateTime2) {
    this.recommendedDateTime2 = recommendedDateTime2;
  }

  public java.sql.Timestamp getRecommendedDateTime3() {
    return this.recommendedDateTime3;
  }

  public void setRecommendedDateTime3(java.sql.Timestamp recommendedDateTime3) {
    this.recommendedDateTime3 = recommendedDateTime3;
  }

  public long getMeetingLengthMins() {
    return this.meetingLengthMins;
  }

  public void setMeetingLengthMins(long meetingLengthMins) {
    this.meetingLengthMins = meetingLengthMins;
  }

  public java.sql.Timestamp getCancelledDate() {
    return this.cancelledDate;
  }

  public void setCancelledDate(java.sql.Timestamp cancelledDate) {
    this.cancelledDate = cancelledDate;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getCandidateRejectedDate1() {
    return this.candidateRejectedDate1;
  }

  public void setCandidateRejectedDate1(long candidateRejectedDate1) {
    this.candidateRejectedDate1 = candidateRejectedDate1;
  }

  public long getCandidateRejectedDate2() {
    return this.candidateRejectedDate2;
  }

  public void setCandidateRejectedDate2(long candidateRejectedDate2) {
    this.candidateRejectedDate2 = candidateRejectedDate2;
  }

  public long getCandidateRejectedDate3() {
    return this.candidateRejectedDate3;
  }

  public void setCandidateRejectedDate3(long candidateRejectedDate3) {
    this.candidateRejectedDate3 = candidateRejectedDate3;
  }

  public java.sql.Timestamp getEndRecommendedDateTime1() {
    return this.endRecommendedDateTime1;
  }

  public void setEndRecommendedDateTime1(java.sql.Timestamp endRecommendedDateTime1) {
    this.endRecommendedDateTime1 = endRecommendedDateTime1;
  }

  public java.sql.Timestamp getEndRecommendedDateTime2() {
    return this.endRecommendedDateTime2;
  }

  public void setEndRecommendedDateTime2(java.sql.Timestamp endRecommendedDateTime2) {
    this.endRecommendedDateTime2 = endRecommendedDateTime2;
  }

  public java.sql.Timestamp getEndRecommendedDateTime3() {
    return this.endRecommendedDateTime3;
  }

  public void setEndRecommendedDateTime3(java.sql.Timestamp endRecommendedDateTime3) {
    this.endRecommendedDateTime3 = endRecommendedDateTime3;
  }

  public String getTimeZone() {
    return this.timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public long getAdditionalUserId() {
    return this.additionalUserId;
  }

  public void setAdditionalUserId(long additionalUserId) {
    this.additionalUserId = additionalUserId;
  }

  public long getCompanyLocationId() {
    return this.companyLocationId;
  }

  public void setCompanyLocationId(long companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  public String getContactPersonName() {
    return this.contactPersonName;
  }

  public void setContactPersonName(String contactPersonName) {
    this.contactPersonName = contactPersonName;
  }

  public java.sql.Timestamp getInterviewDateTimeTo() {
    return this.interviewDateTimeTo;
  }

  public void setInterviewDateTimeTo(java.sql.Timestamp interviewDateTimeTo) {
    this.interviewDateTimeTo = interviewDateTimeTo;
  }

  public long getInterviewKey() {
    return this.interviewKey;
  }

  public void setInterviewKey(long interviewKey) {
    this.interviewKey = interviewKey;
  }

  public String getOtherLocation() {
    return this.otherLocation;
  }

  public void setOtherLocation(String otherLocation) {
    this.otherLocation = otherLocation;
  }
}
