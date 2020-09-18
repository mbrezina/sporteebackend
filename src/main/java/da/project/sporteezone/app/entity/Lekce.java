package da.project.sporteezone.app.entity;

import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;

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
    private Date datum;
    private Date zacatek;
    private Date konec;
    private Integer kapacita;
    private Boolean nutnostRezervace;
    private Integer cena;
    private Integer kodFitko;
    private Integer kodLektor;



}

