package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class DwDimCurrenciesExchangeId implements Serializable {
  private String codeFrom;
  private String codeTo;
  private double value;
}

@Entity
@Table(name="dw_dim_currencies_exchange")
@IdClass(DwDimCurrenciesExchangeId.class)
public class DwDimCurrenciesExchange {

  @Id
  @Column(name="code_from")
  private String codeFrom;

  @Id
  @Column(name="code_to")
  private String codeTo;

  @Id
  @Column(name="value")
  private double value;


  public String getCodeFrom() {
    return this.codeFrom;
  }

  public void setCodeFrom(String codeFrom) {
    this.codeFrom = codeFrom;
  }

  public String getCodeTo() {
    return this.codeTo;
  }

  public void setCodeTo(String codeTo) {
    this.codeTo = codeTo;
  }

  public double getValue() {
    return this.value;
  }

  public void setValue(double value) {
    this.value = value;
  }
}
