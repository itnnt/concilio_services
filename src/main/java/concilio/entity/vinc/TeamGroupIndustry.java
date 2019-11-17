package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team_group_industry")
public class TeamGroupIndustry {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="industry_id")
  private long industryId;

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

  public long getIndustryId() {
    return this.industryId;
  }

  public void setIndustryId(long industryId) {
    this.industryId = industryId;
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
