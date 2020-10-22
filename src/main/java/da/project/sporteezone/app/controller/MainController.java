package da.project.sporteezone.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.Map;


@Slf4j
@Controller
public class MainController {

    //@Autowired
    //private FitnessService fitnessService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView dataHolder = new ModelAndView("index");
        log.info("jsem ve welcome");
        //dataHolder.addObject("message", "hello World");
        return dataHolder;
    }

    @GetMapping("/user")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        return Collections.singletonMap("name", principal.getAttribute("name"));
    }
    public static void main(String[] args) {
        SpringApplication.run(MainController.class, args);
    }


    @RequestMapping(value = "/star", method = RequestMethod.GET)
    public ModelAndView secured() {
        ModelAndView dataHolder = new ModelAndView("star");
        return dataHolder;
    }


    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout() {
        ModelAndView dataHolder = new ModelAndView("logout");
        return dataHolder;
    }
}




