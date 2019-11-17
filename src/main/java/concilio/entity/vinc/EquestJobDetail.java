package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equest_job_detail")
public class EquestJobDetail {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_id")
  private long positionId;

  @Column(name="job_board_id")
  private long jobBoardId;

  @Column(name="job_title")
  private String jobTitle;

  @Column(name="job_description")
  private String jobDescription;

  @Column(name="job_country")
  private String jobCountry;

  @Column(name="job_state")
  private String jobState;

  @Column(name="job_city")
  private String jobCity;

  @Column(name="job_postcode")
  private String jobPostcode;

  @Column(name="travel_percentage")
  private double travelPercentage;

  @Column(name="telecommute_percentage")
  private double telecommutePercentage;

  @Column(name="job_function")
  private String jobFunction;

  @Column(name="job_industry")
  private String jobIndustry;

  @Column(name="classification_type")
  private String classificationType;

  @Column(name="classification_time")
  private String classificationTime;

  @Column(name="compensation_type")
  private String compensationType;

  @Column(name="compensation_currency")
  private String compensationCurrency;

  @Column(name="compensation_rate")
  private String compensationRate;

  @Column(name="compensation_min")
  private double compensationMin;

  @Column(name="compensation_max")
  private double compensationMax;

  @Column(name="compensation_amount")
  private double compensationAmount;

  @Column(name="job_education")
  private String jobEducation;

  @Column(name="job_skill")
  private String jobSkill;

  @Column(name="job_benefit")
  private String jobBenefit;

  @Column(name="candidate_response_url")
  private String candidateResponseUrl;

  @Column(name="candidate_response_email")
  private String candidateResponseEmail;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="requisition_number")
  private String requisitionNumber;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public long getJobBoardId() {
    return this.jobBoardId;
  }

  public void setJobBoardId(long jobBoardId) {
    this.jobBoardId = jobBoardId;
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getJobDescription() {
    return this.jobDescription;
  }

  public void setJobDescription(String jobDescription) {
    this.jobDescription = jobDescription;
  }

  public String getJobCountry() {
    return this.jobCountry;
  }

  public void setJobCountry(String jobCountry) {
    this.jobCountry = jobCountry;
  }

  public String getJobState() {
    return this.jobState;
  }

  public void setJobState(String jobState) {
    this.jobState = jobState;
  }

  public String getJobCity() {
    return this.jobCity;
  }

  public void setJobCity(String jobCity) {
    this.jobCity = jobCity;
  }

  public String getJobPostcode() {
    return this.jobPostcode;
  }

  public void setJobPostcode(String jobPostcode) {
    this.jobPostcode = jobPostcode;
  }

  public double getTravelPercentage() {
    return this.travelPercentage;
  }

  public void setTravelPercentage(double travelPercentage) {
    this.travelPercentage = travelPercentage;
  }

  public double getTelecommutePercentage() {
    return this.telecommutePercentage;
  }

  public void setTelecommutePercentage(double telecommutePercentage) {
    this.telecommutePercentage = telecommutePercentage;
  }

  public String getJobFunction() {
    return this.jobFunction;
  }

  public void setJobFunction(String jobFunction) {
    this.jobFunction = jobFunction;
  }

  public String getJobIndustry() {
    return this.jobIndustry;
  }

  public void setJobIndustry(String jobIndustry) {
    this.jobIndustry = jobIndustry;
  }

  public String getClassificationType() {
    return this.classificationType;
  }

  public void setClassificationType(String classificationType) {
    this.classificationType = classificationType;
  }

  public String getClassificationTime() {
    return this.classificationTime;
  }

  public void setClassificationTime(String classificationTime) {
    this.classificationTime = classificationTime;
  }

  public String getCompensationType() {
    return this.compensationType;
  }

  public void setCompensationType(String compensationType) {
    this.compensationType = compensationType;
  }

  public String getCompensationCurrency() {
    return this.compensationCurrency;
  }

  public void setCompensationCurrency(String compensationCurrency) {
    this.compensationCurrency = compensationCurrency;
  }

  public String getCompensationRate() {
    return this.compensationRate;
  }

  public void setCompensationRate(String compensationRate) {
    this.compensationRate = compensationRate;
  }

  public double getCompensationMin() {
    return this.compensationMin;
  }

  public void setCompensationMin(double compensationMin) {
    this.compensationMin = compensationMin;
  }

  public double getCompensationMax() {
    return this.compensationMax;
  }

  public void setCompensationMax(double compensationMax) {
    this.compensationMax = compensationMax;
  }

  public double getCompensationAmount() {
    return this.compensationAmount;
  }

  public void setCompensationAmount(double compensationAmount) {
    this.compensationAmount = compensationAmount;
  }

  public String getJobEducation() {
    return this.jobEducation;
  }

  public void setJobEducation(String jobEducation) {
    this.jobEducation = jobEducation;
  }

  public String getJobSkill() {
    return this.jobSkill;
  }

  public void setJobSkill(String jobSkill) {
    this.jobSkill = jobSkill;
  }

  public String getJobBenefit() {
    return this.jobBenefit;
  }

  public void setJobBenefit(String jobBenefit) {
    this.jobBenefit = jobBenefit;
  }

  public String getCandidateResponseUrl() {
    return this.candidateResponseUrl;
  }

  public void setCandidateResponseUrl(String candidateResponseUrl) {
    this.candidateResponseUrl = candidateResponseUrl;
  }

  public String getCandidateResponseEmail() {
    return this.candidateResponseEmail;
  }

  public void setCandidateResponseEmail(String candidateResponseEmail) {
    this.candidateResponseEmail = candidateResponseEmail;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getRequisitionNumber() {
    return this.requisitionNumber;
  }

  public void setRequisitionNumber(String requisitionNumber) {
    this.requisitionNumber = requisitionNumber;
  }
}
