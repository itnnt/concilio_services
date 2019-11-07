package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="deps_saved_ddl")
public class DepsSavedDdl {


  @Id
  @Column(name="deps_id")
  private long depsId;

  @Column(name="deps_view_schema")
  private String depsViewSchema;

  @Column(name="deps_view_name")
  private String depsViewName;

  @Column(name="deps_ddl_to_run")
  private String depsDdlToRun;


  public long getDepsId() {
    return this.depsId;
  }

  public void setDepsId(long depsId) {
    this.depsId = depsId;
  }

  public String getDepsViewSchema() {
    return this.depsViewSchema;
  }

  public void setDepsViewSchema(String depsViewSchema) {
    this.depsViewSchema = depsViewSchema;
  }

  public String getDepsViewName() {
    return this.depsViewName;
  }

  public void setDepsViewName(String depsViewName) {
    this.depsViewName = depsViewName;
  }

  public String getDepsDdlToRun() {
    return this.depsDdlToRun;
  }

  public void setDepsDdlToRun(String depsDdlToRun) {
    this.depsDdlToRun = depsDdlToRun;
  }
}
