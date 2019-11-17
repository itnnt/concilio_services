package concilio.entity.vinc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dw_pa_dim_functional_expertise")
public class DwPaDimFunctionalExpertise {


  @Id
  @Column(name="function_key")
  private long functionKey;

  @Column(name="function_name")
  private String functionName;


  public long getFunctionKey() {
    return this.functionKey;
  }

  public void setFunctionKey(long functionKey) {
    this.functionKey = functionKey;
  }

  public String getFunctionName() {
    return this.functionName;
  }

  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }
}
