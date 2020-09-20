package da.project.sporteezone.app.repository;

import da.project.sporteezone.app.entity.Fitness;
import da.project.sporteezone.app.entity.Lekce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface LekceRepository extends JpaRepository <Lekce, Integer>{

    List<Lekce> findAllByZacatekBetween(Date zacatek, Date konec);

    //@Query("FROM Lekce WHERE datum = ?1")
    //public List<Lekce> findByDatum(Date date);

    //List<Lekce> findAllByDatum(Date datum);

    //List<Lekce> findAllByZacatekBetween(Date timeStart, Date timeEnd);

}
