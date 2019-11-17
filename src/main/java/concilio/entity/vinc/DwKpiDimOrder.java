package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_kpi_dim_order")
public class DwKpiDimOrder {


  @Id
  @Column(name="kpi_lib_key")
  private long kpiLibKey;

  @Column(name="kpi_order")
  private long kpiOrder;

  @Column(name="kpi_name")
  private String kpiName;

  @Column(name="is_active")
  private long isActive;


  public long getKpiLibKey() {
    return this.kpiLibKey;
  }

  public void setKpiLibKey(long kpiLibKey) {
    this.kpiLibKey = kpiLibKey;
  }

  public long getKpiOrder() {
    return this.kpiOrder;
  }

  public void setKpiOrder(long kpiOrder) {
    this.kpiOrder = kpiOrder;
  }

  public String getKpiName() {
    return this.kpiName;
  }

  public void setKpiName(String kpiName) {
    this.kpiName = kpiName;
  }

  public long getIsActive() {
    return this.isActive;
  }

  public void setIsActive(long isActive) {
    this.isActive = isActive;
  }
}
