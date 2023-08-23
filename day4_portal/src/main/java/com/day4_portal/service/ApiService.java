package com.day4_portal.service;

import java.util.List;

import com.day4_portal.model.Student;



public interface ApiService {
	

public boolean adduser(Student student);
public boolean updateuser(Long id, Student tour);
boolean deleteUser(Long id);
}