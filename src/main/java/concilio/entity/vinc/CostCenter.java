package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cost_center")
public class CostCenter {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="hidden_timestamp")
  private java.sql.Timestamp hiddenTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="require_signoff")
  private long requireSignoff;

  @Column(name="require_resignoff")
  private long requireResignoff;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public java.sql.Timestamp getHiddenTimestamp() {
    return this.hiddenTimestamp;
  }

  public void setHiddenTimestamp(java.sql.Timestamp hiddenTimestamp) {
    this.hiddenTimestamp = hiddenTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getRequireSignoff() {
    return this.requireSignoff;
  }

  public void setRequireSignoff(long requireSignoff) {
    this.requireSignoff = requireSignoff;
  }

  public long getRequireResignoff() {
    return this.requireResignoff;
  }

  public void setRequireResignoff(long requireResignoff) {
    this.requireResignoff = requireResignoff;
  }
}
