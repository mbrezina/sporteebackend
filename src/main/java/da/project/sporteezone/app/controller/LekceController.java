package da.project.sporteezone.app.controller;

import da.project.sporteezone.app.entity.Fitness;
import da.project.sporteezone.app.entity.Lekce;
import da.project.sporteezone.app.repository.FitnessRepository;
import da.project.sporteezone.app.repository.LekceRepository;
import lombok.extern.java.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.slf4j.Log4jLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Slf4j
@RestController
@RequestMapping(path = "/api/v1/lekce")
public class LekceController {

    @Autowired
    private LekceRepository lekceRepository;

    @GetMapping(path = "")
    public @ResponseBody
    List<Lekce> getAllLekce() {
        return lekceRepository.findAll();
    }


    @GetMapping(path = "/byDatum")
    public @ResponseBody
    List<Lekce> findLekceByDateTime(
        @RequestParam("zacatek")
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime zacatek,

        @RequestParam("konec")
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime konec) {


        System.out.println("datum je " + zacatek);
        System.out.println(zacatek.getClass());
        return lekceRepository.findAllByZacatekBetween(zacatek, konec);
    }


    // API call - GET  localhost:8090/api/v1/lekce/byDatum?zacatek=2020-09-13%2015:00&konec=2020-09-13%2017:00

}

