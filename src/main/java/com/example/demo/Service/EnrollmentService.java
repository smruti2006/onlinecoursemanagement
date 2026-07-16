package com.example.demo.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.EnrollmentDTO;
import com.example.demo.Entity.Course;
import com.example.demo.Entity.Enrollment;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Repository.EnrollmentRepository;
import com.example.demo.Repository.StudentRepository;

@Service
public class EnrollmentService {
	@Autowired
	EnrollmentRepository enrollmentrepository;
	@Autowired
	CourseRepository courserepository;
	@Autowired
	StudentRepository studentrepository;
	//Enroll a student
	public Enrollment Enroll(EnrollmentDTO dto) {
		Student student = studentrepository.findById(dto.getStudentid()).orElseThrow(() -> new RuntimeException("Student not found"));
		Course course = courserepository.findById(dto.getCourseid()).orElseThrow(()->new RuntimeException("Course not found"));
		Enrollment enroll = new Enrollment();
		enroll.setStudent(student);
		enroll.setCourse(course);
		enroll.setEnrollDate(LocalDate.now());
		return enrollmentrepository.save(enroll);
	}
	//Get all student
	public List<Enrollment> GetAllEnrollment(){
		return enrollmentrepository.findAll();
	}
	//Delete a student enrollment by id
	public String DeleteStudent(int id) {
		enrollmentrepository.deleteById(id);
		return "Delete Successfully";
	}
	//Return all Students enrollment in a course
	public List<Course> allCoursesOfStudent(int id){
		List<Enrollment> enrollments = enrollmentrepository.findByStudentId(id);
		List<Course> courses = new ArrayList<>();
		for(Enrollment e:enrollments) {
			courses.add(e.getCourse());
		}
		return courses;
	}
	public List<Student> allStudentOfCourse(int id){
		List<Enrollment> enrollments = enrollmentrepository.findByCourseId(id);
		List<Student> students = new ArrayList<>();
		for(Enrollment e:enrollments) {
			students.add(e.getStudent());
		}
		return students;
	}
}
