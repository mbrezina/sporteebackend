package da.project.sporteezone.app.controller;

import ch.qos.logback.classic.Logger;
import da.project.sporteezone.app.entity.Fitness;
import da.project.sporteezone.app.entity.Lekce;
import da.project.sporteezone.app.repository.FitnessRepository;
import da.project.sporteezone.app.service.FitnessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.LoggerConfiguration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


@Slf4j
@Controller
public class MainController {

    //@Autowired
    //private FitnessService fitnessService;

    @RequestMapping(value = "/guest", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView dataHolder = new ModelAndView("index");
        log.info("jsem zde");
        //dataHolder.addObject("message", "hello World");
        return dataHolder;
    }


    @RequestMapping(value = "/star", method = RequestMethod.GET)
    public ModelAndView secured() {
        ModelAndView dataHolder = new ModelAndView("star");
        return dataHolder;
    }

}




