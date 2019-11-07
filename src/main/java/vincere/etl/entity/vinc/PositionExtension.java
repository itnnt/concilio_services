package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_extension")
public class PositionExtension {


  @Id
  @Column(name="position_id")
  private long positionId;

  @Column(name="agency_consultant_names")
  private String agencyConsultantNames;

  @Column(name="agency_consultant_ids")
  private long agencyConsultantIds;

  @Column(name="screening_count")
  private long screeningCount;

  @Column(name="sent_num")
  private long sentNum;

  @Column(name="interview1_num")
  private long interview1Num;

  @Column(name="interview2_plus_num")
  private long interview2PlusNum;

  @Column(name="offers_num")
  private long offersNum;

  @Column(name="placed_num")
  private long placedNum;

  @Column(name="num_of_pending")
  private long numOfPending;

  @Column(name="max_status")
  private long maxStatus;

  @Column(name="team_group_ids")
  private long teamGroupIds;


  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public String getAgencyConsultantNames() {
    return this.agencyConsultantNames;
  }

  public void setAgencyConsultantNames(String agencyConsultantNames) {
    this.agencyConsultantNames = agencyConsultantNames;
  }

  public long getAgencyConsultantIds() {
    return this.agencyConsultantIds;
  }

  public void setAgencyConsultantIds(long agencyConsultantIds) {
    this.agencyConsultantIds = agencyConsultantIds;
  }

  public long getScreeningCount() {
    return this.screeningCount;
  }

  public void setScreeningCount(long screeningCount) {
    this.screeningCount = screeningCount;
  }

  public long getSentNum() {
    return this.sentNum;
  }

  public void setSentNum(long sentNum) {
    this.sentNum = sentNum;
  }

  public long getInterview1Num() {
    return this.interview1Num;
  }

  public void setInterview1Num(long interview1Num) {
    this.interview1Num = interview1Num;
  }

  public long getInterview2PlusNum() {
    return this.interview2PlusNum;
  }

  public void setInterview2PlusNum(long interview2PlusNum) {
    this.interview2PlusNum = interview2PlusNum;
  }

  public long getOffersNum() {
    return this.offersNum;
  }

  public void setOffersNum(long offersNum) {
    this.offersNum = offersNum;
  }

  public long getPlacedNum() {
    return this.placedNum;
  }

  public void setPlacedNum(long placedNum) {
    this.placedNum = placedNum;
  }

  public long getNumOfPending() {
    return this.numOfPending;
  }

  public void setNumOfPending(long numOfPending) {
    this.numOfPending = numOfPending;
  }

  public long getMaxStatus() {
    return this.maxStatus;
  }

  public void setMaxStatus(long maxStatus) {
    this.maxStatus = maxStatus;
  }

  public long getTeamGroupIds() {
    return this.teamGroupIds;
  }

  public void setTeamGroupIds(long teamGroupIds) {
    this.teamGroupIds = teamGroupIds;
  }
}
