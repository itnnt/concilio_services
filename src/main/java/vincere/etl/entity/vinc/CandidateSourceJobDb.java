package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_source_job_db")
public class CandidateSourceJobDb {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="user_name")
  private String userName;

  @Column(name="password")
  private String password;

  @Column(name="scm_account")
  private String scmAccount;

  @Column(name="scm_user_name")
  private String scmUserName;

  @Column(name="scm_password")
  private String scmPassword;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="quick_apply_url")
  private String quickApplyUrl;

  @Column(name="company_name")
  private String companyName;

  @Column(name="email")
  private String email;

  @Column(name="company_description")
  private String companyDescription;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getScmAccount() {
    return this.scmAccount;
  }

  public void setScmAccount(String scmAccount) {
    this.scmAccount = scmAccount;
  }

  public String getScmUserName() {
    return this.scmUserName;
  }

  public void setScmUserName(String scmUserName) {
    this.scmUserName = scmUserName;
  }

  public String getScmPassword() {
    return this.scmPassword;
  }

  public void setScmPassword(String scmPassword) {
    this.scmPassword = scmPassword;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getQuickApplyUrl() {
    return this.quickApplyUrl;
  }

  public void setQuickApplyUrl(String quickApplyUrl) {
    this.quickApplyUrl = quickApplyUrl;
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCompanyDescription() {
    return this.companyDescription;
  }

  public void setCompanyDescription(String companyDescription) {
    this.companyDescription = companyDescription;
  }
}
