package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_cs_fact_candidate_source")
public class DwCsFactCandidateSource {


  @Column(name="date_key")
  private long dateKey;

  @Id
  @Column(name="candidate_source_key")
  private long candidateSourceKey;

  @Column(name="candidate_by_source")
  private long candidateBySource;

  @Column(name="first_interview")
  private long firstInterview;

  @Column(name="place")
  private long place;

  @Column(name="active")
  private long active;

  @Column(name="rejected")
  private long rejected;


  public long getDateKey() {
    return this.dateKey;
  }

  public void setDateKey(long dateKey) {
    this.dateKey = dateKey;
  }

  public long getCandidateSourceKey() {
    return this.candidateSourceKey;
  }

  public void setCandidateSourceKey(long candidateSourceKey) {
    this.candidateSourceKey = candidateSourceKey;
  }

  public long getCandidateBySource() {
    return this.candidateBySource;
  }

  public void setCandidateBySource(long candidateBySource) {
    this.candidateBySource = candidateBySource;
  }

  public long getFirstInterview() {
    return this.firstInterview;
  }

  public void setFirstInterview(long firstInterview) {
    this.firstInterview = firstInterview;
  }

  public long getPlace() {
    return this.place;
  }

  public void setPlace(long place) {
    this.place = place;
  }

  public long getActive() {
    return this.active;
  }

  public void setActive(long active) {
    this.active = active;
  }

  public long getRejected() {
    return this.rejected;
  }

  public void setRejected(long rejected) {
    this.rejected = rejected;
  }
}
