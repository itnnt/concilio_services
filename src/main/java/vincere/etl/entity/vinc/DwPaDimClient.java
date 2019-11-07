package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_pa_dim_client")
public class DwPaDimClient {


  @Id
  @Column(name="client_key")
  private long clientKey;

  @Column(name="client_name")
  private String clientName;

  @Column(name="insert_datekey")
  private long insertDatekey;


  public long getClientKey() {
    return this.clientKey;
  }

  public void setClientKey(long clientKey) {
    this.clientKey = clientKey;
  }

  public String getClientName() {
    return this.clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public long getInsertDatekey() {
    return this.insertDatekey;
  }

  public void setInsertDatekey(long insertDatekey) {
    this.insertDatekey = insertDatekey;
  }
}
