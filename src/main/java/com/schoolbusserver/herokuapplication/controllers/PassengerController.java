package com.schoolbusserver.herokuapplication.controllers;

import com.schoolbusserver.herokuapplication.domain.Passenger;
import com.schoolbusserver.herokuapplication.services.PassengerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(PassengerController.BASE_URL)
public class PassengerController {

    private final PassengerService passengerService;
    static final String BASE_URL = "/api";

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @GetMapping
    public List<Passenger> getAllPassengers(){
        return passengerService.findAllPassengers();
    }

    @GetMapping("/{id}")
    public Passenger getPassengerById(@PathVariable long id){
        return passengerService.findPassengerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Passenger savePassenger(Passenger passenger){
        return passengerService.savePassenger(passenger);
    }

}
