package da.project.sporteezone.app.repository;

import da.project.sporteezone.app.entity.Fitness;
import da.project.sporteezone.app.entity.Lekce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LekceRepository extends JpaRepository <Lekce, Integer>{

    @Query("FROM Fitness WHERE name = ?1")
    List<Lekce> findByName(String name);

//    @Query("SELECT a FROM Fitness a WHERE firstName = ?1 AND lastName = ?2")
//    List<Fitness> findByFirstNameAndLastName(String firstName, String lastName);




}
