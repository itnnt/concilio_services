package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="label_detail")
public class LabelDetail {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="label_name")
  private String labelName;

  @Column(name="background_color")
  private String backgroundColor;

  @Column(name="text_color")
  private String textColor;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLabelName() {
    return this.labelName;
  }

  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }

  public String getBackgroundColor() {
    return this.backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public String getTextColor() {
    return this.textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
