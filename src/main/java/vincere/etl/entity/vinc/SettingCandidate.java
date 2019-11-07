package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="setting_candidate")
public class SettingCandidate {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="logo")
  private String logo;

  @Column(name="real_logo")
  private String realLogo;

  @Column(name="from_color")
  private String fromColor;

  @Column(name="to_color")
  private String toColor;

  @Column(name="text_color")
  private String textColor;

  @Column(name="twitter_user_name")
  private String twitterUserName;

  @Column(name="twitter_password")
  private String twitterPassword;

  @Column(name="linkedin_url")
  private String linkedinUrl;

  @Column(name="facebook_url")
  private String facebookUrl;

  @Column(name="user_guide")
  private String userGuide;

  @Column(name="real_user_guide")
  private String realUserGuide;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLogo() {
    return this.logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public String getRealLogo() {
    return this.realLogo;
  }

  public void setRealLogo(String realLogo) {
    this.realLogo = realLogo;
  }

  public String getFromColor() {
    return this.fromColor;
  }

  public void setFromColor(String fromColor) {
    this.fromColor = fromColor;
  }

  public String getToColor() {
    return this.toColor;
  }

  public void setToColor(String toColor) {
    this.toColor = toColor;
  }

  public String getTextColor() {
    return this.textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public String getTwitterUserName() {
    return this.twitterUserName;
  }

  public void setTwitterUserName(String twitterUserName) {
    this.twitterUserName = twitterUserName;
  }

  public String getTwitterPassword() {
    return this.twitterPassword;
  }

  public void setTwitterPassword(String twitterPassword) {
    this.twitterPassword = twitterPassword;
  }

  public String getLinkedinUrl() {
    return this.linkedinUrl;
  }

  public void setLinkedinUrl(String linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
  }

  public String getFacebookUrl() {
    return this.facebookUrl;
  }

  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  public String getUserGuide() {
    return this.userGuide;
  }

  public void setUserGuide(String userGuide) {
    this.userGuide = userGuide;
  }

  public String getRealUserGuide() {
    return this.realUserGuide;
  }

  public void setRealUserGuide(String realUserGuide) {
    this.realUserGuide = realUserGuide;
  }
}
