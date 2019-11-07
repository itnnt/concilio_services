package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="feature_flags")
public class FeatureFlags {


  @Id
  @Column(name="feature_name")
  private String featureName;

  @Column(name="feature_enabled")
  private long featureEnabled;

  @Column(name="strategy_id")
  private String strategyId;

  @Column(name="strategy_params")
  private String strategyParams;


  public String getFeatureName() {
    return this.featureName;
  }

  public void setFeatureName(String featureName) {
    this.featureName = featureName;
  }

  public long getFeatureEnabled() {
    return this.featureEnabled;
  }

  public void setFeatureEnabled(long featureEnabled) {
    this.featureEnabled = featureEnabled;
  }

  public String getStrategyId() {
    return this.strategyId;
  }

  public void setStrategyId(String strategyId) {
    this.strategyId = strategyId;
  }

  public String getStrategyParams() {
    return this.strategyParams;
  }

  public void setStrategyParams(String strategyParams) {
    this.strategyParams = strategyParams;
  }
}
