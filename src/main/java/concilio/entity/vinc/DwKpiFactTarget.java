package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_kpi_fact_target")
public class DwKpiFactTarget {

  @Id
  @Column(name="consultant_key")
  private long consultantKey;

  @Column(name="kpi_lib_key")
  private long kpiLibKey;

  @Column(name="time_frame")
  private long timeFrame;

  @Column(name="target")
  private double target;

  @Column(name="start_date")
  private long startDate;

  @Column(name="end_date")
  private long endDate;


  public long getConsultantKey() {
    return this.consultantKey;
  }

  public void setConsultantKey(long consultantKey) {
    this.consultantKey = consultantKey;
  }

  public long getKpiLibKey() {
    return this.kpiLibKey;
  }

  public void setKpiLibKey(long kpiLibKey) {
    this.kpiLibKey = kpiLibKey;
  }

  public long getTimeFrame() {
    return this.timeFrame;
  }

  public void setTimeFrame(long timeFrame) {
    this.timeFrame = timeFrame;
  }

  public double getTarget() {
    return this.target;
  }

  public void setTarget(double target) {
    this.target = target;
  }

  public long getStartDate() {
    return this.startDate;
  }

  public void setStartDate(long startDate) {
    this.startDate = startDate;
  }

  public long getEndDate() {
    return this.endDate;
  }

  public void setEndDate(long endDate) {
    this.endDate = endDate;
  }
}
