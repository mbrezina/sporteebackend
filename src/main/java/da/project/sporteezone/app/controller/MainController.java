package da.project.sporteezone.app.controller;

import da.project.sporteezone.app.entity.Fitness;
import da.project.sporteezone.app.entity.Lekce;
import da.project.sporteezone.app.repository.FitnessRepository;
import da.project.sporteezone.app.repository.LekceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@RestController
public class MainController {
    @Autowired
    private FitnessRepository fitnessRepository;
    @Autowired
    private LekceRepository lekceRepository;

    //Lekce:
    @GetMapping(path = "/api/v1/lekce/all")
    public @ResponseBody
    List<Lekce> getAllLekce() {
        return lekceRepository.findAll();
    }

    @GetMapping(path = "/api/v1/lekce/byDatum")
    public @ResponseBody
    List<Lekce> findLekceByDateTime(@RequestParam("zacatek") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") Date zacatek,
                                    @RequestParam("konec") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") Date konec) {

        System.out.println("datum je " + zacatek);
        return lekceRepository.findAllByZacatekBetween(zacatek, konec);
    }

    // API call - GET  localhost:8090/api/v1/lekce/byDatum?zacatek=2020-09-13%2015:00&konec=2020-09-13%2017:00
    // nic nevrací, protože protože z DB se vrací jen čas bez data, viz mapování entity Lekce


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

