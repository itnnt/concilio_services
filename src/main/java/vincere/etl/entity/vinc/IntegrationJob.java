package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="integration_job")
public class IntegrationJob {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="post_to_job_street")
  private long postToJobStreet;

  @Column(name="post_to_job_db")
  private long postToJobDb;

  @Column(name="post_to_linkedin")
  private long postToLinkedin;

  @Column(name="post_to_straits_times")
  private long postToStraitsTimes;

  @Column(name="post_to_recruite")
  private long postToRecruite;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getPostToJobStreet() {
    return this.postToJobStreet;
  }

  public void setPostToJobStreet(long postToJobStreet) {
    this.postToJobStreet = postToJobStreet;
  }

  public long getPostToJobDb() {
    return this.postToJobDb;
  }

  public void setPostToJobDb(long postToJobDb) {
    this.postToJobDb = postToJobDb;
  }

  public long getPostToLinkedin() {
    return this.postToLinkedin;
  }

  public void setPostToLinkedin(long postToLinkedin) {
    this.postToLinkedin = postToLinkedin;
  }

  public long getPostToStraitsTimes() {
    return this.postToStraitsTimes;
  }

  public void setPostToStraitsTimes(long postToStraitsTimes) {
    this.postToStraitsTimes = postToStraitsTimes;
  }

  public long getPostToRecruite() {
    return this.postToRecruite;
  }

  public void setPostToRecruite(long postToRecruite) {
    this.postToRecruite = postToRecruite;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
