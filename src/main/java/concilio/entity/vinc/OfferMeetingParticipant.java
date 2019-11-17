package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer_meeting_participant")
public class OfferMeetingParticipant {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_meeting_id")
  private long offerMeetingId;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="meeting_participant_id")
  private long meetingParticipantId;

  @Column(name="confirmed")
  private long confirmed;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getOfferMeetingId() {
    return this.offerMeetingId;
  }

  public void setOfferMeetingId(long offerMeetingId) {
    this.offerMeetingId = offerMeetingId;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public long getMeetingParticipantId() {
    return this.meetingParticipantId;
  }

  public void setMeetingParticipantId(long meetingParticipantId) {
    this.meetingParticipantId = meetingParticipantId;
  }

  public long getConfirmed() {
    return this.confirmed;
  }

  public void setConfirmed(long confirmed) {
    this.confirmed = confirmed;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
