package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="kpi_criteria")
public class KpiCriteria {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="kpi_category_id")
  private long kpiCategoryId;

  @Column(name="kpi_library_id")
  private long kpiLibraryId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getKpiCategoryId() {
    return this.kpiCategoryId;
  }

  public void setKpiCategoryId(long kpiCategoryId) {
    this.kpiCategoryId = kpiCategoryId;
  }

  public long getKpiLibraryId() {
    return this.kpiLibraryId;
  }

  public void setKpiLibraryId(long kpiLibraryId) {
    this.kpiLibraryId = kpiLibraryId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
