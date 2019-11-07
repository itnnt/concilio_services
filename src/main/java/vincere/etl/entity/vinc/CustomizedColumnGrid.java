package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="customized_column_grid")
public class CustomizedColumnGrid {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_account_id")
  private long userAccountId;

  @Column(name="visible_column_json")
  private String visibleColumnJson;

  @Column(name="list_type")
  private String listType;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getVisibleColumnJson() {
    return this.visibleColumnJson;
  }

  public void setVisibleColumnJson(String visibleColumnJson) {
    this.visibleColumnJson = visibleColumnJson;
  }

  public String getListType() {
    return this.listType;
  }

  public void setListType(String listType) {
    this.listType = listType;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
