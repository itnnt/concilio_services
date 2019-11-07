package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="paid_time_off")
public class PaidTimeOff {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="hash_code")
  private String hashCode;

  @Column(name="code_name")
  private String codeName;

  @Column(name="country_code")
  private String countryCode;

  @Column(name="code_type")
  private String codeType;

  @Column(name="status")
  private String status;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="update_timestamp")
  private java.sql.Timestamp updateTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getHashCode() {
    return this.hashCode;
  }

  public void setHashCode(String hashCode) {
    this.hashCode = hashCode;
  }

  public String getCodeName() {
    return this.codeName;
  }

  public void setCodeName(String codeName) {
    this.codeName = codeName;
  }

  public String getCountryCode() {
    return this.countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getCodeType() {
    return this.codeType;
  }

  public void setCodeType(String codeType) {
    this.codeType = codeType;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public java.sql.Timestamp getUpdateTimestamp() {
    return this.updateTimestamp;
  }

  public void setUpdateTimestamp(java.sql.Timestamp updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }
}
