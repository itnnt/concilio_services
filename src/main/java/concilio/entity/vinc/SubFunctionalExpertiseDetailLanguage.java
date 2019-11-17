package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sub_functional_expertise_detail_language")
public class SubFunctionalExpertiseDetailLanguage {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="sub_functional_expertise_id")
  private long subFunctionalExpertiseId;

  @Column(name="language")
  private String language;

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

  public long getSubFunctionalExpertiseId() {
    return this.subFunctionalExpertiseId;
  }

  public void setSubFunctionalExpertiseId(long subFunctionalExpertiseId) {
    this.subFunctionalExpertiseId = subFunctionalExpertiseId;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
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
