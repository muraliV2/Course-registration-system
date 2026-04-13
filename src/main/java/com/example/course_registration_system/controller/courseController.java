package com.example.course_registration_system.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.course_registration_system.model.course;
import com.example.course_registration_system.model.courseregistry;
import com.example.course_registration_system.service.CourseService;

@RestController
@CrossOrigin
@RequestMapping("/courses")
public class courseController 
{
	
	@Autowired
	CourseService CourseService;
	@GetMapping
	public List<course> AvailableCourse()
	{
		return CourseService.AvailableCourse();
		
		
	}
	
	 @GetMapping("/enrolled")
	public List<courseregistry> enrolledstudents()
	{
		return CourseService.enrolledstudents();
		
	}
	
	@PostMapping("/register")
	public String  registercourse(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("Coursename") String Coursename)
	{
		
		CourseService.registercourse(name,email,Coursename);
		return "thank you" +  name + "for successfully enrolling in" +   Coursename ;
	}
	
}
