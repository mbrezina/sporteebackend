package da.project.sporteezone.app.repository;


import da.project.sporteezone.app.entity.Fitness;
import da.project.sporteezone.app.entity.Lekce;
import da.project.sporteezone.app.entity.Trener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface TrenerRepository extends JpaRepository<Trener, Integer> {


    //@Query("SELECT DISTINCT lekce FROM Lekce lekce LEFT JOIN lekce.lektor lektor WHERE lektor.id = ?1")

    //@Query("FROM Trener WHERE id = ?1")
    //Trener findTrenerById(Integer id);


    /*@Query("FROM ReleaseDateType AS rdt LEFT JOIN rdt.cacheMedias AS cm WHERE cm.id = ?1")    //This is using a named query method
    public List<ReleaseDateType> FindAllWithDescriptionQuery(Integer id);
    */


    //@Query("FROM Fitness WHERE nazev = ?1")
    //List<Fitness> findByNazev(String nazev);


    /*
    @Query("FROM Fitness WHERE nazev = ?1")
    List<Fitness> findByNazev(String nazev);

    public Optional<Fitness> najdiFitko(Integer id) {
        return fitnessRepository.findById(id);
    }*/

    //@Query("FROM Lekce WHERE datum = ?1")
    //public List<Lekce> findByDatum(Date date);


}
