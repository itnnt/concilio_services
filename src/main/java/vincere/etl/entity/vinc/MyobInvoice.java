package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="myob_invoice")
public class MyobInvoice {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_candidate_id")
  private long positionCandidateId;

  @Column(name="text_field_1")
  private String textField1;

  @Column(name="text_field_2")
  private String textField2;

  @Column(name="text_field_3")
  private String textField3;

  @Column(name="text_field_4")
  private String textField4;

  @Column(name="text_field_5")
  private String textField5;

  @Column(name="text_field_6")
  private String textField6;

  @Column(name="text_field_7")
  private String textField7;

  @Column(name="text_field_8")
  private String textField8;

  @Column(name="text_field_9")
  private String textField9;

  @Column(name="text_field_10")
  private String textField10;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionCandidateId() {
    return this.positionCandidateId;
  }

  public void setPositionCandidateId(long positionCandidateId) {
    this.positionCandidateId = positionCandidateId;
  }

  public String getTextField1() {
    return this.textField1;
  }

  public void setTextField1(String textField1) {
    this.textField1 = textField1;
  }

  public String getTextField2() {
    return this.textField2;
  }

  public void setTextField2(String textField2) {
    this.textField2 = textField2;
  }

  public String getTextField3() {
    return this.textField3;
  }

  public void setTextField3(String textField3) {
    this.textField3 = textField3;
  }

  public String getTextField4() {
    return this.textField4;
  }

  public void setTextField4(String textField4) {
    this.textField4 = textField4;
  }

  public String getTextField5() {
    return this.textField5;
  }

  public void setTextField5(String textField5) {
    this.textField5 = textField5;
  }

  public String getTextField6() {
    return this.textField6;
  }

  public void setTextField6(String textField6) {
    this.textField6 = textField6;
  }

  public String getTextField7() {
    return this.textField7;
  }

  public void setTextField7(String textField7) {
    this.textField7 = textField7;
  }

  public String getTextField8() {
    return this.textField8;
  }

  public void setTextField8(String textField8) {
    this.textField8 = textField8;
  }

  public String getTextField9() {
    return this.textField9;
  }

  public void setTextField9(String textField9) {
    this.textField9 = textField9;
  }

  public String getTextField10() {
    return this.textField10;
  }

  public void setTextField10(String textField10) {
    this.textField10 = textField10;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
