package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class ContactOwnerId implements Serializable {
  private long contactId;
  private long userId;

}

@Entity
@Table(name="contact_owner")
@IdClass(ContactOwnerId.class)
public class ContactOwner {


  @Id
  @Column(name="contact_id")
  private long contactId;

  @Id
  @Column(name="user_id")
  private long userId;

  @Column(name="index")
  private long index;


  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public long getIndex() {
    return this.index;
  }

  public void setIndex(long index) {
    this.index = index;
  }
}
