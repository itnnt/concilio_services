package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deal_functional_expertise")
public class DealFunctionalExpertise {

  @Id
  @Column(name="deal_id")
  private long dealId;

  @Column(name="fe_id")
  private long feId;

  @Column(name="sfe_id")
  private long sfeId;


  public long getDealId() {
    return this.dealId;
  }

  public void setDealId(long dealId) {
    this.dealId = dealId;
  }

  public long getFeId() {
    return this.feId;
  }

  public void setFeId(long feId) {
    this.feId = feId;
  }

  public long getSfeId() {
    return this.sfeId;
  }

  public void setSfeId(long sfeId) {
    this.sfeId = sfeId;
  }
}
