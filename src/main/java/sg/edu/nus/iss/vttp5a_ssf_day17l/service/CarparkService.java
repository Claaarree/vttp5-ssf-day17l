package sg.edu.nus.iss.vttp5a_ssf_day17l.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.vttp5a_ssf_day17l.model.Carpark;
import sg.edu.nus.iss.vttp5a_ssf_day17l.restController.CarparkRestController;

@Service
public class CarparkService {
    
    @Autowired
    CarparkRestController carparkRestController;

    public List<Carpark> getAllCarparks() {
        ResponseEntity<List<Carpark>> carparksResponse = carparkRestController.getAllCarparks();
        List<Carpark> carparks = carparksResponse.getBody();

        return carparks;
    }
}
