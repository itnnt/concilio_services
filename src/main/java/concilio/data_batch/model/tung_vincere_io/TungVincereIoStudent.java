package concilio.data_batch.model.tung_vincere_io;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Contains the information of a single student who has purchased
 * the course.
 */
@Entity
@Table(name = "student")
@XmlRootElement(name="student")
public class TungVincereIoStudent {

    @Id
    private String emailAddress;
    private String name;
    private String purchasedPackage;

    public TungVincereIoStudent() {}

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getPurchasedPackage() {
        return purchasedPackage;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPurchasedPackage(String purchasedPackage) {
        this.purchasedPackage = purchasedPackage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("emailAddress", this.emailAddress)
                .append("name", this.name)
                .append("purchasedPackage", this.purchasedPackage)
                .toString();
    }
}
