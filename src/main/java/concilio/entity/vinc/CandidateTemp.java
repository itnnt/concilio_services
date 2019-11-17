package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_temp")
public class CandidateTemp {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="first_name")
  private String firstName;

  @Column(name="first_name_kana")
  private String firstNameKana;

  @Column(name="email")
  private String email;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="resume_filename1")
  private String resumeFilename1;

  @Column(name="resume_filename2")
  private String resumeFilename2;

  @Column(name="resume_filename3")
  private String resumeFilename3;

  @Column(name="resume_filename4")
  private String resumeFilename4;

  @Column(name="resume_filename5")
  private String resumeFilename5;

  @Column(name="photo_filename")
  private String photoFilename;

  @Column(name="salary")
  private String salary;

  @Column(name="date_of_birth")
  private java.sql.Timestamp dateOfBirth;

  @Column(name="comments")
  private String comments;

  @Column(name="fee_comments")
  private String feeComments;

  @Column(name="personal_summary")
  private String personalSummary;

  @Column(name="male")
  private long male;

  @Column(name="hidden_timestamp")
  private java.sql.Timestamp hiddenTimestamp;

  @Column(name="description_template_id")
  private long descriptionTemplateId;

  @Column(name="description_template_xml")
  private String descriptionTemplateXml;

  @Column(name="latest_status_change_date")
  private java.sql.Timestamp latestStatusChangeDate;

  @Column(name="latest_status")
  private long latestStatus;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="last_name")
  private String lastName;

  @Column(name="email2")
  private String email2;

  @Column(name="middle_name")
  private String middleName;

  @Column(name="uploaded_resume_content_id")
  private long uploadedResumeContentId;

  @Column(name="phone")
  private String phone;

  @Column(name="address1")
  private String address1;

  @Column(name="address2")
  private String address2;

  @Column(name="zipcode")
  private String zipcode;

  @Column(name="nationality")
  private String nationality;

  @Column(name="year_of_experience")
  private long yearOfExperience;

  @Column(name="present_job")
  private String presentJob;

  @Column(name="linked_in_profile")
  private String linkedInProfile;

  @Column(name="industry")
  private long industry;

  @Column(name="country")
  private String country;

  @Column(name="relocate")
  private long relocate;

  @Column(name="education")
  private long education;

  @Column(name="full_time")
  private long fullTime;

  @Column(name="last_name_kana")
  private String lastNameKana;

  @Column(name="middle_name_kana")
  private String middleNameKana;

  @Column(name="skype")
  private String skype;

  @Column(name="city")
  private String city;

  @Column(name="current_salary")
  private double currentSalary;

  @Column(name="desire_salary")
  private double desireSalary;

  @Column(name="currency_of_salary")
  private String currencyOfSalary;

  @Column(name="contract_rate")
  private double contractRate;

  @Column(name="time_unit_of_contract_rate")
  private String timeUnitOfContractRate;

  @Column(name="other_benefits")
  private String otherBenefits;

  @Column(name="total_p_a")
  private double totalPA;

  @Column(name="source_contact_id")
  private long sourceContactId;

  @Column(name="languages_spoken")
  private String languagesSpoken;

  @Column(name="language_levels")
  private String languageLevels;

  @Column(name="jobs")
  private String jobs;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="eeo_gender")
  private String eeoGender;

  @Column(name="eeo_ethnicity")
  private String eeoEthnicity;

  @Column(name="eeo_race")
  private String eeoRace;

  @Column(name="eeo_veteran_status")
  private String eeoVeteranStatus;

  @Column(name="eeo_require")
  private long eeoRequire;

  @Column(name="encrypted_password")
  private String encryptedPassword;

  @Column(name="phone2")
  private String phone2;

  @Column(name="toeic_score")
  private String toeicScore;

  @Column(name="contract")
  private long contract;

  @Column(name="graduate")
  private long graduate;

  @Column(name="internship")
  private long internship;

  @Column(name="qualification")
  private String qualification;

  @Column(name="school_name")
  private String schoolName;

  @Column(name="degree_name")
  private String degreeName;

  @Column(name="gpa")
  private double gpa;

  @Column(name="major")
  private String major;

  @Column(name="minor")
  private String minor;

  @Column(name="availability_start")
  private java.sql.Timestamp availabilityStart;

  @Column(name="language")
  private String language;

  @Column(name="refered_by")
  private String referedBy;

  @Column(name="refered_by_company")
  private String referedByCompany;

  @Column(name="keyword")
  private String keyword;

  @Column(name="other_info")
  private String otherInfo;

  @Column(name="gender_title")
  private String genderTitle;

  @Column(name="notes1")
  private String notes1;

  @Column(name="candidate_ref_no1")
  private long candidateRefNo1;

  @Column(name="notes2")
  private String notes2;

  @Column(name="candidate_ref_no2")
  private long candidateRefNo2;

  @Column(name="notes3")
  private String notes3;

  @Column(name="candidate_ref_no3")
  private long candidateRefNo3;

  @Column(name="state")
  private String state;

  @Column(name="employee_number")
  private String employeeNumber;

  @Column(name="active")
  private long active;

  @Column(name="cover_letter")
  private String coverLetter;

  @Column(name="current_employer")
  private String currentEmployer;

  @Column(name="graduation_year")
  private long graduationYear;

  @Column(name="present_title")
  private String presentTitle;

  @Column(name="part_time")
  private long partTime;

  @Column(name="is_employee_referal")
  private long isEmployeeReferal;

  @Column(name="passport_no")
  private String passportNo;

  @Column(name="work_phone")
  private String workPhone;

  @Column(name="work_email")
  private String workEmail;

  @Column(name="home_phone")
  private String homePhone;

  @Column(name="instant_messenger_json")
  private String instantMessengerJson;

  @Column(name="contract_interval")
  private String contractInterval;

  @Column(name="personal_address1")
  private String personalAddress1;

  @Column(name="personal_address2")
  private String personalAddress2;

  @Column(name="personal_city")
  private String personalCity;

  @Column(name="personal_zipcode")
  private String personalZipcode;

  @Column(name="personal_country")
  private String personalCountry;

  @Column(name="personal_state")
  private String personalState;

  @Column(name="emergency_name")
  private String emergencyName;

  @Column(name="emergency_phone")
  private String emergencyPhone;

  @Column(name="emergency_relationship")
  private String emergencyRelationship;

  @Column(name="emergency_email")
  private String emergencyEmail;

  @Column(name="employee_job_title")
  private String employeeJobTitle;

  @Column(name="employee_marital_status")
  private String employeeMaritalStatus;

  @Column(name="employee_bus_unit")
  private String employeeBusUnit;

  @Column(name="employee_sub_bus_unit")
  private String employeeSubBusUnit;

  @Column(name="employee_id_number")
  private String employeeIdNumber;

  @Column(name="employee_probation_period")
  private String employeeProbationPeriod;

  @Column(name="employee_termination_reason")
  private String employeeTerminationReason;

  @Column(name="employee_others")
  private String employeeOthers;

  @Column(name="employee_vertical")
  private long employeeVertical;

  @Column(name="employee_line_manager")
  private long employeeLineManager;

  @Column(name="employee_matrix_manager")
  private long employeeMatrixManager;

  @Column(name="employee_location")
  private long employeeLocation;

  @Column(name="employee_employment_type")
  private long employeeEmploymentType;

  @Column(name="employee_start_date")
  private java.sql.Timestamp employeeStartDate;

  @Column(name="employee_end_date")
  private java.sql.Timestamp employeeEndDate;

  @Column(name="employee_termination_date")
  private java.sql.Timestamp employeeTerminationDate;

  @Column(name="salary_bank_name")
  private String salaryBankName;

  @Column(name="salary_bank_branch")
  private String salaryBankBranch;

  @Column(name="salary_account_number")
  private String salaryAccountNumber;

  @Column(name="salary_sort_branch_code")
  private String salarySortBranchCode;

  @Column(name="salary_swift_number")
  private String salarySwiftNumber;

  @Column(name="salary_iban_number")
  private String salaryIbanNumber;

  @Column(name="salary_account_name")
  private String salaryAccountName;

  @Column(name="salary_tax_code")
  private String salaryTaxCode;

  @Column(name="country_specific")
  private String countrySpecific;

  @Column(name="country_specific_display_full_name_as")
  private String countrySpecificDisplayFullNameAs;

  @Column(name="country_specific_detail")
  private String countrySpecificDetail;

  @Column(name="employee")
  private long employee;

  @Column(name="edu_details_json")
  private String eduDetailsJson;

  @Column(name="employee_district")
  private String employeeDistrict;

  @Column(name="employee_country")
  private String employeeCountry;

  @Column(name="employee_cost_center")
  private String employeeCostCenter;

  @Column(name="employee_position_band")
  private String employeePositionBand;

  @Column(name="employee_job_family")
  private String employeeJobFamily;

  @Column(name="employee_job_ref")
  private String employeeJobRef;

  @Column(name="salary_payroll_id")
  private String salaryPayrollId;

  @Column(name="salary_pay_type")
  private String salaryPayType;

  @Column(name="salary_pay_group")
  private String salaryPayGroup;

  @Column(name="salary_eligible_for_benefits")
  private long salaryEligibleForBenefits;

  @Column(name="salary_eligible_for_car")
  private long salaryEligibleForCar;

  @Column(name="salary_target_earnings")
  private String salaryTargetEarnings;

  @Column(name="salary_target_pay")
  private String salaryTargetPay;

  @Column(name="drivers_license_type")
  private String driversLicenseType;

  @Column(name="drivers_license_number")
  private String driversLicenseNumber;

  @Column(name="employer_location_text")
  private String employerLocationText;

  @Column(name="employer_linemanager_text")
  private String employerLinemanagerText;

  @Column(name="employer_vertical_text")
  private String employerVerticalText;

  @Column(name="line_manager_email")
  private String lineManagerEmail;

  @Column(name="line_manager_string")
  private String lineManagerString;

  @Column(name="name_kana")
  private String nameKana;

  @Column(name="employee_line_manager_string")
  private String employeeLineManagerString;

  @Column(name="graduate_high_school")
  private long graduateHighSchool;

  @Column(name="note")
  private String note;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="nickname")
  private String nickname;

  @Column(name="maritalstatus")
  private long maritalstatus;

  @Column(name="objective")
  private String objective;

  @Column(name="skills")
  private String skills;

  @Column(name="courses")
  private String courses;

  @Column(name="institution")
  private String institution;

  @Column(name="thesis")
  private String thesis;

  @Column(name="description")
  private String description;

  @Column(name="training")
  private String training;

  @Column(name="address")
  private String address;

  @Column(name="grade")
  private String grade;

  @Column(name="honors")
  private String honors;

  @Column(name="honorific")
  private String honorific;

  @Column(name="street")
  private String street;

  @Column(name="website")
  private String website;

  @Column(name="pob")
  private String pob;

  @Column(name="publications")
  private String publications;

  @Column(name="affiliations")
  private String affiliations;

  @Column(name="reference")
  private String reference;

  @Column(name="summary")
  private String summary;

  @Column(name="statements")
  private String statements;

  @Column(name="personal")
  private String personal;

  @Column(name="skillrollup")
  private String skillrollup;

  @Column(name="special")
  private String special;

  @Column(name="variant")
  private String variant;

  @Column(name="education_summary")
  private String educationSummary;

  @Column(name="experience")
  private String experience;

  @Column(name="ielts_score")
  private String ieltsScore;

  @Column(name="skill_details_json")
  private String skillDetailsJson;

  @Column(name="experience_details_json")
  private String experienceDetailsJson;

  @Column(name="nearest_train_stn")
  private String nearestTrainStn;

  @Column(name="org_candidate_id")
  private String orgCandidateId;

  @Column(name="trigger_index_update_timestamp")
  private java.sql.Timestamp triggerIndexUpdateTimestamp;

  @Column(name="personal_statements")
  private String personalStatements;

  @Column(name="availability")
  private long availability;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstNameKana() {
    return this.firstNameKana;
  }

  public void setFirstNameKana(String firstNameKana) {
    this.firstNameKana = firstNameKana;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getResumeFilename1() {
    return this.resumeFilename1;
  }

  public void setResumeFilename1(String resumeFilename1) {
    this.resumeFilename1 = resumeFilename1;
  }

  public String getResumeFilename2() {
    return this.resumeFilename2;
  }

  public void setResumeFilename2(String resumeFilename2) {
    this.resumeFilename2 = resumeFilename2;
  }

  public String getResumeFilename3() {
    return this.resumeFilename3;
  }

  public void setResumeFilename3(String resumeFilename3) {
    this.resumeFilename3 = resumeFilename3;
  }

  public String getResumeFilename4() {
    return this.resumeFilename4;
  }

  public void setResumeFilename4(String resumeFilename4) {
    this.resumeFilename4 = resumeFilename4;
  }

  public String getResumeFilename5() {
    return this.resumeFilename5;
  }

  public void setResumeFilename5(String resumeFilename5) {
    this.resumeFilename5 = resumeFilename5;
  }

  public String getPhotoFilename() {
    return this.photoFilename;
  }

  public void setPhotoFilename(String photoFilename) {
    this.photoFilename = photoFilename;
  }

  public String getSalary() {
    return this.salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  public java.sql.Timestamp getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(java.sql.Timestamp dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getComments() {
    return this.comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public String getFeeComments() {
    return this.feeComments;
  }

  public void setFeeComments(String feeComments) {
    this.feeComments = feeComments;
  }

  public String getPersonalSummary() {
    return this.personalSummary;
  }

  public void setPersonalSummary(String personalSummary) {
    this.personalSummary = personalSummary;
  }

  public long getMale() {
    return this.male;
  }

  public void setMale(long male) {
    this.male = male;
  }

  public java.sql.Timestamp getHiddenTimestamp() {
    return this.hiddenTimestamp;
  }

  public void setHiddenTimestamp(java.sql.Timestamp hiddenTimestamp) {
    this.hiddenTimestamp = hiddenTimestamp;
  }

  public long getDescriptionTemplateId() {
    return this.descriptionTemplateId;
  }

  public void setDescriptionTemplateId(long descriptionTemplateId) {
    this.descriptionTemplateId = descriptionTemplateId;
  }

  public String getDescriptionTemplateXml() {
    return this.descriptionTemplateXml;
  }

  public void setDescriptionTemplateXml(String descriptionTemplateXml) {
    this.descriptionTemplateXml = descriptionTemplateXml;
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

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail2() {
    return this.email2;
  }

  public void setEmail2(String email2) {
    this.email2 = email2;
  }

  public String getMiddleName() {
    return this.middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public long getUploadedResumeContentId() {
    return this.uploadedResumeContentId;
  }

  public void setUploadedResumeContentId(long uploadedResumeContentId) {
    this.uploadedResumeContentId = uploadedResumeContentId;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress1() {
    return this.address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return this.address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getZipcode() {
    return this.zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public String getNationality() {
    return this.nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public long getYearOfExperience() {
    return this.yearOfExperience;
  }

  public void setYearOfExperience(long yearOfExperience) {
    this.yearOfExperience = yearOfExperience;
  }

  public String getPresentJob() {
    return this.presentJob;
  }

  public void setPresentJob(String presentJob) {
    this.presentJob = presentJob;
  }

  public String getLinkedInProfile() {
    return this.linkedInProfile;
  }

  public void setLinkedInProfile(String linkedInProfile) {
    this.linkedInProfile = linkedInProfile;
  }

  public long getIndustry() {
    return this.industry;
  }

  public void setIndustry(long industry) {
    this.industry = industry;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public long getRelocate() {
    return this.relocate;
  }

  public void setRelocate(long relocate) {
    this.relocate = relocate;
  }

  public long getEducation() {
    return this.education;
  }

  public void setEducation(long education) {
    this.education = education;
  }

  public long getFullTime() {
    return this.fullTime;
  }

  public void setFullTime(long fullTime) {
    this.fullTime = fullTime;
  }

  public String getLastNameKana() {
    return this.lastNameKana;
  }

  public void setLastNameKana(String lastNameKana) {
    this.lastNameKana = lastNameKana;
  }

  public String getMiddleNameKana() {
    return this.middleNameKana;
  }

  public void setMiddleNameKana(String middleNameKana) {
    this.middleNameKana = middleNameKana;
  }

  public String getSkype() {
    return this.skype;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public double getCurrentSalary() {
    return this.currentSalary;
  }

  public void setCurrentSalary(double currentSalary) {
    this.currentSalary = currentSalary;
  }

  public double getDesireSalary() {
    return this.desireSalary;
  }

  public void setDesireSalary(double desireSalary) {
    this.desireSalary = desireSalary;
  }

  public String getCurrencyOfSalary() {
    return this.currencyOfSalary;
  }

  public void setCurrencyOfSalary(String currencyOfSalary) {
    this.currencyOfSalary = currencyOfSalary;
  }

  public double getContractRate() {
    return this.contractRate;
  }

  public void setContractRate(double contractRate) {
    this.contractRate = contractRate;
  }

  public String getTimeUnitOfContractRate() {
    return this.timeUnitOfContractRate;
  }

  public void setTimeUnitOfContractRate(String timeUnitOfContractRate) {
    this.timeUnitOfContractRate = timeUnitOfContractRate;
  }

  public String getOtherBenefits() {
    return this.otherBenefits;
  }

  public void setOtherBenefits(String otherBenefits) {
    this.otherBenefits = otherBenefits;
  }

  public double getTotalPA() {
    return this.totalPA;
  }

  public void setTotalPA(double totalPA) {
    this.totalPA = totalPA;
  }

  public long getSourceContactId() {
    return this.sourceContactId;
  }

  public void setSourceContactId(long sourceContactId) {
    this.sourceContactId = sourceContactId;
  }

  public String getLanguagesSpoken() {
    return this.languagesSpoken;
  }

  public void setLanguagesSpoken(String languagesSpoken) {
    this.languagesSpoken = languagesSpoken;
  }

  public String getLanguageLevels() {
    return this.languageLevels;
  }

  public void setLanguageLevels(String languageLevels) {
    this.languageLevels = languageLevels;
  }

  public String getJobs() {
    return this.jobs;
  }

  public void setJobs(String jobs) {
    this.jobs = jobs;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public String getEeoGender() {
    return this.eeoGender;
  }

  public void setEeoGender(String eeoGender) {
    this.eeoGender = eeoGender;
  }

  public String getEeoEthnicity() {
    return this.eeoEthnicity;
  }

  public void setEeoEthnicity(String eeoEthnicity) {
    this.eeoEthnicity = eeoEthnicity;
  }

  public String getEeoRace() {
    return this.eeoRace;
  }

  public void setEeoRace(String eeoRace) {
    this.eeoRace = eeoRace;
  }

  public String getEeoVeteranStatus() {
    return this.eeoVeteranStatus;
  }

  public void setEeoVeteranStatus(String eeoVeteranStatus) {
    this.eeoVeteranStatus = eeoVeteranStatus;
  }

  public long getEeoRequire() {
    return this.eeoRequire;
  }

  public void setEeoRequire(long eeoRequire) {
    this.eeoRequire = eeoRequire;
  }

  public String getEncryptedPassword() {
    return this.encryptedPassword;
  }

  public void setEncryptedPassword(String encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
  }

  public String getPhone2() {
    return this.phone2;
  }

  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }

  public String getToeicScore() {
    return this.toeicScore;
  }

  public void setToeicScore(String toeicScore) {
    this.toeicScore = toeicScore;
  }

  public long getContract() {
    return this.contract;
  }

  public void setContract(long contract) {
    this.contract = contract;
  }

  public long getGraduate() {
    return this.graduate;
  }

  public void setGraduate(long graduate) {
    this.graduate = graduate;
  }

  public long getInternship() {
    return this.internship;
  }

  public void setInternship(long internship) {
    this.internship = internship;
  }

  public String getQualification() {
    return this.qualification;
  }

  public void setQualification(String qualification) {
    this.qualification = qualification;
  }

  public String getSchoolName() {
    return this.schoolName;
  }

  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }

  public String getDegreeName() {
    return this.degreeName;
  }

  public void setDegreeName(String degreeName) {
    this.degreeName = degreeName;
  }

  public double getGpa() {
    return this.gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  public String getMajor() {
    return this.major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public String getMinor() {
    return this.minor;
  }

  public void setMinor(String minor) {
    this.minor = minor;
  }

  public java.sql.Timestamp getAvailabilityStart() {
    return this.availabilityStart;
  }

  public void setAvailabilityStart(java.sql.Timestamp availabilityStart) {
    this.availabilityStart = availabilityStart;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getReferedBy() {
    return this.referedBy;
  }

  public void setReferedBy(String referedBy) {
    this.referedBy = referedBy;
  }

  public String getReferedByCompany() {
    return this.referedByCompany;
  }

  public void setReferedByCompany(String referedByCompany) {
    this.referedByCompany = referedByCompany;
  }

  public String getKeyword() {
    return this.keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public String getOtherInfo() {
    return this.otherInfo;
  }

  public void setOtherInfo(String otherInfo) {
    this.otherInfo = otherInfo;
  }

  public String getGenderTitle() {
    return this.genderTitle;
  }

  public void setGenderTitle(String genderTitle) {
    this.genderTitle = genderTitle;
  }

  public String getNotes1() {
    return this.notes1;
  }

  public void setNotes1(String notes1) {
    this.notes1 = notes1;
  }

  public long getCandidateRefNo1() {
    return this.candidateRefNo1;
  }

  public void setCandidateRefNo1(long candidateRefNo1) {
    this.candidateRefNo1 = candidateRefNo1;
  }

  public String getNotes2() {
    return this.notes2;
  }

  public void setNotes2(String notes2) {
    this.notes2 = notes2;
  }

  public long getCandidateRefNo2() {
    return this.candidateRefNo2;
  }

  public void setCandidateRefNo2(long candidateRefNo2) {
    this.candidateRefNo2 = candidateRefNo2;
  }

  public String getNotes3() {
    return this.notes3;
  }

  public void setNotes3(String notes3) {
    this.notes3 = notes3;
  }

  public long getCandidateRefNo3() {
    return this.candidateRefNo3;
  }

  public void setCandidateRefNo3(long candidateRefNo3) {
    this.candidateRefNo3 = candidateRefNo3;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getEmployeeNumber() {
    return this.employeeNumber;
  }

  public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  public long getActive() {
    return this.active;
  }

  public void setActive(long active) {
    this.active = active;
  }

  public String getCoverLetter() {
    return this.coverLetter;
  }

  public void setCoverLetter(String coverLetter) {
    this.coverLetter = coverLetter;
  }

  public String getCurrentEmployer() {
    return this.currentEmployer;
  }

  public void setCurrentEmployer(String currentEmployer) {
    this.currentEmployer = currentEmployer;
  }

  public long getGraduationYear() {
    return this.graduationYear;
  }

  public void setGraduationYear(long graduationYear) {
    this.graduationYear = graduationYear;
  }

  public String getPresentTitle() {
    return this.presentTitle;
  }

  public void setPresentTitle(String presentTitle) {
    this.presentTitle = presentTitle;
  }

  public long getPartTime() {
    return this.partTime;
  }

  public void setPartTime(long partTime) {
    this.partTime = partTime;
  }

  public long getIsEmployeeReferal() {
    return this.isEmployeeReferal;
  }

  public void setIsEmployeeReferal(long isEmployeeReferal) {
    this.isEmployeeReferal = isEmployeeReferal;
  }

  public String getPassportNo() {
    return this.passportNo;
  }

  public void setPassportNo(String passportNo) {
    this.passportNo = passportNo;
  }

  public String getWorkPhone() {
    return this.workPhone;
  }

  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }

  public String getWorkEmail() {
    return this.workEmail;
  }

  public void setWorkEmail(String workEmail) {
    this.workEmail = workEmail;
  }

  public String getHomePhone() {
    return this.homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public String getInstantMessengerJson() {
    return this.instantMessengerJson;
  }

  public void setInstantMessengerJson(String instantMessengerJson) {
    this.instantMessengerJson = instantMessengerJson;
  }

  public String getContractInterval() {
    return this.contractInterval;
  }

  public void setContractInterval(String contractInterval) {
    this.contractInterval = contractInterval;
  }

  public String getPersonalAddress1() {
    return this.personalAddress1;
  }

  public void setPersonalAddress1(String personalAddress1) {
    this.personalAddress1 = personalAddress1;
  }

  public String getPersonalAddress2() {
    return this.personalAddress2;
  }

  public void setPersonalAddress2(String personalAddress2) {
    this.personalAddress2 = personalAddress2;
  }

  public String getPersonalCity() {
    return this.personalCity;
  }

  public void setPersonalCity(String personalCity) {
    this.personalCity = personalCity;
  }

  public String getPersonalZipcode() {
    return this.personalZipcode;
  }

  public void setPersonalZipcode(String personalZipcode) {
    this.personalZipcode = personalZipcode;
  }

  public String getPersonalCountry() {
    return this.personalCountry;
  }

  public void setPersonalCountry(String personalCountry) {
    this.personalCountry = personalCountry;
  }

  public String getPersonalState() {
    return this.personalState;
  }

  public void setPersonalState(String personalState) {
    this.personalState = personalState;
  }

  public String getEmergencyName() {
    return this.emergencyName;
  }

  public void setEmergencyName(String emergencyName) {
    this.emergencyName = emergencyName;
  }

  public String getEmergencyPhone() {
    return this.emergencyPhone;
  }

  public void setEmergencyPhone(String emergencyPhone) {
    this.emergencyPhone = emergencyPhone;
  }

  public String getEmergencyRelationship() {
    return this.emergencyRelationship;
  }

  public void setEmergencyRelationship(String emergencyRelationship) {
    this.emergencyRelationship = emergencyRelationship;
  }

  public String getEmergencyEmail() {
    return this.emergencyEmail;
  }

  public void setEmergencyEmail(String emergencyEmail) {
    this.emergencyEmail = emergencyEmail;
  }

  public String getEmployeeJobTitle() {
    return this.employeeJobTitle;
  }

  public void setEmployeeJobTitle(String employeeJobTitle) {
    this.employeeJobTitle = employeeJobTitle;
  }

  public String getEmployeeMaritalStatus() {
    return this.employeeMaritalStatus;
  }

  public void setEmployeeMaritalStatus(String employeeMaritalStatus) {
    this.employeeMaritalStatus = employeeMaritalStatus;
  }

  public String getEmployeeBusUnit() {
    return this.employeeBusUnit;
  }

  public void setEmployeeBusUnit(String employeeBusUnit) {
    this.employeeBusUnit = employeeBusUnit;
  }

  public String getEmployeeSubBusUnit() {
    return this.employeeSubBusUnit;
  }

  public void setEmployeeSubBusUnit(String employeeSubBusUnit) {
    this.employeeSubBusUnit = employeeSubBusUnit;
  }

  public String getEmployeeIdNumber() {
    return this.employeeIdNumber;
  }

  public void setEmployeeIdNumber(String employeeIdNumber) {
    this.employeeIdNumber = employeeIdNumber;
  }

  public String getEmployeeProbationPeriod() {
    return this.employeeProbationPeriod;
  }

  public void setEmployeeProbationPeriod(String employeeProbationPeriod) {
    this.employeeProbationPeriod = employeeProbationPeriod;
  }

  public String getEmployeeTerminationReason() {
    return this.employeeTerminationReason;
  }

  public void setEmployeeTerminationReason(String employeeTerminationReason) {
    this.employeeTerminationReason = employeeTerminationReason;
  }

  public String getEmployeeOthers() {
    return this.employeeOthers;
  }

  public void setEmployeeOthers(String employeeOthers) {
    this.employeeOthers = employeeOthers;
  }

  public long getEmployeeVertical() {
    return this.employeeVertical;
  }

  public void setEmployeeVertical(long employeeVertical) {
    this.employeeVertical = employeeVertical;
  }

  public long getEmployeeLineManager() {
    return this.employeeLineManager;
  }

  public void setEmployeeLineManager(long employeeLineManager) {
    this.employeeLineManager = employeeLineManager;
  }

  public long getEmployeeMatrixManager() {
    return this.employeeMatrixManager;
  }

  public void setEmployeeMatrixManager(long employeeMatrixManager) {
    this.employeeMatrixManager = employeeMatrixManager;
  }

  public long getEmployeeLocation() {
    return this.employeeLocation;
  }

  public void setEmployeeLocation(long employeeLocation) {
    this.employeeLocation = employeeLocation;
  }

  public long getEmployeeEmploymentType() {
    return this.employeeEmploymentType;
  }

  public void setEmployeeEmploymentType(long employeeEmploymentType) {
    this.employeeEmploymentType = employeeEmploymentType;
  }

  public java.sql.Timestamp getEmployeeStartDate() {
    return this.employeeStartDate;
  }

  public void setEmployeeStartDate(java.sql.Timestamp employeeStartDate) {
    this.employeeStartDate = employeeStartDate;
  }

  public java.sql.Timestamp getEmployeeEndDate() {
    return this.employeeEndDate;
  }

  public void setEmployeeEndDate(java.sql.Timestamp employeeEndDate) {
    this.employeeEndDate = employeeEndDate;
  }

  public java.sql.Timestamp getEmployeeTerminationDate() {
    return this.employeeTerminationDate;
  }

  public void setEmployeeTerminationDate(java.sql.Timestamp employeeTerminationDate) {
    this.employeeTerminationDate = employeeTerminationDate;
  }

  public String getSalaryBankName() {
    return this.salaryBankName;
  }

  public void setSalaryBankName(String salaryBankName) {
    this.salaryBankName = salaryBankName;
  }

  public String getSalaryBankBranch() {
    return this.salaryBankBranch;
  }

  public void setSalaryBankBranch(String salaryBankBranch) {
    this.salaryBankBranch = salaryBankBranch;
  }

  public String getSalaryAccountNumber() {
    return this.salaryAccountNumber;
  }

  public void setSalaryAccountNumber(String salaryAccountNumber) {
    this.salaryAccountNumber = salaryAccountNumber;
  }

  public String getSalarySortBranchCode() {
    return this.salarySortBranchCode;
  }

  public void setSalarySortBranchCode(String salarySortBranchCode) {
    this.salarySortBranchCode = salarySortBranchCode;
  }

  public String getSalarySwiftNumber() {
    return this.salarySwiftNumber;
  }

  public void setSalarySwiftNumber(String salarySwiftNumber) {
    this.salarySwiftNumber = salarySwiftNumber;
  }

  public String getSalaryIbanNumber() {
    return this.salaryIbanNumber;
  }

  public void setSalaryIbanNumber(String salaryIbanNumber) {
    this.salaryIbanNumber = salaryIbanNumber;
  }

  public String getSalaryAccountName() {
    return this.salaryAccountName;
  }

  public void setSalaryAccountName(String salaryAccountName) {
    this.salaryAccountName = salaryAccountName;
  }

  public String getSalaryTaxCode() {
    return this.salaryTaxCode;
  }

  public void setSalaryTaxCode(String salaryTaxCode) {
    this.salaryTaxCode = salaryTaxCode;
  }

  public String getCountrySpecific() {
    return this.countrySpecific;
  }

  public void setCountrySpecific(String countrySpecific) {
    this.countrySpecific = countrySpecific;
  }

  public String getCountrySpecificDisplayFullNameAs() {
    return this.countrySpecificDisplayFullNameAs;
  }

  public void setCountrySpecificDisplayFullNameAs(String countrySpecificDisplayFullNameAs) {
    this.countrySpecificDisplayFullNameAs = countrySpecificDisplayFullNameAs;
  }

  public String getCountrySpecificDetail() {
    return this.countrySpecificDetail;
  }

  public void setCountrySpecificDetail(String countrySpecificDetail) {
    this.countrySpecificDetail = countrySpecificDetail;
  }

  public long getEmployee() {
    return this.employee;
  }

  public void setEmployee(long employee) {
    this.employee = employee;
  }

  public String getEduDetailsJson() {
    return this.eduDetailsJson;
  }

  public void setEduDetailsJson(String eduDetailsJson) {
    this.eduDetailsJson = eduDetailsJson;
  }

  public String getEmployeeDistrict() {
    return this.employeeDistrict;
  }

  public void setEmployeeDistrict(String employeeDistrict) {
    this.employeeDistrict = employeeDistrict;
  }

  public String getEmployeeCountry() {
    return this.employeeCountry;
  }

  public void setEmployeeCountry(String employeeCountry) {
    this.employeeCountry = employeeCountry;
  }

  public String getEmployeeCostCenter() {
    return this.employeeCostCenter;
  }

  public void setEmployeeCostCenter(String employeeCostCenter) {
    this.employeeCostCenter = employeeCostCenter;
  }

  public String getEmployeePositionBand() {
    return this.employeePositionBand;
  }

  public void setEmployeePositionBand(String employeePositionBand) {
    this.employeePositionBand = employeePositionBand;
  }

  public String getEmployeeJobFamily() {
    return this.employeeJobFamily;
  }

  public void setEmployeeJobFamily(String employeeJobFamily) {
    this.employeeJobFamily = employeeJobFamily;
  }

  public String getEmployeeJobRef() {
    return this.employeeJobRef;
  }

  public void setEmployeeJobRef(String employeeJobRef) {
    this.employeeJobRef = employeeJobRef;
  }

  public String getSalaryPayrollId() {
    return this.salaryPayrollId;
  }

  public void setSalaryPayrollId(String salaryPayrollId) {
    this.salaryPayrollId = salaryPayrollId;
  }

  public String getSalaryPayType() {
    return this.salaryPayType;
  }

  public void setSalaryPayType(String salaryPayType) {
    this.salaryPayType = salaryPayType;
  }

  public String getSalaryPayGroup() {
    return this.salaryPayGroup;
  }

  public void setSalaryPayGroup(String salaryPayGroup) {
    this.salaryPayGroup = salaryPayGroup;
  }

  public long getSalaryEligibleForBenefits() {
    return this.salaryEligibleForBenefits;
  }

  public void setSalaryEligibleForBenefits(long salaryEligibleForBenefits) {
    this.salaryEligibleForBenefits = salaryEligibleForBenefits;
  }

  public long getSalaryEligibleForCar() {
    return this.salaryEligibleForCar;
  }

  public void setSalaryEligibleForCar(long salaryEligibleForCar) {
    this.salaryEligibleForCar = salaryEligibleForCar;
  }

  public String getSalaryTargetEarnings() {
    return this.salaryTargetEarnings;
  }

  public void setSalaryTargetEarnings(String salaryTargetEarnings) {
    this.salaryTargetEarnings = salaryTargetEarnings;
  }

  public String getSalaryTargetPay() {
    return this.salaryTargetPay;
  }

  public void setSalaryTargetPay(String salaryTargetPay) {
    this.salaryTargetPay = salaryTargetPay;
  }

  public String getDriversLicenseType() {
    return this.driversLicenseType;
  }

  public void setDriversLicenseType(String driversLicenseType) {
    this.driversLicenseType = driversLicenseType;
  }

  public String getDriversLicenseNumber() {
    return this.driversLicenseNumber;
  }

  public void setDriversLicenseNumber(String driversLicenseNumber) {
    this.driversLicenseNumber = driversLicenseNumber;
  }

  public String getEmployerLocationText() {
    return this.employerLocationText;
  }

  public void setEmployerLocationText(String employerLocationText) {
    this.employerLocationText = employerLocationText;
  }

  public String getEmployerLinemanagerText() {
    return this.employerLinemanagerText;
  }

  public void setEmployerLinemanagerText(String employerLinemanagerText) {
    this.employerLinemanagerText = employerLinemanagerText;
  }

  public String getEmployerVerticalText() {
    return this.employerVerticalText;
  }

  public void setEmployerVerticalText(String employerVerticalText) {
    this.employerVerticalText = employerVerticalText;
  }

  public String getLineManagerEmail() {
    return this.lineManagerEmail;
  }

  public void setLineManagerEmail(String lineManagerEmail) {
    this.lineManagerEmail = lineManagerEmail;
  }

  public String getLineManagerString() {
    return this.lineManagerString;
  }

  public void setLineManagerString(String lineManagerString) {
    this.lineManagerString = lineManagerString;
  }

  public String getNameKana() {
    return this.nameKana;
  }

  public void setNameKana(String nameKana) {
    this.nameKana = nameKana;
  }

  public String getEmployeeLineManagerString() {
    return this.employeeLineManagerString;
  }

  public void setEmployeeLineManagerString(String employeeLineManagerString) {
    this.employeeLineManagerString = employeeLineManagerString;
  }

  public long getGraduateHighSchool() {
    return this.graduateHighSchool;
  }

  public void setGraduateHighSchool(long graduateHighSchool) {
    this.graduateHighSchool = graduateHighSchool;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public String getNickname() {
    return this.nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public long getMaritalstatus() {
    return this.maritalstatus;
  }

  public void setMaritalstatus(long maritalstatus) {
    this.maritalstatus = maritalstatus;
  }

  public String getObjective() {
    return this.objective;
  }

  public void setObjective(String objective) {
    this.objective = objective;
  }

  public String getSkills() {
    return this.skills;
  }

  public void setSkills(String skills) {
    this.skills = skills;
  }

  public String getCourses() {
    return this.courses;
  }

  public void setCourses(String courses) {
    this.courses = courses;
  }

  public String getInstitution() {
    return this.institution;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
  }

  public String getThesis() {
    return this.thesis;
  }

  public void setThesis(String thesis) {
    this.thesis = thesis;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTraining() {
    return this.training;
  }

  public void setTraining(String training) {
    this.training = training;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getGrade() {
    return this.grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public String getHonors() {
    return this.honors;
  }

  public void setHonors(String honors) {
    this.honors = honors;
  }

  public String getHonorific() {
    return this.honorific;
  }

  public void setHonorific(String honorific) {
    this.honorific = honorific;
  }

  public String getStreet() {
    return this.street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getWebsite() {
    return this.website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public String getPob() {
    return this.pob;
  }

  public void setPob(String pob) {
    this.pob = pob;
  }

  public String getPublications() {
    return this.publications;
  }

  public void setPublications(String publications) {
    this.publications = publications;
  }

  public String getAffiliations() {
    return this.affiliations;
  }

  public void setAffiliations(String affiliations) {
    this.affiliations = affiliations;
  }

  public String getReference() {
    return this.reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public String getSummary() {
    return this.summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getStatements() {
    return this.statements;
  }

  public void setStatements(String statements) {
    this.statements = statements;
  }

  public String getPersonal() {
    return this.personal;
  }

  public void setPersonal(String personal) {
    this.personal = personal;
  }

  public String getSkillrollup() {
    return this.skillrollup;
  }

  public void setSkillrollup(String skillrollup) {
    this.skillrollup = skillrollup;
  }

  public String getSpecial() {
    return this.special;
  }

  public void setSpecial(String special) {
    this.special = special;
  }

  public String getVariant() {
    return this.variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public String getEducationSummary() {
    return this.educationSummary;
  }

  public void setEducationSummary(String educationSummary) {
    this.educationSummary = educationSummary;
  }

  public String getExperience() {
    return this.experience;
  }

  public void setExperience(String experience) {
    this.experience = experience;
  }

  public String getIeltsScore() {
    return this.ieltsScore;
  }

  public void setIeltsScore(String ieltsScore) {
    this.ieltsScore = ieltsScore;
  }

  public String getSkillDetailsJson() {
    return this.skillDetailsJson;
  }

  public void setSkillDetailsJson(String skillDetailsJson) {
    this.skillDetailsJson = skillDetailsJson;
  }

  public String getExperienceDetailsJson() {
    return this.experienceDetailsJson;
  }

  public void setExperienceDetailsJson(String experienceDetailsJson) {
    this.experienceDetailsJson = experienceDetailsJson;
  }

  public String getNearestTrainStn() {
    return this.nearestTrainStn;
  }

  public void setNearestTrainStn(String nearestTrainStn) {
    this.nearestTrainStn = nearestTrainStn;
  }

  public String getOrgCandidateId() {
    return this.orgCandidateId;
  }

  public void setOrgCandidateId(String orgCandidateId) {
    this.orgCandidateId = orgCandidateId;
  }

  public java.sql.Timestamp getTriggerIndexUpdateTimestamp() {
    return this.triggerIndexUpdateTimestamp;
  }

  public void setTriggerIndexUpdateTimestamp(java.sql.Timestamp triggerIndexUpdateTimestamp) {
    this.triggerIndexUpdateTimestamp = triggerIndexUpdateTimestamp;
  }

  public String getPersonalStatements() {
    return this.personalStatements;
  }

  public void setPersonalStatements(String personalStatements) {
    this.personalStatements = personalStatements;
  }

  public long getAvailability() {
    return this.availability;
  }

  public void setAvailability(long availability) {
    this.availability = availability;
  }
}
