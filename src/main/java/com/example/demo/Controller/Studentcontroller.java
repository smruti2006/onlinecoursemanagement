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

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class Studentcontroller {
	@Autowired
	StudentService service;
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	@GetMapping("/getstudents")
	public List<Student> getAllStudent(){
		return service.getAllStudent();
	}
	@GetMapping("/getstudent/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	@PutMapping("/updatestudent/{id}")
	public Student updateStudentById(@PathVariable int id,@RequestBody Student student) {
		return service.updateStudentById(id, student);
	}
	@DeleteMapping("/deletestudent/{id}")
	public String deleteStudentById(@PathVariable int id) {
		return service.deleteStudentByid(id);
	}
	
}
