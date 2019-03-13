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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.csye6225.spring2019.courseservice.datamodel.Student;
import com.csye6225.spring2019.courseservice.service.StudentService;




@Path("students")
public class StudentResource {
	StudentService stuService = new StudentService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents(){
		return stuService.getAllStudents();
	}

	
	@GET
	@Path("/program/{programId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudentByProgram(
			@QueryParam("program") String program){
		if(program == null) {
			return stuService.getAllStudents();
		}
		return stuService.getStudentByProgram(program);
	}
	
	// ... webapi/student/1 
	@GET
	@Path("/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("studentId") String stuID) {
		System.out.println("Student Resource: Looking for: " + stuID);
		return stuService.getStudent(stuID);
	}
	
	@GET
	@Path("/{studentId}/courses")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCourses(@PathParam("studentId") String stuID) {
		System.out.println("Student Courses: Looking for: " + stuID);
		System.out.println(stuService.getAllCourse(stuID).toString());
		return stuService.getAllCourse(stuID).toString();
	}
		
	@DELETE
	@Path("/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student deleteStudent(@PathParam("studentId") String stuID) {
		return stuService.deleteStudent(stuID);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student addStudent(Student stu) {
		stuService.addStudent(stu);
		return stu;
	}
	
	@POST
	@Path("/add/{courseName}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student addCourseToStudent(@PathParam("courseName") String courseName,Student stu) {
		return stuService.addCourseToStudent(stu.getStudentId(), courseName);
	}
	
	@POST
	@Path("/delete/{courseName}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student deleteCourseFromStudent(@PathParam("courseName") String courseName,Student stu) {
		return stuService.deleteCourseFromStudent(stu.getStudentId(), courseName);
	}
	
		
	@PUT
	@Path("/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student updateStudent(@PathParam("studentId") String stuID, 
			Student stu) {
		return stuService.updateStudentInformation(stuID, stu);
	}
	
}

