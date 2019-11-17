package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_education")
public class CandidateEducation {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="education_id")
  private long educationId;

  @Column(name="qualification")
  private String qualification;

  @Column(name="school_name")
  private String schoolName;

  @Column(name="degree_name")
  private String degreeName;

  @Column(name="major")
  private String major;

  @Column(name="minor")
  private String minor;

  @Column(name="start_date")
  private java.sql.Timestamp startDate;

  @Column(name="graduation_date")
  private java.sql.Timestamp graduationDate;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="gpa")
  private double gpa;


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

  public long getEducationId() {
    return this.educationId;
  }

  public void setEducationId(long educationId) {
    this.educationId = educationId;
  }

  public String getQualification() {
    return this.qualification;
  }

  public void setQualification(String qualification) {
    this.qualification = qualification;
  }

  public String getSchoolName() {
    return this.schoolName;
  }

  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }

  public String getDegreeName() {
    return this.degreeName;
  }

  public void setDegreeName(String degreeName) {
    this.degreeName = degreeName;
  }

  public String getMajor() {
    return this.major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public String getMinor() {
    return this.minor;
  }

  public void setMinor(String minor) {
    this.minor = minor;
  }

  public java.sql.Timestamp getStartDate() {
    return this.startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }

  public java.sql.Timestamp getGraduationDate() {
    return this.graduationDate;
  }

  public void setGraduationDate(java.sql.Timestamp graduationDate) {
    this.graduationDate = graduationDate;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public double getGpa() {
    return this.gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }
}
