package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class BroadbeanUserMappingId implements Serializable {
  private long broadbeanId;
  private long userId;
  private String broadbeanUsername;

}
@Entity
@Table(name="broadbean_user_mapping")
@IdClass(BroadbeanUserMappingId.class)
public class BroadbeanUserMapping {


  @Id
  @Column(name="broadbean_id")
  private long broadbeanId;

  @Id
  @Column(name="user_id")
  private long userId;

  @Id
  @Column(name="broadbean_username")
  private String broadbeanUsername;


  public long getBroadbeanId() {
    return this.broadbeanId;
  }

  public void setBroadbeanId(long broadbeanId) {
    this.broadbeanId = broadbeanId;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getBroadbeanUsername() {
    return this.broadbeanUsername;
  }

  public void setBroadbeanUsername(String broadbeanUsername) {
    this.broadbeanUsername = broadbeanUsername;
  }
}
