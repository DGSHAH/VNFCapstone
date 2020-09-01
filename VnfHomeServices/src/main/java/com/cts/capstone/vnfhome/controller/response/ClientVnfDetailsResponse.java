package com.cts.capstone.vnfhome.controller.response;

import java.util.List;

import com.cts.capstone.vnfhome.entity.CapstoneUser;

public class ClientVnfDetailsResponse {
	
	CapstoneUser user ;
	List<String> installedServices;
	List<String> availableServices;
	
	public CapstoneUser getUser() {
		return user;
	}
	public void setUser(CapstoneUser user) {
		this.user = user;
	}
	public List<String> getInstalledServices() {
		return installedServices;
	}
	public void setInstalledServices(List<String> installedServices) {
		this.installedServices = installedServices;
	}
	public List<String> getAvailableServices() {
		return availableServices;
	}
	public void setAvailableServices(List<String> availableServices) {
		this.availableServices = availableServices;
	}
	
	
}
