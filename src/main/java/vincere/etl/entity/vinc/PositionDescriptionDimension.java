package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="position_description_dimension")
public class PositionDescriptionDimension {


  @Column(name="name")
  private String name;

  @Column(name="business_unit")
  private String businessUnit;

  @Column(name="description")
  private String description;

  @Column(name="contract")
  private long contract;

  @Column(name="source_id")
  private long sourceId;

  @Column(name="vertical_id")
  private long verticalId;

  @Column(name="location_id")
  private long locationId;

  @Id
  @Column(name="id")
  private long id;

  @Column(name="target_scaler")
  private double targetScaler;


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBusinessUnit() {
    return this.businessUnit;
  }

  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public long getContract() {
    return this.contract;
  }

  public void setContract(long contract) {
    this.contract = contract;
  }

  public long getSourceId() {
    return this.sourceId;
  }

  public void setSourceId(long sourceId) {
    this.sourceId = sourceId;
  }

  public long getVerticalId() {
    return this.verticalId;
  }

  public void setVerticalId(long verticalId) {
    this.verticalId = verticalId;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public double getTargetScaler() {
    return this.targetScaler;
  }

  public void setTargetScaler(double targetScaler) {
    this.targetScaler = targetScaler;
  }
}
