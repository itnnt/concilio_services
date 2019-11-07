package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class CandidateSourceVerticalFactCompositeId implements Serializable {
  private long candidateSourceId;
  private long verticalId;
  private long dateId;
}

@Entity
@Table(name="candidate_source_vertical_fact")
@IdClass(CandidateSourceVerticalFactCompositeId.class)
public class CandidateSourceVerticalFact {

  @Id
  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Id
  @Column(name="vertical_id")
  private long verticalId;

  @Id
  @Column(name="date_id")
  private long dateId;


  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getVerticalId() {
    return this.verticalId;
  }

  public void setVerticalId(long verticalId) {
    this.verticalId = verticalId;
  }

  public long getDateId() {
    return this.dateId;
  }

  public void setDateId(long dateId) {
    this.dateId = dateId;
  }
}
