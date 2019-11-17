package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class LogicMelonUserMappingId implements Serializable {
  private long logicmelonId;
  private long userId;
  private String logicmelonUsername;

}

@Entity
@Table(name="logic_melon_user_mapping")
@IdClass(LogicMelonUserMappingId.class)
public class LogicMelonUserMapping {


  @Id
  @Column(name="logicmelon_id")
  private long logicmelonId;

  @Id
  @Column(name="user_id")
  private long userId;

  @Id
  @Column(name="logicmelon_username")
  private String logicmelonUsername;


  public long getLogicmelonId() {
    return this.logicmelonId;
  }

  public void setLogicmelonId(long logicmelonId) {
    this.logicmelonId = logicmelonId;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getLogicmelonUsername() {
    return this.logicmelonUsername;
  }

  public void setLogicmelonUsername(String logicmelonUsername) {
    this.logicmelonUsername = logicmelonUsername;
  }
}
