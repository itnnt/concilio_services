package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_pa_dim_team")
public class DwPaDimTeam {


  @Id
  @Column(name="team_key")
  private long teamKey;

  @Column(name="team_name")
  private String teamName;


  public long getTeamKey() {
    return this.teamKey;
  }

  public void setTeamKey(long teamKey) {
    this.teamKey = teamKey;
  }

  public String getTeamName() {
    return this.teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }
}
