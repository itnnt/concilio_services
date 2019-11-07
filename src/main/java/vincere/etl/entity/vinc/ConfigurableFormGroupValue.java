package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="configurable_form_group_value")
public class ConfigurableFormGroupValue {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="parent_id")
  private long parentId;

  @Column(name="children_id")
  private long childrenId;

  @Column(name="text_data")
  private String textData;

  @Column(name="value_data")
  private String valueData;

  @Column(name="value_data_array")
  private long valueDataArray;

  @Column(name="date_data")
  private java.sql.Timestamp dateData;

  @Column(name="index")
  private long index;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="constraint_id")
  private String constraintId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public long getParentId() {
    return this.parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }

  public long getChildrenId() {
    return this.childrenId;
  }

  public void setChildrenId(long childrenId) {
    this.childrenId = childrenId;
  }

  public String getTextData() {
    return this.textData;
  }

  public void setTextData(String textData) {
    this.textData = textData;
  }

  public String getValueData() {
    return this.valueData;
  }

  public void setValueData(String valueData) {
    this.valueData = valueData;
  }

  public long getValueDataArray() {
    return this.valueDataArray;
  }

  public void setValueDataArray(long valueDataArray) {
    this.valueDataArray = valueDataArray;
  }

  public java.sql.Timestamp getDateData() {
    return this.dateData;
  }

  public void setDateData(java.sql.Timestamp dateData) {
    this.dateData = dateData;
  }

  public long getIndex() {
    return this.index;
  }

  public void setIndex(long index) {
    this.index = index;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getConstraintId() {
    return this.constraintId;
  }

  public void setConstraintId(String constraintId) {
    this.constraintId = constraintId;
  }
}
