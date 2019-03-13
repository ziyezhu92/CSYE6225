package com.csye6225.spring2019.courseservice.datamodel;

import java.util.List;

public class Student {
	private String id;
    private String studentId;
    private String firstName;
    private String lastName;
    private String joiningDate;
    private List<String> courses;
    private String program;
	
	public Student() {}
	
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> Courses) {
        this.courses = Courses;
    }

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + ", firstName: " + getFirstName() + ", lastName: " + getLastName() + ", program: " + getProgram()
		+ ", courses: " + getCourses().toString();
	}
}
