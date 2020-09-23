package da.project.sporteezone.app.controller;

import da.project.sporteezone.app.entity.Lekce;
import da.project.sporteezone.app.repository.LekceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


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

        log.info("datum je " + zacatek);
        log.debug("jsem v debugu");
        log.debug("datum je " + zacatek);
        log.debug(String.valueOf(zacatek.getClass()));
        return lekceRepository.findAllByZacatekBetween(zacatek, konec);
    }


    // API call - GET  localhost:8090/api/v1/lekce/byDatum?zacatek=2020-09-13%2015:00&konec=2020-09-13%2017:00

}

