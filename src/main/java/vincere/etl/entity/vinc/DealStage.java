package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="deal_stage")
public class DealStage {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="pipeline_id")
  private long pipelineId;

  @Column(name="name")
  private String name;

  @Column(name="deal_probability")
  private double dealProbability;

  @Column(name="deal_rotting")
  private long dealRotting;

  @Column(name="position")
  private long position;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPipelineId() {
    return this.pipelineId;
  }

  public void setPipelineId(long pipelineId) {
    this.pipelineId = pipelineId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getDealProbability() {
    return this.dealProbability;
  }

  public void setDealProbability(double dealProbability) {
    this.dealProbability = dealProbability;
  }

  public long getDealRotting() {
    return this.dealRotting;
  }

  public void setDealRotting(long dealRotting) {
    this.dealRotting = dealRotting;
  }

  public long getPosition() {
    return this.position;
  }

  public void setPosition(long position) {
    this.position = position;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
