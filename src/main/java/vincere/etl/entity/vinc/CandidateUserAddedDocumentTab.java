package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="candidate_user_added_document_tab")
public class CandidateUserAddedDocumentTab {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="tab_title")
  private String tabTitle;

  @Column(name="candidate_id")
  private long candidateId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTabTitle() {
    return this.tabTitle;
  }

  public void setTabTitle(String tabTitle) {
    this.tabTitle = tabTitle;
  }

  public long getCandidateId() {
    return this.candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
