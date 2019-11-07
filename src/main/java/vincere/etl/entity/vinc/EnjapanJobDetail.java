package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="enjapan_job_detail")
public class EnjapanJobDetail {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="position_id")
  private long positionId;

  @Column(name="job_board_id")
  private long jobBoardId;

  @Column(name="work_status")
  private String workStatus;

  @Column(name="work_type")
  private String workType;

  @Column(name="work_language")
  private String workLanguage;

  @Column(name="work_consul_publish_flg")
  private String workConsulPublishFlg;

  @Column(name="work_highclass_publish_flg")
  private String workHighclassPublishFlg;

  @Column(name="work_executive_publish_flg")
  private String workExecutivePublishFlg;

  @Column(name="work_name")
  private String workName;

  @Column(name="work_catch_copy")
  private String workCatchCopy;

  @Column(name="work_background")
  private String workBackground;

  @Column(name="work_detail")
  private String workDetail;

  @Column(name="work_qualification")
  private String workQualification;

  @Column(name="work_age")
  private String workAge;

  @Column(name="work_age_reason")
  private String workAgeReason;

  @Column(name="work_experience")
  private String workExperience;

  @Column(name="work_points")
  private String workPoints;

  @Column(name="work_emp_form")
  private String workEmpForm;

  @Column(name="work_post")
  private String workPost;

  @Column(name="work_location")
  private String workLocation;

  @Column(name="work_time")
  private String workTime;

  @Column(name="work_wage")
  private String workWage;

  @Column(name="work_treatment")
  private String workTreatment;

  @Column(name="work_holiday")
  private String workHoliday;

  @Column(name="work_career_path")
  private String workCareerPath;

  @Column(name="com_sum_name")
  private String comSumName;

  @Column(name="com_sum_is_com_name_open")
  private String comSumIsComNameOpen;

  @Column(name="com_sum_establish")
  private String comSumEstablish;

  @Column(name="com_sum_capital")
  private String comSumCapital;

  @Column(name="com_sum_turnover")
  private String comSumTurnover;

  @Column(name="com_sum_employees")
  private String comSumEmployees;

  @Column(name="com_sum_feature")
  private String comSumFeature;

  @Column(name="work_job_type_id")
  private String workJobTypeId;

  @Column(name="work_biz_type_id01")
  private String workBizTypeId01;

  @Column(name="work_biz_type_id02")
  private String workBizTypeId02;

  @Column(name="work_biz_type_id03")
  private String workBizTypeId03;

  @Column(name="work_area_id_list")
  private String workAreaIdList;

  @Column(name="work_income_min")
  private String workIncomeMin;

  @Column(name="work_income_max")
  private String workIncomeMax;

  @Column(name="work_position10")
  private String workPosition10;

  @Column(name="work_position20")
  private String workPosition20;

  @Column(name="work_position30")
  private String workPosition30;

  @Column(name="work_position40")
  private String workPosition40;

  @Column(name="work_position50")
  private String workPosition50;

  @Column(name="work_position90")
  private String workPosition90;

  @Column(name="work_emp_type")
  private String workEmpType;

  @Column(name="work_req_english")
  private String workReqEnglish;

  @Column(name="work_job_change")
  private String workJobChange;

  @Column(name="work_age_min")
  private String workAgeMin;

  @Column(name="work_age_max")
  private String workAgeMax;

  @Column(name="work_school")
  private String workSchool;

  @Column(name="graduate_min_graduate")
  private double graduateMinGraduate;

  @Column(name="graduate_max_graduate")
  private double graduateMaxGraduate;

  @Column(name="graduate_min_university")
  private double graduateMinUniversity;

  @Column(name="graduate_max_university")
  private double graduateMaxUniversity;

  @Column(name="graduate_min_techcollege")
  private double graduateMinTechcollege;

  @Column(name="graduate_max_techcollege")
  private double graduateMaxTechcollege;

  @Column(name="graduate_min_juniorcollege")
  private double graduateMinJuniorcollege;

  @Column(name="graduate_max_juniorcollege")
  private double graduateMaxJuniorcollege;

  @Column(name="graduate_min_vocationalschool")
  private double graduateMinVocationalschool;

  @Column(name="graduate_max_vocationalschool")
  private double graduateMaxVocationalschool;

  @Column(name="graduate_min_highschool")
  private double graduateMinHighschool;

  @Column(name="graduate_max_highschool")
  private double graduateMaxHighschool;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public long getJobBoardId() {
    return this.jobBoardId;
  }

  public void setJobBoardId(long jobBoardId) {
    this.jobBoardId = jobBoardId;
  }

  public String getWorkStatus() {
    return this.workStatus;
  }

  public void setWorkStatus(String workStatus) {
    this.workStatus = workStatus;
  }

  public String getWorkType() {
    return this.workType;
  }

  public void setWorkType(String workType) {
    this.workType = workType;
  }

  public String getWorkLanguage() {
    return this.workLanguage;
  }

  public void setWorkLanguage(String workLanguage) {
    this.workLanguage = workLanguage;
  }

  public String getWorkConsulPublishFlg() {
    return this.workConsulPublishFlg;
  }

  public void setWorkConsulPublishFlg(String workConsulPublishFlg) {
    this.workConsulPublishFlg = workConsulPublishFlg;
  }

  public String getWorkHighclassPublishFlg() {
    return this.workHighclassPublishFlg;
  }

  public void setWorkHighclassPublishFlg(String workHighclassPublishFlg) {
    this.workHighclassPublishFlg = workHighclassPublishFlg;
  }

  public String getWorkExecutivePublishFlg() {
    return this.workExecutivePublishFlg;
  }

  public void setWorkExecutivePublishFlg(String workExecutivePublishFlg) {
    this.workExecutivePublishFlg = workExecutivePublishFlg;
  }

  public String getWorkName() {
    return this.workName;
  }

  public void setWorkName(String workName) {
    this.workName = workName;
  }

  public String getWorkCatchCopy() {
    return this.workCatchCopy;
  }

  public void setWorkCatchCopy(String workCatchCopy) {
    this.workCatchCopy = workCatchCopy;
  }

  public String getWorkBackground() {
    return this.workBackground;
  }

  public void setWorkBackground(String workBackground) {
    this.workBackground = workBackground;
  }

  public String getWorkDetail() {
    return this.workDetail;
  }

  public void setWorkDetail(String workDetail) {
    this.workDetail = workDetail;
  }

  public String getWorkQualification() {
    return this.workQualification;
  }

  public void setWorkQualification(String workQualification) {
    this.workQualification = workQualification;
  }

  public String getWorkAge() {
    return this.workAge;
  }

  public void setWorkAge(String workAge) {
    this.workAge = workAge;
  }

  public String getWorkAgeReason() {
    return this.workAgeReason;
  }

  public void setWorkAgeReason(String workAgeReason) {
    this.workAgeReason = workAgeReason;
  }

  public String getWorkExperience() {
    return this.workExperience;
  }

  public void setWorkExperience(String workExperience) {
    this.workExperience = workExperience;
  }

  public String getWorkPoints() {
    return this.workPoints;
  }

  public void setWorkPoints(String workPoints) {
    this.workPoints = workPoints;
  }

  public String getWorkEmpForm() {
    return this.workEmpForm;
  }

  public void setWorkEmpForm(String workEmpForm) {
    this.workEmpForm = workEmpForm;
  }

  public String getWorkPost() {
    return this.workPost;
  }

  public void setWorkPost(String workPost) {
    this.workPost = workPost;
  }

  public String getWorkLocation() {
    return this.workLocation;
  }

  public void setWorkLocation(String workLocation) {
    this.workLocation = workLocation;
  }

  public String getWorkTime() {
    return this.workTime;
  }

  public void setWorkTime(String workTime) {
    this.workTime = workTime;
  }

  public String getWorkWage() {
    return this.workWage;
  }

  public void setWorkWage(String workWage) {
    this.workWage = workWage;
  }

  public String getWorkTreatment() {
    return this.workTreatment;
  }

  public void setWorkTreatment(String workTreatment) {
    this.workTreatment = workTreatment;
  }

  public String getWorkHoliday() {
    return this.workHoliday;
  }

  public void setWorkHoliday(String workHoliday) {
    this.workHoliday = workHoliday;
  }

  public String getWorkCareerPath() {
    return this.workCareerPath;
  }

  public void setWorkCareerPath(String workCareerPath) {
    this.workCareerPath = workCareerPath;
  }

  public String getComSumName() {
    return this.comSumName;
  }

  public void setComSumName(String comSumName) {
    this.comSumName = comSumName;
  }

  public String getComSumIsComNameOpen() {
    return this.comSumIsComNameOpen;
  }

  public void setComSumIsComNameOpen(String comSumIsComNameOpen) {
    this.comSumIsComNameOpen = comSumIsComNameOpen;
  }

  public String getComSumEstablish() {
    return this.comSumEstablish;
  }

  public void setComSumEstablish(String comSumEstablish) {
    this.comSumEstablish = comSumEstablish;
  }

  public String getComSumCapital() {
    return this.comSumCapital;
  }

  public void setComSumCapital(String comSumCapital) {
    this.comSumCapital = comSumCapital;
  }

  public String getComSumTurnover() {
    return this.comSumTurnover;
  }

  public void setComSumTurnover(String comSumTurnover) {
    this.comSumTurnover = comSumTurnover;
  }

  public String getComSumEmployees() {
    return this.comSumEmployees;
  }

  public void setComSumEmployees(String comSumEmployees) {
    this.comSumEmployees = comSumEmployees;
  }

  public String getComSumFeature() {
    return this.comSumFeature;
  }

  public void setComSumFeature(String comSumFeature) {
    this.comSumFeature = comSumFeature;
  }

  public String getWorkJobTypeId() {
    return this.workJobTypeId;
  }

  public void setWorkJobTypeId(String workJobTypeId) {
    this.workJobTypeId = workJobTypeId;
  }

  public String getWorkBizTypeId01() {
    return this.workBizTypeId01;
  }

  public void setWorkBizTypeId01(String workBizTypeId01) {
    this.workBizTypeId01 = workBizTypeId01;
  }

  public String getWorkBizTypeId02() {
    return this.workBizTypeId02;
  }

  public void setWorkBizTypeId02(String workBizTypeId02) {
    this.workBizTypeId02 = workBizTypeId02;
  }

  public String getWorkBizTypeId03() {
    return this.workBizTypeId03;
  }

  public void setWorkBizTypeId03(String workBizTypeId03) {
    this.workBizTypeId03 = workBizTypeId03;
  }

  public String getWorkAreaIdList() {
    return this.workAreaIdList;
  }

  public void setWorkAreaIdList(String workAreaIdList) {
    this.workAreaIdList = workAreaIdList;
  }

  public String getWorkIncomeMin() {
    return this.workIncomeMin;
  }

  public void setWorkIncomeMin(String workIncomeMin) {
    this.workIncomeMin = workIncomeMin;
  }

  public String getWorkIncomeMax() {
    return this.workIncomeMax;
  }

  public void setWorkIncomeMax(String workIncomeMax) {
    this.workIncomeMax = workIncomeMax;
  }

  public String getWorkPosition10() {
    return this.workPosition10;
  }

  public void setWorkPosition10(String workPosition10) {
    this.workPosition10 = workPosition10;
  }

  public String getWorkPosition20() {
    return this.workPosition20;
  }

  public void setWorkPosition20(String workPosition20) {
    this.workPosition20 = workPosition20;
  }

  public String getWorkPosition30() {
    return this.workPosition30;
  }

  public void setWorkPosition30(String workPosition30) {
    this.workPosition30 = workPosition30;
  }

  public String getWorkPosition40() {
    return this.workPosition40;
  }

  public void setWorkPosition40(String workPosition40) {
    this.workPosition40 = workPosition40;
  }

  public String getWorkPosition50() {
    return this.workPosition50;
  }

  public void setWorkPosition50(String workPosition50) {
    this.workPosition50 = workPosition50;
  }

  public String getWorkPosition90() {
    return this.workPosition90;
  }

  public void setWorkPosition90(String workPosition90) {
    this.workPosition90 = workPosition90;
  }

  public String getWorkEmpType() {
    return this.workEmpType;
  }

  public void setWorkEmpType(String workEmpType) {
    this.workEmpType = workEmpType;
  }

  public String getWorkReqEnglish() {
    return this.workReqEnglish;
  }

  public void setWorkReqEnglish(String workReqEnglish) {
    this.workReqEnglish = workReqEnglish;
  }

  public String getWorkJobChange() {
    return this.workJobChange;
  }

  public void setWorkJobChange(String workJobChange) {
    this.workJobChange = workJobChange;
  }

  public String getWorkAgeMin() {
    return this.workAgeMin;
  }

  public void setWorkAgeMin(String workAgeMin) {
    this.workAgeMin = workAgeMin;
  }

  public String getWorkAgeMax() {
    return this.workAgeMax;
  }

  public void setWorkAgeMax(String workAgeMax) {
    this.workAgeMax = workAgeMax;
  }

  public String getWorkSchool() {
    return this.workSchool;
  }

  public void setWorkSchool(String workSchool) {
    this.workSchool = workSchool;
  }

  public double getGraduateMinGraduate() {
    return this.graduateMinGraduate;
  }

  public void setGraduateMinGraduate(double graduateMinGraduate) {
    this.graduateMinGraduate = graduateMinGraduate;
  }

  public double getGraduateMaxGraduate() {
    return this.graduateMaxGraduate;
  }

  public void setGraduateMaxGraduate(double graduateMaxGraduate) {
    this.graduateMaxGraduate = graduateMaxGraduate;
  }

  public double getGraduateMinUniversity() {
    return this.graduateMinUniversity;
  }

  public void setGraduateMinUniversity(double graduateMinUniversity) {
    this.graduateMinUniversity = graduateMinUniversity;
  }

  public double getGraduateMaxUniversity() {
    return this.graduateMaxUniversity;
  }

  public void setGraduateMaxUniversity(double graduateMaxUniversity) {
    this.graduateMaxUniversity = graduateMaxUniversity;
  }

  public double getGraduateMinTechcollege() {
    return this.graduateMinTechcollege;
  }

  public void setGraduateMinTechcollege(double graduateMinTechcollege) {
    this.graduateMinTechcollege = graduateMinTechcollege;
  }

  public double getGraduateMaxTechcollege() {
    return this.graduateMaxTechcollege;
  }

  public void setGraduateMaxTechcollege(double graduateMaxTechcollege) {
    this.graduateMaxTechcollege = graduateMaxTechcollege;
  }

  public double getGraduateMinJuniorcollege() {
    return this.graduateMinJuniorcollege;
  }

  public void setGraduateMinJuniorcollege(double graduateMinJuniorcollege) {
    this.graduateMinJuniorcollege = graduateMinJuniorcollege;
  }

  public double getGraduateMaxJuniorcollege() {
    return this.graduateMaxJuniorcollege;
  }

  public void setGraduateMaxJuniorcollege(double graduateMaxJuniorcollege) {
    this.graduateMaxJuniorcollege = graduateMaxJuniorcollege;
  }

  public double getGraduateMinVocationalschool() {
    return this.graduateMinVocationalschool;
  }

  public void setGraduateMinVocationalschool(double graduateMinVocationalschool) {
    this.graduateMinVocationalschool = graduateMinVocationalschool;
  }

  public double getGraduateMaxVocationalschool() {
    return this.graduateMaxVocationalschool;
  }

  public void setGraduateMaxVocationalschool(double graduateMaxVocationalschool) {
    this.graduateMaxVocationalschool = graduateMaxVocationalschool;
  }

  public double getGraduateMinHighschool() {
    return this.graduateMinHighschool;
  }

  public void setGraduateMinHighschool(double graduateMinHighschool) {
    this.graduateMinHighschool = graduateMinHighschool;
  }

  public double getGraduateMaxHighschool() {
    return this.graduateMaxHighschool;
  }

  public void setGraduateMaxHighschool(double graduateMaxHighschool) {
    this.graduateMaxHighschool = graduateMaxHighschool;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
