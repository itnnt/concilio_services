package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {


  @Id
  @Column(name="emailaddress")
  private String emailaddress;

  @Column(name="name")
  private String name;

  @Column(name="purchasedpackage")
  private String purchasedpackage;


  public String getEmailaddress() {
    return this.emailaddress;
  }

  public void setEmailaddress(String emailaddress) {
    this.emailaddress = emailaddress;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPurchasedpackage() {
    return this.purchasedpackage;
  }

  public void setPurchasedpackage(String purchasedpackage) {
    this.purchasedpackage = purchasedpackage;
  }
}
