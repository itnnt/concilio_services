package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="setting_candidate_post_feed")
public class SettingCandidatePostFeed {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="setting_candidate_id")
  private long settingCandidateId;

  @Column(name="post_content")
  private String postContent;

  @Column(name="post_date")
  private java.sql.Timestamp postDate;


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

  public String getPostContent() {
    return this.postContent;
  }

  public void setPostContent(String postContent) {
    this.postContent = postContent;
  }

  public java.sql.Timestamp getPostDate() {
    return this.postDate;
  }

  public void setPostDate(java.sql.Timestamp postDate) {
    this.postDate = postDate;
  }
}
