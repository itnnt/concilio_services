package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_candidate")
public class PositionCandidate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="associated_date")
  private java.sql.Timestamp associatedDate;

  @Column(name="interview1_date")
  private java.sql.Timestamp interview1Date;

  @Column(name="interview2_date")
  private java.sql.Timestamp interview2Date;

  @Column(name="interview3_date")
  private java.sql.Timestamp interview3Date;

  @Column(name="interview4_date")
  private java.sql.Timestamp interview4Date;

  @Column(name="interview5_date")
  private java.sql.Timestamp interview5Date;

  @Column(name="offer_date")
  private java.sql.Timestamp offerDate;

  @Column(name="rejected_date")
  private java.sql.Timestamp rejectedDate;

  @Column(name="hire_date")
  private java.sql.Timestamp hireDate;

  @Column(name="declined_date")
  private java.sql.Timestamp declinedDate;

  @Column(name="resigned_date")
  private java.sql.Timestamp resignedDate;

  @Column(name="background_check_start_date")
  private java.sql.Timestamp backgroundCheckStartDate;

  @Column(name="background_check_finish_date")
  private java.sql.Timestamp backgroundCheckFinishDate;

  @Column(name="hired_position_head_count_id")
  private long hiredPositionHeadCountId;

  @Column(name="hired_position_candidate_source_id")
  private long hiredPositionCandidateSourceId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="latest_average_feedback_score")
  private String latestAverageFeedbackScore;

  @Column(name="feedback_count")
  private long feedbackCount;

  @Column(name="comment_count")
  private long commentCount;

  @Column(name="comment")
  private String comment;

  @Column(name="status")
  private long status;

  @Column(name="accepted_date")
  private java.sql.Timestamp acceptedDate;

  @Column(name="invited_to_interview_date")
  private java.sql.Timestamp invitedToInterviewDate;

  @Column(name="compensation_xml")
  private String compensationXml;

  @Column(name="work_start_date")
  private java.sql.Timestamp workStartDate;

  @Column(name="quick_feedback_rejection")
  private String quickFeedbackRejection;

  @Column(name="status_before_rejected")
  private String statusBeforeRejected;

  @Column(name="rejected_user_name")
  private String rejectedUserName;

  @Column(name="active")
  private long active;

  @Column(name="offer_accepted_date")
  private java.sql.Timestamp offerAcceptedDate;

  @Column(name="person_responsible")
  private long personResponsible;

  @Column(name="background_check")
  private long backgroundCheck;

  @Column(name="offer_status")
  private long offerStatus;

  @Column(name="remind_send_offer_letter_date")
  private java.sql.Timestamp remindSendOfferLetterDate;

  @Column(name="people_responsible_id")
  private long peopleResponsibleId;

  @Column(name="confirmation_compensation_date")
  private java.sql.Timestamp confirmationCompensationDate;

  @Column(name="work_address")
  private String workAddress;

  @Column(name="report_to")
  private String reportTo;

  @Column(name="reason_for_offer_rejection")
  private String reasonForOfferRejection;

  @Column(name="currency_type")
  private String currencyType;

  @Column(name="email_template_id")
  private long emailTemplateId;

  @Column(name="contract_expired_remind_days")
  private long contractExpiredRemindDays;

  @Column(name="contract_expired_remind_whom")
  private String contractExpiredRemindWhom;

  @Column(name="contract_expired_renewal_whom")
  private String contractExpiredRenewalWhom;

  @Column(name="send_mail_option")
  private long sendMailOption;

  @Column(name="vendor_id")
  private long vendorId;

  @Column(name="vendor_contact_id")
  private long vendorContactId;

  @Column(name="company_name")
  private String companyName;

  @Column(name="contract_renewal_date")
  private java.sql.Timestamp contractRenewalDate;

  @Column(name="refer_start_date")
  private java.sql.Timestamp referStartDate;

  @Column(name="confirm_hire_date")
  private long confirmHireDate;

  @Column(name="screening_out")
  private long screeningOut;

  @Column(name="status_skip_interview")
  private long statusSkipInterview;

  @Column(name="employee_before_hired")
  private long employeeBeforeHired;

  @Column(name="job_title")
  private String jobTitle;

  @Column(name="introduced_date")
  private java.sql.Timestamp introducedDate;

  @Column(name="sent_date")
  private java.sql.Timestamp sentDate;

  @Column(name="accept_job_date")
  private java.sql.Timestamp acceptJobDate;

  @Column(name="decline_reason")
  private String declineReason;

  @Column(name="old_status")
  private long oldStatus;

  @Column(name="reminder_names")
  private String reminderNames;

  @Column(name="reminder_emails")
  private String reminderEmails;

  @Column(name="reminder_before")
  private long reminderBefore;

  @Column(name="reminder_unit")
  private String reminderUnit;

  @Column(name="reminder_date")
  private java.sql.Timestamp reminderDate;

  @Column(name="reminder_sent_date")
  private java.sql.Timestamp reminderSentDate;

  @Column(name="rejected_email_to_company_date")
  private java.sql.Timestamp rejectedEmailToCompanyDate;

  @Column(name="created_by")
  private long createdBy;

  @Column(name="external_id")
  private String externalId;

  @Column(name="made_by")
  private long madeBy;

  @Column(name="end_date")
  private java.sql.Timestamp endDate;

  @Column(name="placed_date")
  private java.sql.Timestamp placedDate;

  @Column(name="sub_status_id")
  private long subStatusId;

  @Column(name="hide_candidate_name_in_live_list")
  private long hideCandidateNameInLiveList;

  @Column(name="hide_employer_name_in_live_list")
  private long hideEmployerNameInLiveList;

  @Column(name="consent_status")
  private long consentStatus;

  @Column(name="consent_date")
  private java.sql.Timestamp consentDate;

  @Column(name="last_stage_date")
  private java.sql.Timestamp lastStageDate;

  @Column(name="shortlisted_user_id")
  private long shortlistedUserId;

  @Column(name="sent_user_id")
  private long sentUserId;

  @Column(name="configurable_stage_id")
  private long configurableStageId;

  @Column(name="sub_status_date")
  private java.sql.Timestamp subStatusDate;

  @Column(name="sub_status_update_user_id")
  private long subStatusUpdateUserId;

  @Column(name="contract_count")
  private long contractCount;


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

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public java.sql.Timestamp getAssociatedDate() {
    return this.associatedDate;
  }

  public void setAssociatedDate(java.sql.Timestamp associatedDate) {
    this.associatedDate = associatedDate;
  }

  public java.sql.Timestamp getInterview1Date() {
    return this.interview1Date;
  }

  public void setInterview1Date(java.sql.Timestamp interview1Date) {
    this.interview1Date = interview1Date;
  }

  public java.sql.Timestamp getInterview2Date() {
    return this.interview2Date;
  }

  public void setInterview2Date(java.sql.Timestamp interview2Date) {
    this.interview2Date = interview2Date;
  }

  public java.sql.Timestamp getInterview3Date() {
    return this.interview3Date;
  }

  public void setInterview3Date(java.sql.Timestamp interview3Date) {
    this.interview3Date = interview3Date;
  }

  public java.sql.Timestamp getInterview4Date() {
    return this.interview4Date;
  }

  public void setInterview4Date(java.sql.Timestamp interview4Date) {
    this.interview4Date = interview4Date;
  }

  public java.sql.Timestamp getInterview5Date() {
    return this.interview5Date;
  }

  public void setInterview5Date(java.sql.Timestamp interview5Date) {
    this.interview5Date = interview5Date;
  }

  public java.sql.Timestamp getOfferDate() {
    return this.offerDate;
  }

  public void setOfferDate(java.sql.Timestamp offerDate) {
    this.offerDate = offerDate;
  }

  public java.sql.Timestamp getRejectedDate() {
    return this.rejectedDate;
  }

  public void setRejectedDate(java.sql.Timestamp rejectedDate) {
    this.rejectedDate = rejectedDate;
  }

  public java.sql.Timestamp getHireDate() {
    return this.hireDate;
  }

  public void setHireDate(java.sql.Timestamp hireDate) {
    this.hireDate = hireDate;
  }

  public java.sql.Timestamp getDeclinedDate() {
    return this.declinedDate;
  }

  public void setDeclinedDate(java.sql.Timestamp declinedDate) {
    this.declinedDate = declinedDate;
  }

  public java.sql.Timestamp getResignedDate() {
    return this.resignedDate;
  }

  public void setResignedDate(java.sql.Timestamp resignedDate) {
    this.resignedDate = resignedDate;
  }

  public java.sql.Timestamp getBackgroundCheckStartDate() {
    return this.backgroundCheckStartDate;
  }

  public void setBackgroundCheckStartDate(java.sql.Timestamp backgroundCheckStartDate) {
    this.backgroundCheckStartDate = backgroundCheckStartDate;
  }

  public java.sql.Timestamp getBackgroundCheckFinishDate() {
    return this.backgroundCheckFinishDate;
  }

  public void setBackgroundCheckFinishDate(java.sql.Timestamp backgroundCheckFinishDate) {
    this.backgroundCheckFinishDate = backgroundCheckFinishDate;
  }

  public long getHiredPositionHeadCountId() {
    return this.hiredPositionHeadCountId;
  }

  public void setHiredPositionHeadCountId(long hiredPositionHeadCountId) {
    this.hiredPositionHeadCountId = hiredPositionHeadCountId;
  }

  public long getHiredPositionCandidateSourceId() {
    return this.hiredPositionCandidateSourceId;
  }

  public void setHiredPositionCandidateSourceId(long hiredPositionCandidateSourceId) {
    this.hiredPositionCandidateSourceId = hiredPositionCandidateSourceId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getLatestAverageFeedbackScore() {
    return this.latestAverageFeedbackScore;
  }

  public void setLatestAverageFeedbackScore(String latestAverageFeedbackScore) {
    this.latestAverageFeedbackScore = latestAverageFeedbackScore;
  }

  public long getFeedbackCount() {
    return this.feedbackCount;
  }

  public void setFeedbackCount(long feedbackCount) {
    this.feedbackCount = feedbackCount;
  }

  public long getCommentCount() {
    return this.commentCount;
  }

  public void setCommentCount(long commentCount) {
    this.commentCount = commentCount;
  }

  public String getComment() {
    return this.comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public java.sql.Timestamp getAcceptedDate() {
    return this.acceptedDate;
  }

  public void setAcceptedDate(java.sql.Timestamp acceptedDate) {
    this.acceptedDate = acceptedDate;
  }

  public java.sql.Timestamp getInvitedToInterviewDate() {
    return this.invitedToInterviewDate;
  }

  public void setInvitedToInterviewDate(java.sql.Timestamp invitedToInterviewDate) {
    this.invitedToInterviewDate = invitedToInterviewDate;
  }

  public String getCompensationXml() {
    return this.compensationXml;
  }

  public void setCompensationXml(String compensationXml) {
    this.compensationXml = compensationXml;
  }

  public java.sql.Timestamp getWorkStartDate() {
    return this.workStartDate;
  }

  public void setWorkStartDate(java.sql.Timestamp workStartDate) {
    this.workStartDate = workStartDate;
  }

  public String getQuickFeedbackRejection() {
    return this.quickFeedbackRejection;
  }

  public void setQuickFeedbackRejection(String quickFeedbackRejection) {
    this.quickFeedbackRejection = quickFeedbackRejection;
  }

  public String getStatusBeforeRejected() {
    return this.statusBeforeRejected;
  }

  public void setStatusBeforeRejected(String statusBeforeRejected) {
    this.statusBeforeRejected = statusBeforeRejected;
  }

  public String getRejectedUserName() {
    return this.rejectedUserName;
  }

  public void setRejectedUserName(String rejectedUserName) {
    this.rejectedUserName = rejectedUserName;
  }

  public long getActive() {
    return this.active;
  }

  public void setActive(long active) {
    this.active = active;
  }

  public java.sql.Timestamp getOfferAcceptedDate() {
    return this.offerAcceptedDate;
  }

  public void setOfferAcceptedDate(java.sql.Timestamp offerAcceptedDate) {
    this.offerAcceptedDate = offerAcceptedDate;
  }

  public long getPersonResponsible() {
    return this.personResponsible;
  }

  public void setPersonResponsible(long personResponsible) {
    this.personResponsible = personResponsible;
  }

  public long getBackgroundCheck() {
    return this.backgroundCheck;
  }

  public void setBackgroundCheck(long backgroundCheck) {
    this.backgroundCheck = backgroundCheck;
  }

  public long getOfferStatus() {
    return this.offerStatus;
  }

  public void setOfferStatus(long offerStatus) {
    this.offerStatus = offerStatus;
  }

  public java.sql.Timestamp getRemindSendOfferLetterDate() {
    return this.remindSendOfferLetterDate;
  }

  public void setRemindSendOfferLetterDate(java.sql.Timestamp remindSendOfferLetterDate) {
    this.remindSendOfferLetterDate = remindSendOfferLetterDate;
  }

  public long getPeopleResponsibleId() {
    return this.peopleResponsibleId;
  }

  public void setPeopleResponsibleId(long peopleResponsibleId) {
    this.peopleResponsibleId = peopleResponsibleId;
  }

  public java.sql.Timestamp getConfirmationCompensationDate() {
    return this.confirmationCompensationDate;
  }

  public void setConfirmationCompensationDate(java.sql.Timestamp confirmationCompensationDate) {
    this.confirmationCompensationDate = confirmationCompensationDate;
  }

  public String getWorkAddress() {
    return this.workAddress;
  }

  public void setWorkAddress(String workAddress) {
    this.workAddress = workAddress;
  }

  public String getReportTo() {
    return this.reportTo;
  }

  public void setReportTo(String reportTo) {
    this.reportTo = reportTo;
  }

  public String getReasonForOfferRejection() {
    return this.reasonForOfferRejection;
  }

  public void setReasonForOfferRejection(String reasonForOfferRejection) {
    this.reasonForOfferRejection = reasonForOfferRejection;
  }

  public String getCurrencyType() {
    return this.currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }

  public long getEmailTemplateId() {
    return this.emailTemplateId;
  }

  public void setEmailTemplateId(long emailTemplateId) {
    this.emailTemplateId = emailTemplateId;
  }

  public long getContractExpiredRemindDays() {
    return this.contractExpiredRemindDays;
  }

  public void setContractExpiredRemindDays(long contractExpiredRemindDays) {
    this.contractExpiredRemindDays = contractExpiredRemindDays;
  }

  public String getContractExpiredRemindWhom() {
    return this.contractExpiredRemindWhom;
  }

  public void setContractExpiredRemindWhom(String contractExpiredRemindWhom) {
    this.contractExpiredRemindWhom = contractExpiredRemindWhom;
  }

  public String getContractExpiredRenewalWhom() {
    return this.contractExpiredRenewalWhom;
  }

  public void setContractExpiredRenewalWhom(String contractExpiredRenewalWhom) {
    this.contractExpiredRenewalWhom = contractExpiredRenewalWhom;
  }

  public long getSendMailOption() {
    return this.sendMailOption;
  }

  public void setSendMailOption(long sendMailOption) {
    this.sendMailOption = sendMailOption;
  }

  public long getVendorId() {
    return this.vendorId;
  }

  public void setVendorId(long vendorId) {
    this.vendorId = vendorId;
  }

  public long getVendorContactId() {
    return this.vendorContactId;
  }

  public void setVendorContactId(long vendorContactId) {
    this.vendorContactId = vendorContactId;
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public java.sql.Timestamp getContractRenewalDate() {
    return this.contractRenewalDate;
  }

  public void setContractRenewalDate(java.sql.Timestamp contractRenewalDate) {
    this.contractRenewalDate = contractRenewalDate;
  }

  public java.sql.Timestamp getReferStartDate() {
    return this.referStartDate;
  }

  public void setReferStartDate(java.sql.Timestamp referStartDate) {
    this.referStartDate = referStartDate;
  }

  public long getConfirmHireDate() {
    return this.confirmHireDate;
  }

  public void setConfirmHireDate(long confirmHireDate) {
    this.confirmHireDate = confirmHireDate;
  }

  public long getScreeningOut() {
    return this.screeningOut;
  }

  public void setScreeningOut(long screeningOut) {
    this.screeningOut = screeningOut;
  }

  public long getStatusSkipInterview() {
    return this.statusSkipInterview;
  }

  public void setStatusSkipInterview(long statusSkipInterview) {
    this.statusSkipInterview = statusSkipInterview;
  }

  public long getEmployeeBeforeHired() {
    return this.employeeBeforeHired;
  }

  public void setEmployeeBeforeHired(long employeeBeforeHired) {
    this.employeeBeforeHired = employeeBeforeHired;
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public java.sql.Timestamp getIntroducedDate() {
    return this.introducedDate;
  }

  public void setIntroducedDate(java.sql.Timestamp introducedDate) {
    this.introducedDate = introducedDate;
  }

  public java.sql.Timestamp getSentDate() {
    return this.sentDate;
  }

  public void setSentDate(java.sql.Timestamp sentDate) {
    this.sentDate = sentDate;
  }

  public java.sql.Timestamp getAcceptJobDate() {
    return this.acceptJobDate;
  }

  public void setAcceptJobDate(java.sql.Timestamp acceptJobDate) {
    this.acceptJobDate = acceptJobDate;
  }

  public String getDeclineReason() {
    return this.declineReason;
  }

  public void setDeclineReason(String declineReason) {
    this.declineReason = declineReason;
  }

  public long getOldStatus() {
    return this.oldStatus;
  }

  public void setOldStatus(long oldStatus) {
    this.oldStatus = oldStatus;
  }

  public String getReminderNames() {
    return this.reminderNames;
  }

  public void setReminderNames(String reminderNames) {
    this.reminderNames = reminderNames;
  }

  public String getReminderEmails() {
    return this.reminderEmails;
  }

  public void setReminderEmails(String reminderEmails) {
    this.reminderEmails = reminderEmails;
  }

  public long getReminderBefore() {
    return this.reminderBefore;
  }

  public void setReminderBefore(long reminderBefore) {
    this.reminderBefore = reminderBefore;
  }

  public String getReminderUnit() {
    return this.reminderUnit;
  }

  public void setReminderUnit(String reminderUnit) {
    this.reminderUnit = reminderUnit;
  }

  public java.sql.Timestamp getReminderDate() {
    return this.reminderDate;
  }

  public void setReminderDate(java.sql.Timestamp reminderDate) {
    this.reminderDate = reminderDate;
  }

  public java.sql.Timestamp getReminderSentDate() {
    return this.reminderSentDate;
  }

  public void setReminderSentDate(java.sql.Timestamp reminderSentDate) {
    this.reminderSentDate = reminderSentDate;
  }

  public java.sql.Timestamp getRejectedEmailToCompanyDate() {
    return this.rejectedEmailToCompanyDate;
  }

  public void setRejectedEmailToCompanyDate(java.sql.Timestamp rejectedEmailToCompanyDate) {
    this.rejectedEmailToCompanyDate = rejectedEmailToCompanyDate;
  }

  public long getCreatedBy() {
    return this.createdBy;
  }

  public void setCreatedBy(long createdBy) {
    this.createdBy = createdBy;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public long getMadeBy() {
    return this.madeBy;
  }

  public void setMadeBy(long madeBy) {
    this.madeBy = madeBy;
  }

  public java.sql.Timestamp getEndDate() {
    return this.endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }

  public java.sql.Timestamp getPlacedDate() {
    return this.placedDate;
  }

  public void setPlacedDate(java.sql.Timestamp placedDate) {
    this.placedDate = placedDate;
  }

  public long getSubStatusId() {
    return this.subStatusId;
  }

  public void setSubStatusId(long subStatusId) {
    this.subStatusId = subStatusId;
  }

  public long getHideCandidateNameInLiveList() {
    return this.hideCandidateNameInLiveList;
  }

  public void setHideCandidateNameInLiveList(long hideCandidateNameInLiveList) {
    this.hideCandidateNameInLiveList = hideCandidateNameInLiveList;
  }

  public long getHideEmployerNameInLiveList() {
    return this.hideEmployerNameInLiveList;
  }

  public void setHideEmployerNameInLiveList(long hideEmployerNameInLiveList) {
    this.hideEmployerNameInLiveList = hideEmployerNameInLiveList;
  }

  public long getConsentStatus() {
    return this.consentStatus;
  }

  public void setConsentStatus(long consentStatus) {
    this.consentStatus = consentStatus;
  }

  public java.sql.Timestamp getConsentDate() {
    return this.consentDate;
  }

  public void setConsentDate(java.sql.Timestamp consentDate) {
    this.consentDate = consentDate;
  }

  public java.sql.Timestamp getLastStageDate() {
    return this.lastStageDate;
  }

  public void setLastStageDate(java.sql.Timestamp lastStageDate) {
    this.lastStageDate = lastStageDate;
  }

  public long getShortlistedUserId() {
    return this.shortlistedUserId;
  }

  public void setShortlistedUserId(long shortlistedUserId) {
    this.shortlistedUserId = shortlistedUserId;
  }

  public long getSentUserId() {
    return this.sentUserId;
  }

  public void setSentUserId(long sentUserId) {
    this.sentUserId = sentUserId;
  }

  public long getConfigurableStageId() {
    return this.configurableStageId;
  }

  public void setConfigurableStageId(long configurableStageId) {
    this.configurableStageId = configurableStageId;
  }

  public java.sql.Timestamp getSubStatusDate() {
    return this.subStatusDate;
  }

  public void setSubStatusDate(java.sql.Timestamp subStatusDate) {
    this.subStatusDate = subStatusDate;
  }

  public long getSubStatusUpdateUserId() {
    return this.subStatusUpdateUserId;
  }

  public void setSubStatusUpdateUserId(long subStatusUpdateUserId) {
    this.subStatusUpdateUserId = subStatusUpdateUserId;
  }

  public long getContractCount() {
    return this.contractCount;
  }

  public void setContractCount(long contractCount) {
    this.contractCount = contractCount;
  }
}
