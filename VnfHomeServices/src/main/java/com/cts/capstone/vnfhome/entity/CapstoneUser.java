package com.cts.capstone.vnfhome.entity;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CapstoneUser {
	
	@Id
	String userId;
	String email;
	String firstName;
	String lastName;
	String phone;
	String address;
	Integer zipcode;
	@JsonIgnore
	String password;
	
	
	public CapstoneUser() {
		super();
	}
	public CapstoneUser(String userId, String email, String firstName, String lastName, String phone, String address,
			Integer zipcode, String password) {
		super();
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		this.zipcode = zipcode;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
