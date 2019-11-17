package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compensation_setting")
public class CompensationSetting {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="code")
  private String code;

  @Column(name="country_code")
  private String countryCode;

  @Column(name="state_id")
  private long stateId;

  @Column(name="section")
  private long section;

  @Column(name="delete_timestamp")
  private java.sql.Timestamp deleteTimestamp;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="system_code")
  private String systemCode;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getCountryCode() {
    return this.countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public long getStateId() {
    return this.stateId;
  }

  public void setStateId(long stateId) {
    this.stateId = stateId;
  }

  public long getSection() {
    return this.section;
  }

  public void setSection(long section) {
    this.section = section;
  }

  public java.sql.Timestamp getDeleteTimestamp() {
    return this.deleteTimestamp;
  }

  public void setDeleteTimestamp(java.sql.Timestamp deleteTimestamp) {
    this.deleteTimestamp = deleteTimestamp;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getSystemCode() {
    return this.systemCode;
  }

  public void setSystemCode(String systemCode) {
    this.systemCode = systemCode;
  }
}
