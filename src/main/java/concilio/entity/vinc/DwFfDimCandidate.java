package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_ff_dim_candidate")
public class DwFfDimCandidate {


  @Id
  @Column(name="candidate_key")
  private long candidateKey;

  @Column(name="candidate_firstname")
  private String candidateFirstname;

  @Column(name="candidate_middlename")
  private String candidateMiddlename;

  @Column(name="candidate_lastname")
  private String candidateLastname;

  @Column(name="candidate_owner")
  private String candidateOwner;

  @Column(name="candidate_lastupdated")
  private java.sql.Timestamp candidateLastupdated;

  @Column(name="job_applications_number")
  private long jobApplicationsNumber;

  @Column(name="active")
  private long active;

  @Column(name="current_jobtitle")
  private String currentJobtitle;

  @Column(name="insert_datekey")
  private long insertDatekey;

  @Column(name="can_active")
  private long canActive;

  @Column(name="notice_period")
  private long noticePeriod;


  public long getCandidateKey() {
    return this.candidateKey;
  }

  public void setCandidateKey(long candidateKey) {
    this.candidateKey = candidateKey;
  }

  public String getCandidateFirstname() {
    return this.candidateFirstname;
  }

  public void setCandidateFirstname(String candidateFirstname) {
    this.candidateFirstname = candidateFirstname;
  }

  public String getCandidateMiddlename() {
    return this.candidateMiddlename;
  }

  public void setCandidateMiddlename(String candidateMiddlename) {
    this.candidateMiddlename = candidateMiddlename;
  }

  public String getCandidateLastname() {
    return this.candidateLastname;
  }

  public void setCandidateLastname(String candidateLastname) {
    this.candidateLastname = candidateLastname;
  }

  public String getCandidateOwner() {
    return this.candidateOwner;
  }

  public void setCandidateOwner(String candidateOwner) {
    this.candidateOwner = candidateOwner;
  }

  public java.sql.Timestamp getCandidateLastupdated() {
    return this.candidateLastupdated;
  }

  public void setCandidateLastupdated(java.sql.Timestamp candidateLastupdated) {
    this.candidateLastupdated = candidateLastupdated;
  }

  public long getJobApplicationsNumber() {
    return this.jobApplicationsNumber;
  }

  public void setJobApplicationsNumber(long jobApplicationsNumber) {
    this.jobApplicationsNumber = jobApplicationsNumber;
  }

  public long getActive() {
    return this.active;
  }

  public void setActive(long active) {
    this.active = active;
  }

  public String getCurrentJobtitle() {
    return this.currentJobtitle;
  }

  public void setCurrentJobtitle(String currentJobtitle) {
    this.currentJobtitle = currentJobtitle;
  }

  public long getInsertDatekey() {
    return this.insertDatekey;
  }

  public void setInsertDatekey(long insertDatekey) {
    this.insertDatekey = insertDatekey;
  }

  public long getCanActive() {
    return this.canActive;
  }

  public void setCanActive(long canActive) {
    this.canActive = canActive;
  }

  public long getNoticePeriod() {
    return this.noticePeriod;
  }

  public void setNoticePeriod(long noticePeriod) {
    this.noticePeriod = noticePeriod;
  }
}
