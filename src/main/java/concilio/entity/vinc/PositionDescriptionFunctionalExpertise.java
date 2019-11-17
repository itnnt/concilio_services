package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_description_functional_expertise")
public class PositionDescriptionFunctionalExpertise {

  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_id")
  private long positionId;

  @Column(name="functional_expertise_id")
  private long functionalExpertiseId;

  @Column(name="sub_functional_expertise_id")
  private long subFunctionalExpertiseId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public long getFunctionalExpertiseId() {
    return this.functionalExpertiseId;
  }

  public void setFunctionalExpertiseId(long functionalExpertiseId) {
    this.functionalExpertiseId = functionalExpertiseId;
  }

  public long getSubFunctionalExpertiseId() {
    return this.subFunctionalExpertiseId;
  }

  public void setSubFunctionalExpertiseId(long subFunctionalExpertiseId) {
    this.subFunctionalExpertiseId = subFunctionalExpertiseId;
  }
}
