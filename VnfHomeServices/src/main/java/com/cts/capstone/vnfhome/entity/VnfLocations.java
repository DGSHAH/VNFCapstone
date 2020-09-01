package com.cts.capstone.vnfhome.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vnf_location")
public class VnfLocations {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@Column(name="location")
	String location;
	@Column(name="client")
	String client;
	@Column(name="service")
	String service;
	
	public VnfLocations() {
		super();
	}

	public VnfLocations(Integer id, String location, String client,String service) {
		super();
		this.id = id;
		this.location = location;
		this.client = client;
		this.service = service;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLocationName() {
		return location;
	}
	public void setLocationName(String locationName) {
		this.location = locationName;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
}
