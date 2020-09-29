package da.project.sporteezone.app.repository;

import da.project.sporteezone.app.entity.Fitness;
import da.project.sporteezone.app.entity.Lekce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface LekceRepository extends JpaRepository <Lekce, Integer>{

    List<Lekce> findAllByZacatekBetween(LocalDateTime zacatek, LocalDateTime konec);

    @Query("FROM Lekce AS l LEFT JOIN Trener AS t WHERE t.id = ?1")
    List<Lekce> findLekceByTrenerId(Integer idLektora);


        //@Query("FROM Lekce WHERE datum = ?1")
    //public List<Lekce> findByDatum(Date date);

    //List<Lekce> findAllByDatum(Date datum);

    //List<Lekce> findAllByZacatekBetween(Date timeStart, Date timeEnd);

}
