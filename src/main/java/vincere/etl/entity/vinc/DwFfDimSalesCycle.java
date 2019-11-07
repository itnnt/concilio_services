package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_ff_dim_sales_cycle")
public class DwFfDimSalesCycle {

  @Id
  @Column(name="stage_key")
  private long stageKey;

  @Column(name="date_key")
  private long dateKey;

  @Column(name="real_average")
  private double realAverage;

  @Column(name="real_max")
  private double realMax;

  @Column(name="real_min")
  private double realMin;

  @Column(name="real_nextstage_probability")
  private double realNextstageProbability;

  @Column(name="real_placement_probability")
  private double realPlacementProbability;

  @Column(name="assumption_average")
  private double assumptionAverage;

  @Column(name="assumption_max")
  private double assumptionMax;

  @Column(name="assumption_min")
  private double assumptionMin;

  @Column(name="assumption_nextstage_probability")
  private double assumptionNextstageProbability;

  @Column(name="assumption_placement_probability")
  private double assumptionPlacementProbability;


  public long getStageKey() {
    return this.stageKey;
  }

  public void setStageKey(long stageKey) {
    this.stageKey = stageKey;
  }

  public long getDateKey() {
    return this.dateKey;
  }

  public void setDateKey(long dateKey) {
    this.dateKey = dateKey;
  }

  public double getRealAverage() {
    return this.realAverage;
  }

  public void setRealAverage(double realAverage) {
    this.realAverage = realAverage;
  }

  public double getRealMax() {
    return this.realMax;
  }

  public void setRealMax(double realMax) {
    this.realMax = realMax;
  }

  public double getRealMin() {
    return this.realMin;
  }

  public void setRealMin(double realMin) {
    this.realMin = realMin;
  }

  public double getRealNextstageProbability() {
    return this.realNextstageProbability;
  }

  public void setRealNextstageProbability(double realNextstageProbability) {
    this.realNextstageProbability = realNextstageProbability;
  }

  public double getRealPlacementProbability() {
    return this.realPlacementProbability;
  }

  public void setRealPlacementProbability(double realPlacementProbability) {
    this.realPlacementProbability = realPlacementProbability;
  }

  public double getAssumptionAverage() {
    return this.assumptionAverage;
  }

  public void setAssumptionAverage(double assumptionAverage) {
    this.assumptionAverage = assumptionAverage;
  }

  public double getAssumptionMax() {
    return this.assumptionMax;
  }

  public void setAssumptionMax(double assumptionMax) {
    this.assumptionMax = assumptionMax;
  }

  public double getAssumptionMin() {
    return this.assumptionMin;
  }

  public void setAssumptionMin(double assumptionMin) {
    this.assumptionMin = assumptionMin;
  }

  public double getAssumptionNextstageProbability() {
    return this.assumptionNextstageProbability;
  }

  public void setAssumptionNextstageProbability(double assumptionNextstageProbability) {
    this.assumptionNextstageProbability = assumptionNextstageProbability;
  }

  public double getAssumptionPlacementProbability() {
    return this.assumptionPlacementProbability;
  }

  public void setAssumptionPlacementProbability(double assumptionPlacementProbability) {
    this.assumptionPlacementProbability = assumptionPlacementProbability;
  }
}
