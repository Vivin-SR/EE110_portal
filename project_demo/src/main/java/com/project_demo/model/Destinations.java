package com.project_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="destination")
public class Destinations {

	@Id
	@GeneratedValue
	private int id;
	private String place;
	private int days;
	private int budget;
	
	
	public Destinations() {
		super();
	}
	public Destinations(int id, String place, int days, int budget) {
		super();
		this.id = id;
		this.place = place;
		this.days = days;
		this.budget = budget;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
}
