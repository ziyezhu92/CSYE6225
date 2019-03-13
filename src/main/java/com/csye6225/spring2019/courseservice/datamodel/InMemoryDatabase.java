package com.csye6225.spring2019.courseservice.datamodel;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {
	private static Map<String, Student> studentDB = new HashMap<>();
	private static Map<String, Professor> professorDB = new HashMap<>();
	private static Map<String, Course> courseDB = new HashMap<>();
	private static Map<String, Lecture> lectureDB = new HashMap<>();
	private static Map<String, Program> programDB = new HashMap<>();

	
	public static Map<String, Student> getStudentDB() {
		return studentDB;
	}


	public static Map<String, Professor> getProfessorDB() {
		return professorDB;
	}


	public static Map<String, Course> getCourseDB() {
		return courseDB;
	}


	public static Map<String, Lecture> getLectureDB() {
		return lectureDB;
	}


	public static Map<String, Program> getProgramDB() {
		return programDB;
	}
}
