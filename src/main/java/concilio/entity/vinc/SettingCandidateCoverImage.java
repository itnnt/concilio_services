package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="setting_candidate_cover_image")
public class SettingCandidateCoverImage {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="setting_candidate_id")
  private long settingCandidateId;

  @Column(name="save_name")
  private String saveName;

  @Column(name="file_name")
  private String fileName;


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

  public String getSaveName() {
    return this.saveName;
  }

  public void setSaveName(String saveName) {
    this.saveName = saveName;
  }

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }
}
