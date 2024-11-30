package sg.edu.nus.iss.vttp5a_ssf_day17l.service;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import sg.edu.nus.iss.vttp5a_ssf_day17l.model.Joke;
import sg.edu.nus.iss.vttp5a_ssf_day17l.util.Utility;

@Service
public class JokeRestService {
    
    RestTemplate restTemplate = new RestTemplate();

    public List<Joke> getAllJokes() {
        List<Joke> jokesList = new ArrayList<>();

        // if don't use getForEntity(), can use get with exchange seen in day 17 slides

        ResponseEntity<String> jokes = restTemplate.getForEntity(Utility.jokesUrl, String.class);
        String jokesString = jokes.getBody();

        JsonReader jReader = Json.createReader(new StringReader(jokesString));
        JsonArray jokeArray = jReader.readArray();
        
        for (int i = 0; i < jokeArray.size(); i++) {
            JsonObject joke = jokeArray.getJsonObject(i);
            Joke j = new Joke();
            j.setType(joke.getString("type"));
            j.setSetup(joke.getString("setup"));
            j.setPunchline(joke.getString("punchline"));
            j.setId(joke.getInt("id"));

            jokesList.add(j);

            // System.out.println(j.toString());
            // System.out.println(joke.getString("type"));
        }

        return jokesList;
    }
}
