package com.example.course_registration_system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class courseregistry 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String email;
private String Coursename;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCoursename() {
	return Coursename;
}
public void setCoursename(String coursename) {
	Coursename = coursename;
}

public courseregistry(String name, String email, String Coursename) {
	this.name= name;
	this.email= email;
	this.Coursename = Coursename;
}

public courseregistry()
{
	
}

}
