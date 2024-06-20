package com.springboot.services;

import java.util.List;

import com.springboot.entities.Course;

public interface CouseService {
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);

	public Course addCourse(Course course);
}
