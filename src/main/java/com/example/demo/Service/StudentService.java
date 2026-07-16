package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;
	//Add Student
	public Student addStudent(Student student) {
		return repository.save(student);
	}
	//Get all Student
	public List<Student> getAllStudent(){
		return repository.findAll();
	}
	//Get Student By Id
	public Student getStudentById(int id) {
		return repository.findById(id).orElse(null);
	}
	//Update Student
	public Student updateStudentById(int id,Student ustudent) {
		Student student = repository.findById(id).orElse(null);
		if(student!=null) {
			student.setName(ustudent.getName());
			student.setAge(ustudent.getAge());
			student.setEmail(ustudent.getEmail());
			return repository.save(student);
		}
		return null;
		
	}
	//Delete Student
	public String deleteStudentByid(int id) {
		repository.deleteById(id);
		return "Delete Successfully";
	}
	
}
