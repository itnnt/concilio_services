package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_dim_language_nametype")
public class DwDimLanguageNametype {

  @Id
  @Column(name="language_code")
  private String languageCode;

  @Column(name="name_type")
  private long nameType;


  public String getLanguageCode() {
    return this.languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public long getNameType() {
    return this.nameType;
  }

  public void setNameType(long nameType) {
    this.nameType = nameType;
  }
}
