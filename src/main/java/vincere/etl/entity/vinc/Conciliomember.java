package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="conciliomember")
public class Conciliomember {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="memberid")
  private String memberid;

  @Column(name="name")
  private String name;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getMemberid() {
    return this.memberid;
  }

  public void setMemberid(String memberid) {
    this.memberid = memberid;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
