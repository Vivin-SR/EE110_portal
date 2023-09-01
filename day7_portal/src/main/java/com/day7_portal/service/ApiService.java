package com.day7_portal.service;



import java.util.List;

import com.day7_portal.model.Car;

public interface ApiService {
	
public boolean addUser(Car car);
List<Car> findAllQuery();
}