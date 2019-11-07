package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="external_export_job")
public class ExternalExportJob {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="user_id")
  private long userId;

  @Column(name="client_request_ip")
  private String clientRequestIp;

  @Column(name="app_id")
  private long appId;

  @Column(name="total_record")
  private long totalRecord;

  @Column(name="total_finished")
  private long totalFinished;

  @Column(name="num_success")
  private long numSuccess;

  @Column(name="num_failure")
  private long numFailure;

  @Column(name="has_send_notify_email")
  private long hasSendNotifyEmail;

  @Column(name="email_sent")
  private long emailSent;

  @Column(name="status")
  private String status;

  @Column(name="external_request_id")
  private String externalRequestId;

  @Column(name="detail")
  private String detail;

  @Column(name="s3_export_log_url")
  private String s3ExportLogUrl;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getClientRequestIp() {
    return this.clientRequestIp;
  }

  public void setClientRequestIp(String clientRequestIp) {
    this.clientRequestIp = clientRequestIp;
  }

  public long getAppId() {
    return this.appId;
  }

  public void setAppId(long appId) {
    this.appId = appId;
  }

  public long getTotalRecord() {
    return this.totalRecord;
  }

  public void setTotalRecord(long totalRecord) {
    this.totalRecord = totalRecord;
  }

  public long getTotalFinished() {
    return this.totalFinished;
  }

  public void setTotalFinished(long totalFinished) {
    this.totalFinished = totalFinished;
  }

  public long getNumSuccess() {
    return this.numSuccess;
  }

  public void setNumSuccess(long numSuccess) {
    this.numSuccess = numSuccess;
  }

  public long getNumFailure() {
    return this.numFailure;
  }

  public void setNumFailure(long numFailure) {
    this.numFailure = numFailure;
  }

  public long getHasSendNotifyEmail() {
    return this.hasSendNotifyEmail;
  }

  public void setHasSendNotifyEmail(long hasSendNotifyEmail) {
    this.hasSendNotifyEmail = hasSendNotifyEmail;
  }

  public long getEmailSent() {
    return this.emailSent;
  }

  public void setEmailSent(long emailSent) {
    this.emailSent = emailSent;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getExternalRequestId() {
    return this.externalRequestId;
  }

  public void setExternalRequestId(String externalRequestId) {
    this.externalRequestId = externalRequestId;
  }

  public String getDetail() {
    return this.detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public String getS3ExportLogUrl() {
    return this.s3ExportLogUrl;
  }

  public void setS3ExportLogUrl(String s3ExportLogUrl) {
    this.s3ExportLogUrl = s3ExportLogUrl;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
