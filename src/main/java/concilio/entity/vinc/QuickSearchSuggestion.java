package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quick_search_suggestion")
public class QuickSearchSuggestion {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="category")
  private String category;

  @Column(name="solr_field")
  private String solrField;

  @Column(name="keyword_resource_key")
  private String keywordResourceKey;

  @Column(name="keyword_description")
  private String keywordDescription;

  @Column(name="keyword_type")
  private String keywordType;

  @Column(name="action_method")
  private String actionMethod;

  @Column(name="action_method_param")
  private String actionMethodParam;

  @Column(name="basic")
  private long basic;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;

  @Column(name="suggest_type")
  private long suggestType;

  @Column(name="sort_number")
  private long sortNumber;

  @Column(name="visual_search_filter_key")
  private String visualSearchFilterKey;

  @Column(name="action_method_param_type")
  private long actionMethodParamType;

  @Column(name="hide")
  private String hide;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSolrField() {
    return this.solrField;
  }

  public void setSolrField(String solrField) {
    this.solrField = solrField;
  }

  public String getKeywordResourceKey() {
    return this.keywordResourceKey;
  }

  public void setKeywordResourceKey(String keywordResourceKey) {
    this.keywordResourceKey = keywordResourceKey;
  }

  public String getKeywordDescription() {
    return this.keywordDescription;
  }

  public void setKeywordDescription(String keywordDescription) {
    this.keywordDescription = keywordDescription;
  }

  public String getKeywordType() {
    return this.keywordType;
  }

  public void setKeywordType(String keywordType) {
    this.keywordType = keywordType;
  }

  public String getActionMethod() {
    return this.actionMethod;
  }

  public void setActionMethod(String actionMethod) {
    this.actionMethod = actionMethod;
  }

  public String getActionMethodParam() {
    return this.actionMethodParam;
  }

  public void setActionMethodParam(String actionMethodParam) {
    this.actionMethodParam = actionMethodParam;
  }

  public long getBasic() {
    return this.basic;
  }

  public void setBasic(long basic) {
    this.basic = basic;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }

  public long getSuggestType() {
    return this.suggestType;
  }

  public void setSuggestType(long suggestType) {
    this.suggestType = suggestType;
  }

  public long getSortNumber() {
    return this.sortNumber;
  }

  public void setSortNumber(long sortNumber) {
    this.sortNumber = sortNumber;
  }

  public String getVisualSearchFilterKey() {
    return this.visualSearchFilterKey;
  }

  public void setVisualSearchFilterKey(String visualSearchFilterKey) {
    this.visualSearchFilterKey = visualSearchFilterKey;
  }

  public long getActionMethodParamType() {
    return this.actionMethodParamType;
  }

  public void setActionMethodParamType(long actionMethodParamType) {
    this.actionMethodParamType = actionMethodParamType;
  }

  public String getHide() {
    return this.hide;
  }

  public void setHide(String hide) {
    this.hide = hide;
  }
}
