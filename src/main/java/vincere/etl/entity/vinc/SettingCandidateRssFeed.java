package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="setting_candidate_rss_feed")
public class SettingCandidateRssFeed {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="setting_candidate_id")
  private long settingCandidateId;

  @Column(name="url")
  private String url;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSettingCandidateId() {
    return this.settingCandidateId;
  }

  public void setSettingCandidateId(long settingCandidateId) {
    this.settingCandidateId = settingCandidateId;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
