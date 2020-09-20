package da.project.sporteezone.app.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name = "lekce")
public class Lekce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nazev;
    private String url;

    // Mám používat timestamp?  Protože použití .TIME mi smaže datum.
    @Temporal(TemporalType.TIME)
    private Date zacatek;

    @Temporal(TemporalType.TIME)
    private Date konec;

    private Integer kapacita;
    private Boolean nutnostRezervace;
    private Integer cena;
    private Integer kodFitko;
    private Integer kodLektor;

    public Lekce() {
    }

    @Override
    public String toString() {
        return "Lekce{" +
            "id=" + id +
            ", nazev='" + nazev + '\'' +
            ", url='" + url + '\'' +
            ", zacatek=" + zacatek +
            ", konec  =" + konec +
            ", kapacita=" + kapacita +
            ", nutnotRezervace=" + nutnostRezervace +
            ", cena=" + cena +
            ", kodFitko=" + kodFitko +
            ", kodLektor=" + kodLektor +
            '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setZacatek(Date zacatek) {
        this.zacatek = zacatek;
    }

    public void setKonec(Date konec) {
        this.konec = konec;
    }

    public void setKapacita(Integer kapacita) {
        this.kapacita = kapacita;
    }

    public void setNutnostRezervace(Boolean nutnostRezervace) {
        this.nutnostRezervace = nutnostRezervace;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public void setKodFitko(Integer kodFitko) {
        this.kodFitko = kodFitko;
    }

    public void setKodLektor(Integer kodLektor) {
        this.kodLektor = kodLektor;
    }

    public Integer getId() {
        return id;
    }

    public String getNazev() {
        return nazev;
    }

    public String getUrl() {
        return url;
    }

    public Date getZacatek() {
        return zacatek;
    }

    public Date getTimeEnd() {
        return konec;
    }

    public Integer getKapacita() {
        return kapacita;
    }

    public Boolean getNutnostRezervace() {
        return nutnostRezervace;
    }

    public Integer getCena() {
        return cena;
    }

    public Integer getKodFitko() {
        return kodFitko;
    }

    public Integer getKodLektor() {
        return kodLektor;
    }

    public Lekce(Integer id, String nazev, String url, Date zacatek, Date konec, Integer kapacita, Boolean nutnostRezervace, Integer cena, Integer kodFitko, Integer kodLektor) {
        this.id = id;
        this.nazev = nazev;
        this.url = url;
        this.zacatek = zacatek;
        this.konec = konec;
        this.kapacita = kapacita;
        this.nutnostRezervace = nutnostRezervace;
        this.cena = cena;
        this.kodFitko = kodFitko;
        this.kodLektor = kodLektor;
    }
}

