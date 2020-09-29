package da.project.sporteezone.app.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "treneri")
public class Trener {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String trenerJmeno;
    private Integer fitkoKod;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="RELEASE_DATE_TYPE_ID", nullable=true)

    //@OneToMany(mappedBy = "lektor")
    //@JoinColumn(name="kodLektora", nullable=true)
    //private List<Lekce> seznamLekci;

}
