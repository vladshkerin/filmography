package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FilmController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allFilms() {
        return new ModelAndView("films");
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        return new ModelAndView("editPage");
    }
}
