package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="slideshow_slide")
public class SlideshowSlide {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="slideshow_id")
  private long slideshowId;

  @Column(name="slide_no")
  private long slideNo;

  @Column(name="slide_content")
  private String slideContent;

  @Column(name="thumbnail")
  private String thumbnail;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSlideshowId() {
    return this.slideshowId;
  }

  public void setSlideshowId(long slideshowId) {
    this.slideshowId = slideshowId;
  }

  public long getSlideNo() {
    return this.slideNo;
  }

  public void setSlideNo(long slideNo) {
    this.slideNo = slideNo;
  }

  public String getSlideContent() {
    return this.slideContent;
  }

  public void setSlideContent(String slideContent) {
    this.slideContent = slideContent;
  }

  public String getThumbnail() {
    return this.thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
