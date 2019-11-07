package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="career_site_language")
public class CareerSiteLanguage {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="language")
  private String language;

  @Column(name="abbreviation")
  private String abbreviation;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getAbbreviation() {
    return this.abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
