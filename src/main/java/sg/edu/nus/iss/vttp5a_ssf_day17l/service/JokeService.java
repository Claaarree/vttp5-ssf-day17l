package sg.edu.nus.iss.vttp5a_ssf_day17l.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import sg.edu.nus.iss.vttp5a_ssf_day17l.model.Joke;
import sg.edu.nus.iss.vttp5a_ssf_day17l.util.Utility;

@Service
public class JokeService {

    RestTemplate restTemplate = new RestTemplate();
    
    public List<Joke> getAllJokes() {
        ResponseEntity<List<Joke>> jokesList = restTemplate.exchange(Utility.jokesUrl, HttpMethod.GET, null, 
        new ParameterizedTypeReference<List<Joke>>() {});

        return jokesList.getBody();
    }
}
