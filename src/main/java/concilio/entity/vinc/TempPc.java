package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
