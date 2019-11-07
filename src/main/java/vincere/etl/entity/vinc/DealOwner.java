package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class DealOwnerId implements Serializable {
  private long dealId;
  private long userId;

}
@Entity
@Table(name="deal_owner")
@IdClass(DealOwnerId.class)
public class DealOwner {


  @Id
  @Column(name="deal_id")
  private long dealId;

  @Id
  @Column(name="user_id")
  private long userId;


  public long getDealId() {
    return this.dealId;
  }

  public void setDealId(long dealId) {
    this.dealId = dealId;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }
}
