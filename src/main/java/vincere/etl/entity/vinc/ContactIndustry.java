package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ContactIndustryId implements Serializable {
  private long industryId;
  private long contactId;

}
@Entity
@Table(name="contact_industry")
@IdClass(ContactIndustryId.class)
public class ContactIndustry {


  @Id
  @Column(name="industry_id")
  private long industryId;

  @Id
  @Column(name="contact_id")
  private long contactId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="seq")
  private long seq;


  public long getIndustryId() {
    return this.industryId;
  }

  public void setIndustryId(long industryId) {
    this.industryId = industryId;
  }

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
}
