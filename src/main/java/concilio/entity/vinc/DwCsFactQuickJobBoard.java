package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_cs_fact_quick_job_board")
public class DwCsFactQuickJobBoard {

  @Id
  @Column(name="date_key")
  private long dateKey;

  @Column(name="job_list")
  private long jobList;

  @Column(name="job_active")
  private long jobActive;

  @Column(name="job_application")
  private long jobApplication;

  @Column(name="job_application_active")
  private long jobApplicationActive;

  @Column(name="new_candidate")
  private long newCandidate;

  @Column(name="candidate_active")
  private long candidateActive;

  @Column(name="resume_sent")
  private long resumeSent;

  @Column(name="resume_sent_active")
  private long resumeSentActive;


  public long getDateKey() {
    return this.dateKey;
  }

  public void setDateKey(long dateKey) {
    this.dateKey = dateKey;
  }

  public long getJobList() {
    return this.jobList;
  }

  public void setJobList(long jobList) {
    this.jobList = jobList;
  }

  public long getJobActive() {
    return this.jobActive;
  }

  public void setJobActive(long jobActive) {
    this.jobActive = jobActive;
  }

  public long getJobApplication() {
    return this.jobApplication;
  }

  public void setJobApplication(long jobApplication) {
    this.jobApplication = jobApplication;
  }

  public long getJobApplicationActive() {
    return this.jobApplicationActive;
  }

  public void setJobApplicationActive(long jobApplicationActive) {
    this.jobApplicationActive = jobApplicationActive;
  }

  public long getNewCandidate() {
    return this.newCandidate;
  }

  public void setNewCandidate(long newCandidate) {
    this.newCandidate = newCandidate;
  }

  public long getCandidateActive() {
    return this.candidateActive;
  }

  public void setCandidateActive(long candidateActive) {
    this.candidateActive = candidateActive;
  }

  public long getResumeSent() {
    return this.resumeSent;
  }

  public void setResumeSent(long resumeSent) {
    this.resumeSent = resumeSent;
  }

  public long getResumeSentActive() {
    return this.resumeSentActive;
  }

  public void setResumeSentActive(long resumeSentActive) {
    this.resumeSentActive = resumeSentActive;
  }
}
