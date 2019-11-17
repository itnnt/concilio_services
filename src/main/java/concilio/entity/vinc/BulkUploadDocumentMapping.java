package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bulk_upload_document_mapping")
public class BulkUploadDocumentMapping {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="entity_id")
  private long entityId;

  @Column(name="entity_type")
  private String entityType;

  @Column(name="file_name")
  private String fileName;

  @Column(name="document_id")
  private long documentId;

  @Column(name="document_bulk_upload_external_id")
  private String documentBulkUploadExternalId;

  @Column(name="document_type")
  private String documentType;

  @Column(name="bulk_upload_detail_id")
  private long bulkUploadDetailId;

  @Column(name="default_file")
  private long defaultFile;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getEntityId() {
    return this.entityId;
  }

  public void setEntityId(long entityId) {
    this.entityId = entityId;
  }

  public String getEntityType() {
    return this.entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public long getDocumentId() {
    return this.documentId;
  }

  public void setDocumentId(long documentId) {
    this.documentId = documentId;
  }

  public String getDocumentBulkUploadExternalId() {
    return this.documentBulkUploadExternalId;
  }

  public void setDocumentBulkUploadExternalId(String documentBulkUploadExternalId) {
    this.documentBulkUploadExternalId = documentBulkUploadExternalId;
  }

  public String getDocumentType() {
    return this.documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public long getBulkUploadDetailId() {
    return this.bulkUploadDetailId;
  }

  public void setBulkUploadDetailId(long bulkUploadDetailId) {
    this.bulkUploadDetailId = bulkUploadDetailId;
  }

  public long getDefaultFile() {
    return this.defaultFile;
  }

  public void setDefaultFile(long defaultFile) {
    this.defaultFile = defaultFile;
  }
}
