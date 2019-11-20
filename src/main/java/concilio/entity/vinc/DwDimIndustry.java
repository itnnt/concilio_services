package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_dim_industry")
public class DwDimIndustry {

  @Id
  @Column(name="industry_key")
  private long industryKey;

  @Column(name="industry_name")
  private String industryName;


  public long getIndustryKey() {
    return this.industryKey;
  }

  public void setIndustryKey(long industryKey) {
    this.industryKey = industryKey;
  }

  public String getIndustryName() {
    return this.industryName;
  }

  public void setIndustryName(String industryName) {
    this.industryName = industryName;
  }
}