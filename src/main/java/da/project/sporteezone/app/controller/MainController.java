package da.project.sporteezone.app.controller;

import da.project.sporteezone.app.entity.Fitness;
import da.project.sporteezone.app.repository.FitnessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class MainController {

    @Autowired
    private FitnessRepository fitnessRepository;


    //Fitness:
    @GetMapping(path = "/api/v1/fitness/all")
    public @ResponseBody
    List<Fitness> getAllFitness() {
        return fitnessRepository.findAll();
    }

    @PostMapping(path = "/api/v1/fitness/{id}")
    public @ResponseBody
    Optional<Fitness> getJednoFitko(@PathVariable Integer id) {
        return fitnessRepository.findById(id);
    }


    @PostMapping(path = "/api/v1/fitness/add", consumes = "application/json")      // Map ONLY POST Requests
    public @ResponseBody
    Fitness addNewFitness(@RequestBody Fitness noveFitness) {

        System.out.println(noveFitness.getNazev());
        fitnessRepository.saveAndFlush(noveFitness);
        return noveFitness;
    }


    @GetMapping(path = "/api/v1/greeting")
    public @ResponseBody
    String greet() {
        return "hello world";
    }

}

