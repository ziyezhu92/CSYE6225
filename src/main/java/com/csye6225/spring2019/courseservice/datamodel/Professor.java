package com.csye6225.spring2019.courseservice.datamodel;

public class Professor {
	private String id;
	private String firstName;
	private String lastName;
	private String professorId;
	private String department;
	
	
	public Professor() {
		
	}
	
	public Professor(String professorId, String firstName, 
		String lastName, String department) {
		this.professorId = professorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProfessorId() {
		return professorId;
	}
	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}
	
	@Override
	public String toString() { 
		return "ProfId=" + getId() + ", firstName=" + getFirstName() + ", lastName= " + getLastName()
				+ ", department=" + getDepartment();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
