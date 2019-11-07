package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_kpi_dim_team_manager")
public class DwKpiDimTeamManager {

  @Id
  @Column(name="consultant_key")
  private long consultantKey;

  @Column(name="team_key")
  private long teamKey;


  public long getConsultantKey() {
    return this.consultantKey;
  }

  public void setConsultantKey(long consultantKey) {
    this.consultantKey = consultantKey;
  }

  public long getTeamKey() {
    return this.teamKey;
  }

  public void setTeamKey(long teamKey) {
    this.teamKey = teamKey;
  }
}
