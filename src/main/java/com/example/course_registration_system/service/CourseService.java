package com.example.course_registration_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course_registration_system.model.course;
import com.example.course_registration_system.model.courseregistry;
import com.example.course_registration_system.repository.CourseRepo;
import com.example.course_registration_system.repository.courseregistryrepo;

@Service
public class CourseService 
{

	@Autowired
	CourseRepo courserepo;
	
	@Autowired
	courseregistryrepo courseregisterrepo;
	
	
	public List<course> AvailableCourse() {
		// TODO Auto-generated method stub
		return courserepo.findAll();
	}
	
	public List<courseregistry> enrolledstudents()
	{
		return courseregisterrepo.findAll();
		
	}

	public void registercourse(String name, String email, String Coursename) {
		courseregistry enrollcourse = new courseregistry(name,email,Coursename);
		courseregisterrepo.save(enrollcourse);
		
	}

}
