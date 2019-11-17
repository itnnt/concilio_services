package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_cs_dim_candidate_source")
public class DwCsDimCandidateSource {

  @Id
  @Column(name="candidate_source_key")
  private long candidateSourceKey;

  @Column(name="candidate_source_name")
  private String candidateSourceName;


  public long getCandidateSourceKey() {
    return this.candidateSourceKey;
  }

  public void setCandidateSourceKey(long candidateSourceKey) {
    this.candidateSourceKey = candidateSourceKey;
  }

  public String getCandidateSourceName() {
    return this.candidateSourceName;
  }

  public void setCandidateSourceName(String candidateSourceName) {
    this.candidateSourceName = candidateSourceName;
  }
}
