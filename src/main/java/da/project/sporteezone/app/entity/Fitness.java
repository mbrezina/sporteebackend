package da.project.sporteezone.app.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "fitness")
public class Fitness {
    @Override
    public String toString() {
        return "Fitness{" +
            "id=" + id +
            ", nazev='" + nazev + '\'' +
            ", url='" + url + '\'' +
            ", ulice='" + ulice + '\'' +
            ", mesto='" + mesto + '\'' +
            ", psc='" + psc + '\'' +
            ", multisport=" + multisport +
            ", activepass=" + activepass +
            ", platba='" + platba + '\'' +
            ", pohlavi='" + pohlavi + '\'' +
            ", mhd=" + mhd +
            '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nazev;
    private String url;
    private String ulice;
    private String mesto;
    private String psc;
    private Boolean multisport;
    private Boolean activepass;
    private String platba;
    private String pohlavi;
    private Boolean mhd;


    public Fitness() {
    }


    public Fitness(String nazev, String url, String ulice, String mesto, String psc, Boolean multisport, Boolean activepass, String platba, String pohlavi
        , Boolean mhd) {
        this.nazev = nazev;
        this.ulice = ulice;
        this.url = url;
        this.mesto = mesto;
        this.psc = psc;
        this.multisport = multisport;
        this.activepass = activepass;
        this.platba = Fitness.this.platba;
        this.pohlavi
            = pohlavi
        ;
        this.mhd = mhd;
    }


    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public Fitness(Integer id, String url, String nazev, String ulice, String mesto, String psc, Boolean multisport, Boolean activepass, String platba, String pohlavi
        , Boolean mhd) {
        this.id = id;
        this.nazev = nazev;
        this.url= url;
        this.ulice = ulice;
        this.mesto = mesto;
        this.psc = psc;
        this.multisport = multisport;
        this.activepass = activepass;
        this.platba = Fitness.this.platba;
        this.pohlavi
            = pohlavi
        ;
        this.mhd = mhd;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public void setMultisport(Boolean multisport) {
        this.multisport = multisport;
    }

    public void setActivepass(Boolean activepass) {
        this.activepass = activepass;
    }

    public void setPlatba(String platba) {
        this.platba = platba;
    }

    public void setPohlavi(String pohlavi) {
        this.pohlavi = pohlavi;
    }

    public void setMhd(Boolean mhd) {
        this.mhd = mhd;
    }

    public Integer getId() {
        return id;
    }

    public String getNazev() {
        return nazev;
    }

    public String getUlice() {
        return ulice;
    }

    public String getMesto() {
        return mesto;
    }

    public String getPsc() {
        return psc;
    }

    public Boolean getMultisport() {
        return multisport;
    }

    public Boolean getActivepass() {
        return activepass;
    }

    public String getPlatba() {
        return platba;
    }

    public String getPohlavi() {
        return pohlavi;
    }

    public Boolean getMhd() {
        return mhd;
    }
}
