package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="team_group_job_type")
public class TeamGroupJobType {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="job_type")
  private String jobType;

  @Column(name="team_group_id")
  private long teamGroupId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getJobType() {
    return this.jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public long getTeamGroupId() {
    return this.teamGroupId;
  }

  public void setTeamGroupId(long teamGroupId) {
    this.teamGroupId = teamGroupId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
