package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="currencies_exchange")
public class CurrenciesExchange {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="code_from")
  private String codeFrom;

  @Column(name="code_to")
  private String codeTo;

  @Column(name="value")
  private double value;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

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

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
