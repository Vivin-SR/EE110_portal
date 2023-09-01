package com.day7_portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day7_portal.model.Car;
import com.day7_portal.service.ApiService;


@RestController
@RequestMapping("/api/v1/day7")
public class ApiController {
	
	@Autowired
	private ApiService apiService;
	
	@PostMapping("/addCar")
	public ResponseEntity<String>addUser(@RequestBody Car car){
		boolean dataSaved= apiService.addUser(car);
		if(dataSaved) {
			return ResponseEntity.status(200).body("Car details added successfully");
		}
		else {
			return ResponseEntity.status(404).body("Something went wrong");
		}
		
	}
	
	@GetMapping("/getQuery")
	public ResponseEntity<List<Car>>findAllQuery(){
		return ResponseEntity.status(200).body(apiService.findAllQuery());
	}

}

