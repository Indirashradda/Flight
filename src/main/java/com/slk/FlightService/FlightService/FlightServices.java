package com.slk.FlightService.FlightService;

import java.util.List;

import com.slk.FlightService.Exception.FlightNotFoundException;
import com.slk.FlightService.FlightEntities.FlightEntity;

public interface FlightServices {
	FlightEntity addFlightDetails(FlightEntity flight);
	FlightEntity updateFlightDetails(int flightNumber,FlightEntity flight);
	List<FlightEntity>getAllFlightDetails();
	FlightEntity getFlightDetails(int flightNumber) throws FlightNotFoundException;
	String deleteFlightDetails(int flightNumber) throws FlightNotFoundException ; 
	

}
