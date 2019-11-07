package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_ff_total_fee")
public class DwFfTotalFee {


  @Id
  @Column(name="date_key")
  private long dateKey;

  @Column(name="total_fee")
  private double totalFee;

  @Column(name="placed_per_job")
  private double placedPerJob;


  public long getDateKey() {
    return this.dateKey;
  }

  public void setDateKey(long dateKey) {
    this.dateKey = dateKey;
  }

  public double getTotalFee() {
    return this.totalFee;
  }

  public void setTotalFee(double totalFee) {
    this.totalFee = totalFee;
  }

  public double getPlacedPerJob() {
    return this.placedPerJob;
  }

  public void setPlacedPerJob(double placedPerJob) {
    this.placedPerJob = placedPerJob;
  }
}
