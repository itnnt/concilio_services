package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="contact_location")
public class ContactLocation {


  @Column(name="contact_id")
  private long contactId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="seq")
  private long seq;

  @Id
  @Column(name="location_id")
  private long locationId;

  @Column(name="company_location_id")
  private long companyLocationId;


  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getSeq() {
    return this.seq;
  }

  public void setSeq(long seq) {
    this.seq = seq;
  }

  public long getLocationId() {
    return this.locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public long getCompanyLocationId() {
    return this.companyLocationId;
  }

  public void setCompanyLocationId(long companyLocationId) {
    this.companyLocationId = companyLocationId;
  }
}
