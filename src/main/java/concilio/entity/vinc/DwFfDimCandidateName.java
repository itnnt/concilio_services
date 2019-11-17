package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_ff_dim_candidate_name")
public class DwFfDimCandidateName {

  @Id
  @Column(name="candidate_key")
  private long candidateKey;

  @Column(name="name_type")
  private long nameType;

  @Column(name="candidate_name")
  private String candidateName;


  public long getCandidateKey() {
    return this.candidateKey;
  }

  public void setCandidateKey(long candidateKey) {
    this.candidateKey = candidateKey;
  }

  public long getNameType() {
    return this.nameType;
  }

  public void setNameType(long nameType) {
    this.nameType = nameType;
  }

  public String getCandidateName() {
    return this.candidateName;
  }

  public void setCandidateName(String candidateName) {
    this.candidateName = candidateName;
  }
}
