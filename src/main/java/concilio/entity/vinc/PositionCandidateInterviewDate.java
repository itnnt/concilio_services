package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position_candidate_interview_date")
public class PositionCandidateInterviewDate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="interview_no")
  private long interviewNo;

  @Column(name="interview_date")
  private java.sql.Timestamp interviewDate;


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

  public long getInterviewNo() {
    return this.interviewNo;
  }

  public void setInterviewNo(long interviewNo) {
    this.interviewNo = interviewNo;
  }

  public java.sql.Timestamp getInterviewDate() {
    return this.interviewDate;
  }

  public void setInterviewDate(java.sql.Timestamp interviewDate) {
    this.interviewDate = interviewDate;
  }
}
