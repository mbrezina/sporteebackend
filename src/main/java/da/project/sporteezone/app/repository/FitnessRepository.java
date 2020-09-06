package da.project.sporteezone.app.repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

import da.project.sporteezone.app.entity.Fitness;
import org.springframework.data.repository.CrudRepository;

public interface FitnessRepository extends CrudRepository<Fitness, Integer> {


}
