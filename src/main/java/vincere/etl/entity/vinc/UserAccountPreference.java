package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="user_account_preference")
public class UserAccountPreference {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="candidate_dashboard_filter")
  private long candidateDashboardFilter;

  @Column(name="candidate_dashboard_view")
  private long candidateDashboardView;

  @Column(name="candidate_dashboard_date")
  private long candidateDashboardDate;

  @Column(name="candidate_dashboard_status")
  private long candidateDashboardStatus;

  @Column(name="taskboard_quick_filter")
  private String taskboardQuickFilter;

  @Column(name="filter_candidate_owner")
  private long filterCandidateOwner;

  @Column(name="filter_candidate_created_by")
  private long filterCandidateCreatedBy;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getCandidateDashboardFilter() {
    return this.candidateDashboardFilter;
  }

  public void setCandidateDashboardFilter(long candidateDashboardFilter) {
    this.candidateDashboardFilter = candidateDashboardFilter;
  }

  public long getCandidateDashboardView() {
    return this.candidateDashboardView;
  }

  public void setCandidateDashboardView(long candidateDashboardView) {
    this.candidateDashboardView = candidateDashboardView;
  }

  public long getCandidateDashboardDate() {
    return this.candidateDashboardDate;
  }

  public void setCandidateDashboardDate(long candidateDashboardDate) {
    this.candidateDashboardDate = candidateDashboardDate;
  }

  public long getCandidateDashboardStatus() {
    return this.candidateDashboardStatus;
  }

  public void setCandidateDashboardStatus(long candidateDashboardStatus) {
    this.candidateDashboardStatus = candidateDashboardStatus;
  }

  public String getTaskboardQuickFilter() {
    return this.taskboardQuickFilter;
  }

  public void setTaskboardQuickFilter(String taskboardQuickFilter) {
    this.taskboardQuickFilter = taskboardQuickFilter;
  }

  public long getFilterCandidateOwner() {
    return this.filterCandidateOwner;
  }

  public void setFilterCandidateOwner(long filterCandidateOwner) {
    this.filterCandidateOwner = filterCandidateOwner;
  }

  public long getFilterCandidateCreatedBy() {
    return this.filterCandidateCreatedBy;
  }

  public void setFilterCandidateCreatedBy(long filterCandidateCreatedBy) {
    this.filterCandidateCreatedBy = filterCandidateCreatedBy;
  }
}
