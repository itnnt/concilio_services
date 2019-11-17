package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team_group_user")
public class TeamGroupUser {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_id")
  private long userId;

  @Column(name="team_group_id")
  private long teamGroupId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="manager")
  private long manager;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
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

  public long getManager() {
    return this.manager;
  }

  public void setManager(long manager) {
    this.manager = manager;
  }
}
