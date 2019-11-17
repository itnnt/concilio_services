package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_pa_dim_stage")
public class DwPaDimStage {

  @Id
  @Column(name="stage_key")
  private long stageKey;

  @Column(name="stage_name")
  private String stageName;

  @Column(name="stage_order")
  private long stageOrder;

  @Column(name="stage_description")
  private String stageDescription;


  public long getStageKey() {
    return this.stageKey;
  }

  public void setStageKey(long stageKey) {
    this.stageKey = stageKey;
  }

  public String getStageName() {
    return this.stageName;
  }

  public void setStageName(String stageName) {
    this.stageName = stageName;
  }

  public long getStageOrder() {
    return this.stageOrder;
  }

  public void setStageOrder(long stageOrder) {
    this.stageOrder = stageOrder;
  }

  public String getStageDescription() {
    return this.stageDescription;
  }

  public void setStageDescription(String stageDescription) {
    this.stageDescription = stageDescription;
  }
}
