package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kpi_library_alt_name")
public class KpiLibraryAltName {

  @Id
  @Column(name="kpi_library_id")
  private long kpiLibraryId;

  @Column(name="language")
  private String language;

  @Column(name="alt_name")
  private String altName;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getKpiLibraryId() {
    return this.kpiLibraryId;
  }

  public void setKpiLibraryId(long kpiLibraryId) {
    this.kpiLibraryId = kpiLibraryId;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getAltName() {
    return this.altName;
  }

  public void setAltName(String altName) {
    this.altName = altName;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
