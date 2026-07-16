package com.example.demo.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Enrollment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private LocalDate enrollDate;
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	@ManyToOne
	@JoinColumn(name="courser_id")
	private Course course;
	public LocalDate getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(LocalDate enrollDate) {
		this.enrollDate = enrollDate;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
}
