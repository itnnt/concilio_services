package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="local_currency_mapping")
public class LocalCurrencyMapping {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="from_currency_type")
  private String fromCurrencyType;

  @Column(name="to_currency_type")
  private String toCurrencyType;

  @Column(name="conversion_rate")
  private double conversionRate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFromCurrencyType() {
    return this.fromCurrencyType;
  }

  public void setFromCurrencyType(String fromCurrencyType) {
    this.fromCurrencyType = fromCurrencyType;
  }

  public String getToCurrencyType() {
    return this.toCurrencyType;
  }

  public void setToCurrencyType(String toCurrencyType) {
    this.toCurrencyType = toCurrencyType;
  }

  public double getConversionRate() {
    return this.conversionRate;
  }

  public void setConversionRate(double conversionRate) {
    this.conversionRate = conversionRate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
