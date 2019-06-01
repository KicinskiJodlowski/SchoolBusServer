package com.schoolbusserver.herokuapplication.services;

import com.schoolbusserver.herokuapplication.domain.Passenger;

import java.util.List;

public interface PassengerService {

    Passenger findPassengerById(long id);

    List<Passenger> findAllPassengers();

    Passenger savePassenger(Passenger passenger);
}
