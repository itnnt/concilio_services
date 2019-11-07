package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="expertise_government_name")
public class ExpertiseGovernmentName {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="fe_name")
  private String feName;

  @Column(name="sub_fe_name")
  private String subFeName;

  @Column(name="government_code")
  private String governmentCode;

  @Column(name="government_name")
  private String governmentName;

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

  public String getFeName() {
    return this.feName;
  }

  public void setFeName(String feName) {
    this.feName = feName;
  }

  public String getSubFeName() {
    return this.subFeName;
  }

  public void setSubFeName(String subFeName) {
    this.subFeName = subFeName;
  }

  public String getGovernmentCode() {
    return this.governmentCode;
  }

  public void setGovernmentCode(String governmentCode) {
    this.governmentCode = governmentCode;
  }

  public String getGovernmentName() {
    return this.governmentName;
  }

  public void setGovernmentName(String governmentName) {
    this.governmentName = governmentName;
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
