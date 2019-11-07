package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="saved_search_criteria")
public class SavedSearchCriteria {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="owner_id")
  private long ownerId;

  @Column(name="criteria_string")
  private String criteriaString;

  @Column(name="search_string")
  private String searchString;

  @Column(name="category")
  private String category;

  @Column(name="shared_ids")
  private String sharedIds;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="policy")
  private long policy;

  @Column(name="count_candidate")
  private long countCandidate;

  @Column(name="count_contact")
  private long countContact;

  @Column(name="count_job")
  private long countJob;

  @Column(name="count_company")
  private long countCompany;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getOwnerId() {
    return this.ownerId;
  }

  public void setOwnerId(long ownerId) {
    this.ownerId = ownerId;
  }

  public String getCriteriaString() {
    return this.criteriaString;
  }

  public void setCriteriaString(String criteriaString) {
    this.criteriaString = criteriaString;
  }

  public String getSearchString() {
    return this.searchString;
  }

  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSharedIds() {
    return this.sharedIds;
  }

  public void setSharedIds(String sharedIds) {
    this.sharedIds = sharedIds;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getPolicy() {
    return this.policy;
  }

  public void setPolicy(long policy) {
    this.policy = policy;
  }

  public long getCountCandidate() {
    return this.countCandidate;
  }

  public void setCountCandidate(long countCandidate) {
    this.countCandidate = countCandidate;
  }

  public long getCountContact() {
    return this.countContact;
  }

  public void setCountContact(long countContact) {
    this.countContact = countContact;
  }

  public long getCountJob() {
    return this.countJob;
  }

  public void setCountJob(long countJob) {
    this.countJob = countJob;
  }

  public long getCountCompany() {
    return this.countCompany;
  }

  public void setCountCompany(long countCompany) {
    this.countCompany = countCompany;
  }
}
