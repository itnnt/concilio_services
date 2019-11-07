package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="equest_education")
public class EquestEducation {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="value")
  private String value;

  @Column(name="label")
  private String label;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
}
