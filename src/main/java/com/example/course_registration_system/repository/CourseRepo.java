package com.example.course_registration_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course_registration_system.model.course;
@Repository
public interface CourseRepo extends JpaRepository<course, String>
{

}
