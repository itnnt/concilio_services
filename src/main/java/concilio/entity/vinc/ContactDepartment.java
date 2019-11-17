package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_department")
public class ContactDepartment {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="department_id")
  private long departmentId;

  @Column(name="contact_id")
  private long contactId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }

  public long getContactId() {
    return this.contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
