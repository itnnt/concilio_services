package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="setting_candidate_cover_text")
public class SettingCandidateCoverText {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="setting_candidate_id")
  private long settingCandidateId;

  @Column(name="language")
  private String language;

  @Column(name="content")
  private String content;


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

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
