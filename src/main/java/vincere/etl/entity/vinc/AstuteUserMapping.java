package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="astute_user_mapping")
public class AstuteUserMapping {

  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_id")
  private long userId;

  @Column(name="creator_id")
  private long creatorId;

  @Column(name="astute_user_id")
  private String astuteUserId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


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

  public long getCreatorId() {
    return this.creatorId;
  }

  public void setCreatorId(long creatorId) {
    this.creatorId = creatorId;
  }

  public String getAstuteUserId() {
    return this.astuteUserId;
  }

  public void setAstuteUserId(String astuteUserId) {
    this.astuteUserId = astuteUserId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
