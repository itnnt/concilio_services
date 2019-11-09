package vincere.etl.entity.vinc;


import javax.persistence.*;

@Entity
@Table(name="dw_pa_dim_ua_location")
public class DwPaDimUaLocation {

  @Id
  @Column(name="location_key")
  private long locationKey;

  @Column(name="location_name")
  private String locationName;


  public long getLocationKey() {
    return this.locationKey;
  }

  public void setLocationKey(long locationKey) {
    this.locationKey = locationKey;
  }

  public String getLocationName() {
    return this.locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }
}