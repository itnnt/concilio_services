package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_candidate_source_invitation")
public class PositionCandidateSourceInvitation {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_description_id")
  private long positionDescriptionId;

  @Column(name="vendor_id")
  private long vendorId;

  @Column(name="invited_date")
  private java.sql.Timestamp invitedDate;

  @Column(name="replied_date")
  private java.sql.Timestamp repliedDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionDescriptionId() {
    return this.positionDescriptionId;
  }

  public void setPositionDescriptionId(long positionDescriptionId) {
    this.positionDescriptionId = positionDescriptionId;
  }

  public long getVendorId() {
    return this.vendorId;
  }

  public void setVendorId(long vendorId) {
    this.vendorId = vendorId;
  }

  public java.sql.Timestamp getInvitedDate() {
    return this.invitedDate;
  }

  public void setInvitedDate(java.sql.Timestamp invitedDate) {
    this.invitedDate = invitedDate;
  }

  public java.sql.Timestamp getRepliedDate() {
    return this.repliedDate;
  }

  public void setRepliedDate(java.sql.Timestamp repliedDate) {
    this.repliedDate = repliedDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
