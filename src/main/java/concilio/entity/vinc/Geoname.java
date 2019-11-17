package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="geoname")
public class Geoname {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="standard_name")
  private String standardName;

  @Column(name="name")
  private String name;

  @Column(name="latitude")
  private double latitude;

  @Column(name="longitude")
  private double longitude;

  @Column(name="fclass")
  private String fclass;

  @Column(name="fcode")
  private String fcode;

  @Column(name="country")
  private String country;

  @Column(name="cc2")
  private String cc2;

  @Column(name="admin1")
  private String admin1;

  @Column(name="admin2")
  private String admin2;

  @Column(name="admin3")
  private String admin3;

  @Column(name="admin4")
  private String admin4;

  @Column(name="population")
  private long population;

  @Column(name="elevation")
  private long elevation;

  @Column(name="gtopo30")
  private long gtopo30;

  @Column(name="timezone")
  private String timezone;

  @Column(name="moddate")
  private java.sql.Date moddate;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getStandardName() {
    return this.standardName;
  }

  public void setStandardName(String standardName) {
    this.standardName = standardName;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getLatitude() {
    return this.latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return this.longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public String getFclass() {
    return this.fclass;
  }

  public void setFclass(String fclass) {
    this.fclass = fclass;
  }

  public String getFcode() {
    return this.fcode;
  }

  public void setFcode(String fcode) {
    this.fcode = fcode;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCc2() {
    return this.cc2;
  }

  public void setCc2(String cc2) {
    this.cc2 = cc2;
  }

  public String getAdmin1() {
    return this.admin1;
  }

  public void setAdmin1(String admin1) {
    this.admin1 = admin1;
  }

  public String getAdmin2() {
    return this.admin2;
  }

  public void setAdmin2(String admin2) {
    this.admin2 = admin2;
  }

  public String getAdmin3() {
    return this.admin3;
  }

  public void setAdmin3(String admin3) {
    this.admin3 = admin3;
  }

  public String getAdmin4() {
    return this.admin4;
  }

  public void setAdmin4(String admin4) {
    this.admin4 = admin4;
  }

  public long getPopulation() {
    return this.population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

  public long getElevation() {
    return this.elevation;
  }

  public void setElevation(long elevation) {
    this.elevation = elevation;
  }

  public long getGtopo30() {
    return this.gtopo30;
  }

  public void setGtopo30(long gtopo30) {
    this.gtopo30 = gtopo30;
  }

  public String getTimezone() {
    return this.timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public java.sql.Date getModdate() {
    return this.moddate;
  }

  public void setModdate(java.sql.Date moddate) {
    this.moddate = moddate;
  }
}
