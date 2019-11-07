package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="equest_posting_board")
public class EquestPostingBoard {


  @Id
  @Column(name="id")
  private long id;

  @Column(name="job_detail_id")
  private long jobDetailId;

  @Column(name="position_id")
  private long positionId;

  @Column(name="requisition_number")
  private String requisitionNumber;

  @Column(name="board_id")
  private long boardId;

  @Column(name="board_name")
  private String boardName;

  @Column(name="board_expired")
  private long boardExpired;

  @Column(name="board_start_date")
  private String boardStartDate;

  @Column(name="board_pipeline_id")
  private String boardPipelineId;

  @Column(name="insert_timestamp")
  private java.sql.Timestamp insertTimestamp;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getJobDetailId() {
    return this.jobDetailId;
  }

  public void setJobDetailId(long jobDetailId) {
    this.jobDetailId = jobDetailId;
  }

  public long getPositionId() {
    return this.positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public String getRequisitionNumber() {
    return this.requisitionNumber;
  }

  public void setRequisitionNumber(String requisitionNumber) {
    this.requisitionNumber = requisitionNumber;
  }

  public long getBoardId() {
    return this.boardId;
  }

  public void setBoardId(long boardId) {
    this.boardId = boardId;
  }

  public String getBoardName() {
    return this.boardName;
  }

  public void setBoardName(String boardName) {
    this.boardName = boardName;
  }

  public long getBoardExpired() {
    return this.boardExpired;
  }

  public void setBoardExpired(long boardExpired) {
    this.boardExpired = boardExpired;
  }

  public String getBoardStartDate() {
    return this.boardStartDate;
  }

  public void setBoardStartDate(String boardStartDate) {
    this.boardStartDate = boardStartDate;
  }

  public String getBoardPipelineId() {
    return this.boardPipelineId;
  }

  public void setBoardPipelineId(String boardPipelineId) {
    this.boardPipelineId = boardPipelineId;
  }

  public java.sql.Timestamp getInsertTimestamp() {
    return this.insertTimestamp;
  }

  public void setInsertTimestamp(java.sql.Timestamp insertTimestamp) {
    this.insertTimestamp = insertTimestamp;
  }
}
