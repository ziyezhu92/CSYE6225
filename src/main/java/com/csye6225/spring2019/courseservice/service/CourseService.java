package com.csye6225.spring2019.courseservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.csye6225.spring2019.courseservice.datamodel.Course;
import com.csye6225.spring2019.courseservice.datamodel.InMemoryDatabase;



public class CourseService {
	Map<String, Course> course_Map = InMemoryDatabase.getCourseDB();
	public CourseService() {}
	
	// Getting a list of all student 
	// GET "..webapi/student"
	public List<Course> getAllCourses(){
		//Getting the list
		List<Course> list = new ArrayList<>();
		for(Course course : course_Map.values()) {
			list.add(course);
		}
		return list;
	}
	
	// Adding a course
	public void addCourse(Course course) {
		//Create a Course Object
		course_Map.put(course.getCourseName(), course);
	}
		
	// Getting One Course
	public Course getCourse(String courseId) {
		Course course = course_Map.get(courseId);
		System.out.println("Item retrieved:");
		System.out.println(course.toString());
		return course;
	}
		
	// Deleting a course
	public Course deleteCourse(String courseID) {
		Course deletedCourse = course_Map.get(courseID);
		course_Map.remove(courseID);
		return deletedCourse;
	}
	
	// Updating Course Info
	public Course updateCourseInformation(String courseId, Course course) {
		course_Map.put(course.getCourseName(),course);
		return course;
	}
	
	// Adding a Student to the roster of a course
	public Course addStudentToCourse(String studentId, String courseId) {
		course_Map.get(courseId).getRoster().add(studentId);
		return course_Map.get(courseId);
	}
	
	// Removing a Student from the roster of a course
	public Course deleteStudentFromCourse(String studentId, String courseId) {
		course_Map.get(courseId).getRoster().remove(studentId);
		return course_Map.get(courseId);
	}
}
