package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contract_schema_version")
public class ContractSchemaVersion {


  @Column(name="version_rank")
  private long versionRank;

  @Column(name="installed_rank")
  private long installedRank;

  @Id
  @Column(name="version")
  private String version;

  @Column(name="description")
  private String description;

  @Column(name="type")
  private String type;

  @Column(name="script")
  private String script;

  @Column(name="checksum")
  private long checksum;

  @Column(name="installed_by")
  private String installedBy;

  @Column(name="installed_on")
  private java.sql.Timestamp installedOn;

  @Column(name="execution_time")
  private long executionTime;

  @Column(name="success")
  private String success;


  public long getVersionRank() {
    return this.versionRank;
  }

  public void setVersionRank(long versionRank) {
    this.versionRank = versionRank;
  }

  public long getInstalledRank() {
    return this.installedRank;
  }

  public void setInstalledRank(long installedRank) {
    this.installedRank = installedRank;
  }

  public String getVersion() {
    return this.version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getScript() {
    return this.script;
  }

  public void setScript(String script) {
    this.script = script;
  }

  public long getChecksum() {
    return this.checksum;
  }

  public void setChecksum(long checksum) {
    this.checksum = checksum;
  }

  public String getInstalledBy() {
    return this.installedBy;
  }

  public void setInstalledBy(String installedBy) {
    this.installedBy = installedBy;
  }

  public java.sql.Timestamp getInstalledOn() {
    return this.installedOn;
  }

  public void setInstalledOn(java.sql.Timestamp installedOn) {
    this.installedOn = installedOn;
  }

  public long getExecutionTime() {
    return this.executionTime;
  }

  public void setExecutionTime(long executionTime) {
    this.executionTime = executionTime;
  }

  public String getSuccess() {
    return this.success;
  }

  public void setSuccess(String success) {
    this.success = success;
  }
}
