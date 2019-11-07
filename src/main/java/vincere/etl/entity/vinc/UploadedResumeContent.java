package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="uploaded_resume_content")
public class UploadedResumeContent {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="saved_to")
  private String savedTo;

  @Column(name="size")
  private long size;

  @Column(name="original_filename")
  private String originalFilename;

  @Column(name="uploaded_time")
  private long uploadedTime;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="process_step")
  private long processStep;

  @Column(name="resume_content")
  private String resumeContent;

  @Column(name="submitted")
  private long submitted;

  @Column(name="show")
  private long show;

  @Column(name="candidate_id")
  private long candidateId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getSavedTo() {
    return this.savedTo;
  }

  public void setSavedTo(String savedTo) {
    this.savedTo = savedTo;
  }

  public long getSize() {
    return this.size;
  }

  public void setSize(long size) {
    this.size = size;
  }

  public String getOriginalFilename() {
    return this.originalFilename;
  }

  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }

  public long getUploadedTime() {
    return this.uploadedTime;
  }

  public void setUploadedTime(long uploadedTime) {
    this.uploadedTime = uploadedTime;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getProcessStep() {
    return this.processStep;
  }

  public void setProcessStep(long processStep) {
    this.processStep = processStep;
  }

  public String getResumeContent() {
    return this.resumeContent;
  }

  public void setResumeContent(String resumeContent) {
    this.resumeContent = resumeContent;
  }

  public long getSubmitted() {
    return this.submitted;
  }

  public void setSubmitted(long submitted) {
    this.submitted = submitted;
  }

  public long getShow() {
    return this.show;
  }

  public void setShow(long show) {
    this.show = show;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }
}
