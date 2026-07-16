package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.EnrollmentDTO;
import com.example.demo.Entity.Course;
import com.example.demo.Entity.Enrollment;
import com.example.demo.Entity.Student;
import com.example.demo.Service.EnrollmentService;

@RestController
public class Enrollmentcontroller {
	@Autowired
	EnrollmentService service;
	@PostMapping("/enrollment")
	public Enrollment enroll(@RequestBody EnrollmentDTO dto) {
		return service.Enroll(dto);
	}
	@GetMapping("/getenrollments")
	public List<Enrollment> getEnrollments(){
		return service.GetAllEnrollment();
	}
	@DeleteMapping("/deleteenrollments/{id}")
	public String deleteEnrollments(@PathVariable int id) {
		return service.DeleteStudent(id);
	}
	@GetMapping("/students/{id}/courses")
	public List<Course> allCourseByAStudent(@PathVariable int id){
		return service.allCoursesOfStudent(id);
	}
	@GetMapping("/courses/{id}/students")
	public List<Student> allStudentOfCourse(@PathVariable int id){
		return service.allStudentOfCourse(id);
	}
}
