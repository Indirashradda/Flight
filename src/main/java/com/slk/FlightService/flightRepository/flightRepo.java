package com.slk.FlightService.flightRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slk.FlightService.FlightEntities.FlightEntity;

public interface flightRepo extends JpaRepository<FlightEntity,Integer> {

}
