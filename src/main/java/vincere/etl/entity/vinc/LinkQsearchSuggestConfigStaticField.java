package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="link_qsearch_suggest_config_static_field")
public class LinkQsearchSuggestConfigStaticField {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="quick_search_suggestion_visual_search_filter_key")
  private String quickSearchSuggestionVisualSearchFilterKey;

  @Column(name="configurable_form_static_field_field_id")
  private String configurableFormStaticFieldFieldId;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getQuickSearchSuggestionVisualSearchFilterKey() {
    return this.quickSearchSuggestionVisualSearchFilterKey;
  }

  public void setQuickSearchSuggestionVisualSearchFilterKey(String quickSearchSuggestionVisualSearchFilterKey) {
    this.quickSearchSuggestionVisualSearchFilterKey = quickSearchSuggestionVisualSearchFilterKey;
  }

  public String getConfigurableFormStaticFieldFieldId() {
    return this.configurableFormStaticFieldFieldId;
  }

  public void setConfigurableFormStaticFieldFieldId(String configurableFormStaticFieldFieldId) {
    this.configurableFormStaticFieldFieldId = configurableFormStaticFieldFieldId;
  }
}
