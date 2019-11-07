package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="offer_document_template_bk")
public class OfferDocumentTemplateBk {

  @Id
  @Column(name="id")
  private long id;

  @Column(name="footer_height")
  private double footerHeight;

  @Column(name="header_height")
  private double headerHeight;

  @Column(name="header_cover_height")
  private double headerCoverHeight;

  @Column(name="footer_cover_height")
  private double footerCoverHeight;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public double getFooterHeight() {
    return this.footerHeight;
  }

  public void setFooterHeight(double footerHeight) {
    this.footerHeight = footerHeight;
  }

  public double getHeaderHeight() {
    return this.headerHeight;
  }

  public void setHeaderHeight(double headerHeight) {
    this.headerHeight = headerHeight;
  }

  public double getHeaderCoverHeight() {
    return this.headerCoverHeight;
  }

  public void setHeaderCoverHeight(double headerCoverHeight) {
    this.headerCoverHeight = headerCoverHeight;
  }

  public double getFooterCoverHeight() {
    return this.footerCoverHeight;
  }

  public void setFooterCoverHeight(double footerCoverHeight) {
    this.footerCoverHeight = footerCoverHeight;
  }
}
