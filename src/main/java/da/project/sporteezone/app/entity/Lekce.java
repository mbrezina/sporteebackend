package da.project.sporteezone.app.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "lekce")
public class Lekce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nazev;
    private Date zacatek;
    private Date konec;
    private Integer kodFitko;


}
