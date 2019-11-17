package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_primary_email_phone_bk")
public class ContactPrimaryEmailPhoneBk {

  @Id
  @Column(name="id")
  private long id;

  @Column(name="email")
  private String email;

  @Column(name="phone")
  private String phone;

  @Column(name="mobile_phone")
  private String mobilePhone;

  @Column(name="personal_email")
  private String personalEmail;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getMobilePhone() {
    return this.mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public String getPersonalEmail() {
    return this.personalEmail;
  }

  public void setPersonalEmail(String personalEmail) {
    this.personalEmail = personalEmail;
  }
}
