package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class CareersiteTermsConfigurationId implements Serializable {
  private long careersiteId;
  private String language;

}

@Entity
@Table(name="careersite_terms_configuration")
@IdClass(CareersiteTermsConfigurationId.class)
public class CareersiteTermsConfiguration {


  @Id
  @Column(name="careersite_id")
  private long careersiteId;

  @Column(name="terms_file_id")
  private long termsFileId;

  @Id
  @Column(name="language")
  private String language;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getCareersiteId() {
    return this.careersiteId;
  }

  public void setCareersiteId(long careersiteId) {
    this.careersiteId = careersiteId;
  }

  public long getTermsFileId() {
    return this.termsFileId;
  }

  public void setTermsFileId(long termsFileId) {
    this.termsFileId = termsFileId;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
