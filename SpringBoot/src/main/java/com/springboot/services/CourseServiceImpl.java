package com.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entities.Course;

@Service
public class CourseServiceImpl implements CouseService {
	
	List<Course>list;
	
	public CourseServiceImpl() {
		list=new ArrayList();
		list.add(new Course(145,"Java Core Course","this course contains basics"));
		list.add(new Course(343,"Python Course","creating"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
		list.add(course);
		return course;
	}
	
}
