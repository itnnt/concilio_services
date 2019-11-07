package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ActivityCompanyId implements Serializable {
  private long activityId;
  private long companyId;

}
@Entity
@Table(name="activity_company")
@IdClass(ActivityCompanyId.class)
public class ActivityCompany {


  @Id
  @Column(name="activity_id")
  private long activityId;

  @Id
  @Column(name="company_id")
  private long companyId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getActivityId() {
    return this.activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
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
}
