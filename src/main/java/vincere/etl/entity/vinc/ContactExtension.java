package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="contact_extension")
public class ContactExtension {


  @Id
  @Column(name="contact_id")
  private long contactId;

  @Column(name="distribution_list_ids")
  private long distributionListIds;

  @Column(name="last_activity_date")
  private java.sql.Timestamp lastActivityDate;

  @Column(name="team_group_ids")
  private long teamGroupIds;


  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getDistributionListIds() {
    return this.distributionListIds;
  }

  public void setDistributionListIds(long distributionListIds) {
    this.distributionListIds = distributionListIds;
  }

  public java.sql.Timestamp getLastActivityDate() {
    return this.lastActivityDate;
  }

  public void setLastActivityDate(java.sql.Timestamp lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public long getTeamGroupIds() {
    return this.teamGroupIds;
  }

  public void setTeamGroupIds(long teamGroupIds) {
    this.teamGroupIds = teamGroupIds;
  }
}
