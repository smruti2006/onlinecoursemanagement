package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Integer>{
	List<Enrollment> findByStudentId(int StudentId);
	List<Enrollment> findByCourseId(int CourseId);
}
