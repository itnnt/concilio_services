package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_ad_fact_action_1")
public class DwAdFactAction1 {

  @Id
  @Column(name="date_key")
  private long dateKey;

  @Column(name="time_key")
  private long timeKey;

  @Column(name="consultant_key")
  private long consultantKey;

  @Column(name="action_type_key")
  private long actionTypeKey;

  @Column(name="uni_key")
  private long uniKey;

  @Column(name="candidate_key")
  private long candidateKey;


  public long getDateKey() {
    return this.dateKey;
  }

  public void setDateKey(long dateKey) {
    this.dateKey = dateKey;
  }

  public long getTimeKey() {
    return this.timeKey;
  }

  public void setTimeKey(long timeKey) {
    this.timeKey = timeKey;
  }

  public long getConsultantKey() {
    return this.consultantKey;
  }

  public void setConsultantKey(long consultantKey) {
    this.consultantKey = consultantKey;
  }

  public long getActionTypeKey() {
    return this.actionTypeKey;
  }

  public void setActionTypeKey(long actionTypeKey) {
    this.actionTypeKey = actionTypeKey;
  }

  public long getUniKey() {
    return this.uniKey;
  }

  public void setUniKey(long uniKey) {
    this.uniKey = uniKey;
  }

  public long getCandidateKey() {
    return this.candidateKey;
  }

  public void setCandidateKey(long candidateKey) {
    this.candidateKey = candidateKey;
  }
}
