package com.day7_portal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day7_portal.model.Car;
import com.day7_portal.repository.CarRepo;
import com.day7_portal.service.ApiService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ApiServiceImpl implements ApiService {
    @Autowired
	private CarRepo carRepo;
    
    @Override
    public boolean addUser(Car car) {
    	boolean userExists = carRepo.existsByMobile(car.getMobile());
		if(!userExists)
		{
			carRepo.save(car);
			return true;
		}else {
			
			return false;
		}
    }


	@Override
	public List<Car> findAllQuery() {
		return carRepo.findAllQuery();
	}

	
}