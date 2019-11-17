package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_ff_tmp_dim_candidate")
public class DwFfTmpDimCandidate {

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
}
