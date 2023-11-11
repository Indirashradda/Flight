package com.slk.FlightService.FlightController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slk.FlightService.Exception.FlightNotFoundException;
import com.slk.FlightService.FlightEntities.FlightEntity;
import com.slk.FlightService.FlightService.FlightServices;

@RestController
@RequestMapping("/flight.com")
public class FlightController {
	@Autowired
	FlightServices service;
	
    @PostMapping("/addFlight")
	public ResponseEntity <FlightEntity> addFlightDetails(@RequestBody FlightEntity flight) {
    	FlightEntity flight1=service.addFlightDetails(flight);
		
		return new ResponseEntity<>(flight1,HttpStatus.CREATED) ;
	}

	@PutMapping("/updateFlight/{flightNumber}")
	public FlightEntity updateFlightDetails(@PathVariable int flightNumber,@RequestBody FlightEntity flight) {
		return service.updateFlightDetails(flightNumber, flight);
		
	}

	@GetMapping("/allFlight")
	public List<FlightEntity> getAllFlightDetails() {
	
		return service.getAllFlightDetails();
	}

	@GetMapping("/details/{flightNumber}")
	public FlightEntity getFlightDetails(@PathVariable int flightNumber) throws FlightNotFoundException  {
		
		return service.getFlightDetails(flightNumber);
	}

	@DeleteMapping("/delete/{flightNumber}") 
	public String deleteFlightDetails(@PathVariable int flightNumber) throws FlightNotFoundException  {
		return service.deleteFlightDetails(flightNumber);
		
	}

}

	


