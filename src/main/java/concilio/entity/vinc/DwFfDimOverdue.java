package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_ff_dim_overdue")
public class DwFfDimOverdue {

  @Id
  @Column(name="overdue_key")
  private long overdueKey;

  @Column(name="overdue_name")
  private String overdueName;


  public long getOverdueKey() {
    return this.overdueKey;
  }

  public void setOverdueKey(long overdueKey) {
    this.overdueKey = overdueKey;
  }

  public String getOverdueName() {
    return this.overdueName;
  }

  public void setOverdueName(String overdueName) {
    this.overdueName = overdueName;
  }
}
