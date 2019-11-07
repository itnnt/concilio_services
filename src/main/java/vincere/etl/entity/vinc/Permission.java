package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="permission")
public class Permission {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="permission_key")
  private String permissionKey;

  @Column(name="name")
  private String name;

  @Column(name="internal_staff_grouping")
  private String internalStaffGrouping;

  @Column(name="external_staff_grouping")
  private String externalStaffGrouping;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="index")
  private long index;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPermissionKey() {
    return this.permissionKey;
  }

  public void setPermissionKey(String permissionKey) {
    this.permissionKey = permissionKey;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getInternalStaffGrouping() {
    return this.internalStaffGrouping;
  }

  public void setInternalStaffGrouping(String internalStaffGrouping) {
    this.internalStaffGrouping = internalStaffGrouping;
  }

  public String getExternalStaffGrouping() {
    return this.externalStaffGrouping;
  }

  public void setExternalStaffGrouping(String externalStaffGrouping) {
    this.externalStaffGrouping = externalStaffGrouping;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getIndex() {
    return this.index;
  }

  public void setIndex(long index) {
    this.index = index;
  }
}
