package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class UserMailCandidateId implements Serializable {
  private long userMailMessageId;
  private long candidateId;

}
@Entity
@Table(name="user_mail_candidate")
@IdClass(UserMailCandidateId.class)
public class UserMailCandidate {


  @Id
  @Column(name="user_mail_message_id")
  private long userMailMessageId;

  @Id
  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="status")
  private long status;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getUserMailMessageId() {
    return this.userMailMessageId;
  }

  public void setUserMailMessageId(long userMailMessageId) {
    this.userMailMessageId = userMailMessageId;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getStatus() {
    return this.status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
