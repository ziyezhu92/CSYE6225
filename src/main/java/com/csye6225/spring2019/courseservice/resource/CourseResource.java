package com.csye6225.spring2019.courseservice.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.csye6225.spring2019.courseservice.datamodel.Course;
import com.csye6225.spring2019.courseservice.service.CourseService;



@Path("courses")
public class CourseResource {
	CourseService courseService = new CourseService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> getCourses(){
		return courseService.getAllCourses();
	}
	
	// ... webapi/course/1 
	@GET
	@Path("/{courseName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Course getStudent(@PathParam("courseName") String courseName) {
		System.out.println("Course Resource: Looking for: " + courseName);
		return courseService.getCourse(courseName);
	}
	
	@DELETE
	@Path("/{courseName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Course deleteCourse(@PathParam("courseName") String courseName) {
		return courseService.deleteCourse(courseName);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Course addCourse(Course course) {
		courseService.addCourse(course);
		return course;
	}
	
	@POST
	@Path("/add/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Course addStudentToCourse(@PathParam("studentId") String studentId, Course course) {
		System.out.println("StudentId: " + studentId);
		System.out.println("CouseId: " + course.getCourseName());		
		return courseService.addStudentToCourse(studentId, course.getCourseName());
	}
	
	@POST
	@Path("/delete/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Course deleteStudentFromCourse(@PathParam("studentId") String studentId, Course course) {
		System.out.println("StudentId: " + studentId);
		System.out.println("CouseId: " + course.getCourseName());		
		return courseService.deleteStudentFromCourse(studentId, course.getCourseName());
	}
		
	@PUT
	@Path("/{courseName}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Course updateStudent(@PathParam("courseName") String courseName, 
			Course course) {
		return courseService.updateCourseInformation(courseName, course);
	}
}
