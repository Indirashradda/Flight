package com.slk.FlightService.FlightService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.FlightService.Exception.FlightNotFoundException;
import com.slk.FlightService.FlightEntities.FlightEntity;
import com.slk.FlightService.flightRepository.flightRepo;
@Service
public class FlightServiceImp implements FlightServices{
	@Autowired
	flightRepo repo;

	@Override
	public FlightEntity addFlightDetails(FlightEntity flight) {
		
		return repo.save(flight);
	}

	@Override
	public FlightEntity updateFlightDetails(int flightNumber, FlightEntity flight) {
		FlightEntity flightUpdate;
		if(repo.findById(flightNumber).get()!=null)
		{
			 flightUpdate = repo.save(flight);
		}
		else
		{
		   flightUpdate = null;
		}
		return flightUpdate;
	}

	@Override
	public List<FlightEntity> getAllFlightDetails() {
	
		return repo.findAll();
	}

	@Override
	public FlightEntity getFlightDetails(int flightNumber) throws FlightNotFoundException  {
		Optional<FlightEntity> flightDetail=repo.findById(flightNumber);
		
		return flightDetail.orElseThrow(()-> new FlightNotFoundException());
	}

	@Override
	public String deleteFlightDetails(int flightNumber) throws FlightNotFoundException  {
		Optional<FlightEntity> flightToBeDeleted=repo.findById(flightNumber);
		//String deleteMessage;
		FlightEntity f=flightToBeDeleted.orElseThrow(()-> new FlightNotFoundException());
		
//		if(flightToBeDeleted!=null)
//		{
//			 repo.deleteById(flightNumber);
//			 deleteMessage="flight details deleted successfully";
//		}
//		else
//		{
//		  deleteMessage="fligt details could not be deleted";
//		}
		repo.delete(f);
		return "deleteMessage";
	}

}
