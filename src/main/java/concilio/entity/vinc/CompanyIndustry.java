package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class CompanyIndustryId implements Serializable {
  private long industryId;
  private long companyId;

}

@Entity
@Table(name="company_industry")
@IdClass(CompanyIndustryId.class)
public class CompanyIndustry {


  @Id
  @Column(name="industry_id")
  private long industryId;

  @Id
  @Column(name="company_id")
  private long companyId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="seq")
  private long seq;


  public long getIndustryId() {
    return this.industryId;
  }

  public void setIndustryId(long industryId) {
    this.industryId = industryId;
  }

  public long getCompanyId() {
    return this.companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getSeq() {
    return this.seq;
  }

  public void setSeq(long seq) {
    this.seq = seq;
  }
}
