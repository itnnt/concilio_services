package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_description")
public class PositionDescription {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="business_unit")
  private String businessUnit;

  @Column(name="line_manager_id")
  private long lineManagerId;

  @Column(name="internal_recruiter_id")
  private long internalRecruiterId;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="location_id")
  private long locationId;

  @Column(name="full_description")
  private String fullDescription;

  @Column(name="public_description")
  private String publicDescription;

  @Column(name="visible_to_vendors")
  private long visibleToVendors;

  @Column(name="visible_to_hr")
  private long visibleToHr;

  @Column(name="hidden_timestamp")
  private java.sql.Timestamp hiddenTimestamp;

  @Column(name="latest_status_change_date")
  private java.sql.Timestamp latestStatusChangeDate;

  @Column(name="latest_status")
  private long latestStatus;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="compensation_xml")
  private String compensationXml;

  @Column(name="contract_type")
  private String contractType;

  @Column(name="candidate_description_template_xml")
  private String candidateDescriptionTemplateXml;

  @Column(name="priority")
  private long priority;

  @Column(name="sourcing_difficulty")
  private long sourcingDifficulty;

  @Column(name="time_to_hire")
  private long timeToHire;

  @Column(name="time_to_source")
  private long timeToSource;

  @Column(name="candidate_rejection_process")
  private long candidateRejectionProcess;

  @Column(name="hr_id")
  private long hrId;

  @Column(name="visible_to_all")
  private long visibleToAll;

  @Column(name="head_count_open_date")
  private java.sql.Timestamp headCountOpenDate;

  @Column(name="head_count_close_date")
  private java.sql.Timestamp headCountCloseDate;

  @Column(name="creator_account_id")
  private long creatorAccountId;

  @Column(name="interview_feedback_final_decisions")
  private String interviewFeedbackFinalDecisions;

  @Column(name="position_type")
  private long positionType;

  @Column(name="total_cost")
  private double totalCost;

  @Column(name="costcenter_signoff")
  private long costcenterSignoff;

  @Column(name="candidate_ref_no1")
  private String candidateRefNo1;

  @Column(name="candidate_ref_no2")
  private String candidateRefNo2;

  @Column(name="candidate_ref_no3")
  private String candidateRefNo3;

  @Column(name="notes1")
  private String notes1;

  @Column(name="notes2")
  private String notes2;

  @Column(name="notes3")
  private String notes3;

  @Column(name="post_to_job_street")
  private long postToJobStreet;

  @Column(name="post_to_job_db")
  private long postToJobDb;

  @Column(name="post_to_linkedin")
  private long postToLinkedin;

  @Column(name="post_to_strais_times")
  private long postToStraisTimes;

  @Column(name="post_to_recruite")
  private long postToRecruite;

  @Column(name="manual_closed")
  private long manualClosed;

  @Column(name="intership_type")
  private String intershipType;

  @Column(name="notify_whom_by_email")
  private String notifyWhomByEmail;

  @Column(name="currency_type")
  private String currencyType;

  @Column(name="internal_mobility")
  private long internalMobility;

  @Column(name="internal_mobility_release_at")
  private long internalMobilityReleaseAt;

  @Column(name="matrix_manager_id")
  private long matrixManagerId;

  @Column(name="offer_letter")
  private long offerLetter;

  @Column(name="external_release")
  private long externalRelease;

  @Column(name="contract_expired_remind_days")
  private long contractExpiredRemindDays;

  @Column(name="contract_expired_remind_whom")
  private String contractExpiredRemindWhom;

  @Column(name="business_partner_id")
  private long businessPartnerId;

  @Column(name="internal_mobility_internal_recruiter")
  private long internalMobilityInternalRecruiter;

  @Column(name="internal_mobility_line_manager")
  private long internalMobilityLineManager;

  @Column(name="key_words")
  private String keyWords;

  @Column(name="highshool_graduate")
  private long highshoolGraduate;

  @Column(name="key_word_amount")
  private String keyWordAmount;

  @Column(name="final_decision_maker_last_interviewer")
  private long finalDecisionMakerLastInterviewer;

  @Column(name="specific_url_careersite")
  private String specificUrlCareersite;

  @Column(name="emails_to_cv_accepted_notification")
  private String emailsToCvAcceptedNotification;

  @Column(name="company_id")
  private long companyId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="internal_recruiter")
  private String internalRecruiter;

  @Column(name="hiring_line_manager")
  private String hiringLineManager;

  @Column(name="head_count")
  private long headCount;

  @Column(name="company_location_id")
  private long companyLocationId;

  @Column(name="trigger_index_update_timestamp")
  private java.sql.Timestamp triggerIndexUpdateTimestamp;

  @Column(name="hot_job")
  private long hotJob;

  @Column(name="annual_salary_from")
  private double annualSalaryFrom;

  @Column(name="annual_salary_to")
  private double annualSalaryTo;

  @Column(name="updated_timestamp")
  private java.sql.Timestamp updatedTimestamp;

  @Column(name="updated_by")
  private long updatedBy;

  @Column(name="floated_job")
  private long floatedJob;

  @Column(name="auto_submit_candidate")
  private long autoSubmitCandidate;

  @Column(name="employment_type")
  private long employmentType;

  @Column(name="percentage_placement")
  private double percentagePlacement;

  @Column(name="time_to_fill")
  private double timeToFill;

  @Column(name="difficulty_level")
  private long difficultyLevel;

  @Column(name="reason_for_difficulty")
  private String reasonForDifficulty;

  @Column(name="forecast_annual_fee")
  private double forecastAnnualFee;

  @Column(name="forecast_annual_fee_currency")
  private String forecastAnnualFeeCurrency;

  @Column(name="use_compensation_fee")
  private long useCompensationFee;

  @Column(name="projected_placement_date")
  private java.sql.Timestamp projectedPlacementDate;

  @Column(name="note")
  private String note;

  @Column(name="external_id")
  private String externalId;

  @Column(name="private_job")
  private long privateJob;

  @Column(name="summary")
  private String summary;

  @Column(name="share_rating")
  private long shareRating;

  @Column(name="use_time_temp")
  private long useTimeTemp;

  @Column(name="purchase_order")
  private String purchaseOrder;

  @Column(name="job_site_detail")
  private String jobSiteDetail;

  @Column(name="internal_recruiter_contact_id")
  private long internalRecruiterContactId;

  @Column(name="site_manager_contact_id")
  private long siteManagerContactId;

  @Column(name="hot_end_date")
  private java.sql.Timestamp hotEndDate;

  @Column(name="published_date")
  private java.sql.Timestamp publishedDate;

  @Column(name="submission_date")
  private java.sql.Timestamp submissionDate;

  @Column(name="submission_limit")
  private long submissionLimit;

  @Column(name="submission_time")
  private String submissionTime;

  @Column(name="deleted_timestamp")
  private java.sql.Timestamp deletedTimestamp;

  @Column(name="position_category")
  private long positionCategory;

  @Column(name="agency")
  private String agency;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBusinessUnit() {
    return this.businessUnit;
  }

  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }

  public long getLineManagerId() {
    return this.lineManagerId;
  }

  public void setLineManagerId(long lineManagerId) {
    this.lineManagerId = lineManagerId;
  }

  public long getInternalRecruiterId() {
    return this.internalRecruiterId;
  }

  public void setInternalRecruiterId(long internalRecruiterId) {
    this.internalRecruiterId = internalRecruiterId;
  }

  public long getVerticalId() {
    return this.verticalId;
  }

  public void setVerticalId(long verticalId) {
    this.verticalId = verticalId;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public String getFullDescription() {
    return this.fullDescription;
  }

  public void setFullDescription(String fullDescription) {
    this.fullDescription = fullDescription;
  }

  public String getPublicDescription() {
    return this.publicDescription;
  }

  public void setPublicDescription(String publicDescription) {
    this.publicDescription = publicDescription;
  }

  public long getVisibleToVendors() {
    return this.visibleToVendors;
  }

  public void setVisibleToVendors(long visibleToVendors) {
    this.visibleToVendors = visibleToVendors;
  }

  public long getVisibleToHr() {
    return this.visibleToHr;
  }

  public void setVisibleToHr(long visibleToHr) {
    this.visibleToHr = visibleToHr;
  }

  public java.sql.Timestamp getHiddenTimestamp() {
    return this.hiddenTimestamp;
  }

  public void setHiddenTimestamp(java.sql.Timestamp hiddenTimestamp) {
    this.hiddenTimestamp = hiddenTimestamp;
  }

  public java.sql.Timestamp getLatestStatusChangeDate() {
    return this.latestStatusChangeDate;
  }

  public void setLatestStatusChangeDate(java.sql.Timestamp latestStatusChangeDate) {
    this.latestStatusChangeDate = latestStatusChangeDate;
  }

  public long getLatestStatus() {
    return this.latestStatus;
  }

  public void setLatestStatus(long latestStatus) {
    this.latestStatus = latestStatus;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getCompensationXml() {
    return this.compensationXml;
  }

  public void setCompensationXml(String compensationXml) {
    this.compensationXml = compensationXml;
  }

  public String getContractType() {
    return this.contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }

  public String getCandidateDescriptionTemplateXml() {
    return this.candidateDescriptionTemplateXml;
  }

  public void setCandidateDescriptionTemplateXml(String candidateDescriptionTemplateXml) {
    this.candidateDescriptionTemplateXml = candidateDescriptionTemplateXml;
  }

  public long getPriority() {
    return this.priority;
  }

  public void setPriority(long priority) {
    this.priority = priority;
  }

  public long getSourcingDifficulty() {
    return this.sourcingDifficulty;
  }

  public void setSourcingDifficulty(long sourcingDifficulty) {
    this.sourcingDifficulty = sourcingDifficulty;
  }

  public long getTimeToHire() {
    return this.timeToHire;
  }

  public void setTimeToHire(long timeToHire) {
    this.timeToHire = timeToHire;
  }

  public long getTimeToSource() {
    return this.timeToSource;
  }

  public void setTimeToSource(long timeToSource) {
    this.timeToSource = timeToSource;
  }

  public long getCandidateRejectionProcess() {
    return this.candidateRejectionProcess;
  }

  public void setCandidateRejectionProcess(long candidateRejectionProcess) {
    this.candidateRejectionProcess = candidateRejectionProcess;
  }

  public long getHrId() {
    return this.hrId;
  }

  public void setHrId(long hrId) {
    this.hrId = hrId;
  }

  public long getVisibleToAll() {
    return this.visibleToAll;
  }

  public void setVisibleToAll(long visibleToAll) {
    this.visibleToAll = visibleToAll;
  }

  public java.sql.Timestamp getHeadCountOpenDate() {
    return this.headCountOpenDate;
  }

  public void setHeadCountOpenDate(java.sql.Timestamp headCountOpenDate) {
    this.headCountOpenDate = headCountOpenDate;
  }

  public java.sql.Timestamp getHeadCountCloseDate() {
    return this.headCountCloseDate;
  }

  public void setHeadCountCloseDate(java.sql.Timestamp headCountCloseDate) {
    this.headCountCloseDate = headCountCloseDate;
  }

  public long getCreatorAccountId() {
    return this.creatorAccountId;
  }

  public void setCreatorAccountId(long creatorAccountId) {
    this.creatorAccountId = creatorAccountId;
  }

  public String getInterviewFeedbackFinalDecisions() {
    return this.interviewFeedbackFinalDecisions;
  }

  public void setInterviewFeedbackFinalDecisions(String interviewFeedbackFinalDecisions) {
    this.interviewFeedbackFinalDecisions = interviewFeedbackFinalDecisions;
  }

  public long getPositionType() {
    return this.positionType;
  }

  public void setPositionType(long positionType) {
    this.positionType = positionType;
  }

  public double getTotalCost() {
    return this.totalCost;
  }

  public void setTotalCost(double totalCost) {
    this.totalCost = totalCost;
  }

  public long getCostcenterSignoff() {
    return this.costcenterSignoff;
  }

  public void setCostcenterSignoff(long costcenterSignoff) {
    this.costcenterSignoff = costcenterSignoff;
  }

  public String getCandidateRefNo1() {
    return this.candidateRefNo1;
  }

  public void setCandidateRefNo1(String candidateRefNo1) {
    this.candidateRefNo1 = candidateRefNo1;
  }

  public String getCandidateRefNo2() {
    return this.candidateRefNo2;
  }

  public void setCandidateRefNo2(String candidateRefNo2) {
    this.candidateRefNo2 = candidateRefNo2;
  }

  public String getCandidateRefNo3() {
    return this.candidateRefNo3;
  }

  public void setCandidateRefNo3(String candidateRefNo3) {
    this.candidateRefNo3 = candidateRefNo3;
  }

  public String getNotes1() {
    return this.notes1;
  }

  public void setNotes1(String notes1) {
    this.notes1 = notes1;
  }

  public String getNotes2() {
    return this.notes2;
  }

  public void setNotes2(String notes2) {
    this.notes2 = notes2;
  }

  public String getNotes3() {
    return this.notes3;
  }

  public void setNotes3(String notes3) {
    this.notes3 = notes3;
  }

  public long getPostToJobStreet() {
    return this.postToJobStreet;
  }

  public void setPostToJobStreet(long postToJobStreet) {
    this.postToJobStreet = postToJobStreet;
  }

  public long getPostToJobDb() {
    return this.postToJobDb;
  }

  public void setPostToJobDb(long postToJobDb) {
    this.postToJobDb = postToJobDb;
  }

  public long getPostToLinkedin() {
    return this.postToLinkedin;
  }

  public void setPostToLinkedin(long postToLinkedin) {
    this.postToLinkedin = postToLinkedin;
  }

  public long getPostToStraisTimes() {
    return this.postToStraisTimes;
  }

  public void setPostToStraisTimes(long postToStraisTimes) {
    this.postToStraisTimes = postToStraisTimes;
  }

  public long getPostToRecruite() {
    return this.postToRecruite;
  }

  public void setPostToRecruite(long postToRecruite) {
    this.postToRecruite = postToRecruite;
  }

  public long getManualClosed() {
    return this.manualClosed;
  }

  public void setManualClosed(long manualClosed) {
    this.manualClosed = manualClosed;
  }

  public String getIntershipType() {
    return this.intershipType;
  }

  public void setIntershipType(String intershipType) {
    this.intershipType = intershipType;
  }

  public String getNotifyWhomByEmail() {
    return this.notifyWhomByEmail;
  }

  public void setNotifyWhomByEmail(String notifyWhomByEmail) {
    this.notifyWhomByEmail = notifyWhomByEmail;
  }

  public String getCurrencyType() {
    return this.currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }

  public long getInternalMobility() {
    return this.internalMobility;
  }

  public void setInternalMobility(long internalMobility) {
    this.internalMobility = internalMobility;
  }

  public long getInternalMobilityReleaseAt() {
    return this.internalMobilityReleaseAt;
  }

  public void setInternalMobilityReleaseAt(long internalMobilityReleaseAt) {
    this.internalMobilityReleaseAt = internalMobilityReleaseAt;
  }

  public long getMatrixManagerId() {
    return this.matrixManagerId;
  }

  public void setMatrixManagerId(long matrixManagerId) {
    this.matrixManagerId = matrixManagerId;
  }

  public long getOfferLetter() {
    return this.offerLetter;
  }

  public void setOfferLetter(long offerLetter) {
    this.offerLetter = offerLetter;
  }

  public long getExternalRelease() {
    return this.externalRelease;
  }

  public void setExternalRelease(long externalRelease) {
    this.externalRelease = externalRelease;
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

  public long getBusinessPartnerId() {
    return this.businessPartnerId;
  }

  public void setBusinessPartnerId(long businessPartnerId) {
    this.businessPartnerId = businessPartnerId;
  }

  public long getInternalMobilityInternalRecruiter() {
    return this.internalMobilityInternalRecruiter;
  }

  public void setInternalMobilityInternalRecruiter(long internalMobilityInternalRecruiter) {
    this.internalMobilityInternalRecruiter = internalMobilityInternalRecruiter;
  }

  public long getInternalMobilityLineManager() {
    return this.internalMobilityLineManager;
  }

  public void setInternalMobilityLineManager(long internalMobilityLineManager) {
    this.internalMobilityLineManager = internalMobilityLineManager;
  }

  public String getKeyWords() {
    return this.keyWords;
  }

  public void setKeyWords(String keyWords) {
    this.keyWords = keyWords;
  }

  public long getHighshoolGraduate() {
    return this.highshoolGraduate;
  }

  public void setHighshoolGraduate(long highshoolGraduate) {
    this.highshoolGraduate = highshoolGraduate;
  }

  public String getKeyWordAmount() {
    return this.keyWordAmount;
  }

  public void setKeyWordAmount(String keyWordAmount) {
    this.keyWordAmount = keyWordAmount;
  }

  public long getFinalDecisionMakerLastInterviewer() {
    return this.finalDecisionMakerLastInterviewer;
  }

  public void setFinalDecisionMakerLastInterviewer(long finalDecisionMakerLastInterviewer) {
    this.finalDecisionMakerLastInterviewer = finalDecisionMakerLastInterviewer;
  }

  public String getSpecificUrlCareersite() {
    return this.specificUrlCareersite;
  }

  public void setSpecificUrlCareersite(String specificUrlCareersite) {
    this.specificUrlCareersite = specificUrlCareersite;
  }

  public String getEmailsToCvAcceptedNotification() {
    return this.emailsToCvAcceptedNotification;
  }

  public void setEmailsToCvAcceptedNotification(String emailsToCvAcceptedNotification) {
    this.emailsToCvAcceptedNotification = emailsToCvAcceptedNotification;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public String getInternalRecruiter() {
    return this.internalRecruiter;
  }

  public void setInternalRecruiter(String internalRecruiter) {
    this.internalRecruiter = internalRecruiter;
  }

  public String getHiringLineManager() {
    return this.hiringLineManager;
  }

  public void setHiringLineManager(String hiringLineManager) {
    this.hiringLineManager = hiringLineManager;
  }

  public long getHeadCount() {
    return this.headCount;
  }

  public void setHeadCount(long headCount) {
    this.headCount = headCount;
  }

  public long getCompanyLocationId() {
    return this.companyLocationId;
  }

  public void setCompanyLocationId(long companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  public java.sql.Timestamp getTriggerIndexUpdateTimestamp() {
    return this.triggerIndexUpdateTimestamp;
  }

  public void setTriggerIndexUpdateTimestamp(java.sql.Timestamp triggerIndexUpdateTimestamp) {
    this.triggerIndexUpdateTimestamp = triggerIndexUpdateTimestamp;
  }

  public long getHotJob() {
    return this.hotJob;
  }

  public void setHotJob(long hotJob) {
    this.hotJob = hotJob;
  }

  public double getAnnualSalaryFrom() {
    return this.annualSalaryFrom;
  }

  public void setAnnualSalaryFrom(double annualSalaryFrom) {
    this.annualSalaryFrom = annualSalaryFrom;
  }

  public double getAnnualSalaryTo() {
    return this.annualSalaryTo;
  }

  public void setAnnualSalaryTo(double annualSalaryTo) {
    this.annualSalaryTo = annualSalaryTo;
  }

  public java.sql.Timestamp getUpdatedTimestamp() {
    return this.updatedTimestamp;
  }

  public void setUpdatedTimestamp(java.sql.Timestamp updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }

  public long getUpdatedBy() {
    return this.updatedBy;
  }

  public void setUpdatedBy(long updatedBy) {
    this.updatedBy = updatedBy;
  }

  public long getFloatedJob() {
    return this.floatedJob;
  }

  public void setFloatedJob(long floatedJob) {
    this.floatedJob = floatedJob;
  }

  public long getAutoSubmitCandidate() {
    return this.autoSubmitCandidate;
  }

  public void setAutoSubmitCandidate(long autoSubmitCandidate) {
    this.autoSubmitCandidate = autoSubmitCandidate;
  }

  public long getEmploymentType() {
    return this.employmentType;
  }

  public void setEmploymentType(long employmentType) {
    this.employmentType = employmentType;
  }

  public double getPercentagePlacement() {
    return this.percentagePlacement;
  }

  public void setPercentagePlacement(double percentagePlacement) {
    this.percentagePlacement = percentagePlacement;
  }

  public double getTimeToFill() {
    return this.timeToFill;
  }

  public void setTimeToFill(double timeToFill) {
    this.timeToFill = timeToFill;
  }

  public long getDifficultyLevel() {
    return this.difficultyLevel;
  }

  public void setDifficultyLevel(long difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
  }

  public String getReasonForDifficulty() {
    return this.reasonForDifficulty;
  }

  public void setReasonForDifficulty(String reasonForDifficulty) {
    this.reasonForDifficulty = reasonForDifficulty;
  }

  public double getForecastAnnualFee() {
    return this.forecastAnnualFee;
  }

  public void setForecastAnnualFee(double forecastAnnualFee) {
    this.forecastAnnualFee = forecastAnnualFee;
  }

  public String getForecastAnnualFeeCurrency() {
    return this.forecastAnnualFeeCurrency;
  }

  public void setForecastAnnualFeeCurrency(String forecastAnnualFeeCurrency) {
    this.forecastAnnualFeeCurrency = forecastAnnualFeeCurrency;
  }

  public long getUseCompensationFee() {
    return this.useCompensationFee;
  }

  public void setUseCompensationFee(long useCompensationFee) {
    this.useCompensationFee = useCompensationFee;
  }

  public java.sql.Timestamp getProjectedPlacementDate() {
    return this.projectedPlacementDate;
  }

  public void setProjectedPlacementDate(java.sql.Timestamp projectedPlacementDate) {
    this.projectedPlacementDate = projectedPlacementDate;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public long getPrivateJob() {
    return this.privateJob;
  }

  public void setPrivateJob(long privateJob) {
    this.privateJob = privateJob;
  }

  public String getSummary() {
    return this.summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public long getShareRating() {
    return this.shareRating;
  }

  public void setShareRating(long shareRating) {
    this.shareRating = shareRating;
  }

  public long getUseTimeTemp() {
    return this.useTimeTemp;
  }

  public void setUseTimeTemp(long useTimeTemp) {
    this.useTimeTemp = useTimeTemp;
  }

  public String getPurchaseOrder() {
    return this.purchaseOrder;
  }

  public void setPurchaseOrder(String purchaseOrder) {
    this.purchaseOrder = purchaseOrder;
  }

  public String getJobSiteDetail() {
    return this.jobSiteDetail;
  }

  public void setJobSiteDetail(String jobSiteDetail) {
    this.jobSiteDetail = jobSiteDetail;
  }

  public long getInternalRecruiterContactId() {
    return this.internalRecruiterContactId;
  }

  public void setInternalRecruiterContactId(long internalRecruiterContactId) {
    this.internalRecruiterContactId = internalRecruiterContactId;
  }

  public long getSiteManagerContactId() {
    return this.siteManagerContactId;
  }

  public void setSiteManagerContactId(long siteManagerContactId) {
    this.siteManagerContactId = siteManagerContactId;
  }

  public java.sql.Timestamp getHotEndDate() {
    return this.hotEndDate;
  }

  public void setHotEndDate(java.sql.Timestamp hotEndDate) {
    this.hotEndDate = hotEndDate;
  }

  public java.sql.Timestamp getPublishedDate() {
    return this.publishedDate;
  }

  public void setPublishedDate(java.sql.Timestamp publishedDate) {
    this.publishedDate = publishedDate;
  }

  public java.sql.Timestamp getSubmissionDate() {
    return this.submissionDate;
  }

  public void setSubmissionDate(java.sql.Timestamp submissionDate) {
    this.submissionDate = submissionDate;
  }

  public long getSubmissionLimit() {
    return this.submissionLimit;
  }

  public void setSubmissionLimit(long submissionLimit) {
    this.submissionLimit = submissionLimit;
  }

  public String getSubmissionTime() {
    return this.submissionTime;
  }

  public void setSubmissionTime(String submissionTime) {
    this.submissionTime = submissionTime;
  }

  public java.sql.Timestamp getDeletedTimestamp() {
    return this.deletedTimestamp;
  }

  public void setDeletedTimestamp(java.sql.Timestamp deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  public long getPositionCategory() {
    return this.positionCategory;
  }

  public void setPositionCategory(long positionCategory) {
    this.positionCategory = positionCategory;
  }

  public String getAgency() {
    return this.agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }
}
