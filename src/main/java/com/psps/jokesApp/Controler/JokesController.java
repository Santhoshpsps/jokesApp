package com.psps.jokesApp.Controler;

import com.psps.jokesApp.Service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping({"/",""})
    public String getJokes(Model model){
        model.addAttribute("joke",jokesService.getRandomJokes());
        return "index";
    }
}
