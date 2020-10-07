package com.techelevator.model;

import java.util.List;

public class Landmark {

	private Long id;
	private List<BusinessHours> businessHours;
	private String address;
	private String name;
	private String description;
	private String venueType;
	private List<Images> images;
	//pendingApproval default should be true until an Admin approves the landmark addition.
	private boolean pendingApproval;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<BusinessHours> getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(List<BusinessHours> businessHours) {
		this.businessHours = businessHours;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVenueType() {
		return venueType;
	}
	public void setVenueType(String venueType) {
		this.venueType = venueType;
	}
	public List<Images> getImages() {
		return images;
	}
	public void setImages(List<Images> images) {
		this.images = images;
	}
	public boolean isPendingApproval() {
		return pendingApproval;
	}
	public void setPendingApproval(boolean pendingApproval) {
		this.pendingApproval = pendingApproval;
	}
	
	

}