package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="job_alert_email")
public class JobAlertEmail {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="job_id")
  private long jobId;

  @Column(name="career_site_id")
  private long careerSiteId;

  @Column(name="email")
  private String email;

  @Column(name="send_date")
  private java.sql.Timestamp sendDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getJobId() {
    return this.jobId;
  }

  public void setJobId(long jobId) {
    this.jobId = jobId;
  }

  public long getCareerSiteId() {
    return this.careerSiteId;
  }

  public void setCareerSiteId(long careerSiteId) {
    this.careerSiteId = careerSiteId;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public java.sql.Timestamp getSendDate() {
    return this.sendDate;
  }

  public void setSendDate(java.sql.Timestamp sendDate) {
    this.sendDate = sendDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
