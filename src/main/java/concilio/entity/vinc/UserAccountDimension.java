package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_account_dimension")
public class UserAccountDimension {


  @Column(name="source_id")
  private long sourceId;

  @Column(name="name")
  private String name;

  @Column(name="name_kana")
  private String nameKana;

  @Column(name="email")
  private String email;

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

  public String getNameKana() {
    return this.nameKana;
  }

  public void setNameKana(String nameKana) {
    this.nameKana = nameKana;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
