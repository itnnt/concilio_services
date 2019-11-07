package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="solr_index_timestamp")
public class SolrIndexTimestamp {


  @Id
  @Column(name="core")
  private String core;

  @Column(name="next_index_timestamp")
  private java.sql.Timestamp nextIndexTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public String getCore() {
    return this.core;
  }

  public void setCore(String core) {
    this.core = core;
  }

  public java.sql.Timestamp getNextIndexTimestamp() {
    return this.nextIndexTimestamp;
  }

  public void setNextIndexTimestamp(java.sql.Timestamp nextIndexTimestamp) {
    this.nextIndexTimestamp = nextIndexTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
