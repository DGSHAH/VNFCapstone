package com.cts.capstone.vnfhome.controller.request;

public class GetUserTopologiesDetails {
	String userId;
	String location;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
