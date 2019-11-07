package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_ff_dim_job")
public class DwFfDimJob {


  @Id
  @Column(name="job_key")
  private long jobKey;

  @Column(name="job_owner")
  private String jobOwner;

  @Column(name="client_key")
  private long clientKey;

  @Column(name="job_type_key")
  private long jobTypeKey;

  @Column(name="job_name")
  private String jobName;

  @Column(name="head_count")
  private long headCount;

  @Column(name="industry_key")
  private long industryKey;

  @Column(name="location")
  private String location;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="company_key")
  private long companyKey;

  @Column(name="max_stage")
  private long maxStage;

  @Column(name="invoiced_placed_num")
  private long invoicedPlacedNum;

  @Column(name="insert_datekey")
  private long insertDatekey;

  @Column(name="head_count_close_date")
  private java.sql.Timestamp headCountCloseDate;

  @Column(name="change_of_placement")
  private double changeOfPlacement;

  @Column(name="exp_placed_date")
  private java.sql.Timestamp expPlacedDate;

  @Column(name="contact_key")
  private long contactKey;

  @Column(name="head_count_open_date")
  private java.sql.Timestamp headCountOpenDate;


  public long getJobKey() {
    return this.jobKey;
  }

  public void setJobKey(long jobKey) {
    this.jobKey = jobKey;
  }

  public String getJobOwner() {
    return this.jobOwner;
  }

  public void setJobOwner(String jobOwner) {
    this.jobOwner = jobOwner;
  }

  public long getClientKey() {
    return this.clientKey;
  }

  public void setClientKey(long clientKey) {
    this.clientKey = clientKey;
  }

  public long getJobTypeKey() {
    return this.jobTypeKey;
  }

  public void setJobTypeKey(long jobTypeKey) {
    this.jobTypeKey = jobTypeKey;
  }

  public String getJobName() {
    return this.jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public long getHeadCount() {
    return this.headCount;
  }

  public void setHeadCount(long headCount) {
    this.headCount = headCount;
  }

  public long getIndustryKey() {
    return this.industryKey;
  }

  public void setIndustryKey(long industryKey) {
    this.industryKey = industryKey;
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getCompanyKey() {
    return this.companyKey;
  }

  public void setCompanyKey(long companyKey) {
    this.companyKey = companyKey;
  }

  public long getMaxStage() {
    return this.maxStage;
  }

  public void setMaxStage(long maxStage) {
    this.maxStage = maxStage;
  }

  public long getInvoicedPlacedNum() {
    return this.invoicedPlacedNum;
  }

  public void setInvoicedPlacedNum(long invoicedPlacedNum) {
    this.invoicedPlacedNum = invoicedPlacedNum;
  }

  public long getInsertDatekey() {
    return this.insertDatekey;
  }

  public void setInsertDatekey(long insertDatekey) {
    this.insertDatekey = insertDatekey;
  }

  public java.sql.Timestamp getHeadCountCloseDate() {
    return this.headCountCloseDate;
  }

  public void setHeadCountCloseDate(java.sql.Timestamp headCountCloseDate) {
    this.headCountCloseDate = headCountCloseDate;
  }

  public double getChangeOfPlacement() {
    return this.changeOfPlacement;
  }

  public void setChangeOfPlacement(double changeOfPlacement) {
    this.changeOfPlacement = changeOfPlacement;
  }

  public java.sql.Timestamp getExpPlacedDate() {
    return this.expPlacedDate;
  }

  public void setExpPlacedDate(java.sql.Timestamp expPlacedDate) {
    this.expPlacedDate = expPlacedDate;
  }

  public long getContactKey() {
    return this.contactKey;
  }

  public void setContactKey(long contactKey) {
    this.contactKey = contactKey;
  }

  public java.sql.Timestamp getHeadCountOpenDate() {
    return this.headCountOpenDate;
  }

  public void setHeadCountOpenDate(java.sql.Timestamp headCountOpenDate) {
    this.headCountOpenDate = headCountOpenDate;
  }
}
