package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class CalendarPreferenceId implements Serializable {
  private long ownerAccountId;
  private long sharedAccountId;

}
@Entity
@Table(name="calendar_preference")
@IdClass(CalendarPreferenceId.class)
public class CalendarPreference {


  @Id
  @Column(name="owner_account_id")
  private long ownerAccountId;

  @Id
  @Column(name="shared_account_id")
  private long sharedAccountId;

  @Column(name="color")
  private long color;

  @Column(name="hidden")
  private long hidden;

  @Column(name="visible")
  private long visible;


  public long getOwnerAccountId() {
    return this.ownerAccountId;
  }

  public void setOwnerAccountId(long ownerAccountId) {
    this.ownerAccountId = ownerAccountId;
  }

  public long getSharedAccountId() {
    return this.sharedAccountId;
  }

  public void setSharedAccountId(long sharedAccountId) {
    this.sharedAccountId = sharedAccountId;
  }

  public long getColor() {
    return this.color;
  }

  public void setColor(long color) {
    this.color = color;
  }

  public long getHidden() {
    return this.hidden;
  }

  public void setHidden(long hidden) {
    this.hidden = hidden;
  }

  public long getVisible() {
    return this.visible;
  }

  public void setVisible(long visible) {
    this.visible = visible;
  }
}
