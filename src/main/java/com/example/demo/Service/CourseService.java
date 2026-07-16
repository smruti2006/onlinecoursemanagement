package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Course;
import com.example.demo.Repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository repository;
	//Add Course
	public Course addCourse(Course course) {
		return repository.save(course);
	}
	//GET Course
	public List<Course> getCourse(){
		return repository.findAll();
	}
	//GET Course By Course Id
	public Course getCoureById(int id) {
		return repository.findById(id).orElse(null);
	}
	//Update Student By Id
	public Course updateCourseById(int id,Course course) {
		Course ucourse = repository.findById(id).orElse(null);
		if(ucourse!=null) {
			ucourse.setCoursename(course.getCoursename());
			ucourse.setDuration(course.getDuration());
			ucourse.setFees(course.getFees());
			return repository.save(ucourse);
		}
		return null;
	}
	//Delete Course By Course id
	public String delteCourseId(int id) {
		repository.deleteById(id);
		return "Delete Successfully";
	}
	
}
