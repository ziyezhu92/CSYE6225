package com.csye6225.spring2019.courseservice.datamodel;

import java.util.List;

public class Course {
	private String id;
    private String courseName;
    private String professorId;
    private String TAId;
    private String department;
    private String boardId;
    private List<String> roster;
    
    public Course() {
    	
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getProfessorId() {
		return professorId;
	}

	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}

	public String getTAId() {
		return TAId;
	}

	public void setTAId(String tAId) {
		TAId = tAId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public List<String> getRoster() {
		return roster;
	}

	public void setRoster(List<String> roster) {
		this.roster = roster;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", professorId=" + professorId + ", TAId=" + TAId
				+ ", department=" + department + ", boardId=" + boardId + ", roster=" + getRoster().toString() + "]";
	}
    
}
