package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="rejection_reason_dimension")
public class RejectionReasonDimension {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="null_reason")
  private long nullReason;

  @Column(name="reason")
  private String reason;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getNullReason() {
    return this.nullReason;
  }

  public void setNullReason(long nullReason) {
    this.nullReason = nullReason;
  }

  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }
}
