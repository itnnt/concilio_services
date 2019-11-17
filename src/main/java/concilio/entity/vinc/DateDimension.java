package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="date_dimension")
public class DateDimension {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="full_date")
  private java.sql.Date fullDate;

  @Column(name="full_text_description")
  private String fullTextDescription;

  @Column(name="day_of_week")
  private long dayOfWeek;

  @Column(name="day_of_month")
  private long dayOfMonth;

  @Column(name="day_of_quarter")
  private long dayOfQuarter;

  @Column(name="day_of_year")
  private long dayOfYear;

  @Column(name="month")
  private long month;

  @Column(name="quarter")
  private long quarter;

  @Column(name="year")
  private long year;

  @Column(name="week_of_year")
  private long weekOfYear;

  @Column(name="week_of_month")
  private long weekOfMonth;

  @Column(name="days_since1_jan1970")
  private long daysSince1Jan1970;

  @Column(name="year_month_day")
  private String yearMonthDay;

  @Column(name="year_month")
  private String yearMonth;

  @Column(name="year_week_of_year")
  private String yearWeekOfYear;

  @Column(name="year_quarter")
  private String yearQuarter;

  @Column(name="public_holiday")
  private long publicHoliday;

  @Column(name="working_day")
  private long workingDay;

  @Column(name="week_day")
  private long weekDay;

  @Column(name="null_date")
  private long nullDate;

  @Column(name="max_days_in_week")
  private long maxDaysInWeek;

  @Column(name="max_days_in_month")
  private long maxDaysInMonth;

  @Column(name="max_days_in_quarter")
  private long maxDaysInQuarter;

  @Column(name="max_days_in_year")
  private long maxDaysInYear;

  @Column(name="max_working_days_in_week")
  private long maxWorkingDaysInWeek;

  @Column(name="max_working_days_in_month")
  private long maxWorkingDaysInMonth;

  @Column(name="max_working_days_in_quarter")
  private long maxWorkingDaysInQuarter;

  @Column(name="max_working_days_in_year")
  private long maxWorkingDaysInYear;

  @Column(name="working_day_of_week")
  private long workingDayOfWeek;

  @Column(name="working_day_of_month")
  private long workingDayOfMonth;

  @Column(name="working_day_of_quarter")
  private long workingDayOfQuarter;

  @Column(name="working_day_of_year")
  private long workingDayOfYear;

  @Column(name="working_days_since1_jan1970")
  private long workingDaysSince1Jan1970;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public java.sql.Date getFullDate() {
    return this.fullDate;
  }

  public void setFullDate(java.sql.Date fullDate) {
    this.fullDate = fullDate;
  }

  public String getFullTextDescription() {
    return this.fullTextDescription;
  }

  public void setFullTextDescription(String fullTextDescription) {
    this.fullTextDescription = fullTextDescription;
  }

  public long getDayOfWeek() {
    return this.dayOfWeek;
  }

  public void setDayOfWeek(long dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public long getDayOfMonth() {
    return this.dayOfMonth;
  }

  public void setDayOfMonth(long dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  public long getDayOfQuarter() {
    return this.dayOfQuarter;
  }

  public void setDayOfQuarter(long dayOfQuarter) {
    this.dayOfQuarter = dayOfQuarter;
  }

  public long getDayOfYear() {
    return this.dayOfYear;
  }

  public void setDayOfYear(long dayOfYear) {
    this.dayOfYear = dayOfYear;
  }

  public long getMonth() {
    return this.month;
  }

  public void setMonth(long month) {
    this.month = month;
  }

  public long getQuarter() {
    return this.quarter;
  }

  public void setQuarter(long quarter) {
    this.quarter = quarter;
  }

  public long getYear() {
    return this.year;
  }

  public void setYear(long year) {
    this.year = year;
  }

  public long getWeekOfYear() {
    return this.weekOfYear;
  }

  public void setWeekOfYear(long weekOfYear) {
    this.weekOfYear = weekOfYear;
  }

  public long getWeekOfMonth() {
    return this.weekOfMonth;
  }

  public void setWeekOfMonth(long weekOfMonth) {
    this.weekOfMonth = weekOfMonth;
  }

  public long getDaysSince1Jan1970() {
    return this.daysSince1Jan1970;
  }

  public void setDaysSince1Jan1970(long daysSince1Jan1970) {
    this.daysSince1Jan1970 = daysSince1Jan1970;
  }

  public String getYearMonthDay() {
    return this.yearMonthDay;
  }

  public void setYearMonthDay(String yearMonthDay) {
    this.yearMonthDay = yearMonthDay;
  }

  public String getYearMonth() {
    return this.yearMonth;
  }

  public void setYearMonth(String yearMonth) {
    this.yearMonth = yearMonth;
  }

  public String getYearWeekOfYear() {
    return this.yearWeekOfYear;
  }

  public void setYearWeekOfYear(String yearWeekOfYear) {
    this.yearWeekOfYear = yearWeekOfYear;
  }

  public String getYearQuarter() {
    return this.yearQuarter;
  }

  public void setYearQuarter(String yearQuarter) {
    this.yearQuarter = yearQuarter;
  }

  public long getPublicHoliday() {
    return this.publicHoliday;
  }

  public void setPublicHoliday(long publicHoliday) {
    this.publicHoliday = publicHoliday;
  }

  public long getWorkingDay() {
    return this.workingDay;
  }

  public void setWorkingDay(long workingDay) {
    this.workingDay = workingDay;
  }

  public long getWeekDay() {
    return this.weekDay;
  }

  public void setWeekDay(long weekDay) {
    this.weekDay = weekDay;
  }

  public long getNullDate() {
    return this.nullDate;
  }

  public void setNullDate(long nullDate) {
    this.nullDate = nullDate;
  }

  public long getMaxDaysInWeek() {
    return this.maxDaysInWeek;
  }

  public void setMaxDaysInWeek(long maxDaysInWeek) {
    this.maxDaysInWeek = maxDaysInWeek;
  }

  public long getMaxDaysInMonth() {
    return this.maxDaysInMonth;
  }

  public void setMaxDaysInMonth(long maxDaysInMonth) {
    this.maxDaysInMonth = maxDaysInMonth;
  }

  public long getMaxDaysInQuarter() {
    return this.maxDaysInQuarter;
  }

  public void setMaxDaysInQuarter(long maxDaysInQuarter) {
    this.maxDaysInQuarter = maxDaysInQuarter;
  }

  public long getMaxDaysInYear() {
    return this.maxDaysInYear;
  }

  public void setMaxDaysInYear(long maxDaysInYear) {
    this.maxDaysInYear = maxDaysInYear;
  }

  public long getMaxWorkingDaysInWeek() {
    return this.maxWorkingDaysInWeek;
  }

  public void setMaxWorkingDaysInWeek(long maxWorkingDaysInWeek) {
    this.maxWorkingDaysInWeek = maxWorkingDaysInWeek;
  }

  public long getMaxWorkingDaysInMonth() {
    return this.maxWorkingDaysInMonth;
  }

  public void setMaxWorkingDaysInMonth(long maxWorkingDaysInMonth) {
    this.maxWorkingDaysInMonth = maxWorkingDaysInMonth;
  }

  public long getMaxWorkingDaysInQuarter() {
    return this.maxWorkingDaysInQuarter;
  }

  public void setMaxWorkingDaysInQuarter(long maxWorkingDaysInQuarter) {
    this.maxWorkingDaysInQuarter = maxWorkingDaysInQuarter;
  }

  public long getMaxWorkingDaysInYear() {
    return this.maxWorkingDaysInYear;
  }

  public void setMaxWorkingDaysInYear(long maxWorkingDaysInYear) {
    this.maxWorkingDaysInYear = maxWorkingDaysInYear;
  }

  public long getWorkingDayOfWeek() {
    return this.workingDayOfWeek;
  }

  public void setWorkingDayOfWeek(long workingDayOfWeek) {
    this.workingDayOfWeek = workingDayOfWeek;
  }

  public long getWorkingDayOfMonth() {
    return this.workingDayOfMonth;
  }

  public void setWorkingDayOfMonth(long workingDayOfMonth) {
    this.workingDayOfMonth = workingDayOfMonth;
  }

  public long getWorkingDayOfQuarter() {
    return this.workingDayOfQuarter;
  }

  public void setWorkingDayOfQuarter(long workingDayOfQuarter) {
    this.workingDayOfQuarter = workingDayOfQuarter;
  }

  public long getWorkingDayOfYear() {
    return this.workingDayOfYear;
  }

  public void setWorkingDayOfYear(long workingDayOfYear) {
    this.workingDayOfYear = workingDayOfYear;
  }

  public long getWorkingDaysSince1Jan1970() {
    return this.workingDaysSince1Jan1970;
  }

  public void setWorkingDaysSince1Jan1970(long workingDaysSince1Jan1970) {
    this.workingDaysSince1Jan1970 = workingDaysSince1Jan1970;
  }
}
