package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="slideshow_recent_report")
public class SlideshowRecentReport {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="saved_report_name")
  private String savedReportName;

  @Column(name="chart_url")
  private String chartUrl;

  @Column(name="user_id")
  private long userId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getSavedReportName() {
    return this.savedReportName;
  }

  public void setSavedReportName(String savedReportName) {
    this.savedReportName = savedReportName;
  }

  public String getChartUrl() {
    return this.chartUrl;
  }

  public void setChartUrl(String chartUrl) {
    this.chartUrl = chartUrl;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
