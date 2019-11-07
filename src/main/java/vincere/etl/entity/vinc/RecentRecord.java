package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="recent_record")
public class RecentRecord {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="type")
  private long type;

  @Column(name="reference_param")
  private long referenceParam;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="is_pinned")
  private long isPinned;

  @Column(name="title_resouce_key")
  private String titleResouceKey;

  @Column(name="url")
  private String url;

  @Column(name="last_visit_timestamp")
  private java.sql.Timestamp lastVisitTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getType() {
    return this.type;
  }

  public void setType(long type) {
    this.type = type;
  }

  public long getReferenceParam() {
    return this.referenceParam;
  }

  public void setReferenceParam(long referenceParam) {
    this.referenceParam = referenceParam;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public long getIsPinned() {
    return this.isPinned;
  }

  public void setIsPinned(long isPinned) {
    this.isPinned = isPinned;
  }

  public String getTitleResouceKey() {
    return this.titleResouceKey;
  }

  public void setTitleResouceKey(String titleResouceKey) {
    this.titleResouceKey = titleResouceKey;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public java.sql.Timestamp getLastVisitTimestamp() {
    return this.lastVisitTimestamp;
  }

  public void setLastVisitTimestamp(java.sql.Timestamp lastVisitTimestamp) {
    this.lastVisitTimestamp = lastVisitTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
