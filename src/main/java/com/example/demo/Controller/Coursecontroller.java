package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Course;
import com.example.demo.Service.CourseService;

@RestController
public class Coursecontroller {
	@Autowired
	CourseService service;
	@PostMapping("/createcourse")
	public Course createCourse(@RequestBody Course course) {
		return service.addCourse(course);
	}
	@GetMapping("/getallcourse")
	public List<Course> getAllCourse(){
		return service.getCourse();
	}
	@GetMapping("/getcoursebyid/{id}")
	public Course getCourseById(@PathVariable int id) {
		return service.getCoureById(id);
	}
	@PutMapping("/updatecoursebyid/{id}")
	public Course updateCourseById(@PathVariable int id,@RequestBody Course course) {
		return service.updateCourseById(id, course);
	}
	@DeleteMapping("/deletecoursebyid/{id}")
	public String deletecCourseById(@PathVariable int id) {
		return service.delteCourseId(id);
	}
}
