package com.csye6225.spring2019.courseservice.datamodel;

import java.util.List;

public class Program {
	private List<String> courses;
    private String name;

    public Program() {

    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Name: " + getName() + ", Courses: " + getCourses().toString();
	}
}
