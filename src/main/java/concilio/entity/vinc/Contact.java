package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="company_id")
  private long companyId;

  @Column(name="first_name")
  private String firstName;

  @Column(name="phone")
  private String phone;

  @Column(name="email")
  private String email;

  @Column(name="skype")
  private String skype;

  @Column(name="method_of_contact")
  private String methodOfContact;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="deleted_timestamp")
  private java.sql.Timestamp deletedTimestamp;

  @Column(name="status")
  private long status;

  @Column(name="board")
  private long board;

  @Column(name="last_name")
  private String lastName;

  @Column(name="middle_name")
  private String middleName;

  @Column(name="job_title")
  private String jobTitle;

  @Column(name="profile_picture_filename")
  private String profilePictureFilename;

  @Column(name="contact_client_type")
  private long contactClientType;

  @Column(name="org_contact_id")
  private String orgContactId;

  @Column(name="trigger_index_update_timestamp")
  private java.sql.Timestamp triggerIndexUpdateTimestamp;

  @Column(name="contact_owners")
  private String contactOwners;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="first_name_kana")
  private String firstNameKana;

  @Column(name="middle_name_kana")
  private String middleNameKana;

  @Column(name="last_name_kana")
  private String lastNameKana;

  @Column(name="nick_name")
  private String nickName;

  @Column(name="linkedin")
  private String linkedin;

  @Column(name="report_to")
  private long reportTo;

  @Column(name="note")
  private String note;

  @Column(name="external_id")
  private String externalId;

  @Column(name="customer_probability")
  private long customerProbability;

  @Column(name="date_of_birth")
  private java.sql.Timestamp dateOfBirth;

  @Column(name="mobile_phone")
  private String mobilePhone;

  @Column(name="home_phone")
  private String homePhone;

  @Column(name="switchboard_phone")
  private String switchboardPhone;

  @Column(name="switchboard_phone_ext")
  private String switchboardPhoneExt;

  @Column(name="personal_email")
  private String personalEmail;

  @Column(name="current_location_id")
  private long currentLocationId;

  @Column(name="preferred_time_from")
  private String preferredTimeFrom;

  @Column(name="preferred_time_to")
  private String preferredTimeTo;

  @Column(name="twitter")
  private String twitter;

  @Column(name="job_level")
  private String jobLevel;

  @Column(name="hierarchy")
  private long hierarchy;

  @Column(name="department")
  private String department;

  @Column(name="is_assistant")
  private long isAssistant;

  @Column(name="start_date")
  private java.sql.Timestamp startDate;

  @Column(name="skills")
  private String skills;

  @Column(name="facebook")
  private String facebook;

  @Column(name="gender_title")
  private String genderTitle;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="company_admin_time_temp")
  private long companyAdminTimeTemp;

  @Column(name="hot_end_date")
  private java.sql.Timestamp hotEndDate;

  @Column(name="xing")
  private String xing;

  @Column(name="contact_owner_ids")
  private long contactOwnerIds;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSkype() {
    return this.skype;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  public String getMethodOfContact() {
    return this.methodOfContact;
  }

  public void setMethodOfContact(String methodOfContact) {
    this.methodOfContact = methodOfContact;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getDeletedTimestamp() {
    return this.deletedTimestamp;
  }

  public void setDeletedTimestamp(java.sql.Timestamp deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public long getBoard() {
    return this.board;
  }

  public void setBoard(long board) {
    this.board = board;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMiddleName() {
    return this.middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getProfilePictureFilename() {
    return this.profilePictureFilename;
  }

  public void setProfilePictureFilename(String profilePictureFilename) {
    this.profilePictureFilename = profilePictureFilename;
  }

  public long getContactClientType() {
    return this.contactClientType;
  }

  public void setContactClientType(long contactClientType) {
    this.contactClientType = contactClientType;
  }

  public String getOrgContactId() {
    return this.orgContactId;
  }

  public void setOrgContactId(String orgContactId) {
    this.orgContactId = orgContactId;
  }

  public java.sql.Timestamp getTriggerIndexUpdateTimestamp() {
    return this.triggerIndexUpdateTimestamp;
  }

  public void setTriggerIndexUpdateTimestamp(java.sql.Timestamp triggerIndexUpdateTimestamp) {
    this.triggerIndexUpdateTimestamp = triggerIndexUpdateTimestamp;
  }

  public String getContactOwners() {
    return this.contactOwners;
  }

  public void setContactOwners(String contactOwners) {
    this.contactOwners = contactOwners;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getFirstNameKana() {
    return this.firstNameKana;
  }

  public void setFirstNameKana(String firstNameKana) {
    this.firstNameKana = firstNameKana;
  }

  public String getMiddleNameKana() {
    return this.middleNameKana;
  }

  public void setMiddleNameKana(String middleNameKana) {
    this.middleNameKana = middleNameKana;
  }

  public String getLastNameKana() {
    return this.lastNameKana;
  }

  public void setLastNameKana(String lastNameKana) {
    this.lastNameKana = lastNameKana;
  }

  public String getNickName() {
    return this.nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getLinkedin() {
    return this.linkedin;
  }

  public void setLinkedin(String linkedin) {
    this.linkedin = linkedin;
  }

  public long getReportTo() {
    return this.reportTo;
  }

  public void setReportTo(long reportTo) {
    this.reportTo = reportTo;
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

  public long getCustomerProbability() {
    return this.customerProbability;
  }

  public void setCustomerProbability(long customerProbability) {
    this.customerProbability = customerProbability;
  }

  public java.sql.Timestamp getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(java.sql.Timestamp dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getMobilePhone() {
    return this.mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public String getHomePhone() {
    return this.homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public String getSwitchboardPhone() {
    return this.switchboardPhone;
  }

  public void setSwitchboardPhone(String switchboardPhone) {
    this.switchboardPhone = switchboardPhone;
  }

  public String getSwitchboardPhoneExt() {
    return this.switchboardPhoneExt;
  }

  public void setSwitchboardPhoneExt(String switchboardPhoneExt) {
    this.switchboardPhoneExt = switchboardPhoneExt;
  }

  public String getPersonalEmail() {
    return this.personalEmail;
  }

  public void setPersonalEmail(String personalEmail) {
    this.personalEmail = personalEmail;
  }

  public long getCurrentLocationId() {
    return this.currentLocationId;
  }

  public void setCurrentLocationId(long currentLocationId) {
    this.currentLocationId = currentLocationId;
  }

  public String getPreferredTimeFrom() {
    return this.preferredTimeFrom;
  }

  public void setPreferredTimeFrom(String preferredTimeFrom) {
    this.preferredTimeFrom = preferredTimeFrom;
  }

  public String getPreferredTimeTo() {
    return this.preferredTimeTo;
  }

  public void setPreferredTimeTo(String preferredTimeTo) {
    this.preferredTimeTo = preferredTimeTo;
  }

  public String getTwitter() {
    return this.twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  public String getJobLevel() {
    return this.jobLevel;
  }

  public void setJobLevel(String jobLevel) {
    this.jobLevel = jobLevel;
  }

  public long getHierarchy() {
    return this.hierarchy;
  }

  public void setHierarchy(long hierarchy) {
    this.hierarchy = hierarchy;
  }

  public String getDepartment() {
    return this.department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public long getIsAssistant() {
    return this.isAssistant;
  }

  public void setIsAssistant(long isAssistant) {
    this.isAssistant = isAssistant;
  }

  public java.sql.Timestamp getStartDate() {
    return this.startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }

  public String getSkills() {
    return this.skills;
  }

  public void setSkills(String skills) {
    this.skills = skills;
  }

  public String getFacebook() {
    return this.facebook;
  }

  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }

  public String getGenderTitle() {
    return this.genderTitle;
  }

  public void setGenderTitle(String genderTitle) {
    this.genderTitle = genderTitle;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getCompanyAdminTimeTemp() {
    return this.companyAdminTimeTemp;
  }

  public void setCompanyAdminTimeTemp(long companyAdminTimeTemp) {
    this.companyAdminTimeTemp = companyAdminTimeTemp;
  }

  public java.sql.Timestamp getHotEndDate() {
    return this.hotEndDate;
  }

  public void setHotEndDate(java.sql.Timestamp hotEndDate) {
    this.hotEndDate = hotEndDate;
  }

  public String getXing() {
    return this.xing;
  }

  public void setXing(String xing) {
    this.xing = xing;
  }

  public long getContactOwnerIds() {
    return this.contactOwnerIds;
  }

  public void setContactOwnerIds(long contactOwnerIds) {
    this.contactOwnerIds = contactOwnerIds;
  }
}
