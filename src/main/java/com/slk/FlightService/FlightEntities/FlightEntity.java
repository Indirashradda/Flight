package com.slk.FlightService.FlightEntities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class FlightEntity {
	@Id
	private int flightNumber;
	private String flightName;
	private String sourse;
	private String destination;
	
	public int getFlightNumber() {
		return flightNumber;
	}
	
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String getFlightName() {
		return flightName;
	}
	
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	
	public String getsourse() {
		return sourse;
	}
	
	public void setsourse(String sourse) {
		this.sourse = sourse;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "FlightEntity [flightNumber=" + flightNumber + ", flightName=" + flightName + ", sourse=" + sourse
				+ ", destination=" + destination + "]";
	}
	

}
