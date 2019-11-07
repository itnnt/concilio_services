package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="temp_pc")
public class TempPc {

  @Id
  @Column(name="pcid")
  private long pcid;


  public long getPcid() {
    return this.pcid;
  }

  public void setPcid(long pcid) {
    this.pcid = pcid;
  }
}
