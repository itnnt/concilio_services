package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_dim_currency")
public class DwDimCurrency {

  @Id
  @Column(name="currency_key")
  private long currencyKey;

  @Column(name="currency_code")
  private String currencyCode;

  @Column(name="currency_name")
  private String currencyName;

  @Column(name="currency_symbol_code")
  private String currencySymbolCode;

  @Column(name="currency_symbol")
  private String currencySymbol;

  @Column(name="cur_key")
  private String curKey;


  public long getCurrencyKey() {
    return this.currencyKey;
  }

  public void setCurrencyKey(long currencyKey) {
    this.currencyKey = currencyKey;
  }

  public String getCurrencyCode() {
    return this.currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public String getCurrencyName() {
    return this.currencyName;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  public String getCurrencySymbolCode() {
    return this.currencySymbolCode;
  }

  public void setCurrencySymbolCode(String currencySymbolCode) {
    this.currencySymbolCode = currencySymbolCode;
  }

  public String getCurrencySymbol() {
    return this.currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public String getCurKey() {
    return this.curKey;
  }

  public void setCurKey(String curKey) {
    this.curKey = curKey;
  }
}
