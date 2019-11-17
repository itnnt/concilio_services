package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_kpi_dim_contact")
public class DwKpiDimContact {

  @Column(name="contact_key")
  private long contactKey;

  @Column(name="company_key")
  private long companyKey;

  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="middle_name")
  private String middleName;

  @Id
  @Column(name="insert_datekey")
  private long insertDatekey;


  public long getContactKey() {
    return this.contactKey;
  }

  public void setContactKey(long contactKey) {
    this.contactKey = contactKey;
  }

  public long getCompanyKey() {
    return this.companyKey;
  }

  public void setCompanyKey(long companyKey) {
    this.companyKey = companyKey;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMiddleName() {
    return this.middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public long getInsertDatekey() {
    return this.insertDatekey;
  }

  public void setInsertDatekey(long insertDatekey) {
    this.insertDatekey = insertDatekey;
  }
}
