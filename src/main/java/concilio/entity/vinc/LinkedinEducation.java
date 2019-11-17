package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="linkedin_education")
public class LinkedinEducation {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="code")
  private String code;

  @Column(name="name")
  private String name;

  @Column(name="load_order")
  private long loadOrder;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getLoadOrder() {
    return this.loadOrder;
  }

  public void setLoadOrder(long loadOrder) {
    this.loadOrder = loadOrder;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
