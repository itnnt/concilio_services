package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_kpi_dim_library_alt_name")
public class DwKpiDimLibraryAltName {

  @Id
  @Column(name="kpi_lib_key")
  private long kpiLibKey;

  @Column(name="language")
  private String language;

  @Column(name="alt_name")
  private String altName;


  public long getKpiLibKey() {
    return this.kpiLibKey;
  }

  public void setKpiLibKey(long kpiLibKey) {
    this.kpiLibKey = kpiLibKey;
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
}
