package sg.edu.nus.iss.vttp5a_ssf_day17l.service;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import sg.edu.nus.iss.vttp5a_ssf_day17l.model.Carpark;
import sg.edu.nus.iss.vttp5a_ssf_day17l.util.Utility;

@Service
public class CarparkRestService {
    
    RestTemplate restTemplate = new RestTemplate();

    public List<Carpark> getAllCarparks() {
        List<Carpark> carparks = new ArrayList<>();

        String carparkData = restTemplate.getForObject(Utility.carparkRatesUrl, String.class);

        JsonReader jReader = Json.createReader(new StringReader(carparkData));
        JsonObject jObject = jReader.readObject();

        JsonObject jObjectResult = jObject.getJsonObject("result");
        JsonArray jArray = jObjectResult.getJsonArray("records");

        for (int i = 0; i < jArray.size(); i ++){
            JsonObject jObjectRecord = jArray.getJsonObject(i);

            Carpark c = new Carpark();
            c.setId(jObjectRecord.getInt("_id"));
            c.setAddress(jObjectRecord.getString("carpark"));
            c.setCategory(jObjectRecord.getString("category"));
            c.setWeekdaysRate1(jObjectRecord.getString("weekdays_rate_1"));
            c.setWeekdaysRate2(jObjectRecord.getString("weekdays_rate_2"));
            c.setSaturdayRate(jObjectRecord.getString("saturday_rate"));
            c.setSundayNPUbhol(jObjectRecord.getString("sunday_publicholiday_rate"));

            carparks.add(c);
        }

        return carparks;
    }
}
