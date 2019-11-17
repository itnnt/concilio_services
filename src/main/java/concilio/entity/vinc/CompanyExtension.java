package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_extension")
public class CompanyExtension {


  @Id
  @Column(name="company_id")
  private long companyId;

  @Column(name="location_names")
  private String locationNames;

  @Column(name="has_geo")
  private long hasGeo;

  @Column(name="contact_count")
  private long contactCount;

  @Column(name="position_count")
  private long positionCount;

  @Column(name="max_contact_board")
  private long maxContactBoard;

  @Column(name="min_contact_status")
  private long minContactStatus;

  @Column(name="team_group_ids")
  private long teamGroupIds;


  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public String getLocationNames() {
    return this.locationNames;
  }

  public void setLocationNames(String locationNames) {
    this.locationNames = locationNames;
  }

  public long getHasGeo() {
    return this.hasGeo;
  }

  public void setHasGeo(long hasGeo) {
    this.hasGeo = hasGeo;
  }

  public long getContactCount() {
    return this.contactCount;
  }

  public void setContactCount(long contactCount) {
    this.contactCount = contactCount;
  }

  public long getPositionCount() {
    return this.positionCount;
  }

  public void setPositionCount(long positionCount) {
    this.positionCount = positionCount;
  }

  public long getMaxContactBoard() {
    return this.maxContactBoard;
  }

  public void setMaxContactBoard(long maxContactBoard) {
    this.maxContactBoard = maxContactBoard;
  }

  public long getMinContactStatus() {
    return this.minContactStatus;
  }

  public void setMinContactStatus(long minContactStatus) {
    this.minContactStatus = minContactStatus;
  }

  public long getTeamGroupIds() {
    return this.teamGroupIds;
  }

  public void setTeamGroupIds(long teamGroupIds) {
    this.teamGroupIds = teamGroupIds;
  }
}
