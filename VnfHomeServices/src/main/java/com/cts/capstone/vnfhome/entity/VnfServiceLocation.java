package com.cts.capstone.vnfhome.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servicelocation")
public class VnfServiceLocation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	@Column(name="location")
	String location;
	@Column(name="service")
	String service;
	
	public VnfServiceLocation() {
		super();
	}
	
	public VnfServiceLocation(int id, String location, String service) {
		super();
		this.id = id;
		this.location = location;
		this.service = service;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
}
