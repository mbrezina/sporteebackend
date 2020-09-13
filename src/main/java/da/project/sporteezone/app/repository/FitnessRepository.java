package da.project.sporteezone.app.repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

import da.project.sporteezone.app.entity.Fitness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FitnessRepository extends JpaRepository<Fitness, Integer> {

    @Query("FROM Fitness WHERE nazev = ?1")
    List<Fitness> findByNazev(String nazev);

//    @Query("SELECT a FROM Fitness a WHERE firstName = ?1 AND lastName = ?2")
//    List<Fitness> findByFirstNameAndLastName(String firstName, String lastName);

}
