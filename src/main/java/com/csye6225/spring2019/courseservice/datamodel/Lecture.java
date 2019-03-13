package com.csye6225.spring2019.courseservice.datamodel;


public class Lecture {
	private String name;
    private String content;


    public Lecture() {}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


	@Override
	public String toString() {
		return "lectureName: " + name + ", content: " + content + "material: ";
	}
}
