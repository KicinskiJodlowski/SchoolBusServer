package com.schoolbusserver.herokuapplication.services;

import com.schoolbusserver.herokuapplication.domain.Passenger;
import com.schoolbusserver.herokuapplication.repositories.PassengerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;

    public PassengerServiceImpl(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public Passenger findPassengerById(long id) {
        return passengerRepository.findById(id).get();
    }

    @Override
    public List<Passenger> findAllPassengers() {
        return passengerRepository.findAll();
    }

    @Override
    public Passenger savePassenger(@RequestBody Passenger passenger) {
        return passengerRepository.save(passenger);
    }
}
