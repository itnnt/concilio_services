package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="career_site")
public class CareerSite {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="location_id")
  private long locationId;

  @Column(name="name")
  private String name;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="client_url")
  private String clientUrl;

  @Column(name="subdomain")
  private String subdomain;

  @Column(name="language")
  private String language;

  @Column(name="alias_url")
  private String aliasUrl;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="internal")
  private long internal;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getClientUrl() {
    return this.clientUrl;
  }

  public void setClientUrl(String clientUrl) {
    this.clientUrl = clientUrl;
  }

  public String getSubdomain() {
    return this.subdomain;
  }

  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getAliasUrl() {
    return this.aliasUrl;
  }

  public void setAliasUrl(String aliasUrl) {
    this.aliasUrl = aliasUrl;
  }

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public long getInternal() {
    return this.internal;
  }

  public void setInternal(long internal) {
    this.internal = internal;
  }
}
