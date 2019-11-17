package concilio.entity.vinc;


import javax.persistence.*;
import java.io.Serializable;

class SocialnetworkUserconnectionId implements Serializable {
  private String userid;
  private String providerid;
  private String provideruserid;

}

@Entity
@Table(name="socialnetwork_userconnection")
@IdClass(SocialnetworkUserconnectionId.class)
public class SocialnetworkUserconnection {


  @Id
  @Column(name="userid")
  private String userid;

  @Id
  @Column(name="providerid")
  private String providerid;

  @Id
  @Column(name="provideruserid")
  private String provideruserid;

  @Column(name="rank")
  private long rank;

  @Column(name="displayname")
  private String displayname;

  @Column(name="profileurl")
  private String profileurl;

  @Column(name="imageurl")
  private String imageurl;

  @Column(name="accesstoken")
  private String accesstoken;

  @Column(name="secret")
  private String secret;

  @Column(name="refreshtoken")
  private String refreshtoken;

  @Column(name="expiretime")
  private long expiretime;


  public String getUserid() {
    return this.userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public String getProviderid() {
    return this.providerid;
  }

  public void setProviderid(String providerid) {
    this.providerid = providerid;
  }

  public String getProvideruserid() {
    return this.provideruserid;
  }

  public void setProvideruserid(String provideruserid) {
    this.provideruserid = provideruserid;
  }

  public long getRank() {
    return this.rank;
  }

  public void setRank(long rank) {
    this.rank = rank;
  }

  public String getDisplayname() {
    return this.displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public String getProfileurl() {
    return this.profileurl;
  }

  public void setProfileurl(String profileurl) {
    this.profileurl = profileurl;
  }

  public String getImageurl() {
    return this.imageurl;
  }

  public void setImageurl(String imageurl) {
    this.imageurl = imageurl;
  }

  public String getAccesstoken() {
    return this.accesstoken;
  }

  public void setAccesstoken(String accesstoken) {
    this.accesstoken = accesstoken;
  }

  public String getSecret() {
    return this.secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public String getRefreshtoken() {
    return this.refreshtoken;
  }

  public void setRefreshtoken(String refreshtoken) {
    this.refreshtoken = refreshtoken;
  }

  public long getExpiretime() {
    return this.expiretime;
  }

  public void setExpiretime(long expiretime) {
    this.expiretime = expiretime;
  }
}
