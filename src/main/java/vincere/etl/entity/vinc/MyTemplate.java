package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="my_template")
public class MyTemplate {

  @Id
  @Column(name="id")
  private long id;

  @Column(name="name")
  private String name;

  @Column(name="candidate_source_id")
  private long candidateSourceId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="creator")
  private long creator;

  @Column(name="country")
  private long country;

  @Column(name="source_contact_id")
  private long sourceContactId;

  @Column(name="file_name")
  private String fileName;

  @Column(name="original_file_name")
  private String originalFileName;


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

  public long getCandidateSourceId() {
    return this.candidateSourceId;
  }

  public void setCandidateSourceId(long candidateSourceId) {
    this.candidateSourceId = candidateSourceId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getCreator() {
    return this.creator;
  }

  public void setCreator(long creator) {
    this.creator = creator;
  }

  public long getCountry() {
    return this.country;
  }

  public void setCountry(long country) {
    this.country = country;
  }

  public long getSourceContactId() {
    return this.sourceContactId;
  }

  public void setSourceContactId(long sourceContactId) {
    this.sourceContactId = sourceContactId;
  }

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getOriginalFileName() {
    return this.originalFileName;
  }

  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }
}
