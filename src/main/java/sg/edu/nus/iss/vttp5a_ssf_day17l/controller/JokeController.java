package sg.edu.nus.iss.vttp5a_ssf_day17l.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.vttp5a_ssf_day17l.model.Joke;
import sg.edu.nus.iss.vttp5a_ssf_day17l.service.JokeService;

@Controller
@RequestMapping("/jokes")
public class JokeController {
    
    @Autowired
    JokeService jokeService;

    @GetMapping
    public String getAllJokes(Model model) {
        List<Joke> jokesList = jokeService.getAllJokes();
        model.addAttribute("jokes", jokesList);

        return "allJokes";
    }
}
