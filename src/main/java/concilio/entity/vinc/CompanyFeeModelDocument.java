package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_fee_model_document")
public class CompanyFeeModelDocument {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="company_fee_model_id")
  private long companyFeeModelId;

  @Column(name="company_legal_document_id")
  private long companyLegalDocumentId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCompanyFeeModelId() {
    return this.companyFeeModelId;
  }

  public void setCompanyFeeModelId(long companyFeeModelId) {
    this.companyFeeModelId = companyFeeModelId;
  }

  public long getCompanyLegalDocumentId() {
    return this.companyLegalDocumentId;
  }

  public void setCompanyLegalDocumentId(long companyLegalDocumentId) {
    this.companyLegalDocumentId = companyLegalDocumentId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
