package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equest_function")
public class EquestFunction {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="level1")
  private String level1;

  @Column(name="level2")
  private String level2;

  @Column(name="level3")
  private String level3;

  @Column(name="level4")
  private String level4;

  @Column(name="label")
  private String label;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
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

  public String getLevel3() {
    return this.level3;
  }

  public void setLevel3(String level3) {
    this.level3 = level3;
  }

  public String getLevel4() {
    return this.level4;
  }

  public void setLevel4(String level4) {
    this.level4 = level4;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
}
