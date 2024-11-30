package sg.edu.nus.iss.vttp5a_ssf_day17l.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.vttp5a_ssf_day17l.model.Joke;
import sg.edu.nus.iss.vttp5a_ssf_day17l.service.JokeRestService;

@RestController
@RequestMapping("/api/jokes")
public class JokesRestController {
    
    @Autowired
    JokeRestService jokeRestService;

    @GetMapping
    public ResponseEntity<List<Joke>> getAllJokes() {
        List<Joke> jokesList = jokeRestService.getAllJokes();

        return ResponseEntity.ok().body(jokesList);
    }
}
