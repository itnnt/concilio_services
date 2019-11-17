package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sub_functional_expertise")
public class SubFunctionalExpertise {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="functional_expertise_id")
  private long functionalExpertiseId;

  @Column(name="name")
  private String name;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getFunctionalExpertiseId() {
    return this.functionalExpertiseId;
  }

  public void setFunctionalExpertiseId(long functionalExpertiseId) {
    this.functionalExpertiseId = functionalExpertiseId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
