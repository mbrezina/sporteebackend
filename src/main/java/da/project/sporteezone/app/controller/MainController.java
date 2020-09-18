package da.project.sporteezone.app.controller;

import da.project.sporteezone.app.entity.Fitness;
import da.project.sporteezone.app.repository.FitnessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@Controller // This means that this class is a Controller
//@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private FitnessRepository fitnessRepository;


    @RequestMapping("/")
    public ModelAndView showMessage() {
        ModelAndView dataHolder = new ModelAndView("index");
        dataHolder.addObject("msg", "hlásí se aplikace Sporteezone");
        dataHolder.addObject("fitko", fitnessRepository.findByNazev("Myfit"));
        return dataHolder;
    }


    //podobné API jako to, kam se budou posílat cvičení
    @PostMapping(path = "/api/v1/pridejFitko", consumes = "application/json")      // Map ONLY POST Requests
    public @ResponseBody
    Fitness pridejNovouLekci(@RequestBody Fitness noveFitko) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        System.out.println(noveFitko.getNazev());

        fitnessRepository.saveAndFlush(noveFitko);
        return noveFitko;
    }

    @GetMapping( path..... )
    public @ResponseBody

    return \lekncefhk




    @GetMapping(path = "/api/v1/greeting")
    public @ResponseBody
    String greet() {
        return "hello world";
    }


    @PostMapping(path = "/api/v1/najdiJednoFitko/{id}")
    public @ResponseBody
    Optional<Fitness> getJednoFitko(@PathVariable Integer id) {
        return fitnessRepository.findById(id);
    }


    @GetMapping(path = "/api/v1/vsechnaFitka")
    public @ResponseBody
    List<Fitness> getVsechnaFitka() {
        return fitnessRepository.findAll();
    }
}

