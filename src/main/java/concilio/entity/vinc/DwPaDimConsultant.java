package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_pa_dim_consultant")
public class DwPaDimConsultant {


  @Id
  @Column(name="consultant_key")
  private long consultantKey;

  @Column(name="consultant_name")
  private String consultantName;

  @Column(name="location")
  private String location;

  @Column(name="team_name")
  private String teamName;

  @Column(name="team_manager_name")
  private String teamManagerName;

  @Column(name="timezone")
  private String timezone;


  public long getConsultantKey() {
    return this.consultantKey;
  }

  public void setConsultantKey(long consultantKey) {
    this.consultantKey = consultantKey;
  }

  public String getConsultantName() {
    return this.consultantName;
  }

  public void setConsultantName(String consultantName) {
    this.consultantName = consultantName;
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getTeamName() {
    return this.teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getTeamManagerName() {
    return this.teamManagerName;
  }

  public void setTeamManagerName(String teamManagerName) {
    this.teamManagerName = teamManagerName;
  }

  public String getTimezone() {
    return this.timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }
}
