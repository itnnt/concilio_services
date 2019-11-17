package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_account")
public class UserAccount {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="name_kana")
  private String nameKana;

  @Column(name="email")
  private String email;

  @Column(name="encrypted_password")
  private String encryptedPassword;

  @Column(name="super_user")
  private long superUser;

  @Column(name="previous_login_timestamp")
  private java.sql.Timestamp previousLoginTimestamp;

  @Column(name="current_login_timestamp")
  private java.sql.Timestamp currentLoginTimestamp;

  @Column(name="hidden_timestamp")
  private java.sql.Timestamp hiddenTimestamp;

  @Column(name="supervisor_id")
  private long supervisorId;

  @Column(name="internal_recruiter")
  private long internalRecruiter;

  @Column(name="line_manager")
  private long lineManager;

  @Column(name="last_alert_check_timestamp")
  private java.sql.Timestamp lastAlertCheckTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="last_updated_timestamp")
  private java.sql.Timestamp lastUpdatedTimestamp;

  @Column(name="internal_staff")
  private long internalStaff;

  @Column(name="calendar_login_id")
  private String calendarLoginId;

  @Column(name="calendar_password")
  private String calendarPassword;

  @Column(name="calendar_server")
  private String calendarServer;

  @Column(name="job_title")
  private String jobTitle;

  @Column(name="phone")
  private String phone;

  @Column(name="phone_ext")
  private String phoneExt;

  @Column(name="hr")
  private long hr;

  @Column(name="interviewer")
  private long interviewer;

  @Column(name="language")
  private String language;

  @Column(name="email_password")
  private String emailPassword;

  @Column(name="email_host_port")
  private String emailHostPort;

  @Column(name="email_api")
  private String emailApi;

  @Column(name="session_id")
  private String sessionId;

  @Column(name="locked_user")
  private long lockedUser;

  @Column(name="user_location")
  private String userLocation;

  @Column(name="timezone")
  private String timezone;

  @Column(name="requisition_signatory")
  private long requisitionSignatory;

  @Column(name="matrix_manager")
  private long matrixManager;

  @Column(name="business_partner")
  private long businessPartner;

  @Column(name="system_admin")
  private long systemAdmin;

  @Column(name="deleted_timestamp")
  private java.sql.Timestamp deletedTimestamp;

  @Column(name="length_calendar_password")
  private long lengthCalendarPassword;

  @Column(name="length_email_password")
  private long lengthEmailPassword;

  @Column(name="director")
  private long director;

  @Column(name="manager")
  private long manager;

  @Column(name="consultant")
  private long consultant;

  @Column(name="researcher")
  private long researcher;

  @Column(name="email_host_port_out")
  private String emailHostPortOut;

  @Column(name="email_support_type")
  private String emailSupportType;

  @Column(name="exchange_version")
  private long exchangeVersion;

  @Column(name="currency_type")
  private String currencyType;

  @Column(name="reset_request_time")
  private java.sql.Timestamp resetRequestTime;

  @Column(name="date_format")
  private String dateFormat;

  @Column(name="ssl_tls")
  private long sslTls;

  @Column(name="authentication")
  private long authentication;

  @Column(name="email_signature")
  private String emailSignature;

  @Column(name="kpi_permission")
  private String kpiPermission;

  @Column(name="default_candidate_view")
  private String defaultCandidateView;

  @Column(name="default_document_view")
  private long defaultDocumentView;

  @Column(name="display_training")
  private long displayTraining;

  @Column(name="reset_password_token")
  private String resetPasswordToken;

  @Column(name="job_dashboard_default_view")
  private long jobDashboardDefaultView;

  @Column(name="hash_salt")
  private String hashSalt;

  @Column(name="hash_password")
  private String hashPassword;

  @Column(name="hash_iterations")
  private long hashIterations;

  @Column(name="display_intro")
  private long displayIntro;

  @Column(name="pin_comment")
  private long pinComment;

  @Column(name="new_search")
  private long newSearch;

  @Column(name="view_mode")
  private long viewMode;

  @Column(name="email_connected")
  private long emailConnected;

  @Column(name="position_of_box")
  private String positionOfBox;

  @Column(name="email_account_type")
  private String emailAccountType;

  @Column(name="freshdesk_user_id")
  private String freshdeskUserId;

  @Column(name="outgoing_authentication")
  private long outgoingAuthentication;

  @Column(name="outgoing_encrypt_type")
  private long outgoingEncryptType;

  @Column(name="outgoing_email_user_name")
  private String outgoingEmailUserName;

  @Column(name="outgoing_email_password")
  private String outgoingEmailPassword;

  @Column(name="incoming_email_user_name")
  private String incomingEmailUserName;

  @Column(name="distance_unit")
  private String distanceUnit;

  @Column(name="mail_status")
  private String mailStatus;

  @Column(name="mail_refresh_date")
  private java.sql.Timestamp mailRefreshDate;

  @Column(name="exchange_host")
  private String exchangeHost;

  @Column(name="profile_picture_filename")
  private String profilePictureFilename;

  @Column(name="town_city")
  private String townCity;

  @Column(name="branch")
  private String branch;

  @Column(name="division")
  private String division;

  @Column(name="entity")
  private String entity;

  @Column(name="default_welcome_page_view")
  private long defaultWelcomePageView;

  @Column(name="candidate_quick_view_tab")
  private long candidateQuickViewTab;

  @Column(name="synced_to_cognito")
  private long syncedToCognito;

  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="approver_flag")
  private long approverFlag;

  @Column(name="default_renewal_stage")
  private String defaultRenewalStage;

  @Column(name="default_advanced_search")
  private String defaultAdvancedSearch;


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

  public String getNameKana() {
    return this.nameKana;
  }

  public void setNameKana(String nameKana) {
    this.nameKana = nameKana;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEncryptedPassword() {
    return this.encryptedPassword;
  }

  public void setEncryptedPassword(String encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
  }

  public long getSuperUser() {
    return this.superUser;
  }

  public void setSuperUser(long superUser) {
    this.superUser = superUser;
  }

  public java.sql.Timestamp getPreviousLoginTimestamp() {
    return this.previousLoginTimestamp;
  }

  public void setPreviousLoginTimestamp(java.sql.Timestamp previousLoginTimestamp) {
    this.previousLoginTimestamp = previousLoginTimestamp;
  }

  public java.sql.Timestamp getCurrentLoginTimestamp() {
    return this.currentLoginTimestamp;
  }

  public void setCurrentLoginTimestamp(java.sql.Timestamp currentLoginTimestamp) {
    this.currentLoginTimestamp = currentLoginTimestamp;
  }

  public java.sql.Timestamp getHiddenTimestamp() {
    return this.hiddenTimestamp;
  }

  public void setHiddenTimestamp(java.sql.Timestamp hiddenTimestamp) {
    this.hiddenTimestamp = hiddenTimestamp;
  }

  public long getSupervisorId() {
    return this.supervisorId;
  }

  public void setSupervisorId(long supervisorId) {
    this.supervisorId = supervisorId;
  }

  public long getInternalRecruiter() {
    return this.internalRecruiter;
  }

  public void setInternalRecruiter(long internalRecruiter) {
    this.internalRecruiter = internalRecruiter;
  }

  public long getLineManager() {
    return this.lineManager;
  }

  public void setLineManager(long lineManager) {
    this.lineManager = lineManager;
  }

  public java.sql.Timestamp getLastAlertCheckTimestamp() {
    return this.lastAlertCheckTimestamp;
  }

  public void setLastAlertCheckTimestamp(java.sql.Timestamp lastAlertCheckTimestamp) {
    this.lastAlertCheckTimestamp = lastAlertCheckTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getLastUpdatedTimestamp() {
    return this.lastUpdatedTimestamp;
  }

  public void setLastUpdatedTimestamp(java.sql.Timestamp lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
  }

  public long getInternalStaff() {
    return this.internalStaff;
  }

  public void setInternalStaff(long internalStaff) {
    this.internalStaff = internalStaff;
  }

  public String getCalendarLoginId() {
    return this.calendarLoginId;
  }

  public void setCalendarLoginId(String calendarLoginId) {
    this.calendarLoginId = calendarLoginId;
  }

  public String getCalendarPassword() {
    return this.calendarPassword;
  }

  public void setCalendarPassword(String calendarPassword) {
    this.calendarPassword = calendarPassword;
  }

  public String getCalendarServer() {
    return this.calendarServer;
  }

  public void setCalendarServer(String calendarServer) {
    this.calendarServer = calendarServer;
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPhoneExt() {
    return this.phoneExt;
  }

  public void setPhoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
  }

  public long getHr() {
    return this.hr;
  }

  public void setHr(long hr) {
    this.hr = hr;
  }

  public long getInterviewer() {
    return this.interviewer;
  }

  public void setInterviewer(long interviewer) {
    this.interviewer = interviewer;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getEmailPassword() {
    return this.emailPassword;
  }

  public void setEmailPassword(String emailPassword) {
    this.emailPassword = emailPassword;
  }

  public String getEmailHostPort() {
    return this.emailHostPort;
  }

  public void setEmailHostPort(String emailHostPort) {
    this.emailHostPort = emailHostPort;
  }

  public String getEmailApi() {
    return this.emailApi;
  }

  public void setEmailApi(String emailApi) {
    this.emailApi = emailApi;
  }

  public String getSessionId() {
    return this.sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public long getLockedUser() {
    return this.lockedUser;
  }

  public void setLockedUser(long lockedUser) {
    this.lockedUser = lockedUser;
  }

  public String getUserLocation() {
    return this.userLocation;
  }

  public void setUserLocation(String userLocation) {
    this.userLocation = userLocation;
  }

  public String getTimezone() {
    return this.timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public long getRequisitionSignatory() {
    return this.requisitionSignatory;
  }

  public void setRequisitionSignatory(long requisitionSignatory) {
    this.requisitionSignatory = requisitionSignatory;
  }

  public long getMatrixManager() {
    return this.matrixManager;
  }

  public void setMatrixManager(long matrixManager) {
    this.matrixManager = matrixManager;
  }

  public long getBusinessPartner() {
    return this.businessPartner;
  }

  public void setBusinessPartner(long businessPartner) {
    this.businessPartner = businessPartner;
  }

  public long getSystemAdmin() {
    return this.systemAdmin;
  }

  public void setSystemAdmin(long systemAdmin) {
    this.systemAdmin = systemAdmin;
  }

  public java.sql.Timestamp getDeletedTimestamp() {
    return this.deletedTimestamp;
  }

  public void setDeletedTimestamp(java.sql.Timestamp deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  public long getLengthCalendarPassword() {
    return this.lengthCalendarPassword;
  }

  public void setLengthCalendarPassword(long lengthCalendarPassword) {
    this.lengthCalendarPassword = lengthCalendarPassword;
  }

  public long getLengthEmailPassword() {
    return this.lengthEmailPassword;
  }

  public void setLengthEmailPassword(long lengthEmailPassword) {
    this.lengthEmailPassword = lengthEmailPassword;
  }

  public long getDirector() {
    return this.director;
  }

  public void setDirector(long director) {
    this.director = director;
  }

  public long getManager() {
    return this.manager;
  }

  public void setManager(long manager) {
    this.manager = manager;
  }

  public long getConsultant() {
    return this.consultant;
  }

  public void setConsultant(long consultant) {
    this.consultant = consultant;
  }

  public long getResearcher() {
    return this.researcher;
  }

  public void setResearcher(long researcher) {
    this.researcher = researcher;
  }

  public String getEmailHostPortOut() {
    return this.emailHostPortOut;
  }

  public void setEmailHostPortOut(String emailHostPortOut) {
    this.emailHostPortOut = emailHostPortOut;
  }

  public String getEmailSupportType() {
    return this.emailSupportType;
  }

  public void setEmailSupportType(String emailSupportType) {
    this.emailSupportType = emailSupportType;
  }

  public long getExchangeVersion() {
    return this.exchangeVersion;
  }

  public void setExchangeVersion(long exchangeVersion) {
    this.exchangeVersion = exchangeVersion;
  }

  public String getCurrencyType() {
    return this.currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }

  public java.sql.Timestamp getResetRequestTime() {
    return this.resetRequestTime;
  }

  public void setResetRequestTime(java.sql.Timestamp resetRequestTime) {
    this.resetRequestTime = resetRequestTime;
  }

  public String getDateFormat() {
    return this.dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public long getSslTls() {
    return this.sslTls;
  }

  public void setSslTls(long sslTls) {
    this.sslTls = sslTls;
  }

  public long getAuthentication() {
    return this.authentication;
  }

  public void setAuthentication(long authentication) {
    this.authentication = authentication;
  }

  public String getEmailSignature() {
    return this.emailSignature;
  }

  public void setEmailSignature(String emailSignature) {
    this.emailSignature = emailSignature;
  }

  public String getKpiPermission() {
    return this.kpiPermission;
  }

  public void setKpiPermission(String kpiPermission) {
    this.kpiPermission = kpiPermission;
  }

  public String getDefaultCandidateView() {
    return this.defaultCandidateView;
  }

  public void setDefaultCandidateView(String defaultCandidateView) {
    this.defaultCandidateView = defaultCandidateView;
  }

  public long getDefaultDocumentView() {
    return this.defaultDocumentView;
  }

  public void setDefaultDocumentView(long defaultDocumentView) {
    this.defaultDocumentView = defaultDocumentView;
  }

  public long getDisplayTraining() {
    return this.displayTraining;
  }

  public void setDisplayTraining(long displayTraining) {
    this.displayTraining = displayTraining;
  }

  public String getResetPasswordToken() {
    return this.resetPasswordToken;
  }

  public void setResetPasswordToken(String resetPasswordToken) {
    this.resetPasswordToken = resetPasswordToken;
  }

  public long getJobDashboardDefaultView() {
    return this.jobDashboardDefaultView;
  }

  public void setJobDashboardDefaultView(long jobDashboardDefaultView) {
    this.jobDashboardDefaultView = jobDashboardDefaultView;
  }

  public String getHashSalt() {
    return this.hashSalt;
  }

  public void setHashSalt(String hashSalt) {
    this.hashSalt = hashSalt;
  }

  public String getHashPassword() {
    return this.hashPassword;
  }

  public void setHashPassword(String hashPassword) {
    this.hashPassword = hashPassword;
  }

  public long getHashIterations() {
    return this.hashIterations;
  }

  public void setHashIterations(long hashIterations) {
    this.hashIterations = hashIterations;
  }

  public long getDisplayIntro() {
    return this.displayIntro;
  }

  public void setDisplayIntro(long displayIntro) {
    this.displayIntro = displayIntro;
  }

  public long getPinComment() {
    return this.pinComment;
  }

  public void setPinComment(long pinComment) {
    this.pinComment = pinComment;
  }

  public long getNewSearch() {
    return this.newSearch;
  }

  public void setNewSearch(long newSearch) {
    this.newSearch = newSearch;
  }

  public long getViewMode() {
    return this.viewMode;
  }

  public void setViewMode(long viewMode) {
    this.viewMode = viewMode;
  }

  public long getEmailConnected() {
    return this.emailConnected;
  }

  public void setEmailConnected(long emailConnected) {
    this.emailConnected = emailConnected;
  }

  public String getPositionOfBox() {
    return this.positionOfBox;
  }

  public void setPositionOfBox(String positionOfBox) {
    this.positionOfBox = positionOfBox;
  }

  public String getEmailAccountType() {
    return this.emailAccountType;
  }

  public void setEmailAccountType(String emailAccountType) {
    this.emailAccountType = emailAccountType;
  }

  public String getFreshdeskUserId() {
    return this.freshdeskUserId;
  }

  public void setFreshdeskUserId(String freshdeskUserId) {
    this.freshdeskUserId = freshdeskUserId;
  }

  public long getOutgoingAuthentication() {
    return this.outgoingAuthentication;
  }

  public void setOutgoingAuthentication(long outgoingAuthentication) {
    this.outgoingAuthentication = outgoingAuthentication;
  }

  public long getOutgoingEncryptType() {
    return this.outgoingEncryptType;
  }

  public void setOutgoingEncryptType(long outgoingEncryptType) {
    this.outgoingEncryptType = outgoingEncryptType;
  }

  public String getOutgoingEmailUserName() {
    return this.outgoingEmailUserName;
  }

  public void setOutgoingEmailUserName(String outgoingEmailUserName) {
    this.outgoingEmailUserName = outgoingEmailUserName;
  }

  public String getOutgoingEmailPassword() {
    return this.outgoingEmailPassword;
  }

  public void setOutgoingEmailPassword(String outgoingEmailPassword) {
    this.outgoingEmailPassword = outgoingEmailPassword;
  }

  public String getIncomingEmailUserName() {
    return this.incomingEmailUserName;
  }

  public void setIncomingEmailUserName(String incomingEmailUserName) {
    this.incomingEmailUserName = incomingEmailUserName;
  }

  public String getDistanceUnit() {
    return this.distanceUnit;
  }

  public void setDistanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
  }

  public String getMailStatus() {
    return this.mailStatus;
  }

  public void setMailStatus(String mailStatus) {
    this.mailStatus = mailStatus;
  }

  public java.sql.Timestamp getMailRefreshDate() {
    return this.mailRefreshDate;
  }

  public void setMailRefreshDate(java.sql.Timestamp mailRefreshDate) {
    this.mailRefreshDate = mailRefreshDate;
  }

  public String getExchangeHost() {
    return this.exchangeHost;
  }

  public void setExchangeHost(String exchangeHost) {
    this.exchangeHost = exchangeHost;
  }

  public String getProfilePictureFilename() {
    return this.profilePictureFilename;
  }

  public void setProfilePictureFilename(String profilePictureFilename) {
    this.profilePictureFilename = profilePictureFilename;
  }

  public String getTownCity() {
    return this.townCity;
  }

  public void setTownCity(String townCity) {
    this.townCity = townCity;
  }

  public String getBranch() {
    return this.branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public String getDivision() {
    return this.division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public String getEntity() {
    return this.entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public long getDefaultWelcomePageView() {
    return this.defaultWelcomePageView;
  }

  public void setDefaultWelcomePageView(long defaultWelcomePageView) {
    this.defaultWelcomePageView = defaultWelcomePageView;
  }

  public long getCandidateQuickViewTab() {
    return this.candidateQuickViewTab;
  }

  public void setCandidateQuickViewTab(long candidateQuickViewTab) {
    this.candidateQuickViewTab = candidateQuickViewTab;
  }

  public long getSyncedToCognito() {
    return this.syncedToCognito;
  }

  public void setSyncedToCognito(long syncedToCognito) {
    this.syncedToCognito = syncedToCognito;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public long getApproverFlag() {
    return this.approverFlag;
  }

  public void setApproverFlag(long approverFlag) {
    this.approverFlag = approverFlag;
  }

  public String getDefaultRenewalStage() {
    return this.defaultRenewalStage;
  }

  public void setDefaultRenewalStage(String defaultRenewalStage) {
    this.defaultRenewalStage = defaultRenewalStage;
  }

  public String getDefaultAdvancedSearch() {
    return this.defaultAdvancedSearch;
  }

  public void setDefaultAdvancedSearch(String defaultAdvancedSearch) {
    this.defaultAdvancedSearch = defaultAdvancedSearch;
  }
}
