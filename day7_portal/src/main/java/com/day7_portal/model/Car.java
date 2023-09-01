package com.day7_portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	@Id
	@GeneratedValue
	private int id;
	private String carName;
	private String carType;
	private String owners;
	private String currentOwnerName;
	private Long mobile;
	private String address;
	
	
	public Car() {
		super();
	}
	public Car(int id, String carName, String carType, String owners, String currentOwnerName, Long mobile,
			String address) {
		super();
		this.id = id;
		this.carName = carName;
		this.carType = carType;
		this.owners = owners;
		this.currentOwnerName = currentOwnerName;
		this.mobile = mobile;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getOwners() {
		return owners;
	}
	public void setOwners(String owners) {
		this.owners = owners;
	}
	public String getCurrentOwnerName() {
		return currentOwnerName;
	}
	public void setCurrentOwnerName(String currentOwnerName) {
		this.currentOwnerName = currentOwnerName;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
