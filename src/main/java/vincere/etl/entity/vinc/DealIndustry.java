package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class DealIndustryId implements Serializable {
  private long dealId;
  private long industryId;

}
@Entity
@Table(name="deal_industry")
@IdClass(DealIndustryId.class)
public class DealIndustry {


  @Id
  @Column(name="deal_id")
  private long dealId;

  @Id
  @Column(name="industry_id")
  private long industryId;


  public long getDealId() {
    return this.dealId;
  }

  public void setDealId(long dealId) {
    this.dealId = dealId;
  }

  public long getIndustryId() {
    return this.industryId;
  }

  public void setIndustryId(long industryId) {
    this.industryId = industryId;
  }
}
