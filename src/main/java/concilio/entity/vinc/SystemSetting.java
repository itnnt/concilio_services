package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="system_setting")
public class SystemSetting {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="default_candidate_source")
  private long defaultCandidateSource;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getDefaultCandidateSource() {
    return this.defaultCandidateSource;
  }

  public void setDefaultCandidateSource(long defaultCandidateSource) {
    this.defaultCandidateSource = defaultCandidateSource;
  }
}