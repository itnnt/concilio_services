package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class PositionCandidateCompanyResponseId implements Serializable {
  private long id;
  private long positionCandidateId;

}
@Entity
@Table(name="position_candidate_company_response")
@IdClass(PositionCandidateCompanyResponseId.class)
public class PositionCandidateCompanyResponse {


  @Id
  @Column(name="id")
  private long id;

  @Id
  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="company_response_id")
  private long companyResponseId;

  @Column(name="action_date")
  private java.sql.Timestamp actionDate;

  @Column(name="note")
  private String note;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public long getCompanyResponseId() {
    return this.companyResponseId;
  }

  public void setCompanyResponseId(long companyResponseId) {
    this.companyResponseId = companyResponseId;
  }

  public java.sql.Timestamp getActionDate() {
    return this.actionDate;
  }

  public void setActionDate(java.sql.Timestamp actionDate) {
    this.actionDate = actionDate;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
