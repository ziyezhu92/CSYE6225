package com.csye6225.spring2019.courseservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.csye6225.spring2019.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.spring2019.courseservice.datamodel.Student;


public class StudentService {
	static Map<String, Student> student_Map = InMemoryDatabase.getStudentDB();
	public StudentService() {}
	
	// Getting a list of all student 
	// GET "..webapi/student"
	public List<Student> getAllStudents(){
		//Getting the list
		List<Student> list = new ArrayList<>();
		for(Student stu : student_Map.values()) {
			list.add(stu);
		}
		return list;
	}
	
	// Adding a student
	public void addStudent(Student student) {
		//Create a Student Object
		student_Map.put(student.getStudentId(), student);
	}
	
	//Adding a course to a student
	public Student addCourseToStudent(String stuID, String courseID) {
		Student stu = student_Map.get(stuID);
		stu.getCourses().add(courseID);
		return stu;
	}
	
	//Deleting a course from a student
	public Student deleteCourseFromStudent(String stuID, String courseID) {
		student_Map.get(stuID).getCourses().remove(courseID);
		return student_Map.get(stuID);
	}
	
	//Getting One Student
	public Student getStudent(String stuID) {
		Student stu = student_Map.get(stuID);
		System.out.println("Item retrieved:");
	    System.out.println(stu.toString());
	    return stu;
	}
	
	//Getting all the courses for one student
	public List<String> getAllCourse(String stuID){
		return student_Map.get(stuID).getCourses();
	}
	
	//Deleting a student
	public Student deleteStudent(String stuID) {
		Student deletedStuDetails = student_Map.get(stuID);
		student_Map.remove(stuID);
		return deletedStuDetails;
	}
	
	//Updating Student Info
	public Student updateStudentInformation(String stuId, Student stu) {
		student_Map.put(stu.getStudentId(),stu);
		return stu;
	}

	//Get students in a program
	public List<Student> getStudentByProgram(String program){
		//Getting the list
		List<Student> list = new ArrayList<>();
		for(Student stu : student_Map.values()) {
			if(stu.getProgram().equals(program)) {
				list.add(stu);
			}
		}
		return list;
	}
}
