package com.day7_portal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day7_portal.model.Car;


public interface CarRepo extends JpaRepository<Car,Integer>{

	boolean existsByMobile(Long mobile);
	
	@Query("select c from Car c")
	List<Car>findAllQuery();

}