package vincere.etl.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class MessageResourceId implements Serializable {
  private String code;
  private String locale;

}
@Entity
@Table(name="message_resource")
@IdClass(MessageResourceId.class)
public class MessageResource {


  @Id
  @Column(name="code")
  private String code;

  @Id
  @Column(name="locale")
  private String locale;

  @Column(name="msg")
  private String msg;

  @Column(name="group_code")
  private String groupCode;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getLocale() {
    return this.locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public String getMsg() {
    return this.msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public String getGroupCode() {
    return this.groupCode;
  }

  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
