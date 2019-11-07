package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="equest_country_state")
public class EquestCountryState {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="country")
  private String country;

  @Column(name="level1")
  private String level1;

  @Column(name="level2")
  private String level2;

  @Column(name="label")
  private String label;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getLevel1() {
    return this.level1;
  }

  public void setLevel1(String level1) {
    this.level1 = level1;
  }

  public String getLevel2() {
    return this.level2;
  }

  public void setLevel2(String level2) {
    this.level2 = level2;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
}
