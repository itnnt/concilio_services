package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vertical_dimension")
public class VerticalDimension {


  @Column(name="source_id")
  private long sourceId;

  @Column(name="name")
  private String name;

  @Id
  @Column(name="id")
  private long id;


  public long getSourceId() {
    return this.sourceId;
  }

  public void setSourceId(long sourceId) {
    this.sourceId = sourceId;
  }

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
}
