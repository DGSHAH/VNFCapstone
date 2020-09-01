package com.cts.capstone.cart.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class CapstoneCart {
	
	@Id
	@Column (name="sku")
	Integer sku;
	@Column(name="userId")
	String userId;
	@Column(name="serviceId")
	String serviceID;
	@Column(name="createdDate")
	Date createdDate;
	@Column (name="status")
	String status;
	

	public CapstoneCart() {
		super();
	}
	
	public CapstoneCart(Integer sku, String userId, String serviceID, Date createdDate, String status) {
		super();
		this.sku = sku;
		this.userId = userId;
		this.serviceID = serviceID;
		this.createdDate = createdDate;
		this.status = status;
	}

	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getServiceID() {
		return serviceID;
	}
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
