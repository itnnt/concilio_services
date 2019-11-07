package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="system_mail")
public class SystemMail {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="system_mail_type")
  private long systemMailType;

  @Column(name="display_name")
  private String displayName;

  @Column(name="email_address")
  private String emailAddress;

  @Column(name="email_password")
  private String emailPassword;

  @Column(name="email_password_mask")
  private String emailPasswordMask;

  @Column(name="email_host")
  private String emailHost;

  @Column(name="email_port")
  private String emailPort;

  @Column(name="email_support_type")
  private String emailSupportType;

  @Column(name="exchange_version")
  private long exchangeVersion;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="email_host_out")
  private String emailHostOut;

  @Column(name="email_port_out")
  private String emailPortOut;

  @Column(name="ssl_tls")
  private long sslTls;

  @Column(name="authentication")
  private long authentication;

  @Column(name="email_signature")
  private String emailSignature;

  @Column(name="email_connected")
  private long emailConnected;

  @Column(name="outgoing_authentication")
  private long outgoingAuthentication;

  @Column(name="outgoing_encrypt_type")
  private long outgoingEncryptType;

  @Column(name="outgoing_email_user_name")
  private String outgoingEmailUserName;

  @Column(name="outgoing_email_password")
  private String outgoingEmailPassword;

  @Column(name="incoming_email_user_name")
  private String incomingEmailUserName;

  @Column(name="exchange_host")
  private String exchangeHost;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSystemMailType() {
    return this.systemMailType;
  }

  public void setSystemMailType(long systemMailType) {
    this.systemMailType = systemMailType;
  }

  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getEmailAddress() {
    return this.emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getEmailPassword() {
    return this.emailPassword;
  }

  public void setEmailPassword(String emailPassword) {
    this.emailPassword = emailPassword;
  }

  public String getEmailPasswordMask() {
    return this.emailPasswordMask;
  }

  public void setEmailPasswordMask(String emailPasswordMask) {
    this.emailPasswordMask = emailPasswordMask;
  }

  public String getEmailHost() {
    return this.emailHost;
  }

  public void setEmailHost(String emailHost) {
    this.emailHost = emailHost;
  }

  public String getEmailPort() {
    return this.emailPort;
  }

  public void setEmailPort(String emailPort) {
    this.emailPort = emailPort;
  }

  public String getEmailSupportType() {
    return this.emailSupportType;
  }

  public void setEmailSupportType(String emailSupportType) {
    this.emailSupportType = emailSupportType;
  }

  public long getExchangeVersion() {
    return this.exchangeVersion;
  }

  public void setExchangeVersion(long exchangeVersion) {
    this.exchangeVersion = exchangeVersion;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public String getEmailHostOut() {
    return this.emailHostOut;
  }

  public void setEmailHostOut(String emailHostOut) {
    this.emailHostOut = emailHostOut;
  }

  public String getEmailPortOut() {
    return this.emailPortOut;
  }

  public void setEmailPortOut(String emailPortOut) {
    this.emailPortOut = emailPortOut;
  }

  public long getSslTls() {
    return this.sslTls;
  }

  public void setSslTls(long sslTls) {
    this.sslTls = sslTls;
  }

  public long getAuthentication() {
    return this.authentication;
  }

  public void setAuthentication(long authentication) {
    this.authentication = authentication;
  }

  public String getEmailSignature() {
    return this.emailSignature;
  }

  public void setEmailSignature(String emailSignature) {
    this.emailSignature = emailSignature;
  }

  public long getEmailConnected() {
    return this.emailConnected;
  }

  public void setEmailConnected(long emailConnected) {
    this.emailConnected = emailConnected;
  }

  public long getOutgoingAuthentication() {
    return this.outgoingAuthentication;
  }

  public void setOutgoingAuthentication(long outgoingAuthentication) {
    this.outgoingAuthentication = outgoingAuthentication;
  }

  public long getOutgoingEncryptType() {
    return this.outgoingEncryptType;
  }

  public void setOutgoingEncryptType(long outgoingEncryptType) {
    this.outgoingEncryptType = outgoingEncryptType;
  }

  public String getOutgoingEmailUserName() {
    return this.outgoingEmailUserName;
  }

  public void setOutgoingEmailUserName(String outgoingEmailUserName) {
    this.outgoingEmailUserName = outgoingEmailUserName;
  }

  public String getOutgoingEmailPassword() {
    return this.outgoingEmailPassword;
  }

  public void setOutgoingEmailPassword(String outgoingEmailPassword) {
    this.outgoingEmailPassword = outgoingEmailPassword;
  }

  public String getIncomingEmailUserName() {
    return this.incomingEmailUserName;
  }

  public void setIncomingEmailUserName(String incomingEmailUserName) {
    this.incomingEmailUserName = incomingEmailUserName;
  }

  public String getExchangeHost() {
    return this.exchangeHost;
  }

  public void setExchangeHost(String exchangeHost) {
    this.exchangeHost = exchangeHost;
  }
}
