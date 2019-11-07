package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="system_option")
public class SystemOption {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="option")
  private String option;

  @Column(name="value")
  private String value;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getOption() {
    return this.option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
