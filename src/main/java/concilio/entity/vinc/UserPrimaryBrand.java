package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_primary_brand")
public class UserPrimaryBrand {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_id")
  private long userId;

  @Column(name="primary_brand_id")
  private long primaryBrandId;

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

  public long getPrimaryBrandId() {
    return this.primaryBrandId;
  }

  public void setPrimaryBrandId(long primaryBrandId) {
    this.primaryBrandId = primaryBrandId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
