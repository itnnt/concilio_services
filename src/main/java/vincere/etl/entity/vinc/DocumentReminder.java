package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class DocumentReminderId implements Serializable {
  private long documentId;
  private long userId;

}
@Entity
@Table(name="document_reminder")
@IdClass(DocumentReminderId.class)
public class DocumentReminder {


  @Id
  @Column(name="document_id")
  private long documentId;

  @Id
  @Column(name="user_id")
  private long userId;


  public long getDocumentId() {
    return this.documentId;
  }

  public void setDocumentId(long documentId) {
    this.documentId = documentId;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }
}
