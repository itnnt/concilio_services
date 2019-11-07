package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="team_group")
public class TeamGroup {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="description")
  private String description;

  @Column(name="owner_id")
  private long ownerId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="share_permission")
  private long sharePermission;

  @Column(name="doc_id")
  private long docId;

  @Column(name="group_type")
  private String groupType;


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

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public long getOwnerId() {
    return this.ownerId;
  }

  public void setOwnerId(long ownerId) {
    this.ownerId = ownerId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getSharePermission() {
    return this.sharePermission;
  }

  public void setSharePermission(long sharePermission) {
    this.sharePermission = sharePermission;
  }

  public long getDocId() {
    return this.docId;
  }

  public void setDocId(long docId) {
    this.docId = docId;
  }

  public String getGroupType() {
    return this.groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }
}
