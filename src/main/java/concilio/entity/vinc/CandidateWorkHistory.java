package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_work_history")
public class CandidateWorkHistory {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="company")
  private String company;

  @Column(name="address")
  private String address;

  @Column(name="job_title")
  private String jobTitle;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="current_employer")
  private String currentEmployer;

  @Column(name="current_employer_id")
  private long currentEmployerId;

  @Column(name="year_of_experience")
  private String yearOfExperience;

  @Column(name="industry")
  private long industry;

  @Column(name="sub_function_id")
  private long subFunctionId;

  @Column(name="functional_expertise_id")
  private long functionalExpertiseId;

  @Column(name="start_date")
  private String startDate;

  @Column(name="end_date")
  private String endDate;

  @Column(name="cb_employer")
  private String cbEmployer;

  @Column(name="index")
  private long index;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public String getCompany() {
    return this.company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getCurrentEmployer() {
    return this.currentEmployer;
  }

  public void setCurrentEmployer(String currentEmployer) {
    this.currentEmployer = currentEmployer;
  }

  public long getCurrentEmployerId() {
    return this.currentEmployerId;
  }

  public void setCurrentEmployerId(long currentEmployerId) {
    this.currentEmployerId = currentEmployerId;
  }

  public String getYearOfExperience() {
    return this.yearOfExperience;
  }

  public void setYearOfExperience(String yearOfExperience) {
    this.yearOfExperience = yearOfExperience;
  }

  public long getIndustry() {
    return this.industry;
  }

  public void setIndustry(long industry) {
    this.industry = industry;
  }

  public long getSubFunctionId() {
    return this.subFunctionId;
  }

  public void setSubFunctionId(long subFunctionId) {
    this.subFunctionId = subFunctionId;
  }

  public long getFunctionalExpertiseId() {
    return this.functionalExpertiseId;
  }

  public void setFunctionalExpertiseId(long functionalExpertiseId) {
    this.functionalExpertiseId = functionalExpertiseId;
  }

  public String getStartDate() {
    return this.startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return this.endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getCbEmployer() {
    return this.cbEmployer;
  }

  public void setCbEmployer(String cbEmployer) {
    this.cbEmployer = cbEmployer;
  }

  public long getIndex() {
    return this.index;
  }

  public void setIndex(long index) {
    this.index = index;
  }
}
