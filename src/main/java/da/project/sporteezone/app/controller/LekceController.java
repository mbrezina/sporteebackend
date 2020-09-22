package da.project.sporteezone.app.controller;

import da.project.sporteezone.app.entity.Lekce;
import da.project.sporteezone.app.repository.LekceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author vlasta
 */
@RestController
@RequestMapping(path = "/api/v1/lekce")
public class LekceController {

    @Autowired
    private LekceRepository lekceRepository;

    @GetMapping(path = "")
    @ResponseBody
    public List<Lekce> getAllLekce() {
        return lekceRepository.findAll();
    }

    @GetMapping(path = "/byDatum")
    @ResponseBody
    public List<Lekce> findLekceByDateTime(@RequestParam("zacatek") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") Date zacatek,
                                           @RequestParam("konec") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") Date konec) {

        return lekceRepository.findAllByZacatekBetween(zacatek, konec);
    }

}
