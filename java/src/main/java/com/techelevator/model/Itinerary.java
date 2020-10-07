package com.techelevator.model;

import java.time.LocalDate;
import java.util.List;

public class Itinerary {

	private Long itineraryId;
	private String name;
	private String startingLocation;
	private List<Landmark> destinations;
	private LocalDate date;
	private Long userId;
	
	public Itinerary(Long id, String name, String startingLocation, List<Landmark> destinations, LocalDate date, Long userId) {
		this.itineraryId = id;
		this.name = name;
		this.startingLocation = startingLocation;
		this.destinations = destinations;
		this.date = date;
		this.userId = userId;
	}
	
	public Long getItineraryId() {
		return itineraryId;
	}
	public void setItineraryId(Long itineraryId) {
		this.itineraryId = itineraryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartingLocation() {
		return startingLocation;
	}
	public void setStartingLocation(String startingLocation) {
		this.startingLocation = startingLocation;
	}
	public List<Landmark> getDestinations() {
		return destinations;
	}
	public void setDestinations(List<Landmark> destinations) {
		this.destinations = destinations;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}