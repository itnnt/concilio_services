package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class CompanyLegalDocumentFileDescId implements Serializable {
  private long companyLegalDocumentFileId;
  private String language;

}
@Entity
@Table(name="company_legal_document_file_desc")
@IdClass(CompanyLegalDocumentFileDescId.class)
public class CompanyLegalDocumentFileDesc {


  @Id
  @Column(name="company_legal_document_file_id")
  private long companyLegalDocumentFileId;

  @Id
  @Column(name="language")
  private String language;

  @Column(name="description")
  private String description;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getCompanyLegalDocumentFileId() {
    return this.companyLegalDocumentFileId;
  }

  public void setCompanyLegalDocumentFileId(long companyLegalDocumentFileId) {
    this.companyLegalDocumentFileId = companyLegalDocumentFileId;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
