package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_config")
public class CandidateConfig {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="layout_type")
  private long layoutType;

  @Column(name="layout_config")
  private String layoutConfig;

  @Column(name="creator_id")
  private long creatorId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


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

  public long getLayoutType() {
    return this.layoutType;
  }

  public void setLayoutType(long layoutType) {
    this.layoutType = layoutType;
  }

  public String getLayoutConfig() {
    return this.layoutConfig;
  }

  public void setLayoutConfig(String layoutConfig) {
    this.layoutConfig = layoutConfig;
  }

  public long getCreatorId() {
    return this.creatorId;
  }

  public void setCreatorId(long creatorId) {
    this.creatorId = creatorId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
