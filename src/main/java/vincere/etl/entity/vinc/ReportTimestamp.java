package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="report_timestamp")
public class ReportTimestamp {

  @Id
  @Column(name="timestamp")
  private java.sql.Timestamp timestamp;


  public java.sql.Timestamp getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(java.sql.Timestamp timestamp) {
    this.timestamp = timestamp;
  }
}
