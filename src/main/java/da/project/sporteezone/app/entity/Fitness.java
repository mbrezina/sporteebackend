package da.project.sporteezone.app.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "fitness")
public class Fitness {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String street;
    private String city;
    private String postalcode;
    private Boolean multisport;
    private Boolean activepass;
    private String payment;
    private String sex;
    private Boolean mhd;

    public Fitness() {
    }

    public Fitness(Integer id, String name, String street, String city, String postalcode, Boolean multisport, Boolean activepass, String payment, String sex, Boolean mhd) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.city = city;
        this.postalcode = postalcode;
        this.multisport = multisport;
        this.activepass = activepass;
        this.payment = payment;
        this.sex = sex;
        this.mhd = mhd;
    }

    public Fitness(String name, String street, String city, String postalcode, Boolean multisport, Boolean activepass, String payment, String sex, Boolean mhd) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.postalcode = postalcode;
        this.multisport = multisport;
        this.activepass = activepass;
        this.payment = payment;
        this.sex = sex;
        this.mhd = mhd;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Fitness{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", street='" + street + '\'' +
            ", city='" + city + '\'' +
            ", postalcode='" + postalcode + '\'' +
            ", multisport=" + multisport +
            ", activepass=" + activepass +
            ", payment='" + payment + '\'' +
            ", sex='" + sex + '\'' +
            ", mhd=" + mhd +
            '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public void setMultisport(Boolean multisport) {
        this.multisport = multisport;
    }

    public void setActivepass(Boolean activepass) {
        this.activepass = activepass;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMhd(Boolean mhd) {
        this.mhd = mhd;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public Boolean getMultisport() {
        return multisport;
    }

    public Boolean getActivepass() {
        return activepass;
    }

    public String getPayment() {
        return payment;
    }

    public String getSex() {
        return sex;
    }

    public Boolean getMhd() {
        return mhd;
    }


}
