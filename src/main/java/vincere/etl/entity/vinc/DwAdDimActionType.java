package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_ad_dim_action_type")
public class DwAdDimActionType {


  @Id
  @Column(name="action_type_key")
  private long actionTypeKey;

  @Column(name="action_type_name")
  private String actionTypeName;

  @Column(name="tab_name")
  private String tabName;


  public long getActionTypeKey() {
    return this.actionTypeKey;
  }

  public void setActionTypeKey(long actionTypeKey) {
    this.actionTypeKey = actionTypeKey;
  }

  public String getActionTypeName() {
    return this.actionTypeName;
  }

  public void setActionTypeName(String actionTypeName) {
    this.actionTypeName = actionTypeName;
  }

  public String getTabName() {
    return this.tabName;
  }

  public void setTabName(String tabName) {
    this.tabName = tabName;
  }
}
