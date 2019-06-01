package com.schoolbusserver.herokuapplication.repositories;

import com.schoolbusserver.herokuapplication.domain.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {


}
