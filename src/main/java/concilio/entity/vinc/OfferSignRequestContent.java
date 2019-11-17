package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer_sign_request_content")
public class OfferSignRequestContent {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="offer_id")
  private long offerId;

  @Column(name="client_contract_content")
  private String clientContractContent;

  @Column(name="offer_contract_content")
  private String offerContractContent;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getOfferId() {
    return this.offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }

  public String getClientContractContent() {
    return this.clientContractContent;
  }

  public void setClientContractContent(String clientContractContent) {
    this.clientContractContent = clientContractContent;
  }

  public String getOfferContractContent() {
    return this.offerContractContent;
  }

  public void setOfferContractContent(String offerContractContent) {
    this.offerContractContent = offerContractContent;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
