package com.schoolbusserver.herokuapplication.bootstrap;

import com.schoolbusserver.herokuapplication.domain.Passenger;
import com.schoolbusserver.herokuapplication.repositories.PassengerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PassengerRepository passengerRepository;

    public BootStrapData(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Passenger p = new Passenger();
        p.setLatitude(0.0);
        passengerRepository.save(p);
    }
}
