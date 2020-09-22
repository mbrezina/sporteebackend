package da.project.sporteezone.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "lekce")
@Data
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

}

