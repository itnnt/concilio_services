package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enjapan_data")
public class EnjapanData {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="resource_key_id")
  private long resourceKeyId;

  @Column(name="value")
  private String value;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getResourceKeyId() {
    return this.resourceKeyId;
  }

  public void setResourceKeyId(long resourceKeyId) {
    this.resourceKeyId = resourceKeyId;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
