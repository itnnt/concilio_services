package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_dimension")
public class CandidateDimension {


  @Column(name="name")
  private String name;
  @Id
  @Column(name="id")
  private long id;

  @Column(name="source_id")
  private long sourceId;


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSourceId() {
    return this.sourceId;
  }

  public void setSourceId(long sourceId) {
    this.sourceId = sourceId;
  }
}
