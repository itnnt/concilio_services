package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="all_languages")
public class AllLanguages {


  @Id
  @Column(name="code")
  private String code;

  @Column(name="system_name")
  private String systemName;

  @Column(name="local_name")
  private String localName;

  @Column(name="native_name")
  private String nativeName;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getSystemName() {
    return this.systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public String getLocalName() {
    return this.localName;
  }

  public void setLocalName(String localName) {
    this.localName = localName;
  }

  public String getNativeName() {
    return this.nativeName;
  }

  public void setNativeName(String nativeName) {
    this.nativeName = nativeName;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
