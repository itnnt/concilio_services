package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ActivityDocumentId implements Serializable {
  private long activityId;
  private long documentId;

}

@Entity
@Table(name="activity_document")
@IdClass(ActivityDocumentId.class)
public class ActivityDocument {


  @Id
  @Column(name="activity_id")
  private long activityId;

  @Id
  @Column(name="document_id")
  private long documentId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getActivityId() {
    return this.activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }

  public long getDocumentId() {
    return this.documentId;
  }

  public void setDocumentId(long documentId) {
    this.documentId = documentId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
