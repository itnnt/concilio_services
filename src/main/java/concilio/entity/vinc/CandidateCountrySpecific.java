package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class CandidateCountrySpecificId implements Serializable {
  private long candidateId;
  private String countrySpecific;

}

@Entity
@Table(name="candidate_country_specific")
@IdClass(CandidateCountrySpecificId.class)
public class CandidateCountrySpecific {


  @Column(name="id")
  private long id;

  @Id
  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Id
  @Column(name="country_specific")
  private String countrySpecific;

  @Column(name="country_specific_detail")
  private String countrySpecificDetail;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getCountrySpecific() {
    return this.countrySpecific;
  }

  public void setCountrySpecific(String countrySpecific) {
    this.countrySpecific = countrySpecific;
  }

  public String getCountrySpecificDetail() {
    return this.countrySpecificDetail;
  }

  public void setCountrySpecificDetail(String countrySpecificDetail) {
    this.countrySpecificDetail = countrySpecificDetail;
  }
}
