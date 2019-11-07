package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_gdpr_compliance")
public class CandidateGdprCompliance {


  @Column(name="id")
  private long id;

  @Id
  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="explicit_consent")
  private long explicitConsent;

  @Column(name="exercise_right")
  private long exerciseRight;

  @Column(name="request_through")
  private long requestThrough;

  @Column(name="request_through_date")
  private java.sql.Timestamp requestThroughDate;

  @Column(name="obtained_through")
  private long obtainedThrough;

  @Column(name="obtained_through_date")
  private java.sql.Timestamp obtainedThroughDate;

  @Column(name="expire")
  private long expire;

  @Column(name="expire_date")
  private java.sql.Timestamp expireDate;

  @Column(name="obtained_by")
  private long obtainedBy;

  @Column(name="consent_level")
  private long consentLevel;

  @Column(name="under_legitimate_period")
  private long underLegitimatePeriod;

  @Column(name="portal_status")
  private long portalStatus;

  @Column(name="request_forgotten_date")
  private java.sql.Timestamp requestForgottenDate;

  @Column(name="last_login_date")
  private java.sql.Timestamp lastLoginDate;

  @Column(name="activated_date")
  private java.sql.Timestamp activatedDate;

  @Column(name="notes")
  private String notes;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getExplicitConsent() {
    return this.explicitConsent;
  }

  public void setExplicitConsent(long explicitConsent) {
    this.explicitConsent = explicitConsent;
  }

  public long getExerciseRight() {
    return this.exerciseRight;
  }

  public void setExerciseRight(long exerciseRight) {
    this.exerciseRight = exerciseRight;
  }

  public long getRequestThrough() {
    return this.requestThrough;
  }

  public void setRequestThrough(long requestThrough) {
    this.requestThrough = requestThrough;
  }

  public java.sql.Timestamp getRequestThroughDate() {
    return this.requestThroughDate;
  }

  public void setRequestThroughDate(java.sql.Timestamp requestThroughDate) {
    this.requestThroughDate = requestThroughDate;
  }

  public long getObtainedThrough() {
    return this.obtainedThrough;
  }

  public void setObtainedThrough(long obtainedThrough) {
    this.obtainedThrough = obtainedThrough;
  }

  public java.sql.Timestamp getObtainedThroughDate() {
    return this.obtainedThroughDate;
  }

  public void setObtainedThroughDate(java.sql.Timestamp obtainedThroughDate) {
    this.obtainedThroughDate = obtainedThroughDate;
  }

  public long getExpire() {
    return this.expire;
  }

  public void setExpire(long expire) {
    this.expire = expire;
  }

  public java.sql.Timestamp getExpireDate() {
    return this.expireDate;
  }

  public void setExpireDate(java.sql.Timestamp expireDate) {
    this.expireDate = expireDate;
  }

  public long getObtainedBy() {
    return this.obtainedBy;
  }

  public void setObtainedBy(long obtainedBy) {
    this.obtainedBy = obtainedBy;
  }

  public long getConsentLevel() {
    return this.consentLevel;
  }

  public void setConsentLevel(long consentLevel) {
    this.consentLevel = consentLevel;
  }

  public long getUnderLegitimatePeriod() {
    return this.underLegitimatePeriod;
  }

  public void setUnderLegitimatePeriod(long underLegitimatePeriod) {
    this.underLegitimatePeriod = underLegitimatePeriod;
  }

  public long getPortalStatus() {
    return this.portalStatus;
  }

  public void setPortalStatus(long portalStatus) {
    this.portalStatus = portalStatus;
  }

  public java.sql.Timestamp getRequestForgottenDate() {
    return this.requestForgottenDate;
  }

  public void setRequestForgottenDate(java.sql.Timestamp requestForgottenDate) {
    this.requestForgottenDate = requestForgottenDate;
  }

  public java.sql.Timestamp getLastLoginDate() {
    return this.lastLoginDate;
  }

  public void setLastLoginDate(java.sql.Timestamp lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
  }

  public java.sql.Timestamp getActivatedDate() {
    return this.activatedDate;
  }

  public void setActivatedDate(java.sql.Timestamp activatedDate) {
    this.activatedDate = activatedDate;
  }

  public String getNotes() {
    return this.notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
