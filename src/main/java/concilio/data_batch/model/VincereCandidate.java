package concilio.data_batch.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VincereCandidate {
    private Integer id;

    // affiliations
    private String affiliations;

    // String
    // availability_start: Must be in format "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
    private Date availabilityStart;

    // candidate_source_id (required)
    // internal id of candidate source in Vincere.
    // Please refer to the reference section for candidate source.
    @JsonProperty(value = "candidate_source_id", required = true)
    private Integer candidateSourceId;

    // company_count: the number of previous employers
    private Integer companyCount;

    // company_name
    private String companyName;

    // company_number
    private String companyNumber;

    // contract_interval: Enum: "HOURLY" "DAYLY" "WEEKLY" "MONTHLY" "YEARLY"
    private String contractInterval;

    // contract_rate: pay rate
    private Integer contractRate;

    // country_of_domicile: please refer to reference section of countries
    private String countryOfDomicile;

    // creator_id: internal id of an user in Vincere
    private Integer creatorId;

    // currency_type: Currency. Please refer to reference list for the currency values.
    private String currencyType;

    // current_bonus: amount of money
    private Double currentBonus;

    // current_salary: amount of money
    private Double currentSalary;

    // String
    // date_of_birth: Date of Birth. String must be in format "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
    private Date dateOfBirth;

    // desired_bonus: amount of money
    private Double desiredBonus;

    // desired_contract_rate: pay rate
    private Integer desiredContractRate;

    // desired_salary: amount of money
    private Double desiredSalary;

    // desired_salary_monthly: amount of money
    private Double desiredSalaryMonthly;

    // driving_license_number: Driving License Number
    private String drivingLicenseNumber;

    // driving_license_type: Driving License Type
    private String drivingLicenseType;

    // education_summary: Education Summary
    private String educationSummary;

    // email: Primary Email (required)
    @JsonProperty(value="email", required = true)
    private String email;

    // employment_type: Enum: "FULL_TIME" "PART_TIME" "CASUAL" "LABOUR_HIRE"
    private String employmentType;

    // experience
    private String experience;

    // external_id: external Reference id
    private String externalId;

    // emergency_name: Emergency Name
    private String emergencyName;

    // emergency_phone: Emergency Phone
    private String emergencyPhone;

    // emergency_relationship: Emergency Relationship
    private String emergencyRelationship;

    // emergency_email: Emergency Email
    private String emergencyEmail;

    // facebook: Facebook URL
    private String facebook;

    // first_name: required
    @JsonProperty(value="first_name", required = true)
    private String firstName;

    // first_name_kana
    private String firstNameKana;

    // gender: Enum: "MALE" "FEMALE" "NO_VALUE"
    // Please refer to reference section for gender
    private String gender;

    // gender_title
    // accepted gender title of a candidate.
    // Expected values are: Mr., Mrs., Ms., Miss., Dr.
    private String genderTitle;

    // home_phone
    private String homePhone;

    // ielts_score: IELTS Score
    private String ieltsScore;

    // keyword: Keywords. Multiple keywords should be separated by commas
    private String keyword;

    // last_name: required
    @JsonProperty(value="last_name", required = true)
    private String lastName;

    // last_name_kana
    private String lastNameKana;

    // linked_contact_id: contact internal id
    private Integer linkedContactId;

    // linked_in: LinkedIn Url
    private String linkedIn;

    // marital_status: Marital Status. Please refer to reference section for Marital Status
    private String maritalStatus;

    // met_status: please refer to reference section of meetingstatuses.
    private String metStatus;

    // middle_name
    private String middleName;

    // middle_name_kana
    private String middleNameKana;

    private String mobile;

    // nationality: Please refer to reference section for nationality
    private String nationality;

    // nearest_train_station
    private String nearestTrainStation;

    private String note;

    // note_by: internal id of an user in Vincere
    private Integer noteBy;

    // note_on: Date Time for last modification of the note.
    // Must be in this format "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
    private Date noteOn;

    // notice_days: notice period (in days)
    private Integer noticeDays;

    // objective
    private String objective;

    // other_benefits
    private String otherBenefits;

    // passport_no: Passport Number
    private String passportNo;

    // payment_type: Enum: "PAYG" "PAYE" "LTD_CO"
    // candidate payment type, including PAYG, PAYE or LTD_CO (Ltd Co. or corporation)
    private String paymentType;

    // payslip_email: Candidate payslip email. It's unique.
    private String payslipEmail;

    // personal_statements
    private String personalStatements;

    // phone: Primary Phone
    private String phone;

    // place_of_birth
    private String placeOfBirth;

    // preferred_language: please refer to reference section of languages
    private String preferredLanguage;

    // present_salary_rate
    private Double presentSalaryRate;

    // publications
    private String publications;

    // reference
    private String reference;

    // registration_date: required
    // Registration Date. Must be in format "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
    @JsonProperty(value="registration_date", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date registrationDate;

    // relocate
    private Boolean relocate;

    // salary_months_per_year: number of months per year
    private Double salaryMonthsPerYear;

    // salary_type: Enum: "ANNUAL" "MONTHLY"
    // candidate salary type
    private String salaryType;

    // skills: Skill Summary, skills are deliminated by comma, i.e. ","
    private String skills;

    private String skype;

    private String statements;

    private String summary;

    // toeic_score
    private String toeicScore;

    // total_gross: total gross compensation per year
    private Double totalGross;

    // twitter: Twitter Url
    private String twitter;

    private String variant;

    // visa_note
    private String visaNote;

    // visa_number
    private String visaNumber;

    // visa_renewal_date: string
    // Must be in format "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
    private Date visaRenewalDate;

    // visa_status
    private String visaStatus;

    // visa_type
    private String visaType;

    // website
    private String website;

    // work_email
    private String workEmail;

    // work_phone
    private String workPhone;

    // xing: Xing Url
    private String xing;

    // linked_in_resume_content: The resume content retrieved from LinkedIn
    private String linkedInResumeContent;

    //string
    //nickname (or preferred name)
    private String nickname;

    public VincereCandidate() {
    }

    public String getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(String affiliations) {
        this.affiliations = affiliations;
    }

    public Date getAvailabilityStart() {
        return availabilityStart;
    }

    public void setAvailabilityStart(Date availabilityStart) {
        this.availabilityStart = availabilityStart;
    }

    public Integer getCandidateSourceId() {
        return candidateSourceId;
    }

    public void setCandidateSourceId(Integer candidateSourceId) {
        this.candidateSourceId = candidateSourceId;
    }

    public Integer getCompanyCount() {
        return companyCount;
    }

    public void setCompanyCount(Integer companyCount) {
        this.companyCount = companyCount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getContractInterval() {
        return contractInterval;
    }

    public void setContractInterval(String contractInterval) {
        this.contractInterval = contractInterval;
    }

    public Integer getContractRate() {
        return contractRate;
    }

    public void setContractRate(Integer contractRate) {
        this.contractRate = contractRate;
    }

    public String getCountryOfDomicile() {
        return countryOfDomicile;
    }

    public void setCountryOfDomicile(String countryOfDomicile) {
        this.countryOfDomicile = countryOfDomicile;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public Double getCurrentBonus() {
        return currentBonus;
    }

    public void setCurrentBonus(Double currentBonus) {
        this.currentBonus = currentBonus;
    }

    public Double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(Double currentSalary) {
        this.currentSalary = currentSalary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getDesiredBonus() {
        return desiredBonus;
    }

    public void setDesiredBonus(Double desiredBonus) {
        this.desiredBonus = desiredBonus;
    }

    public Integer getDesiredContractRate() {
        return desiredContractRate;
    }

    public void setDesiredContractRate(Integer desiredContractRate) {
        this.desiredContractRate = desiredContractRate;
    }

    public Double getDesiredSalary() {
        return desiredSalary;
    }

    public void setDesiredSalary(Double desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public Double getDesiredSalaryMonthly() {
        return desiredSalaryMonthly;
    }

    public void setDesiredSalaryMonthly(Double desiredSalaryMonthly) {
        this.desiredSalaryMonthly = desiredSalaryMonthly;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public String getDrivingLicenseType() {
        return drivingLicenseType;
    }

    public void setDrivingLicenseType(String drivingLicenseType) {
        this.drivingLicenseType = drivingLicenseType;
    }

    public String getEducationSummary() {
        return educationSummary;
    }

    public void setEducationSummary(String educationSummary) {
        this.educationSummary = educationSummary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public String getEmergencyRelationship() {
        return emergencyRelationship;
    }

    public void setEmergencyRelationship(String emergencyRelationship) {
        this.emergencyRelationship = emergencyRelationship;
    }

    public String getEmergencyEmail() {
        return emergencyEmail;
    }

    public void setEmergencyEmail(String emergencyEmail) {
        this.emergencyEmail = emergencyEmail;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstNameKana() {
        return firstNameKana;
    }

    public void setFirstNameKana(String firstNameKana) {
        this.firstNameKana = firstNameKana;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGenderTitle() {
        return genderTitle;
    }

    public void setGenderTitle(String genderTitle) {
        this.genderTitle = genderTitle;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getIeltsScore() {
        return ieltsScore;
    }

    public void setIeltsScore(String ieltsScore) {
        this.ieltsScore = ieltsScore;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastNameKana() {
        return lastNameKana;
    }

    public void setLastNameKana(String lastNameKana) {
        this.lastNameKana = lastNameKana;
    }

    public Integer getLinkedContactId() {
        return linkedContactId;
    }

    public void setLinkedContactId(Integer linkedContactId) {
        this.linkedContactId = linkedContactId;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMetStatus() {
        return metStatus;
    }

    public void setMetStatus(String metStatus) {
        this.metStatus = metStatus;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleNameKana() {
        return middleNameKana;
    }

    public void setMiddleNameKana(String middleNameKana) {
        this.middleNameKana = middleNameKana;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNearestTrainStation() {
        return nearestTrainStation;
    }

    public void setNearestTrainStation(String nearestTrainStation) {
        this.nearestTrainStation = nearestTrainStation;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getNoteBy() {
        return noteBy;
    }

    public void setNoteBy(Integer noteBy) {
        this.noteBy = noteBy;
    }

    public Date getNoteOn() {
        return noteOn;
    }

    public void setNoteOn(Date noteOn) {
        this.noteOn = noteOn;
    }

    public Integer getNoticeDays() {
        return noticeDays;
    }

    public void setNoticeDays(Integer noticeDays) {
        this.noticeDays = noticeDays;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getOtherBenefits() {
        return otherBenefits;
    }

    public void setOtherBenefits(String otherBenefits) {
        this.otherBenefits = otherBenefits;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPayslipEmail() {
        return payslipEmail;
    }

    public void setPayslipEmail(String payslipEmail) {
        this.payslipEmail = payslipEmail;
    }

    public String getPersonalStatements() {
        return personalStatements;
    }

    public void setPersonalStatements(String personalStatements) {
        this.personalStatements = personalStatements;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public Double getPresentSalaryRate() {
        return presentSalaryRate;
    }

    public void setPresentSalaryRate(Double presentSalaryRate) {
        this.presentSalaryRate = presentSalaryRate;
    }

    public String getPublications() {
        return publications;
    }

    public void setPublications(String publications) {
        this.publications = publications;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Boolean getRelocate() {
        return relocate;
    }

    public void setRelocate(Boolean relocate) {
        this.relocate = relocate;
    }

    public Double getSalaryMonthsPerYear() {
        return salaryMonthsPerYear;
    }

    public void setSalaryMonthsPerYear(Double salaryMonthsPerYear) {
        this.salaryMonthsPerYear = salaryMonthsPerYear;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getStatements() {
        return statements;
    }

    public void setStatements(String statements) {
        this.statements = statements;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getToeicScore() {
        return toeicScore;
    }

    public void setToeicScore(String toeicScore) {
        this.toeicScore = toeicScore;
    }

    public Double getTotalGross() {
        return totalGross;
    }

    public void setTotalGross(Double totalGross) {
        this.totalGross = totalGross;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getVisaNote() {
        return visaNote;
    }

    public void setVisaNote(String visaNote) {
        this.visaNote = visaNote;
    }

    public String getVisaNumber() {
        return visaNumber;
    }

    public void setVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
    }

    public Date getVisaRenewalDate() {
        return visaRenewalDate;
    }

    public void setVisaRenewalDate(Date visaRenewalDate) {
        this.visaRenewalDate = visaRenewalDate;
    }

    public String getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(String visaStatus) {
        this.visaStatus = visaStatus;
    }

    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getXing() {
        return xing;
    }

    public void setXing(String xing) {
        this.xing = xing;
    }

    public String getLinkedInResumeContent() {
        return linkedInResumeContent;
    }

    public void setLinkedInResumeContent(String linkedInResumeContent) {
        this.linkedInResumeContent = linkedInResumeContent;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String toJson() throws JsonProcessingException {
        // Creating Object of ObjectMapper define in Jakson Api
        ObjectMapper Obj = new ObjectMapper();
        return Obj.writeValueAsString(this);
    }
}
