package sg.edu.nus.iss.vttp5a_ssf_day17l.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        // for(Joke j : jokesList){
        //     System.out.println(j.getType());
        // }

        return "allJokes";
    }

    @GetMapping("/create")
    public String showJokeForm(Model model) {
        Joke j = new Joke();
        model.addAttribute("joke", j);

        return "jokeForm";
    }

    @PostMapping("/create")
    public String handleJokeForm(@RequestBody MultiValueMap<String, String> form,
    BindingResult result, Model model) {
        if (result.hasErrors()){
            return "jokeForm";
        }
        
        Integer id = Integer.parseInt(form.getFirst("id"));
        String genre = form.getFirst("type");
        String setup = form.getFirst("setup");
        String punchline = form.getFirst("punchline");

        Joke j = new Joke(genre, setup, punchline, id);

        model.addAttribute("joke", j);

        jokeService.addJoke(j);

        return "showJoke";
    }
}
