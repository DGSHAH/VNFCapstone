package com.cts.capstone.cart.entity;

public class VnfServices {

	int serviceID;
	String serviceType;
	String serviceName;
	char serviceSize;
	
	public VnfServices() {
		super();
	}
	
	public VnfServices(int serviceID, String serviceType, String serviceName, char serviceSize) {
		super();
		this.serviceID = serviceID;
		this.serviceType = serviceType;
		this.serviceName = serviceName;
		this.serviceSize = serviceSize;
	}
	
	public int getServiceID() {
		return serviceID;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public char getServiceSize() {
		return serviceSize;
	}
	public void setServiceSize(char serviceSize) {
		this.serviceSize = serviceSize;
	}
	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}

}
