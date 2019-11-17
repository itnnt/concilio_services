package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_pa_dim_date")
public class DwPaDimDate {


  @Id
  @Column(name="date_key")
  private long dateKey;

  @Column(name="firstdayofmonth")
  private long firstdayofmonth;

  @Column(name="month")
  private long month;

  @Column(name="year")
  private long year;


  public long getDateKey() {
    return this.dateKey;
  }

  public void setDateKey(long dateKey) {
    this.dateKey = dateKey;
  }

  public long getFirstdayofmonth() {
    return this.firstdayofmonth;
  }

  public void setFirstdayofmonth(long firstdayofmonth) {
    this.firstdayofmonth = firstdayofmonth;
  }

  public long getMonth() {
    return this.month;
  }

  public void setMonth(long month) {
    this.month = month;
  }

  public long getYear() {
    return this.year;
  }

  public void setYear(long year) {
    this.year = year;
  }
}
